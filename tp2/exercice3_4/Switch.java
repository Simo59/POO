
/**
 * Décrivez votre classe Switch ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Switch
{
   private Lightbulb ampoulle;// lattribut ampoulle qu on cree a la creation de l instance
   
   /** le construvteur switch qui cree l'ampoulle qu on controlle
      @param amp l'ampoulle qu'on controlle*/
   
   public Switch( Lightbulb amp){
    this.ampoulle = amp;
    }

    /**la methode qui renvoie l'ampoulle controllèè par l interepteur
       @return l ampoulle qui est controllée par l'interepteur(switch */
   public Lightbulb getLightbulb(){
    return this.ampoulle;
}

/** la methode push allume ou eteint l'ampoulle controlle par l'interepteur selon son etat (elle l'allume si elle est eteinte et au sens contraire)*/
public void push(){
  if (this.ampoulle.isOn() == true){
    this.ampoulle.off();
    }
  else{
    this.ampoulle.on();}
}
}
