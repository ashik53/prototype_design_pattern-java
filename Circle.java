public class Circle extends Shape{
    public Circle(){
        type="circle";
    }

    @Override
    public void draw(){
        System.out.println("Inside circle:: draw() method.");
    }
}