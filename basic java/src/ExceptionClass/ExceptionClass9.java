package ExceptionClass;

public class ExceptionClass9 {

	public static void main(String[] args)throws InterruptedException,UserDefinedExecption {
		System.out.println("Program Start");
		setsleep(2000);
		checkNumber(-1);
        System.out.println("Hello Geeks");
		

	}
	static void setsleep(long time) throws InterruptedException{
		Thread.sleep(time);
	}
	static void checkNumber(int num)throws UserDefinedExecption{
		if(num<0){
    		throw new UserDefinedExecption("Number less dn zero");
    	}else {
    		System.out.println("Number is :"+num);
    	}
	}

}
