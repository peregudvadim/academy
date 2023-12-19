package by.academy.homework3;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {

    final Pattern p = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");

    public Pattern getPattern() {
        return p;
    }
}