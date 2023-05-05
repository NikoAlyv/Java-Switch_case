
public class calistir {

	public static void main(String[] args) {
		// 1 dən 10-a qədər cüt qiymətləri yazdir
		// 1 dən 10-a qədər tək qiymətləri yazdır
		// 1 dən 10-a qədər cüt olan qiymətlərin cəmi
		// 1 dən 10-a qədər tək olan qiymətlərin cəmi

		// 1
		// Nihad
		// 3
		// Nihad
		// 5
		// Nihad

		/*
		 * int i=1;
		 * 
		 * do {
		 * 		 if(i%2==0){
		 * System.out.println(i);
		 * }
		 *  i++;
		 *   }while(i<=10);
		 */
		/*
		int i = 1;

		do {
             if(i%2==1) {
			System.out.println(i);
             }			i++;
		} while (i <= 10);
        */
		/*
		int toplam = 0;
		int i=1;
		do {
			if(i%2==0) {
				toplam +=i;
				
			}
			i++;
		}while(i<=10);
		System.out.println(toplam);
		*/
		
		int toplam = 0;
		int i=1;
		do {
			if(i%2==1)
			{
			toplam+=i;
			}
			i++;
		}while(i<=10);
		System.out.println(toplam);
		
	}

}
