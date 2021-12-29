package validate_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String input = "(84)-(0971211326)";
        String regex = "(^\\(\\d{2}\\))[-](\\(0\\d{9}\\)$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
    }
}
