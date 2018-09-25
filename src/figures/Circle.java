package figures;

public class Circle implements Figure{

    private double radius;

    public Circle(double radius) {
        Error negativeValuesError = new Error("negative values in figure size");
        if (radius < 0){
            throw negativeValuesError;
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
