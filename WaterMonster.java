class WaterMonster extends Monster {
    
    public WaterMonster(String name, int attack){
        super(name, attack, "Water");
    }

    // TODO : add constructor and initialize type to "water"
    
    // TODO : create an attack method which deals x2 damage to "fire"
    public boolean attack(Monster opponent) {
        if (opponent instanceof FireMonster) {
            opponent.setLife(Math.min(opponent.getLife() - 2 * this.getAttack(), 0));
        } else {
            opponent.setLife(Math.min(opponent.getLife() - this.getAttack(), 0));
        }
        return opponent.isKO();
    }
}