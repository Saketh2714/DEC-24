package dec24;

public class Test {
	
	public static void main(String[] args) {	
		
	
				float num =6.789999999f;	
				num = (int)(num * 1000);
				System.out.println(num);
				// 678
				int r = (int)(num % 10);// 8
				num = (int)(num / 10);
				
				if(r > 5) {
					// 678
					// 677+1---678---6.78
					num++;
				}
				// 678--- 6.78
				num = num / 100;
				// 6.78
				
				System.out.println("num--->"+num);
				
				
			}
}

