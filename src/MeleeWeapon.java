// Matthew D
public class MeleeWeapon extends Weapon{
    private String type;
    private int strength;
    private int damage;
    private double lengthCM;
    private double weightKG;
    private int sharpness;
    private int strMod;
    private int dexMod;
    private int conMod;
    private int intMod;
    private int wisMod;
    private int chaMod;

    public MeleeWeapon(String type, int strength, int damage, double lengthCM, double weightKG, int sharpness){
        this.type = type;
        this.strength = strength;
        this.damage = damage;
        this.lengthCM = lengthCM;
        this.weightKG = weightKG;
        this.sharpness = sharpness;

        this.strMod = 0;
        this.dexMod = 0;
        this.conMod = 0;
        this.intMod = 0;
        this.wisMod = 0;
        this.chaMod = 0;
    }
    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }
    public int getStrength(){
        return this.strength;

    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getDamage(){
        return this.damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }
    public double getLengthCM(){
        return this.lengthCM;

    }
    public void setLengthCM(double lengthCM){
        this.lengthCM = lengthCM;
    }
    public double getWeightKG(){
        return this.weightKG;

    }
    public void setWeightKG(double weightKG) {
        this.weightKG = weightKG;
    }
    public int getSharpness(){
        return this.sharpness;

    }
    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
    }
    public int getStrMod(){
        return this.strMod;

    }
    public void setStrMod(int strMod) {
        this.strMod = strMod;
    }
    public int getDexMod(){
        return this.dexMod;

    }
    public void setDexMod(int dexMod) {
        this.dexMod = dexMod;
    }
    public int getConMod(){
        return this.conMod;

    }
    public void setConModMod(int conMod) {
        this.conMod = conMod;
    }
    public int getIntMod(){
        return this.intMod;

    }
    public void setIntMod(int intMod) {
        this.intMod = intMod;
    }
    public int getWisMod(){
        return this.wisMod;

    }
    public void setWisMod(int wisMod) {
        this.wisMod = wisMod;
    }
    public int getChaMod(){
        return this.chaMod;

    }
    public void setChaMod(int chaMod) {
        this.chaMod = chaMod;
    }

    public boolean testAll(){
        MeleeWeapon weapon = new MeleeWeapon("Sword", 10, 15, 30.5, 2.5, 7);

        weapon.setType("Axe");
        if (!weapon.getType().equals("Axe")) return false;


        weapon.setStrength(20);
        if (weapon.getStrength() != 20) return false;


        weapon.setDamage(25);
        if (weapon.getDamage() != 25) return false;


        weapon.setLengthCM(45.0);
        if (weapon.getLengthCM() != 45.0) return false;


        weapon.setWeightKG(3.0);
        if (weapon.getWeightKG() != 3.0) return false;


        weapon.setSharpness(9);
        if (weapon.getSharpness() != 9) return false;


        weapon.setStrMod(2);
        if (weapon.getStrMod() != 2) return false;


        weapon.setDexMod(1);
        if (weapon.getDexMod() != 1) return false;


        weapon.setConModMod(3);
        if (weapon.getConMod() != 3) return false;


        weapon.setIntMod(4);
        if (weapon.getIntMod() != 4) return false;


        weapon.setWisMod(5);
        if (weapon.getWisMod() != 5) return false;


        weapon.setChaMod(6);
        if (weapon.getChaMod() != 6) return false;


        return true;
    }
}
