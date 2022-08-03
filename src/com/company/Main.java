package com.company;

public class Main {
    public static void main(String[] args) {
       Days days = Days.MONDAY;
       Days days1 = Days.FRIDAY;
        switch (days){
            case MONDAY -> System.out.println("Дуйшонбу куну мен теория джава тилин окуйм");
            case TUESDAY -> System.out.println("Шайшемби куну джава тилинен  практика отом");
            case WEDNESDAY -> System.out.println("Шаршенби куну мен басскетбол ойнойм жана ");
            case THURSDAY -> System.out.println("Бейшемби куну англис тили сабагын окуйм ");
            case FRIDAY -> System.out.println("Жума куну жума намазга барам");
            case SATURDY -> System.out.println("Ишенби куну апама жана атама жардам берем ");
            case SUNDAY -> System.out.println("Жекшемби куну дем алам жана кичине укам менен ойнойм");
        }
        System.out.println("--------------------------");

        if (days1.equals(Days.MONDAY)){
            System.out.println("Дуйшонбу куну мен теория джава тилин окуйм");
        } else if (days1.equals(Days.TUESDAY)) {
            System.out.println("Шайшемби куну джава тилинен  практика отом");
        } else if (days1.equals(Days.WEDNESDAY)) {
            System.out.println("Шаршенби куну мен басскетбол ойнойм жана ");
        } else if (days1.equals(Days.THURSDAY)) {
            System.out.println("Бейшемби куну англис тили сабагын окуйм ");
        } else if (days1.equals(Days.FRIDAY)) {
            System.out.println("Жума куну жума намазга барам");
        } else if (days1.equals(Days.SATURDY)) {
            System.out.println("Ишенби куну апама жана атама жардам берем ");
        } else if (days1.equals(Days.SUNDAY)) {
            System.out.println("Жекшемби куну дем алам жана кичине укам менен ойнойм");
        }

    }
}