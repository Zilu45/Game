
package com.mycompany.drone;
public class DroneGame {
    public static void main(String[] args) {
        
    
Drone drone = new Drone();

   drone.energi = 11;
   drone.terbang();
   
   drone.energi = 0;
   drone.matikanMesin();
   
   drone.ketinggian= 11;
   drone.energi = 5;
   drone.turun();
   
   drone.energi=4;
   drone.belok();
    
   drone.energi = 4;
   drone.maju();
   drone.kecepatan= 3;

    drone.energi = 3;
    drone.mundur();
    drone.kecepatan = 4;
    
    }
}
