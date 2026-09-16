package org.laba;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Hero hero = new Hero("Артур");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВыберите способ перемещения героя " + hero.name + ":");
        System.out.println("walk — идти пешком");
        System.out.println("ride — ехать на лошади");
        System.out.println("fly — лететь");
        System.out.println("exit — выйти");


        while (true) {
            System.out.print("Введите команду: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "walk":
                    hero.setLocomotion(new Walking());
                    break;
                case "ride":
                    hero.setLocomotion(new HorseRiding());
                    break;
                case "fly":
                    hero.setLocomotion(new Flying());
                    break;
                case "exit":
                    scanner.close();
                    return;
                default:
                    System.out.println("Введите команду:");
                    continue;
            }
            hero.move();
        }
    }
}