package stringsDemo;

public class Mian {

	public static void main(String[] args) {
		String message = "    The weather is beautiful today.    ";
		System.out.println(message);

		/*
		 * System.out.println("Eleman sayısı : " + message.length());
		 * System.out.println("5. eleman :" + message.charAt(3));
		 * System.out.println(message.concat("Hooray!"));
		 * System.out.println(message.startsWith("T"));
		 * System.out.println(message.endsWith(".")); char[] characters = new char[5];
		 * message.getChars(0, 5, characters, 0); System.out.println(characters);
		 * System.out.println(message.indexOf('a'));
		 * System.out.println(message.indexOf("he"));
		 * System.out.println(message.lastIndexOf("e"));
		 */

		String newmessage = message.replace(' ', '-');
		// System.out.println(message.replace(' ', '-'));
		System.out.println(newmessage);
		System.out.println(message.substring(2, 7));
		
		for(String kelime : message.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
	}

}
//Engin profesörün Intellij IDE'sinde sol üstte Code>coment with Block Comment ile yaptığının karşılığını Eclipsede Source>Add Block Comment ile kendim bulup yaptım
//message.indexOf('') belirttiğim karakterin kaçıncı eleman olduğunu bulmaya yarar. lastindex ise sondanyani sağdan başlar
//5.eleman 0'dan başladığımız için 4.indextir.
//concat means concatenation which is a series of interconnected things. Actually mit message.concat has created a new String.
//The ile başlıyor yani T yazarsak true başka bir harf hatalı olur. küçük t yazsak yine false olur. Java case sensitive olduğundan startsWith harfi büyükse true çıktısı için büyük harf ile yazılır.
//subString'in görevi metnin içinden parça almaktır.
//Split fonksiyonu bir metni belirli bir karakter veya karakter dizisini dikkate alarak parçalamaya yarar.
//toLowerCase harflerin hepsini küçültür. toUpperCAse ise tam tersini yapar