package by.academy.homework3;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {


    final Pattern p = Pattern.compile("^(\\+375)[-]?(29|25|44|33)[-]?(\\d{3})[-]?(\\d{2})-?(\\d{2})$");

    public Pattern getPattern() {
        return p;
    }
}

