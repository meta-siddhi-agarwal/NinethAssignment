package pac;

import java.util.Scanner;

public class Point {
int x,y;
Scanner scannerObject=new Scanner(System.in);

public void getCoordinatesFromUser() {
	System.out.println("Enter x coordinates");
		x=scannerObject.nextInt();
		System.out.println("Enter y coordinates");{
			y=scannerObject.nextInt();
	}
}
}