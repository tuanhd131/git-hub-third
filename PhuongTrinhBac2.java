package practise;

import java.util.Scanner;

public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ax2 + bx +c = 0
		// neu a =0. nghiem la x =-c/b
		// neu a!= 0, tinh delta = b2-4ac
		// neu delta <0, pt vo nghiem
		// neu delta = 0, thi x = -b/2a
		// delta >0. x1 = (-b-can(delta))/2a; x2= (-b+cawn(delta))/2a
		System.out.println("Vui long nhap vao gia tri a, b, c: ");
		Scanner In = new Scanner(System.in);
		
		double a = In.nextDouble();
		double b = In.nextDouble();
		double c = In.nextDouble();
		
		if (a==0) {
			System.out.println(" Nghiem la x= " + -c/b);
			
		}
		else {
			double delta = b*b - 4*a*c;
			if (delta <0) {
				System.out.println("Phuong trinh vo nghiem!");
				
			}
			else if(delta ==0) {
				System.out.println("Phuong trinh co nghiem kep la x=" + -b/(2*a));
				
			}
			else {
				System.out.println("Phuong trinh co 2 nghiem!");
				System.out.println("Nghiem x1= "+ (-b-Math.sqrt(delta))/2*a );
				System.out.println("Nghiem x2= "+ (-b+Math.sqrt(delta))/2*a );
			}
		}
	}

}
