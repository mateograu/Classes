public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length1) {
        this.length = length1;
    }

    public void setWidth(double width1) {
        this.width = width1;
    }

    public double getArea(){
        return length * width;
    }

    public double getDiagonal(){
        double squared = length * length;
        double squared0 = width * width;
        double diagonal = Math.sqrt(squared  + squared0 );
    return diagonal;
    }

    public boolean isSquare(){
        return length == width;
    }
    
}
