package cookieBaking;

public class cookiePrep implements cookieDough {

	private cookieDough cookieTime;

	public void setcookieDough(cookieDough cookieDough) {
		this.cookieTime=cookieDough;
	}

	public cookieDough getcookieDough() {
		return this.cookieTime;
	}

	public void doAction() {
		this.cookieTime.doAction();
	}

}