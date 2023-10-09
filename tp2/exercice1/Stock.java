
/**
 * class Stock : permet la modélisation de Stocks
 *
 * @author HACHOUR-LAKROUT
 */
public class Stock
{
    /** l attribut quantity */
    private int quantity;
    /** Stock est un constructeur de la classe qui initialise la quantity a 0 */
    public Stock () {
        this.quantity = 0;
    }
    
    /** le deuxieme constructeur qui met la quantite a une valeur entre en parametre
     * @param le nombre a mettre dans la quantite
     */
    public Stock(int val){
        this.quantity = val;
    }
    
    /** methode getContity qui permet de consulter le stock
       * @return le resultat est la quantity dans le stock*/
   public int getQuantity(){
       return this.quantity; 
    }
    
    /**La méthode add permet d'augmenter la quantité de n
       * @param le nombre dont on doit augmenter la quantité*/
    public void add(int n){
        this.quantity=this.quantity + n;
    }
    
    
    /** la methode remove permet de diminuer le stock de r 
     * @param le nombre qu on veut diminuer
     * @return combien on a diminuer
     */
    public int remove(int r){
        int res;
        if (r<=this.quantity){
           res=r;
         this.quantity=this.quantity-r;}
        else{
            res= this.quantity;
            this.quantity=0;
        
        }
        return res ;
    }
    
    /** la methode to string qui renvoi la phrase"the stock’s quantity is n" avec n la quantite
     * @return la phrase "the stock’s quantity is n" avec n la quantite dans le stock
     */
    public String toString(){
        return "the stock’s quantity is " + this.quantity;
        
    }
       
        
    
    
    
}
