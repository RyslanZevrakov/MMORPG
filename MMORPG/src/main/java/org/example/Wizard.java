package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Wizard implements Skills {

    private ArrayList<String> skills = new ArrayList<>();
    @Override
    public void addSkills(ArrayList<String> skills) {
        skills.add("Разряд");
        skills.add("Огненная стрела");
        skills.add("Щит");
    }
    int numder = (int) (Math.random() * 4)+2;

    public void wizard() throws java.io.IOException {
        addSkills(skills);
        System.out.println("Информация");
        System.out.println(" 1. Разряд");
        System.out.println(" 2. Огненная стрела");
        System.out.println(" 3. Щит");
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



    @Override
    public void sirstSkill() {

        if (numder == 3) {
            System.out.println("Спасобность " + skills.get(0) + " сработала");
        } else {
            System.out.println("Спасобность " + skills.get(0) + " не сработала");
        }
    }

    @Override
    public void secondSkill() {
        if (numder == 4) {
            System.out.println("Спасобность " + skills.get(1) + " сработала");
        } else {
            System.out.println("Спасобность " + skills.get(1) + " не сработала");
        }
    }

    @Override
    public void thirdSkill() {
        if (numder == 5) {
            System.out.println("Спасобность " + skills.get(2) + " сработала");
        } else {
            System.out.println("Спасобность " + skills.get(2) + " не сработала");
        }
    }
}
