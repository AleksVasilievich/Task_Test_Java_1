package TEST_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test_1 {
    public static void main(String[] args) {
       Pattern  Pattern = Pattern.compile("foo");
       Matcher matcher = java.util.regex.Pattern.matcher("foofoo");
       int matchers = 0;
       while (matcher.find()) {
        matchers++;
       }
 

    }
}
