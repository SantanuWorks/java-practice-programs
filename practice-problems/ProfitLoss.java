// cost and sell price is given; find incurred loss or profit
// input through command line 
public class ProfitLoss{
	public static void main(String[] args){
		int cp = Integer.parseInt(args[0]);
		int sp = Integer.parseInt(args[1]);
		if( cp > sp ) System.out.print("He incurred a loss of "+(cp-sp));
		else if( cp < sp ) System.out.print("He incurred a profit of "+(sp-cp));
	}
}