package cookieBaking;

public class ovenSettings {

	public static void main(String[] args) {
		cookiePrep context = new cookiePrep();
		cookieDough cookiesBake = new cookiesBake();
		cookieDough cookiesDone = new cookiesDone();
		
		context.setcookieDough(cookiesBake);
		context.doAction();
		
		
		context.setcookieDough(cookiesDone);
		context.doAction();
		
	}

}