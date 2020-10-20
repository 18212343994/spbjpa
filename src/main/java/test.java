package javastudy;

import java.util.List;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test{
    public static void main(String path[]) throws Exception {
        String ab="test";
        URL u = new URL("http://localhost:8088/id?id=2");
        InputStream in = u.openStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            byte buf[] = new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        } finally {
            if ( in != null) {
                in.close();
            }
        }

        byte b[] = out.toByteArray();
        String a=new String(b, "utf-8");
        String chinese = "english\":(.+?),";
        Matcher ch = Pattern.compile(chinese).matcher(a);
        while (ch.find()){

            String chi = ch.group(1);

            System.out.println(chi);
        }


        //String b=a.getJSONObject("showapi_res_body");
        //JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        System.out.print(a);
    }
}