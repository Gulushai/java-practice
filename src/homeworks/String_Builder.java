package homeworks;
import java.util.*;
public class String_Builder {

	public static void main(String[] args) {
		char ch = 'A';
		ch++;
		System.out.println(ch);
		
		StringBuilder alphabet = new StringBuilder();
		
		for(char v ='A'; v<='Z'; v++) {
		alphabet.append(v);
		
		}System.out.println(alphabet);

	}

}
