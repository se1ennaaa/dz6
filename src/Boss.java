public class Boss extends GameEntity{

    Weapon weapon=new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "здоровье"+ getHalth()+"урон"+getDamage()+"тип оружия"+weapon.getType()+"названия"+weapon.getName();
    }
}

