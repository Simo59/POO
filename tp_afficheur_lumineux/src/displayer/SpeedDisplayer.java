package displayer;

public class SpeedDisplayer extends DisplayerWithLatency {

   protected int speed;

   /**
    * @param width
    */
   public SpeedDisplayer(int width, int latency, int speed) {
      super(width, latency);
      this.speed = speed;
   }

   public int getSpeed() {
      return this.speed;
   }

   /** speed up is performed calling several times "normal" shift
    * @see displayer.LedDisplayer#shift()
    */
   public void shift() {
      for(int i = 0; i<this.speed; i++ ) {
         super.shift();
      }
   }
}
