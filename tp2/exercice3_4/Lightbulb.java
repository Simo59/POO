
/**
 * Décrivez votre classe Lightbulb ici.
 *
 * @author l
 * @version (un numéro de version ou une date)
 */
public class Lightbulb
{
    private int power;
    private String color;
    private boolean allumee;
    
    /** le constructeur qui met la force a p et la color a col et letat de l'ampoule a et
     * @param p la force de l'ampoule en watts
     * @param col la couleur de l'ampoule
     * @param et l etat de lampoulle si elle est allumée
     */
    public Lightbulb( int p , String col){
      this.power = p;
      this.color = col;
    }
    
    /** affiche la puissance de l'ampoule
     * @return la puissance de l'ampoule en watts
       */
    public int getPower(){
        return this.power;
    }
    
    /** affiche la couleur de l'ampoule
       *@return la couleur de l'ampoule
       */
    public String getColor(){
        return this.color;
    }
    
    /**affiche l'etat de lampoule si elle est alluméé ou eteinte
     * @return est ce que l'ampoule et allumée
       */
    public boolean isOn(){
        return this.allumee;
    }
    
    /**allume l'ampoule
       */
    public void on(){
        this.allumee=true;
    }
    
    /** eteint l'ampoule*/

    public void off(){
        this.allumee=false;
    }
    
    /**la methode toString qui decrit l'ampoule*/
    public String toString(){
        String res;
        if  (this.allumee== true)
            res = "l ampoule est "+ this.color +" et sa force est de "+ this.power+ "W et elle est allumee";
         else
         res = "l ampoule est "+ this.color +" et sa force est de "+ this.power+ "W et elle est eteinte";
        return res ;
    }
    
}
