package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {
		int number = 2;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if(number<2) {
			System.out.println("Geçersiz sayı");
		}
		for (int i=2; i<number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime==true) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
	}

}
//6. satırda 25 yazınca sayı asal değildir çıktısını aldık 5'e bölünür. 1 yazınca (1 asal değildir en küçük asal 2dir) sayı asaldır çıktısını aldık çünkü uygulamaızda bir bug var bunun için kural gerçekleştirmeliyiz.