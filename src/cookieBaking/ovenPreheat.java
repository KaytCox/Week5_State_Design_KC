package cookieBaking;

public class ovenPreheat {

	private String cookieDough="";
	
	public void setcookieDough(String cookieDough){
		this.cookieDough=cookieDough;
	}
	
	public void doAction(){
		if(cookieDough.equalsIgnoreCase("BAKE")){
			System.out.println("Cookies are in the oven.");
		}else if(cookieDough.equalsIgnoreCase("DONE")){
			System.out.println("Cookies are done.");
		}
	}

	public static void main(String args[]){
		ovenPreheat remote = new ovenPreheat();
		
		remote.setcookieDough("BAKE");
		remote.doAction();
		
		remote.setcookieDough("DONE");
		remote.doAction();
	}

}
