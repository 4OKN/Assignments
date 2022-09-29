package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default: // default yukarda belirtilen A,B,C,D notları dışında bir not girerseniz ne
					// olacağına dair sonuç
			System.out.println("Geçersiz not girdiniz");
		}

		//iki farklı harf notu aynı değeri versin istersek:
		//case 'B':
		//case 'C':
		//System.out.println("iyi = Geçtiniz");
		//break;  kodlamasını yaparak Console'da iy geçtiniz çıktısını alırız
	}

}
