package displayer;
public class DisplayerWithLatency extends LedDisplayer{
 protected int latency;

 public DisplayerWithLatency(int w ,int l){
   super(w);
   this.latency=l;
 }

 public void setMessage(String message){
   String messageWithLatency=message;
   for (int i=0;i<this.latency;i++){
     messageWithLatency+=" ";
   }
   super.setMessage(messageWithLatency);
 }

public String getMessage(){
  return this.message.substring(0,this.message.length()-this.latency);
}


}
