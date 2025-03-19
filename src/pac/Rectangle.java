package pac;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rectangle implements Shape{
double length,breadth;
List<Integer> coordinatesList=new ArrayList<>();

  Rectangle(){
	  LocalDateTime.now();
  }
	@Override
	public double getArea() {
		double area=length*breadth;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter=2*(length+breadth);
		return perimeter;
	}

	@Override
	public List<Integer> getOrigin(Point pointObject) {
		coordinatesList.add(pointObject.x);
		coordinatesList.add(pointObject.y);
		return coordinatesList;
	}

	@Override
	public boolean isPointEnclosed(Point pointObject) {
         double xOrigin=coordinatesList.get(0);
         double xMax=xOrigin+length;
         double yOrigin=coordinatesList.get(1);
         double yMax=yOrigin+length;
	
		
		if(( pointObject.x>=xOrigin && pointObject.x<=xMax)
		&& (pointObject.y>=yOrigin && pointObject.y<=yMax))return true;
		else return false;
		
	}

	public List<Integer> getDimensions(){
		List<Integer> dimensions=new ArrayList<Integer>();
		Scanner scannerObject=new Scanner(System.in);
		try {
			System.out.println("Enter length of rectangle");
			int length=scannerObject.nextInt();
			if(length>0) {
				dimensions.add(length);
				
				System.out.println("Enter breadth of rectangle");
				int breadth=scannerObject.nextInt();
				if(breadth>0) {
					dimensions.add(breadth);
					
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
