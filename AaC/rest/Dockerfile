FROM openjdk:17-slim

# update package
RUN apt-get update && apt-get upgrade -y

# install common tools
RUN apt-get install -y --no-install-recommends sudo git emacs less screen && \
    apt-get install -y --no-install-recommends wget curl zip unzip

# install Gradle
RUN curl -s https://get.sdkman.io | bash
RUN bash -c " \
	source "$HOME/.sdkman/bin/sdkman-init.sh" && \
	sdk install gradle 8.3 \
	"

# install locale, set TZ/LANG
RUN apt-get install -y --no-install-recommends locales && \
    locale-gen ja_JP.UTF-8 && \
    localedef -f UTF-8 -i ja_JP ja_JP.UTF-8
ENV LANG=ja_JP.UTF-8
ENV TZ=Asia/Tokyo

WORKDIR /app
