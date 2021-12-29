import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        // Kiểm tra định dạng số điện thoại

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số điện thoại (9 hoặc 10 số): ");
//        String phoneNumber = sc.nextLine();
        String input = "(+84) 0971211326";
//        String input2 = "(84) 0971211326";

        String regex = "((^\\(\\+84\\))(\\s)([^0]\\d{8})$)|((^\\(\\+84\\))(\\s)(0\\d{9})$)";
//        String regex2 = "((^\\(\\+84\\).*)(\\s)(0\\d{9})$)";
//        Pattern pattern2 = Pattern.compile(regex2);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
//        Matcher matcher2 = pattern2.matcher(input);

        if (matcher.find()){
            System.out.println(" OK!!!");
        } else {
            System.out.println("Vui lòng kiểm tra lại số điện thoại");
        }



    }

}
