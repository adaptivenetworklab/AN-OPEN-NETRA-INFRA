FROM jenkins/jenkins:lts

USER jenkins

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false -Duser.timezone=Asia/Jakarta

ENV CASC_JENKINS_CONFIG /var/jenkins_home/casc.yaml

COPY ./plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli --plugin-file /usr/share/jenkins/ref/plugins.txt