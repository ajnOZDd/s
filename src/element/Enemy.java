package element;

import org.w3c.dom.css.Counter;

public class Enemy extends Effet {
    int Count = 3 ;
    String nomEnemy ;
    int pointVie ;
    double puissance  ;
    int level ;
    double vitesse ;
    int taille ;
    String [] nameArm = {"missile" ,"pisolet" , "epee"};
    double randomvalue  = Math.random()*Count;
    @Override
    String[][] nomEffet(String nomAttribut) {
     return super.nomEffet(nomAttribut);
    }
    public Enemy (){
        nomEffet("ball morte") ;
    }
    public static void main(String[] args){
        Enemy enemy = new Enemy();
    }
}
