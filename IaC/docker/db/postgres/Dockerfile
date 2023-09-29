FROM postgres:latest

# update package
RUN apt-get update && \
    apt-get upgrade -y

# install common tools
RUN apt-get install -y --no-install-recommends sudo git emacs less screen && \
    apt-get install -y --no-install-recommends wget curl zip unzip && \
    apt-get install --reinstall -y --no-install-recommends ca-certificates

# install locale, set TZ/LANG
RUN apt-get install -y --no-install-recommends locales && \
    locale-gen ja_JP.UTF-8 && \
    localedef -f UTF-8 -i ja_JP ja_JP.UTF-8
ENV LANG=ja_JP.UTF-8
ENV TZ=Asia/Tokyo

WORKDIR /app
