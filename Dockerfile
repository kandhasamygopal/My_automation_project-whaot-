# Use a base image with Java and Maven pre-installed
FROM ubuntu:latest

RUN apt-get update

RUN apt-get install openjdk-8-jdk maven -y

# Add the necessary packages and update package index
RUN apt-get update && apt-get install -y wget curl --fix-missing

RUN apt-get install -y wget
RUN wget -q https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
RUN apt-get install -y ./google-chrome-stable_current_amd64.deb

# Install necessary tools
RUN apt-get install -y unzip

# Set the working directory
WORKDIR /home/gopal/git/whaot-automation

# Copy the pom.xml file to the container
COPY pom.xml pom.xml

# Copy the rest of the application code to the container
COPY src src

# Download the latest ChromeDriver version using curl and set it as an environment variable
RUN CHROMEDRIVER_VERSION=$(curl -s https://chromedriver.storage.googleapis.com/LATEST_RELEASE) && \
    wget -q "https://chromedriver.storage.googleapis.com/$CHROMEDRIVER_VERSION/chromedriver_linux64.zip" -O /tmp/chromedriver.zip && \
    unzip /tmp/chromedriver.zip -d src/test/resources/linuxdriver/ && \
    chmod +x src/test/resources/linuxdriver/chromedriver

# Build the application
RUN mvn clean install -DskipTests=true
