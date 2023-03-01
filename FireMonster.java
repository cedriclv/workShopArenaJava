class FireMonster extends Monster {

    public FireMonster(String name, int attack){
        super(name, attack, "Fire");
    }

    // TODO : create an attack method which deals x2 damage to "air"
    public boolean attack(Monster opponent){
        if ( opponent instanceof AirMonster){
            opponent.setLife( Math.min( opponent.getLife() - 2* this.getAttack(), 0));
        } else {
            opponent.setLife( Math.min( opponent.getLife() - this.getAttack(), 0));
        }
        return opponent.isKO();
    }    
}