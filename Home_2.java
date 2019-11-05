package oop_2;
import java.util.*;

public class Home_2 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 String alpha = new String(" אבגדהו¸זחטיךכלםמןנסעףפץצקרשתûü‎‏ÿ");
		 String text = scan.nextLine();
		 scan.close();
		 StringBuilder res = new StringBuilder("");
		 System.out.println(text);
		 
		 for (int i=0;i<text.length();i++) {
			 res.append(alpha.indexOf(text.charAt(i)));
		 }
		 
		 System.out.println(res);

	}

}
