package simpleEg;

public class Army {
    double hp = 50;
    int attack = 8;
    double defense =0.2;

    void attack(Army enemy){

        enemy.hp-=attack*(1-enemy.defense);
    }
}
