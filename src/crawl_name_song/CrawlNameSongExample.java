package crawl_name_song;

import java.io.*;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNameSongExample {
    public static void main(String[] args) {
//        try {
//            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
//            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//            scanner.useDelimiter("\\Z"); //Hết dòng.
//            String content = scanner.next();
//            scanner.close();
//            content = content.replaceAll("\\n+", "");
////            System.out.println(content);
//            // regex
//            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
//            Matcher m = p.matcher(content);
//            while (m.find()) {
//                System.out.println(m.group(1));
//            }
//
//        } catch (IOException |
//                NullPointerException e) {
//            e.printStackTrace();
//        }
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = bufferedReader.readLine()) !=null){
                Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    System.out.println(matcher.group(1));
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
