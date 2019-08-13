package md5.test;
import org.apache.*;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * MD5通用类
 * @author  号令天下
 * @since   2019.8.13
 * @version 1.0.0
 */
public class MD5 {
    public static String md5(String text,String key){
        String encodeStr = DigestUtils.md5Hex(text+key);
        System.out.println("MD5加密后字符串为encodeStr="+encodeStr);
        return  encodeStr;
    }

    public  static boolean verify(String text,String key,String md5) {
        String md5Text=md5(text,key);
        if (md5Text.equalsIgnoreCase(md5)){
            System.out.println("MD5验证通过");
            return true;
        }
        return false;
    }

}
