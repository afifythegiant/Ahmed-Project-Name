
public class calculator {
	public static void main (String args[]) {
	
		double X = 4.5;        // 1st numb
		double Y = 2.5;       // 2nd numb
		char operator = '/';
		
		
		switch(operator) {
		
		case '+': System.out.println(X+Y);
		break;
		
		case '-': System.out.println(X-Y);
		break;
		
		case '*': System.out.println(X*Y);
		break;
		
		case '/': System.out.println(X/Y);
		break;
		
		default: System.out.println("Incorrect operator");
		}
		

}
}