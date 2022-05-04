package Constructor;

public class Constructor8 {
	double sum(int g, int h) {
		System.out.println(g + h);
		return (g + h);
	}

	double sum(int g, double h) {
		System.out.println(g + h);
		return (g + h);
	}

	public static void main(String[] args) {
		Constructor8 c1=new Constructor8();
		 c1.sum(20, 20);
		 c1.sum(20, 20.56);
	}

}
