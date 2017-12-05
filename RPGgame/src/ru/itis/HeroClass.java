package ru.itis;

public class HeroClass {
    protected String name;
    protected int hp;
    protected int mana;
    protected boolean isAlive = true;
    protected int bag;
    protected Zone currentZone;
    protected int damage;
    protected int lvl = 1;
    protected int exp = 0;
    protected int gold = 0;

    public HeroClass(int hp, int mana, int damage) {
        this.hp = hp;
        this.mana = mana;
        this.damage = damage;
    }

    protected void getDamage(int dmg){
        hp -= dmg;
        if (hp < 1) isAlive = false;
    }

    protected void attack(int n, Monster monster){
        monster.getDamage(n);
    }

    protected void useSpell(Spell spell){

    }

    protected void changeZone(){

    }

    protected void lvlUp(){
        this.lvl++;
    }

    protected void getAward(int exp,Item item, int gold){

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getBag() {
        return bag;
    }

    public void setBag(int bag) {
        this.bag = bag;
    }

    public Zone getCurrentZone() {
        return currentZone;
    }

    public void setCurrentZone(Zone currentZone) {
        this.currentZone = currentZone;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


}
