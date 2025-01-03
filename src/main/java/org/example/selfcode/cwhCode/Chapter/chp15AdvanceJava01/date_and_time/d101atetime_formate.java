package org.example.selfcode.cwhCode.Chapter.chp15AdvanceJava01.date_and_time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class d101atetime_formate {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);

    }
}

