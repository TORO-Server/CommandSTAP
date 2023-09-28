# CommandSTAP

「/stap」というコマンドを追加するサンプル用プラグインです。

「/stap」コマンドが実行されると、すべてのプレイヤーのチャットに「STAPコマンドは、あります！」

というテキストが表示されるシンプルなプラグインです。

コマンドを追加するプラグインの開発の参考にしてください。

## 解説

[plugin.yml](src/main/resources/plugin.yml#L6-L9) で、コマンドを登録しています。

「/stap」コマンドが実行されると、[stap.java](src/main/java/marumasa/command_stap/stap.java#L13-L16) ここに書いた処理が実行されます。

