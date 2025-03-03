package RDatas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter129 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        String format = localDate.format(DateTimeFormatter.ISO_DATE);
        String format1= localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);

        System.out.println(format1);
        System.out.println(format2);

        LocalDate formatter = LocalDate.parse("2025-02-14",DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate formatter2 = LocalDate.parse("20250214",DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(formatter);
        System.out.println(formatter2);

      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse = LocalDate.parse("2007/08/23", dateTimeFormatter);
        System.out.println(parse);

    }
}
