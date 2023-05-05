import java.util.Scanner;

public class calistir {
	
	public static void main(String[] args) {
		
		//Sadə ədəd tapmaq 
		//1 və özündən başq heçbir ədədə bölünməyən ədədə sadə ədəd deyilir
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("***************SADE EDED TAPMAQ*************** ");
		System.out.print("Eded daxil edin:");
		int num = scanner.nextInt();
		
		boolean sadedir = false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				sadedir = false;
				break;
				
			}else {
				sadedir = true;
				
			}
		}
		if(sadedir)
		{
			System.out.println(num+" ededi sade ededdir.");
		}
		else {
			System.out.println(num+" ededi sade eded deyil");
		}
		
	}

}
