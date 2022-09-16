package com;

import java.time.LocalDate;

import java.time.Period;


public class DateEx {

    public static void main(String[] args) {
        LocalDate dateBefore= LocalDate.parse("2016-08-31");
        LocalDate dateAfter = LocalDate.parse("2016-11-30");
        //int months = Months.monthsBetween(dateBefore, dateAfter).getMonths();
        Period age = Period.between(dateBefore, dateAfter);
        int months = age.getMonths();
        System.out.println(months);
    }
}
