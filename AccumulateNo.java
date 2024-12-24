package dec24;

public class AccumulateNo {

	public static void main(String[] args) {
		int num = 8179,r,sum=0;
		
		while(num!=0) {
			r=num%10;
			num=num/10;
			sum=sum+r;
			if(num==0) {
				if(sum>10) {
					num=sum;
					sum=0;
				}
			}
		}
System.out.println("sum......>"+sum);
	}

}
