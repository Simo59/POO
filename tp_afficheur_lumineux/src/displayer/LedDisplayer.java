package displayer;

/**
 *
 */

public class LedDisplayer {

  protected String message;
  protected int ScreenWidth;
  protected String onScreen;
  protected int currentIndex;

   public LedDisplayer(int width) {
       this.ScreenWidth=width;
   }

   /** get the (full) message of this displayer
    * @return the (full) message of this displayer
    */
   public String getMessage( ) {
       return this.message;
   }
   /**
     * set the message to display
     * @param the message to display
   */
   public void setMessage(String message) {
       this.message=message;
       this.currentIndex=-1;
       this.onScreen="";
       for(int i=0;i<this.ScreenWidth;i++){
         this.onScreen+=" ";
       }
      }

   /**
     * get the screen width
     * @return the screen width
   */
   public int getScreenWidth() {
       return this.ScreenWidth;
   }
   /**  shift message by one character  */
   public void shift() {
       this.currentIndex=(this.currentIndex+1)%this.message.length();
       this.onScreen= this.onScreen.substring(1) + this.message.charAt(this.currentIndex);
   }

   /**
     * get the text on screen
     * @return the text displayed on the screen
   */
   public String textOnScreen() {
       return this.onScreen;
   }

}
