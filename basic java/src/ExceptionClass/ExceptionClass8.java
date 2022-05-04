package ExceptionClass;

class UserDefinedExecption extends Exception{
	public UserDefinedExecption(String e) {
		super(e);

	}
}

public class ExceptionClass8 {
	public static void validage(int age)throws UserDefinedExecption{
		if(age<18) {
			throw new UserDefinedExecption("this person is not eligible for vote");
		}else {
			System.out.println("Person is not eligible of vote ");
		}
	}

	public static void main(String[] args) {
		try {
			throw new UserDefinedExecption("this is user defined execption");
		}catch(Throwable b){
			System.out.println(b);
			
		}
		try {
			validage(18);
			
		}catch(Throwable g) {
			System.out.println(g);
		}
		System.out.println("rest program");
		

	}

}
