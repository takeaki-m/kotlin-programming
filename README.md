# memo
- [tools] -> [kotlin] -> [REPL]
- ファイルを作る必要なく、コードをテストできるツール
- コードを入力したら, ctrl + enterで実行

- intellijの提案を受け入れる
  - `alt + enter`
- 型を確認する
  - `contrlo + shift + P`
- byteコードを確認する
  - [Shift] を2回おす→Search Everywhere
  - 'show kotlin byte code'
- decompile
  - バイトコードを逆コンパイルする
- 型定義
  - Java
    - 参照型
      - 大文字で始まる
    - primitive
      - 小文字で始まる
  - kotlin
    - 参照型しかない
    - だが、byteコードをjavaコードにdecompileすると、primitiveが使われている
    - 参照型の使いやすいさと共に、primitiveのパフォーマンスも提供する

# check
- [] 型推論は積極的に利用すべきなのか