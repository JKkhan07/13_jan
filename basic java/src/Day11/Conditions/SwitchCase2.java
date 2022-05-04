package Day11.Conditions;

public class SwitchCase2 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 5, res;
		char op = '%';
		switch (op) {
		case '+':
			res = num1 + num2;
			System.out.println("addition = " + res);
			break;
		case '-':
			res = num1 - num2;
			System.out.println("sutraction =" + res);
			break;
		case '*':
			res = num1*num2;
			System.out.println("multiplication "+res);
			break;
			default:
			System.out.println("Unknow oprator");
			break;

		}

	}

}
