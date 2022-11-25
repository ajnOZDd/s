package element;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Nom  {
    String hote ;
    String ip ;
    String nomJoueur ;
    int point ;
    int matchgagner ;
    JFrame frame ;

    String [] couleur ;

    public void setLabel (String hote ,String ip , String nomJoueur ,int point,int matchgagner ){
        this.hote=hote ;
        this.ip=ip ;
        this.nomJoueur=nomJoueur ;
        /*this.point=point ;*/
       /*  this.matchgagner=matchgagner*/ ;
    }
    public void  getLabel() {
     frame= new JFrame () ;
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE) ;
     
     Object [] Allthings= {hote ,ip, nomJoueur ,point , matchgagner } ;
    JLabel  label  ;
     String r = "" ;
     for (int i=0; i<Allthings.length-1; i++){
     r=r+Allthings[i]+"  ";
     }
     r=r+Allthings[Allthings.length-1] ;

     label = new JLabel(r);
     label.setLocation(500,500);
     frame.add(label) ;

     }


    

    private Nom (){
        setLabel("1234" , "192.168.1.2" , "all" ,1 ,2 )  ;
        getLabel () ;
    }

    public static void main(String[] args) throws Exception {
        Nom nom = new Nom();
    }


}
