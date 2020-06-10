import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution2037 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        Pattern p = Pattern.compile("[a-z]+");
        Matcher m = p.matcher(str);
        List<String> list = new ArrayList<>();
        while (m.find()) {
            list.add(m.group());
        }
           for(String e : list) System.out.println(e);
        int a = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        String res = "";
        String tmp = "";
        if (a >= 0 && a <= 1000) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).length() >= a) {
                    sb.append(list.get(i) + ",");
                }
            }
            tmp = sb.toString();
            res = tmp.substring(0, tmp.length() - 1);
            System.out.println(res);
        }
    }
}