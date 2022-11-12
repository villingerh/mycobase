FROM bitnami/minideb:bullseye-amd64
LABEL maintainer="villingerh@fweb.de"
RUN install_packages openjdk-11-jre openjdk-11-jre-headless curl docker.io xkb-data firefox-esr xauth x11-xkb-utils ncurses-bin time bzip2 git unzip
ARG GRADLE_VERSION=6.5.1
RUN export VERSION=${GRADLE_VERSION} \
 ; curl -o gradle.zip -L https://services.gradle.org/distributions/gradle-${VERSION}-bin.zip \
 && head gradle.zip \
 && unzip -d /opt/gradle gradle.zip \
 && ln -s /opt/gradle/gradle-${VERSION} /opt/gradle/latest \
 && echo "export GRADLE_HOME=/opt/gradle/latest" > /etc/profile.d/gradle.sh \
 && echo "export PATH=\${GRADLE_HOME}/bin:\${PATH}" >> /etc/profile.d/gradle.sh \
 && chmod +x /etc/profile.d/gradle.sh \
 && rm -f gradle.zip
ARG user=builder
ARG group=builder
ARG uid=1000
ARG gid=1000
RUN groupadd -g ${gid} ${group} \
    && useradd -d "/home/${user}" -u "${uid}" -g "${gid}" -m -s /bin/bash "${user}"
WORKDIR "/home/${user}"
