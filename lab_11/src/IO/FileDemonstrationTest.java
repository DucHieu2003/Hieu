package IO;

import java.util.Scanner;

public class FileDemonstrationTest {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		FileDemonstration application = new FileDemonstration();

		System.out.print("Nhap ten tep hoac thu muc: ");
		application.analyzePath(input.nextLine());
	}  
}  
