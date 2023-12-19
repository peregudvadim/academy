package by.academy.homework3;

import java.util.regex.Pattern;

public interface Validator {

    Pattern getPattern();

    default boolean validate(String string) {
        return getPattern().matcher(string).matches();
    }
}

