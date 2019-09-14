public class Square extends Rectangle{
    public Square(){
    }
    public Square(double size) {
        super(size,size);
    }
    public Square(double size,String color,boolean filled) {
        super(size,size,color,filled);
    }
    public double getSide() {
        return getWidth();
    }

    public void setWidth(double width) {
        setWidth(width);
    }
    public void setHeight(double height) {
        setHeight(height);
    }
    public String toString() {
        return "A square with size "
                +getSide()
                +" , which a subclass of "
                +super.toString();
    }
}
