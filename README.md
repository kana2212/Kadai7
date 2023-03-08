# Kadai7　　
## やること  
授業で扱った実装例を参考にHTTPメソッドのGET/POST/PATCH/DELETEのリクエストを扱えるControllerを実装する  

### ・GET  
GETリクエストにて指定したパスで、指定した名前の値が返ってくるかを確認する。
![GET成功](https://user-images.githubusercontent.com/121325913/223707417-7de466f7-1915-402d-8d5a-c0990782576a.png)  

### ・POST  
-dオプション内のデータをJSON形式でリクエストした時にリクエストが正しく返ってくるか、

その下の-iオプションではレスポンス状態コードの確認、HTTPヘッダ、データ本体の確認とリクエストがうまくいったかどうか指定したメッセージの応答確認をする。
![POST 成功](https://user-images.githubusercontent.com/121325913/223707475-3559e27c-450f-4159-be33-3f15b0c7644a.png)  

### ・PATCH  
PATCHリクエストでidの値を1と更新した際に正しく更新処理が実行されたかを確認する。
![PATCH成功](https://user-images.githubusercontent.com/121325913/223707587-140ec1e0-a0c3-495f-8b97-9ff03b95549e.png)  

### ・DELETE  
PATCHで更新して作られたidを正しく削除処理されたかを確認する。
![DELETE](https://user-images.githubusercontent.com/121325913/223707637-78783d6c-a6f4-4145-b5eb-f768f43ac61d.png)

