public class Oddloop{
	public static void main(String [] args){

		int i=1;// the dividend
		int t=2;// the divisor

		for(i=1; i<=100; i++){
			if (i%t == 0){
				System.out.println(" ");
			}
			else{
				System.out.print(i);
			}
		}
	}
}
