package org.ctac.fs103.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isValidEmail(String email) {
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneNumberPattern = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean isValidDate(String date) {
        String datePattern = "^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2\\d|3[01])/(\\d{4})$";
        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public static boolean isValidUrl(String url) {
        String urlPattern = "^https?://(?:www\\.)?[\\w-]+(?:\\.[\\w-]+)+[\\w.,@?^=%&:/~+#-]*$";
        Pattern pattern = Pattern.compile(urlPattern);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    public static boolean isValidCreditCardNumber(String creditCardNumber) {
        String creditCardPattern = "^(\\d{4}[ -]?){3}\\d{4}$";
        Pattern pattern = Pattern.compile(creditCardPattern);
        Matcher matcher = pattern.matcher(creditCardNumber);
        return matcher.matches();
    }

    public static boolean isValidZipCode(String zipCode) {
        String zipCodePattern = "^\\d{5}(?:-\\d{4})?$";
        Pattern pattern = Pattern.compile(zipCodePattern);
        Matcher matcher = pattern.matcher(zipCode);
        return matcher.matches();
    }

    public static boolean isValidJavaIdentifier(String identifier) {
        String identifierPattern = "^[a-zA-Z_$][\\w$]*$";
        Pattern pattern = Pattern.compile(identifierPattern);
        Matcher matcher = pattern.matcher(identifier);
        return matcher.matches();
    }

    public static boolean isValidHexColorCode(String colorCode) {
        String colorCodePattern = "^#[0-9A-Fa-f]{6}$";
        Pattern pattern = Pattern.compile(colorCodePattern);
        Matcher matcher = pattern.matcher(colorCode);
        return matcher.matches();
    }

    public static boolean isValidTime(String time) {
        String timePattern = "^([01]\\d|2[0-3]):[0-5]\\d$";
        Pattern pattern = Pattern.compile(timePattern);
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Email Validation Tests");
        String email1 = "john.doe@example.co.uk";
        String email2 = "invalid.email@";

        System.out.println(email1 + ": " + isValidEmail(email1));
        System.out.println(email2 + ": " + isValidEmail(email2));
        System.out.println();

        System.out.println("Phone Number Validation Tests");
        String phone1 = "(123) 456-7890";
        String phone2 = "(12) 456-7890";


        System.out.println(phone1 + ": " + isValidPhoneNumber(phone1));
        System.out.println(phone2 + ": " + isValidPhoneNumber(phone2));
        System.out.println();

        System.out.println("Date Validation Tests");
        String date1 = "01/01/2023";
        String date2 = "01/32/2023";

        System.out.println(date1 + ": " + isValidDate(date1));
        System.out.println(date2 + ": " + isValidDate(date2));
        System.out.println();

        System.out.println("Url Validation Tests");
        String url1 = "http://example.com";
        String url2 = "http:/example.com";

        System.out.println(url1 + ": " + isValidUrl(url1));
        System.out.println(url2 + ": " + isValidUrl(url2));
        System.out.println();

        System.out.println("Credit Card Number Validation Tests");
        String card1 = "1234-5678-9012-3456";
        String card2 = "123456789012345A";

        System.out.println(card1 + ": " + isValidCreditCardNumber(card1));
        System.out.println(card2 + ": " + isValidCreditCardNumber(card2));
        System.out.println();

        System.out.println("Zip Code Validation Tests");
        String zip1 = "12345-6789";
        String zip2 = "12345-67";

        System.out.println(zip1 + ": " + isValidZipCode(zip1));
        System.out.println(zip2 + ": " + isValidZipCode(zip2));
        System.out.println();

        System.out.println("Java Identifiers Validation Tests");
        String identifier1 = "myVariable";
        String identifier2 = "variable-with-dash";

        System.out.println(identifier1 + ": " + isValidJavaIdentifier(identifier1));
        System.out.println(identifier2 + ": " + isValidJavaIdentifier(identifier2));
        System.out.println();

        System.out.println("Hexadecimal Colors Validation Tests");
        String hex1 = "#FF0000";
        String hex2 = "#GHIJKL";

        System.out.println(hex1 + ": " + isValidHexColorCode(hex1));
        System.out.println(hex2 + ": " + isValidHexColorCode(hex2));
        System.out.println();

        System.out.println("Time Validation Tests");
        String time1 = "12:30";
        String time2 = "24:00";

        System.out.println(time1 + ": " + isValidTime(time1));
        System.out.println(time2 + ": " + isValidTime(time2));
        System.out.println();
    }
}
