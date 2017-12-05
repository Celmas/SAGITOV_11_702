package ru.itis;

public class Monster extends HeroClass {
    public Monster(int hp,int lvl, int damage,int exp, int loot){
        super(hp,0,damage);
        this.lvl = lvl;
        this.exp = exp;
        this.gold = loot;
    }

    public void giveAwards(HeroClass hero){
        hero.getAward(exp,null, gold);
    }
}
