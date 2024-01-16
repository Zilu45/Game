package game;
public class Game {

    public static void main(String[] args) {
 
//hero
        player Hero = new player();
        
        Hero.nameHero="";
        Hero.healthpoin=+Hero.healthpoin;
        Hero.speed= +Hero.speed;
        Hero.run();
        
         Hero.damage=Hero.damage;
         Hero.attack();
        
        Hero.resistance=Hero.resistance;
        Hero.resist();
         
        Hero.defense=Hero.defense;
        Hero.armor();
        
        Hero.HeroPower=Hero.speed+Hero.healthpoin+Hero.damage+Hero.defense+Hero.resistance;
         Hero.heroPower();
         
         
             
//enemy
        enemy Enemy = new enemy();
        
        Enemy.nameEnemy ="";
        Enemy.healthpoinE=Enemy.healthpoinE;
        Enemy.speedE=Enemy.speedE;
        Enemy.runE();
        
         Enemy.damageE=Enemy.damageE;
         Enemy.attack();
        
         Enemy.resistanceE=Enemy.resistanceE;
         Enemy.resist();
                        Enemy.defenseE=Enemy.defenseE;
                        Enemy.armor();
        Enemy.EnemyPower= Enemy.speedE+ Enemy.healthpoinE+ Enemy.damageE+Enemy.defenseE+Enemy.resistanceE;
         Enemy.EnemyPower();
         
         
         
        //battle
        if (Hero.HeroPower>Enemy.EnemyPower) {
            System.out.println(Hero.nameHero+" VS "+Enemy.nameEnemy);
            System.out.println(Hero.nameHero+" win "+Enemy.nameEnemy+" lose");
            
        }
        else if (Hero.HeroPower<Enemy.EnemyPower) {
            System.out.println(Hero.nameHero+" VS "+Enemy.nameEnemy);
            System.out.println(Hero.nameHero+" Lose "+Enemy.nameEnemy+" Win");
        }
        else if(Hero.HeroPower==Enemy.EnemyPower) {
            System.out.println(Hero.nameHero+" VS "+Enemy.nameEnemy);
            System.out.println(Hero+" Draw");
        }
    }
    
}

