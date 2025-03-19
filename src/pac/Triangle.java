package pac;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Triangle implements Shape{
List<Integer> listOfCoordinates=new ArrayList<>();
	double side1,side2,side3;
	
	Triangle(){
		LocalDateTime.now();
	}
	@Override
	public double getArea() {
		double semiPerimeter=(side1+side2+side3)/(2*1.0);
		double area=Math.sqrt( (semiPerimeter*(semiPerimeter-side1)) *
		(semiPerimeter*(semiPerimeter-side2)) * (semiPerimeter*(semiPerimeter-side3)) );
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter=side1+side2+side3;
		return perimeter;
	}

	@Override
	public List<Integer> getOrigin(Point pointObject) {
		listOfCoordinates.add(pointObject.x);
		listOfCoordinates.add(pointObject.y);
		return listOfCoordinates;
	}

	@Override
	public boolean isPointEnclosed(Point pointObject) {
		double hypotenuse=side3*side3;
		double base=side1/(2*1.0);
		base*=base;
		double heigth=Math.sqrt(hypotenuse-base);
		
		
		 double xOrigin=listOfCoordinates.get(0);
         double xMax=xOrigin+side1;
         double yOrigin=listOfCoordinates.get(1);
         double yMax=yOrigin+heigth;
	
		
		if(( pointObject.x>=xOrigin && pointObject.x<=xMax)
		&& (pointObject.y>=yOrigin && pointObject.y<=yMax))return true;
		else return false;
	}

	
	public List<Integer> getDimensions(){
		List<Integer> dimensions=new ArrayList<Integer>();
		Scanner scannerObject=new Scanner(System.in);
		try {
			System.out.println("Enter side1 of triangle");
			int side1=scannerObject.nextInt();
			if(side1>0) {
				dimensions.add(side1);
				
				System.out.println("Enter side2 of triangle");
				int side2=scannerObject.nextInt();
				if(side2>0) {
					dimensions.add(side2);
					
					System.out.println("Enter side3 of triangle");
					int side3=scannerObject.nextInt();
					if(side3>0)dimensions.add(side3);
					else System.out.println("Enter valid dimensions");
					
				}
				else {System.out.println("Enter valid dimensions");}
			}
			else {System.out.println("Enter valid dimensions");}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	return dimensions;
		
	}
}
