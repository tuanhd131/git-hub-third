package practise;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] mang = { 'a', 'b' ,'c', 'd', 'e'};
		boolean x =true;
		while (x) {
			System.out.println("Nhap vao mot ky tu: ");
			Scanner scan = new Scanner(System.in);
			char St = scan.next().charAt(0);
			int i=0;
			for (;i< mang.length; i++) {
				
				if(St == mang[i]) {
					System.out.println("ban da nhap dung!");
					x=false;
					break;
				}
			}
		}
		System.out.println("ket thuc");
	}

}
