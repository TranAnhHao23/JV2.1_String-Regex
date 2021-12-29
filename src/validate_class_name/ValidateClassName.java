package validate_class_name;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        System.out.println("Nhập tên lớp học");
        Scanner sc = new Scanner(System.in);
        String className = "C0318G";
//        String regex = "(?=[GHIKLM]$)";
        String regex = "(^?=[CAP])(.*\\d{4})(.*[GHIKLM]{1}$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className);
        if (matcher.find()){
            System.out.println("Tên đúng");
        } else {
            System.out.println("Tên sai");
        }
    }
}
