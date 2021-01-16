package com.chenkai.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/*IO与Properties联合使用
 非常好的一个设计理念：
        以后经常改变的数据，可以单独写到一个文件中，使用程序动态读取
        将来只需要修改文件内容，代码不用动，不需要重新 编译，服务器也不需要重启，就可以动态拿到信息

        类似于以上这种文件被称为配置文件，并且当配置文件内容格式是
        key1=value
        key2=value
        时，这种配置文件被称为属性配置文件
 */

public class IoPropertiesTest01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("user");
        Properties pro=new Properties();
        //调用load()方法将文件数据加载到Map集合中
        pro.load(fis);  // 文件中的数据顺着管道加载到Map集合中，等号左边是key
        System.out.println(pro.getProperty("username"));

    }
}
