package com.company;

import java.time.LocalDate;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth as YYYY-MM-DD format:");
        String DOB = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthday = LocalDate.parse(DOB,formatter);
        LocalDate TODAY = LocalDate.now();
        Period age = Period.between(TODAY, birthday);
        int years = age.getYears() * -1;
        int months = age.getMonths() * -1;
        int days = age.getDays() * -1;
        System.out.println("Your age is: " + years + " years, " + months + " months and " + days + " days.");






    }
}
