
public class calistir {

	public static void main(String[] args) {

		//Break - Continue 
		//Break-dövrəni bir dəfə sındırır sonraki əməliyyatlar icra olunmur
		/*
		 * 
		int qiymetiTapdin=0;
		for(int i=1;i<=10;i++) 
		{
			if(i==4)
			{
				qiymetiTapdin=i ;
				break;
			}
			System.out.println(i);
		}
		
		*/
		
		// Continue - dövrəni eyni anda bir neçə yerdən sındıra bilər
		// sonrakı əməliyyatlar icra olunacaq
		
		int qiymetiTapdin = 0;
		
		for(int i=0;i<=10;i++)
		{
			if(i==7 || i==8) {
				qiymetiTapdin=i;
				continue;
			}
			System.out.println(i);
			
		}
		
	}

}
