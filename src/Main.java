public class Main {
    public static void main(String[] args) {
Boss archi =  new Boss();
archi.setHalth(800);
archi.setDamage(50);
archi.weapon.setType(WeaponType.BOMB);
archi.weapon.setName("гранат");
        System.out.println(" здоровье Босса "+ archi.getHalth()+"урон Босса"+archi.getDamage()+"тип оружия" + archi.weapon.getType() +"Названия оружия"+archi.weapon.getName());
        System.out.println(archi.printInfo());
        Skeleton skeleton= new Skeleton();
        skeleton.setDamage(60);
        skeleton.setHalth(900);
        skeleton.weapon.setType(WeaponType.GUN);
        skeleton.weapon.setName("пистолет");
        skeleton.setNumber(20);
        System.out.println(skeleton.printInfo());
            Skeleton skeleton1= new Skeleton();
            skeleton1.setDamage(10);
            skeleton1.setHalth(300);
            skeleton1.weapon.setType(WeaponType.KNIFE);
            skeleton1.weapon.setName("нож");
            skeleton1.setNumber(10);
            System.out.println(skeleton1.printInfo());
    }

}