public class Rectangle extends Shape{
    //constructor
    public Rectangle(){
        type="Rectangle";
    }

    @Override
    public void draw(){
        System.out.println("Inside Rectangle:: draw() method.");
    }
}