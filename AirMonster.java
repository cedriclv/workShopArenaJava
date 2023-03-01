class AirMonster extends Monster {

    public AirMonster(String name, int attack) {
        super(name, attack, "Air");
    }
    // TODO : add constructor and initialize type to "air"

    // TODO : create an attack method which deals x2 damage to "water"
    public boolean attack(Monster opponent) {
        if (opponent instanceof WaterMonster) {
            opponent.setLife(Math.min(opponent.getLife() - 2 * this.getAttack(), 0));
        } else {
            opponent.setLife(Math.min(opponent.getLife() - this.getAttack(), 0));
        }
        return opponent.isKO();
    }
}