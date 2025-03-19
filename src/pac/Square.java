package pac;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Square implements Shape{
double side;
List<Integer> listOfCoordinates=new ArrayList<Integer>();


Square(){
	LocalDateTime.now();
}
	@Override
	public double getArea() {
		double area=side*side;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter=4*side;
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
		 double xOrigin=listOfCoordinates.get(0);
         double xMax=xOrigin+side;
         double yOrigin=listOfCoordinates.get(1);
         double yMax=yOrigin+side;
	
		
		if(( pointObject.x>=xOrigin && pointObject.x<=xMax)
		&& (pointObject.y>=yOrigin && pointObject.y<=yMax))return true;
		else return false;
	    
	}

	public List<Integer> getDimensions(){
		List<Integer> dimensions=new ArrayList<Integer>();
		Scanner scannerObject=new Scanner(System.in);
		try {
			System.out.println("Enter side of square");
			int side=scannerObject.nextInt();
			if(side>0) {
				dimensions.add(side);}
				
			else {System.out.println("Enter valid dimensions");}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	return dimensions;
		
	}

}
