package pac;
import java.util.*;
public class Factory {
	
public Shape createShape(String typeOfShape) {
	if(typeOfShape=="circle") {
		Circle circleObject=new Circle();
		return circleObject;
	}
	else if(typeOfShape=="rectangle") {
		Rectangle rectangleObject=new Rectangle();
		return rectangleObject;
	}
	else if(typeOfShape=="square") {
		Square squareObject=new Square();
		return squareObject;
	}
	else {
		Triangle triangleObject=new Triangle();
		return triangleObject;
	}
}
	
public static void createShape(Shape shapeObject,Point pointObject,List<Integer> dimensionList) {
	
}

}
