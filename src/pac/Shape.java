package pac;

import java.util.List;

public interface Shape {
double getArea();
double getPerimeter();
List<Integer> getOrigin(Point pointObject);
boolean isPointEnclosed(Point pointObject);
List<Integer> getDimensions();

}
