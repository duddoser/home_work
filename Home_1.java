package oop_2;
import java.util.*;

public class Home_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();   // сам текст
		char x = scan.nextLine().charAt(0); // символ, на который заменяем
		int k = scan.nextInt();  // номер буквы для замены
		StringBuilder text2 = new StringBuilder("");
		
		if (text.length() >= k) {
			for (int i=0;i<text.length();i++) {
				if ((i + 1) % k == 0) {
					text2.append(x);
				} else {
					text2.append(text.charAt(i));
				}
			}
		}
		
		System.out.println(text2);  // вывод преобразованного текста

	}

}
