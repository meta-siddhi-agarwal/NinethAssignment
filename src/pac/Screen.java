package pac;

import java.util.ArrayList;
import java.util.List;

public class Screen {
	int xMax=500,yMax=500;
	List<Shape> shapeList=new ArrayList<Shape>();
public boolean addShape(Shape shapeObject) {
	List<Integer> coordinatesList=new ArrayList<>();
	coordinatesList=shapeObject.getDimensions();
	int x=coordinatesList.get(0);
	int y=coordinatesList.get(1);
	
	List<Integer> dimensionsList=new ArrayList<>();
	
	int maxValueForX=x+dimensionsList.get(0);
	
	int maxValueForY=y+dimensionsList.get(1);
	if(maxValueForX<xMax && maxValueForY<yMax) {
		shapeList.add(shapeObject);
		return true;
	}
	else return false;
}

public boolean deleteShape(Shape shapeObject) {
	boolean isRemoved=shapeList.remove(shapeObject);
	return isRemoved;
}

public boolean deleteAllShapes(Shape shapeObject) {
	boolean isDeleted=false;
	for(int shapeListIndex=0;shapeListIndex<shapeList.size();shapeListIndex++) {
		if(shapeList.get(shapeListIndex)==shapeObject) {
			shapeList.remove(shapeListIndex);
			isDeleted=true;
		}
	}
	return isDeleted;
}

}
