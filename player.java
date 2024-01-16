package game;
import java.util.Scanner;
public class player {
   
    //atribut
    String nameHero;
    int speed, healthpoin, damage, defense, resistance;
    int HeroPower;
           Scanner input= new Scanner(System.in);
         
    //method run
    void run(){
        System.out.print("Masukan nama Hero mu: ");
        nameHero=input.nextLine();
        System.out.println("---------------------");
        System.out.print("HP: ");
        healthpoin=input.nextInt();
        System.out.println("---------------------");
        System.out.print("Speed: ");
        speed=input.nextInt();
        System.out.println("---------------------");
    }
    
    void attack(){
        System.out.print("Attack: ");
        damage=input.nextInt();
            System.out.println("---------------------");
    }
    void armor(){
        System.out.print("Armor defense: ");
        defense=input.nextInt();
        System.out.println("--------------------");
    }
    void resist(){
        System.out.print("Magic Resist: ");
        resistance=input.nextInt();
            System.out.println("---------------------");
    }
    void heroPower(){
        System.out.println("Your HeroPower: "+HeroPower);
           System.out.println("----------------------");
    
    };       
}
