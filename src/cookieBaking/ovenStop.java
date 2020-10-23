package cookieBaking;

public class ovenStop implements baking {

	   public void doAction(cooling cooling) {
	      System.out.println("Timer goes off after 10 minutes.");
	      cooling.setbaking(this);	
	   }

	   public String toString(){
	      return "Stop the timer and take cookies out of oven.";
	   }
	}