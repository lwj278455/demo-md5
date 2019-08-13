package md5.test;

import org.apache.commons.codec.digest.Md5Crypt;
import org.junit.Test;

public class T {
    @Test
    public void test() {
        String md5 = MD5.md5("2784552501", "liu278455");
        System.out.println(MD5.verify("2784sss552501", "liu278455", md5));
    }
}
