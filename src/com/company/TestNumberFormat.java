package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class TestNumberFormat {
    public static  void main(String[] args){
//        NumberFormat numf = NumberFormat.getNumberInstance();
//        numf.setMaximumIntegerDigits(2);
//
//        numf.setRoundingMode(RoundingMode.UP);
//        System.out.println("Chế độ làm tròn: " + numf.getRoundingMode());
//        System.out.println("523.454 sau khi làm tròn = " + numf.format(523.454));
//        System.out.println("733.455 sau khi làm tròn = " + numf.format(733.455));
//        System.out.println("823.456 sau khi làm tròn = " + numf.format(823.456));
//
//        // RoundingMode.DOWN: làm tròn xuống
//        numf.setRoundingMode(RoundingMode.DOWN);
//        System.out.println("\nChế độ làm tròn: " + numf.getRoundingMode());
//        System.out.println("523.454 sau khi làm tròn = " + numf.format(523.454));
//        System.out.println("733.455 sau khi làm tròn = " + numf.format(733.455));
//        System.out.println("823.456 sau khi làm tròn = " + numf.format(823.455));

        double floatNumber = 23243434131.3123;
        Locale locale = new Locale("vi","VN");

        String pattern = "###,###.##";
        DecimalFormat dcf = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        dcf.applyPattern(pattern);
        System.out.println(floatNumber+ " " + dcf.format(floatNumber));

    }
}
