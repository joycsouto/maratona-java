package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsMacherTest {
    public static void main(String[] args) {
        String regex = "ma";
        String text = "mamama";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){

            System.out.println(matcher.start() + " " + matcher.group());

        }
    }
}
