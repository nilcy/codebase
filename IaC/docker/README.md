# Java

- Usage: (`$ docker compose [OPTIONS] COMMAND`)
  - Build or rebuild services (`$ docker compose build`)
  - Create and start containers (`$ docker compose up -d`)
    - Execute a command in a running container (`$ docker compose exec app bash`)
  - Stop services (`$ docker compose stop`)
  - Stop and remove containers, networks(`$ docker compose down --rmi all --volumes --remove-orphans`)
  - Removes stopped service containers (`$ docker compose rm -f`)
  - for more information on a command (`$ docker compose --help`)
