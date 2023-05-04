import java.util.Scanner;

public class calistir {

	public static void main(String[] args) {
		
		// Nihad Aliyev : KOD 5397 7890 2356 0080
		// Nihadın istifadəçi adı və şifrəsi :Niho ---1234
		
		// Xudu Aliyev  : KOD 5245 4879 0079 0900
		// Xudunun istifadəçi adı və şifrəsi :Xudis ---2468
		
		/*
		 Balansa baxmaq üçün --->1
		 Pul çəkmək üçün --->2
		 Fərqli hesaba pul atmaq üçün --->3
		 Proqramdan çıxmaq üçün --->q'bottununu basin... 
		 
		 */
		String islemSecenekleri = "Balans goruntuleme -->1\n"
				    + "Pul cekmek -->2\n"
				    + "Ferqli hesaba pul atarken -->3\n"
				    + "Cixis ucun q'ya basin...";
		
		
		Scanner scanner = new Scanner(System.in);
		double nihadBalans = 2450;
		String nihadKOD = "5397 7890 2356 0080";
		String nihadIstifadeci = "Niho" ;
		String nihadSifre = "1234";
		
		
		double xuduBalans = 1890;		
		String xuduKOD =  "5245 4879 0079 0900";
		String xuduIstifadeci = "Xudis";
		String xuduSifre = "2468";
		
		System.out.println("Proqrama xos geldiniz.");
		System.out.println("Xahis olunur melumatlarinizi daxil edin.");
		
		System.out.print("Istifadeci adi:");
		String istifadeciAdi = scanner.nextLine();
		
		System.out.print("Sifre:");
		String sifre = scanner.nextLine();
		
		if(istifadeciAdi.equals("Niho") && sifre.equals("1234")) {
			System.out.println("Nihad Aliyevin hesabina daxil oldunuz...");
			System.out.println(islemSecenekleri);
			
			System.out.print("Xahis olunur bir secim edin:");
			String secim = scanner.nextLine();
			
			switch (secim) {
			case "1":
				System.out.println("Balansiniz:" +nihadBalans);
				break;
                 
			case "2":
			
				System.out.print("Cekmek istediyiniz meblegi yazin:");
				int cekilecekMebleg = scanner.nextInt();
				if(nihadBalans>=cekilecekMebleg) {
					nihadBalans -= cekilecekMebleg;
					System.out.println("Qalan mebleg:"+nihadBalans);
				}
				else {
					System.out.println("Balansinizdan cox pul ceke bilmezsiniz.. ");
				}
				break;
			case "3":
				System.out.print("Ne qeder pul kocurmek isteyirsiniz:");
		            int kocurulecekMebleg = scanner.nextInt();
		            scanner.nextLine();
				if(kocurulecekMebleg<=nihadBalans) 
				{
					System.out.print("Kod daxil edin : ");
					String kocurulecekKOD = scanner.nextLine();
					
					if(kocurulecekKOD.equals(xuduKOD)) {
					
						System.out.println("Pul Xudu Aliyev adli shexse kocurulur..");
						nihadBalans -= kocurulecekMebleg;
						xuduBalans += kocurulecekMebleg;
						//System.out.println("Xudu Aliyevin balansi:"+xuduBalans);
						//System.out.println("Nihad ALiyevin Balansi:"+nihadBalans);
					}
											
					
				}
			}
		}
		else if(istifadeciAdi.equals("Xudis") && sifre.equals("2468")) {
			System.out.println("Xudu Aliyevin hesabina daxil oldunuz...");
			System.out.println(islemSecenekleri);
		}
		else {
			System.out.println("Istifadeci adiniz ve ya sifreniz sehvdir!!");
	    } 
		
	}
}
