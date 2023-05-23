// program to show errors and anomely in switch case
public class SwitchAnomly{
	public static void main(String[] args){
		// repeated case value leads to errors
		// following code will generate error
		switch(3){
			case 2: System.out.print("2");break;
			case 2: System.out.print("2");break;
			case 3: System.out.print("2");break;
		}
		// break; terminates the execution in switch case; 
		// if it is not goven then consecutive cases 
		// will be executed without matching
		switch(1){
			case 0: System.out.print("0");break;
			case 1: System.out.print("1");
			case 2: System.out.print("2");
			case 3: System.out.print("3");
			default: System.out.print("4");
			// case 1 will match and further cases will automatically
			// executed untill next break or default case
			// prints 1234
		}
		// floating values or boolean values are not allowed 
		switch(1.0f){ // will generate error
			case 0.0f: System.out.print("0");break;
			case 1.0f: System.out.print("1");break;
			case 2.0f: System.out.print("2");break;
			case 3.0f: System.out.print("3");
		}
		// all case value type should match with expresstion type
		// but char and int types can together use
		switch("hey"){ // will generate error
			case 1: System.out.print("0");break;
			case 'A': System.out.print("1");break;
			case "hey": System.out.print("2");break;
			case 3l: System.out.print("3");
		}
	}
}