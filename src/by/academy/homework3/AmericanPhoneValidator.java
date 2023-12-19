package by.academy.homework3;
import java.util.regex.Pattern;
public class AmericanPhoneValidator implements Validator {


    final Pattern p = Pattern.compile("^(\\+1)[-]?(\\d{3})[-]?(\\d{3})[-]?(\\d{4})$");

    public Pattern getPattern() {
        return p;
    }
}
