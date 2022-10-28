package org.example;

import io.restassured.path.json.JsonPath;

public class AssesmentTetsingClass {
    public static void main(String[] args) {
       String response= "{\n" +
                "\t\"code\": 200,\n" +
                "\t\"status\": \"OK\",\n" +
                "\t\"data\": [{\n" +
                "\t\t\"type\": \"new_user_usp\",\n" +
                "\t\t\"priority\": 10,\n" +
                "\t\t\"data\": {\n" +
                "\t\t\t\"noticeboardSubTitle\": \"Berkah ramadhan untuk member baru dan gratis ongkir berkali-kali. Cus tunggu apalagi, cek sekarang!\",\n" +
                "\t\t\t\"noticeboardTitle\": \"Cashback Hingga 100%\",\n" +
                "\t\t\t\"image\": \"https://static-uata.gdn-app.com/siva/asset///03_2020/DANCOW-BLM-microsite-jan.jpg\",\n" +
                "\t\t\t\"url\": \"/promosi/teapot-gak\"\n" +
                "\t\t},\n" +
                "\t\t\"expired_at\": 1667056257174\n" +
                "\t}, {\n" +
                "\t\t\"type\": \"new_feature\",\n" +
                "\t\t\"priority\": 190,\n" +
                "\t\t\"data\": {\n" +
                "\t\t\t\"noticeboardSubTitle\": \"Deskripsi dari new feature\",\n" +
                "\t\t\t\"noticeboardTitle\": \"New Feature\",\n" +
                "\t\t\t\"image\": \"https://static-uata.gdn-app.com/siva/asset///07_2021/image-step.png\",\n" +
                "\t\t\t\"url\": \"/flashsale\"\n" +
                "\t\t},\n" +
                "\t\t\"expired_at\": 1667056257174\n" +
                "\t}, {\n" +
                "\t\t\"type\": \"general_promo\",\n" +
                "\t\t\"priority\": 250,\n" +
                "\t\t\"data\": {\n" +
                "\t\t\t\"noticeboardSubTitle\": \"Satu aplikasi buat rame rame\",\n" +
                "\t\t\t\"noticeboardTitle\": \"Kuy di tiket-in ajah\",\n" +
                "\t\t\t\"image\": \"https://static-uata.gdn-app.com/siva/asset///11_2018/novdeal_tiket_APP.png\",\n" +
                "\t\t\t\"url\": \"https://tiket.onelink.me/3719787275/c426237a?isExternal=true\"\n" +
                "\t\t},\n" +
                "\t\t\"expired_at\": 1667056257174\n" +
                "\t}, {\n" +
                "\t\t\"type\": \"curated_product\",\n" +
                "\t\t\"priority\": 260,\n" +
                "\t\t\"data\": {\n" +
                "\t\t\t\"name\": \"Xiaomi Redmi 4a\",\n" +
                "\t\t\t\"sku\": \"TOQ-15131-01603\",\n" +
                "\t\t\t\"sequence\": 0,\n" +
                "\t\t\t\"image\": \"https://static-uata.gdn-app.com/wcsstore/Indraprastha/images/catalog/medium//96/MTA-0524948/xiaomi_xiaomi_redmi_4a_full01_k6lsumst.jpg\",\n" +
                "\t\t\t\"price\": {\n" +
                "\t\t\t\t\"list\": \"Rp 12,120\",\n" +
                "\t\t\t\t\"listValue\": 12120.0,\n" +
                "\t\t\t\t\"offer\": \"Rp 2,120 - Rp 12,120\",\n" +
                "\t\t\t\t\"offerValue\": 2120.0,\n" +
                "\t\t\t\t\"min\": 2120.0,\n" +
                "\t\t\t\t\"max\": 12120.0,\n" +
                "\t\t\t\t\"discount\": 82\n" +
                "\t\t\t},\n" +
                "\t\t\t\"buyable\": {\n" +
                "\t\t\t\t\"value\": true\n" +
                "\t\t\t},\n" +
                "\t\t\t\"discoverable\": {\n" +
                "\t\t\t\t\"value\": true\n" +
                "\t\t\t},\n" +
                "\t\t\t\"url\": \"https://wwwuata.gdn-app.com/p/xiaomi-redmi-4a/ps--TOQ-15131-01603\",\n" +
                "\t\t\t\"itemSkus\": [\"TOQ-15131-01603-00001\", \"TOQ-15131-01603-00002\", \"TOQ-15131-01603-00003\", \"TOQ-15131-01603-00004\", \"TOQ-15131-01603-00005\"],\n" +
                "\t\t\t\"merchantCode\": \"TOQ-15131\",\n" +
                "\t\t\t\"review\": {\n" +
                "\t\t\t\t\"rating\": 1.5,\n" +
                "\t\t\t\t\"count\": 4,\n" +
                "\t\t\t\t\"absoluteRating\": 1.5\n" +
                "\t\t\t},\n" +
                "\t\t\t\"inventory\": {\n" +
                "\t\t\t\t\"status\": \"OUT_OF_STOCK\",\n" +
                "\t\t\t\t\"percentage\": 0\n" +
                "\t\t\t},\n" +
                "\t\t\t\"cnc\": false,\n" +
                "\t\t\t\"ageRestricted\": false\n" +
                "\t\t},\n" +
                "\t\t\"expired_at\": 1667056257174\n" +
                "\t}, {\n" +
                "\t\t\"type\": \"bank_promo\",\n" +
                "\t\t\"priority\": 270,\n" +
                "\t\t\"data\": {\n" +
                "\t\t\t\"noticeboardSubTitle\": \"Cicilan tidak perlu dibayar 123\",\n" +
                "\t\t\t\"noticeboardTitle\": \"Bank Promo\",\n" +
                "\t\t\t\"image\": \"https://static-uata.gdn-app.com/siva/asset///07_2020/Bank.png\",\n" +
                "\t\t\t\"url\": \"https://flashsale-dev.gdn-app.com/?isExternal=true\"\n" +
                "\t\t},\n" +
                "\t\t\"expired_at\": 1667056257174\n" +
                "\t}, {\n" +
                "\t\t\"type\": \"product_recommendation\",\n" +
                "\t\t\"priority\": 280,\n" +
                "\t\t\"data\": {\n" +
                "\t\t\t\"name\": \"Test campaign 1\",\n" +
                "\t\t\t\"sku\": \"TOD-60518-00052\",\n" +
                "\t\t\t\"sequence\": 0,\n" +
                "\t\t\t\"image\": \"https://static-uata.gdn-app.com/wcsstore/Indraprastha/images/catalog/medium//95/MTA-0861493/asus_test_campaign_1_full01_i6uep05z.jpg\",\n" +
                "\t\t\t\"price\": {\n" +
                "\t\t\t\t\"listValue\": 9000000.0,\n" +
                "\t\t\t\t\"offerValue\": 8990000.0,\n" +
                "\t\t\t\t\"discount\": 0\n" +
                "\t\t\t},\n" +
                "\t\t\t\"buyable\": {\n" +
                "\t\t\t\t\"value\": true\n" +
                "\t\t\t},\n" +
                "\t\t\t\"discoverable\": {\n" +
                "\t\t\t\t\"value\": true\n" +
                "\t\t\t},\n" +
                "\t\t\t\"url\": \"https://wwwuata.gdn-app.com/p/test-campaign-1/ps--TOD-60518-00052?ds=TOD-60518-00052-00001&source=SEARCH&sid=4998f86e1f29dcc6&cnc=false&pickupPointCode=PP-3023549&pid=MTA-0861493\",\n" +
                "\t\t\t\"categoryCode\": [\"54593\"],\n" +
                "\t\t\t\"merchantCode\": \"TOD-60518\",\n" +
                "\t\t\t\"review\": {\n" +
                "\t\t\t\t\"rating\": 0.0,\n" +
                "\t\t\t\t\"count\": 0,\n" +
                "\t\t\t\t\"absoluteRating\": 0.0\n" +
                "\t\t\t},\n" +
                "\t\t\t\"cnc\": false,\n" +
                "\t\t\t\"ageRestricted\": false\n" +
                "\t\t},\n" +
                "\t\t\"expired_at\": 1667056257210\n" +
                "\t}],\n" +
                "\t\"paging\": null,\n" +
                "\t\"errors\": null\n" +
                "}";
        JsonPath jsonPath = new JsonPath(response);
        int size = jsonPath.get("data.size");
        System.out.println("size is "+ size);
       for(int i=0;i<size;i++){
           if(jsonPath.get("data["+i+"].type").equals("new_feature")){
               System.out.println("SHOUDL EB CRCT"+jsonPath.get("data["+i+"].data.noticeboardTitle"));
           }
       }









    }
}
