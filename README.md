# monorepo

- `Git`

  - ユーザ ID とグループ ID を確認する(`$ groups $(whoami)`)
  - `.git/`ディレクトリに権限付与する

    ```
    $ chown -R ${ユーザ ID}.${グループ ID} .git
    $ chmod -R ug+rw .git
    ```
