package practise;

import java.util.Scanner;

public class New {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("lenh tiep tuc vong lap trong java");
			System.out.println("1. continue");
			System.out.println("2. break");
			System.out.println(" ban bam q de thoat");
			String luaChon = scan.nextLine();

			if (luaChon.equals("1")) {
				System.out.println("ban da tra loi dung");
				break;
			} else if (luaChon.equals("2")) {
				System.out.println("ban lua chon sai");
				break;
			} else if (luaChon.equals("q")) {
				break;
			} else {
				System.out.println("vui long lau chon dap an");
			}
		}
	}
}
