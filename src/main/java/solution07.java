/*
 * UCF COP3330 Summer 2021 Assignment 7 Solution
 * Copyright 2021 Alexander De Corte
 */

import java.util.Scanner;

public class solution07 {
    public static void main(String[] args) {
        final double conversionFactor = 0.09290304;

        int len, wid;
        double areaF, areaM;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        len = Integer.parseInt(in.nextLine());
        System.out.print("What is the width of the room in feet? ");
        wid = Integer.parseInt(in.nextLine());

        areaF = len * wid;
        areaM = areaF * conversionFactor;

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", len, wid);
        System.out.printf("The area is \n%.1f square feet\n%.3f square meters", areaF, areaM);


    }
}
