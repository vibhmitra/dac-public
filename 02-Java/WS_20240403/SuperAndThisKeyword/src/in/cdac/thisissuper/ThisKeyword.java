package in.cdac.thisissuper;

class ABC {
	ABC() {
		System.out.println("ABC DEfault Constructor.");
	}
	
	ABC(int x) {
		this(); 	/// Calling the default constructor;
		System.out.println("Value of X : " + x);
	}
}


public class ThisKeyword {
	
	void msg() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		System.out.println(tk);
		tk.msg();
		ABC abc = new ABC(2);
	}

}
