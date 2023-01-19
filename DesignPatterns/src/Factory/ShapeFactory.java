
import Factory.Circle;
import Factory.Shape;

public class ShapeFactory {
    public Shape getShape(String name){
        if(name.equalsIgnoreCase("CIRCLE")){
            return new Circle() ;
        }else if(name.equalsIgnoreCase("SQURE")){
            return new Squre() ;
        }
        else if(name.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle() ;
        }
        return null;
    }
}
