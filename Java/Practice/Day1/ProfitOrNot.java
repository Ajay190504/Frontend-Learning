package day1;


public class ProfitOrNot {

	public static void main(String[] args) {


			int sp = 2500;
			int cp = 2000;

			if(cp>sp){
				
				System.out.println("Loss : "+(cp-sp));
				}
			else if(cp<sp){
				
				System.out.println("Profit : "+(sp-cp));
				}
			else{
				
				System.out.println("No Profit No Loss");
			}

	}

}

