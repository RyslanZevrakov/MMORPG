package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Hunter implements Skills {
    int numder = (int) (Math.random() * 4)+2;

    public void hunter() throws java.io.IOException {
        System.out.println("Информация");
        System.out.println(" 1. Соколиное зрение");
        System.out.println(" 2. Выстрел из лука");
        System.out.println(" 3. Запах крови");
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
    public ArrayList<String> getSkills() {
        return skills;
    }
    private ArrayList<String> skills;
    @Override
    public void addSkills(ArrayList<String> skills) {
        skills.add("Крававая охота");
        skills.add("Вистрел из лука");
        skills.add("Апорт");
    }

    @Override
    public void sirstSkill() {

        if (numder == 3) {
            System.out.println("Спасобность " + getSkills().get(0) + " сработала");
        } else {
            System.out.println("Спасобность " + getSkills().get(0) + " не сработала");
        }
    }

    @Override
    public void secondSkill() {
        if (numder == 4) {
            System.out.println("Спасобность " + getSkills().get(1) + " сработала");
        } else {
            System.out.println("Спасобность " + getSkills().get(1) + " не сработала");
        }
    }

    @Override
    public void thirdSkill() {
        if (numder == 5) {
            System.out.println("Спасобность " + getSkills().get(2) + " сработала");
        } else {
            System.out.println("Спасобность " + getSkills().get(2) + " не сработала");
        }
    }
}
