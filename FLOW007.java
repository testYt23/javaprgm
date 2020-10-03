import java.util.*;
import java.lang.*;
import java.io.*;
public class FLOW007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			int num = sc.nextInt();
			int reversed = 0;
			while(num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }
			System.out.println(reversed);
		}

	}

}
