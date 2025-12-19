FROM maven:3.9.9-eclipse-temurin-17

# Install Chrome + Driver
RUN apt-get update && \
    apt-get install -y chromium chromium-driver && \
    rm -rf /var/lib/apt/lists/*

# Environment variables
ENV CHROME_BIN=/usr/bin/chromium
ENV WEBDRIVER_CHROME_DRIVER=/usr/bin/chromedriver

WORKDIR /app

# Copy project files
COPY . .

# Run tests
CMD ["mvn", "clean", "test"]
