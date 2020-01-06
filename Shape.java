/*
    cloneable means this class can be cloned/duplicated

*/

public abstract class Shape implements Cloneable {
    //every shape type has an id circle = 1, square = 2, rectangle = 3
    private String id;
    protected String type; //circle/rectangle/Square

    //draw method would be implemented by subclasses,shows information that one shape(circle/rectangle/square) is created
    abstract void draw();

    public String getType(){
        return type;
    } 

    public String getId(){
        return id;
    } 

    public void setId(String id){
        this.id = id;
    }

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }


}//class