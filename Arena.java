
import java.util.Random;

class Arena {

    public static void main(String[] args) {
        
        FireMonster leFeu = new FireMonster("LE FEU", 30);
        WaterMonster leau = new WaterMonster("L'EAU", 20);
             
       Random random = new Random();
       int randomId = random.nextInt(2);

       if(randomId == 0){
        System.out.println(battle(leFeu, leau));
       } else {
        System.out.println(battle(leau, leFeu));
       }
    }        

    public static String battle(Monster firstAttacker, Monster secondAttacker) {
        String endMessage = "";
        boolean onGoing = true;
        
        while(onGoing){
            if (firstAttacker.getLife() > 0 && secondAttacker.getLife() > 0) {
                onGoing = !firstAttacker.attack(secondAttacker);
            }
            if (secondAttacker.getLife() > 0 && firstAttacker.getLife() > 0) {
                secondAttacker.attack(firstAttacker);
                onGoing = !firstAttacker.attack(secondAttacker);
            } 
        }
        if (firstAttacker.isKO()){
            endMessage = secondAttacker.getName() + " win ";
        } else {
            endMessage = firstAttacker.getName() + " win ";
        }
        
        return endMessage;
    }
}