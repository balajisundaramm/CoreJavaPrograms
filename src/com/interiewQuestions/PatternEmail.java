package com.interiewQuestions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Balaji on 7/11/17.
 */
public class PatternEmail {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._,%+-=]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                    Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }


    public static void main(String[] args) {
        String email="B,=@ytr.codfgh";
        System.out.println(validate(email));
    }
}
/*
class EmailValidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    */
/**
     * Validate hex with regular expression
     *
     * @param hex
     *            hex for validation
     * @return true valid hex, false invalid hex
     *//*

    public boolean validate(final String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

    }

    public static void main(String[] args) {
        EmailValidator e1=new EmailValidator();
        String email="hgfds@hgfd.vi";
        System.out.println(e1.validate(email));
    }
}
*/
