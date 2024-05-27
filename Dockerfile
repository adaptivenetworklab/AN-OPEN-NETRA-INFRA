# Use the official Jenkins LTS (Long Term Support) image from the Docker Hub
FROM jenkins/jenkins:lts

# Skip the setup wizard
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

# Install any necessary plugins
RUN jenkins-plugin-cli --plugins configuration-as-code:latest
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
USER jenkins
# Expose Jenkins port
EXPOSE 8080

# Expose the working directory
VOLUME /var/jenkins_home

# Set the default command to run Jenkins
RUN jenkins-plugin-cli --plugin-file /usr/share/jenkins/ref/plugins.txt