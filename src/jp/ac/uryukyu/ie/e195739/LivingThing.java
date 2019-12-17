package jp.ac.uryukyu.ie.e195739;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name,int HP,int attack){
        this.name = name;
        hitPoint = HP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, HP, attack);
    }

    public boolean isDead(){
        return  dead;
    }

    public String getName(){
        return name;
    }

    public void attack(LivingThing opponent){
        if(!dead){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
