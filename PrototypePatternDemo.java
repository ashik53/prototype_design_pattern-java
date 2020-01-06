
public class PrototypePatternDemo {
   public static void main(String[] args) {
      //insert all shape objects into HashMap
        ShapeCache.loadCache();
        
        //call by by 'shape id = 1'
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : "+clonedShape.getType());

        //call by by 'shape id = 2'
        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());		
   }
}