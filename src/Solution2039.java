//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Solution2039 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String str = in.readLine();
//        if (str.length()>=0 && str.length()<=10000){
//            String[] mas = str.split("\\W+|\\d+|\\s+|()");
//            System.out.println(mas.length);
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution2039 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        if (str.length() >= 0 && str.length() <= 10000) {
            Pattern p = Pattern.compile("[a-zA-Z]+");
            Matcher m = p.matcher(str);
            List<String> list = new ArrayList<>();
            while (m.find()) {
                list.add(m.group());
            }

            List<Integer> ints = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                ints.add(list.get(i).length());
            }

            int max = Collections.max(ints);
             System.out.println(max);
        }
    }
}
