package by.academy.homework3;

import java.util.regex.Pattern;

public class DateValidate implements Validator {


    final Pattern p = Pattern.compile("\\d{2}[-]\\d{2}[-]\\d{4}");

    public Pattern getPattern() {
        return p;
    }
}

