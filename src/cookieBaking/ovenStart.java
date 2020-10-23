package cookieBaking;

public class ovenStart implements baking {

	   public void doAction(cooling cooling) {
	      System.out.println("Set timer for 10 minutes or 13 minutes if you like them more done.");
	      cooling.setbaking(this);	
	   }

	   public String toString(){
	      return "Place cookies in oven.";
	   }
	}