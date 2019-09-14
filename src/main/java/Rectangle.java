public class Rectangle extends Shape{
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height,String color,boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return 2*(width+height);
    }

    public String toString() {
        return "A rectangle width "
                + getWidth()
                +" and height "
                +getHeight()
                +" which a subclass "
                +super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width = (this.width/100)*percent;
        this.height = (this.height/100)*percent;
    }
}
