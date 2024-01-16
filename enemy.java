
package game;

import java.util.Scanner;

public class enemy {
     String nameEnemy;
 int speedE, healthpoinE, damageE, defenseE, resistanceE,EnemyPower;

      Scanner inputE = new Scanner(System.in);
            void runE(){
        System.out.print("Masukan nama Enemy mu: ");
        nameEnemy=inputE.nextLine();
        System.out.println("---------------------");
        System.out.print("HP: ");
        healthpoinE=inputE.nextInt();
        System.out.println("---------------------");
        System.out.print("Speed: ");
        speedE=inputE.nextInt();
        System.out.println("---------------------");
    }
            void attack(){
        System.out.print("Attack: ");
        damageE=inputE.nextInt();
            System.out.println("---------------------");
    }
    void armor(){
        System.out.print("Armor defense: ");
        defenseE=inputE.nextInt();
        System.out.println("--------------------");
    }
    void resist(){
        System.out.print("Magic Resist: ");
        resistanceE=inputE.nextInt();
            System.out.println("---------------------");
    }
    void EnemyPower(){
        System.out.println("Enemy Power is: "+EnemyPower);
            System.out.println("--------------------");
    }
            

}
