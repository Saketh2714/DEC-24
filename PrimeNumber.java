package dec24;

public class PrimeNumber {

	public static void main(String[] args) {
		int pc=0;
		for(int k=1;k<300;k++) {
			
			if(checkPrime(k)==1) {
				System.out.println(k+" ");
				pc++;
				if(pc==17) {
					System.out.println(k);
					break;
				}
			}
		}

	}

	private static int checkPrime(int k) {
		
		
		int count=0;
		for(int i=1;i<=k;i++) {
			if(k %i == 0) count++;
		}
		if(count == 2) return 1;
		
		
		
		return 0;
	}

}
