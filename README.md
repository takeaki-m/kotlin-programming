# memo - [tools] -> [kotlin] -> [REPL]
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
- 逆引用符の利用
  - 例外的な文字を利用する場合でも、"`" で囲むことで、定義、呼び出しができる
    - Javaとの相互互換性を持たせるため
      - Javaで予約後として定義されている言葉をkotlinでは定義できるようにするため
    - 関数名の表現をより豊かにするため
      - テスト暗腕のテストメソッド関数めいに逆引用符を用いることでより読みやすく表現できる
- 無名関数
  - 定義の一部として名前おw持たない
  - 他の缶巣に渡すか、おhか音関数から返すのに使われることが多い
  - 関数型(function type)と関数引数(function arguments)によって可能となっている
# check
- [] 型推論は積極的に利用すべきなのか