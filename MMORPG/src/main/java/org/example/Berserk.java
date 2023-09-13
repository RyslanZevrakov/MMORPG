package org.example;

import com.sun.jdi.connect.spi.TransportService;

import java.util.Random;
import java.util.Scanner;

public class Berserk implements Skills {


    int numder = (int) (Math.random() * 4)+2 ;

    public void berserk() throws java.io.IOException {
        System.out.println("Информация");
        System.out.println(" 1. Первая способность");
        System.out.println(" 2. Вторая способность");
        System.out.println(" 3. Третья способность");
        System.out.print("Bыберете вариант: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                sirstSkill();
                break;
            case 2:
                secondSkill();
                break;
            case 3:
                thirdSkill();
                break;

        }
    }

    public void sirstSkill() {

        if (numder == 3) {
            System.out.println("Спасобность сработала");
        } else {
            System.out.println("Спасобность не сработала");
        }
    }

    public void secondSkill() {
        if (numder == 4) {
            System.out.println("Спасобность сработала");
        } else {
            System.out.println("Спасобность не сработала");
        }
    }

    public void thirdSkill() {
        if (numder == 5) {
            System.out.println("Спасобность сработала");
        } else {
            System.out.println("Спасобность не сработала");
        }
    }


}
