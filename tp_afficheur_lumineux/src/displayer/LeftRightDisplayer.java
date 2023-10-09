package displayer;

public class LeftRightDisplayer extends LedDisplayer{

 public LeftRightDisplayer(int width ){
   super(width);
 }
   public void shift() {
       this.currentIndex=(this.currentIndex+1)%this.message.length();
       this.onScreen=  this.message.charAt(this.currentIndex)+this.onScreen.substring(0,this.ScreenWidth-1);
   }




}
