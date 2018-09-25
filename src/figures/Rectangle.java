package figures;

public class Rectangle implements Figure {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        Error negativeValuesError = new Error("negative values in figure size");
        if ((width < 0)||(height<0)){
            throw negativeValuesError;
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width*height;
    }
}
