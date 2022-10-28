package dataProvider;

import org.testng.annotations.DataProvider;

public class dataProvider {
    @DataProvider(name ="TestApiWithMultiData")
    public Object[][] giveArray(){
        String  array[][]= {{"Gandhi","Ji"},{"Modi","Ji"}};
        return array;}
    }


