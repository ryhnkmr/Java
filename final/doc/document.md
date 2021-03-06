# Group カスタマー

## カスタマーのエンドポイント [/api/v1/customer{?customer_id}]

### カスタマー情報取得 [GET]

#### 処理概要

* カスタマー情報を1件取得する。

+ Parameters
  + customer_id: A0001 (string, required) - 顧客番号

+ Request (application/json)

  + Headers
    Accept: application/json

+ Response 201 (application/json)
  + Attributes
    + customer_id: A0001 (string, required) - 顧客番号 (format: string)
    + name: 内山 理佐 (string, required) - 氏名 (format: string)
    + tel: 090-1111-2222 (number, required) - 電話番号 (format: tel)
    + birthday: 1999/3/2 (string, required) - 生年月日 (format: string)
    + mail: test@test.com (string, required) - email (format: email)
    + postal_code: 736-0041 (string, required) - 郵便番号 (format: string)
    + address: 広島県安芸郡海田町大正町2-7-8 (string, required) - 住所 (format: string)
    + purchased_times: 23 (number, required)- 購入回数 (format: number)
    + last_purchased_at: 2020/8/8 5:02:16 (number, required) - 最終購入日時 (format: Datetime)


## カスタマーのエンドポイント [/api/v1/customer]

### カスタマー情報登録 [POST]

#### 処理概要

* カスタマーを作成する

+ Parameters
    + customer_id: A0001 (string, required) - 顧客番号

+ Request (application/json)

    + Headers
        Accept: application/json

    + Attributes
        + customer_id: A0001 (string, required) - 顧客番号 (format: string)
        + name: 内山 理佐 (string, required) - 氏名 (format: string)
        + tel: 090-1111-2222 (number, required) - 電話番号 (format: tel)
        + birthday: 1999/3/2 (string, required) - 生年月日 (format: string)
        + mail: test@test.com (string, required) - email (format: email)
        + postal_code: 736-0041 (string, required) - 郵便番号 (format: string)
        + address: 広島県安芸郡海田町大正町2-7-8 (string, required) - 住所 (format: string)
        + purchased_times: 23 (number, optional)- 購入回数 (format: number)
        + last_purchased_at: 2020/8/8 5:02:16 (number, optional) - 最終購入日時 (format: Datetime)


+ Response 201 (application/json)
    + Attributes
        + customer_id: A0001 (string, required) - 顧客番号 (format: string)
        + name: 内山 理佐 (string, required) - 氏名 (format: string)
        + tel: 090-1111-2222 (number, required) - 電話番号 (format: tel)
        + birthday: 1999/3/2 (string, required) - 生年月日 (format: string)
        + mail: test@test.com (string, required) - email (format: email)
        + postal_code: 736-0041 (string, required) - 郵便番号 (format: string)
        + address: 広島県安芸郡海田町大正町2-7-8 (string, required) - 住所 (format: string)
        + purchased_times: 23 (number, required)- 購入回数 (format: number)
        + last_purchased_at: 2020/8/8 5:02:16 (number, required) - 最終購入日時 (format: Datetime)

## カスタマーのエンドポイント [/api/v1/customer/{?customer_id}]

### カスタマー情報更新 [PUT]

#### 処理概要

* カスタマー情報を更新する。

+ Parameters
    + customer_id: A0001 (string, required) - 顧客番号

+ Request (application/json)

    + Headers
        Accept: application/json

    + Attributes
        + customer_id: A0001 (string, required) - 顧客番号 (format: string)
        + name: 内山 理佐 (string, required) - 氏名 (format: string)
        + tel: 090-1111-2222 (number, required) - 電話番号 (format: tel)
        + birthday: 1999/3/2 (string, required) - 生年月日 (format: string)
        + mail: test@test.com (string, required) - email (format: email)
        + postal_code: 736-0041 (string, required) - 郵便番号 (format: string)
        + address: 広島県安芸郡海田町大正町2-7-8 (string, required) - 住所 (format: string)
        + purchased_times: 23 (number, optional)- 購入回数 (format: number)
        + last_purchased_at: 2020/8/8 5:02:16 (number, optional) - 最終購入日時 (format: Datetime)


+ Response 201 (application/json)
    + Attributes
        + customer_id: A0001 (string, required) - 顧客番号 (format: string)
        + name: 内山 理佐 (string, required) - 氏名 (format: string)
        + tel: 090-1111-2222 (number, required) - 電話番号 (format: tel)
        + birthday: 1999/3/2 (string, required) - 生年月日 (format: string)
        + mail: test@test.com (string, required) - email (format: email)
        + postal_code: 736-0041 (string, required) - 郵便番号 (format: string)
        + address: 広島県安芸郡海田町大正町2-7-8 (string, required) - 住所 (format: string)
        + purchased_times: 23 (number, required)- 購入回数 (format: number)
        + last_purchased_at: 2020/8/8 5:02:16 (number, required) - 最終購入日時 (format: Datetime)


## カスタマーのエンドポイント [/api/v1/customer/{?customer_id}]

### カスタマー情報削除 [DELETE]

#### 処理概要

* カスタマー情報を1件削除する。

+ Parameters
    + customer_id: A0001 (string, required) - 顧客番号

+ Request (application/json)

    + Headers
        Accept: application/json

+ Response 201 (application/json)
    + Attributes
        + message: sucess (string, required) - message (format: string)
