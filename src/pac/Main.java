package pac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	int xmax=500,ymax=500;
	Main mainObject=new Main();
	
	static boolean isValid=true;
	
	static Factory factoryObject=new Factory();
	static Scanner scannerObject=new Scanner(System.in);
	static Shape shapeObject;
	static Point pointObject=new Point();
	
    static List<Integer> coordinatesList=new ArrayList<Integer>();

	public static void main(String[] args) {
		while(isValid) {
			try {
				System.out.println("Enter which shape you want to create\n"
				+"1.Rectangle\n"+"2.Square\n"+"3.Triangle\n"+"4.Circle\n"+"5.Exit");
				int input=scannerObject.nextInt();
				switch(input) {
				case 1:
					shapeObject=factoryObject.createShape("rectangle");
				    pointObject.getCoordinatesFromUser();
				    coordinatesList=shapeObject.getDimensions();
				    factoryObject.createShape(shapeObject, pointObject, coordinatesList);
					break;
				case 2:
					shapeObject=factoryObject.createShape("square");
					pointObject.getCoordinatesFromUser();
					coordinatesList=shapeObject.getDimensions();
					factoryObject.createShape(shapeObject, pointObject, coordinatesList);
					break;
				case 3:
					shapeObject=factoryObject.createShape("triangle");
					pointObject.getCoordinatesFromUser();
					coordinatesList=shapeObject.getDimensions();
					factoryObject.createShape(shapeObject, pointObject, coordinatesList);
					break;
				case 4:
					shapeObject=factoryObject.createShape("circle");
					pointObject.getCoordinatesFromUser();
					coordinatesList=shapeObject.getDimensions();
					factoryObject.createShape(shapeObject, pointObject, coordinatesList);
					break;
				case 5:
					System.out.println("Program terminated successfully");
					isValid=false;
					break;
				default:
					System.out.println("Select valid option");
					break;
					
				}
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}
