package pac;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Circle  implements Shape{
    double radius;
    List<Integer> originCoordinates=new ArrayList<Integer>();
    
    Circle(){
    	LocalDateTime.now();
    }

	@Override
	
	 public double getArea() {
		double area=radius*radius*3.14;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter=2*3.14*radius;
		return perimeter;
	}

	@Override
	public List<Integer> getOrigin(Point pointObject) {
		originCoordinates.add(pointObject.x);
		originCoordinates.add(pointObject.y);
		return originCoordinates;
	}

	@Override
	public boolean isPointEnclosed(Point pointObject) {
     double xCoordinate=pointObject.x;
     double yCoordinate=pointObject.y;
     
     double maxXCoordinate=originCoordinates.get(0)*2*radius;
     double maxYCoordinate=originCoordinates.get(1)*2*radius;
     
     if(xCoordinate<=maxXCoordinate && yCoordinate<=maxYCoordinate)return true;
     else return false;
	}
	
	public List<Integer> getDimensions(){
		List<Integer> dimensions=new ArrayList<Integer>();
		Scanner scannerObject=new Scanner(System.in);
		try {
			System.out.println("Enter radius of circle");
			int radius=scannerObject.nextInt();
			if(radius>0) {
				dimensions.add(radius);
			}
			else System.out.println("Enter valid dimensions");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	return dimensions;
		
	}

}
