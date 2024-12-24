package dec24;

public class TestV1 {

	public static void main(String[] args) {
		float num = 5.99499999999f;
		String str=num+"";
		int index=str.indexOf(".");
		char ch= str.charAt(index+3);
		System.out.println(". position...>"+str.indexOf("."));
		
		
		num=(int)(num*1000);
		System.out.println(num);

		
		int r = (int)(num % 10);
		num = (int)(num / 10);	
		if(r > 5) {
			
			num++;
		}
	
		num = num / 100;
	
		System.out.println("num--->"+num);
	}

}
