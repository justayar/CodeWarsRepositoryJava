public class Kata {
	
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    
    while(fighter1.health > 0 && fighter2.health > 0){
    
        if(firstAttacker.equals(fighter1.name)){
        
            oneRound(fighter1,fighter2);
        
        }else{
            oneRound(fighter2,fighter1);
        }
    }
    return fighter1.health <= 0 ? fighter2.name : fighter1.name;
  }
  
  public static void oneRound(Fighter attacker,Fighter defender){
  
        defender.health -= attacker.damagePerAttack;
        
        if(defender.health > 0){
        
          attacker.health -= defender.damagePerAttack;
        
        }
  }
}