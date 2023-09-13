package org.example;

import java.util.Scanner;

public class Characters {
    Berserk berserk = new Berserk();
    Hunter hunter = new Hunter();
    Wizard wizard = new Wizard();

    public void characters()
            throws java.io.IOException {
        System.out.println("Информация");
        System.out.println(" 1. Первый персонаж");
        System.out.println(" 2. Второй персонаж");
        System.out.println(" 3. Третий персонаж");
        System.out.println(" 4.создать персонажа");
        System.out.print("Bыберете вариант: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                wizard.wizard();
                break;
            case 2:
                berserk.berserk();
                break;
            case 3:
                hunter.hunter();
                break;
            case 4:
                System.out.println("У вас максимальное количество персонажей");
                break;

        }
    }
}

