
/**
 * la classe goods et une classe qui gere information d une marchandise avec un prix et un nom
 *
 * @author LAKROUT-HACHOUR
 * 
 */
public class Goods
{   
    private double price;// l attribut price
    private String name;//l'attribut name
    
    /** le premier constructeur qui met la valeur n a l attribut name
       *@param le nom de la marchandise
        */
    public Goods(String n){
        this.name=n;
    }
    
    /** le second constructeur
       *@param le nom de la marchandise et son prix 
       */
    public Goods(String n ,double pr){
        this.name = n;
        this.price = pr;
    }
     
    /**le premier getteur qui affiche le prix
        *@return le prix de la marchandise
        */
    public double getPrice(){
       return this.price;
    }
    
    /** le premier setteur qui modifier la valeur du prix
     * @param le prix de la marchandise a inserer 
       */
    public void setPrice(double n){
        this.price = n;
    }
    
    /** le deuxieme setteur qui modifie le nom de la marchandise
       *@pararm le nom de la marchandise
        */
    public void setName(String ch){
        this.name=ch;
     
    }
    
    /**la methode to string qui affiche la phrase "the goods name costs price"
     * @return la phrase "the goods name costs price"
       */
    public String toString(){
        return "the goods"+ this.name + "costs"+ this.price ;
    }
    
    /** la fonction ttc calacule la tva d'une marchandise et renvoi le prix final en l'ajoutant
       *return le prix final avec la tva
        */
    
    public double ttc(){
     double tva = this.price * 0.2;
     return this.price + tva;
    }
}
