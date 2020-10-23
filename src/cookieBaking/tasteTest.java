package cookieBaking;

public class tasteTest {
	   public static void main(String[] args) {
		   cooling cooling = new cooling();

		   ovenStart ovenStart = new ovenStart();
		      ovenStart.doAction(cooling);

		      System.out.println(cooling.getbaking().toString());

		      ovenStop ovenStop = new ovenStop();
		      ovenStop.doAction(cooling);

		      System.out.println(cooling.getbaking().toString());
		   }
		}