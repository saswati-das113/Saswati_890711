package saswati_890711;

public class Bird {
	static int height=4;
	static String category="small";
	static boolean canfly=true;
	static float distance=30f;
	static double weight=8.0;
	
	public void Fly() {
		System.out.println("Bird can Fly");
	}

	public Bird() {
	super();
		// TODO Auto-generated constructor stub
	}


	void display() {
		System.out.println(height+" "+category+" "+canfly+" "+distance+" "+weight);
	}

}
