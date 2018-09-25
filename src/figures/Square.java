package figures;

public class Square implements Figure {

    private double side_lenght;

    public Square(double side_lenght) {
        Error negativeValuesError = new Error("negative values in figure size");
        if (side_lenght < 0){
            throw negativeValuesError;
        }
        this.side_lenght = side_lenght;
    }

    @Override
    public double calculateArea() {
        return side_lenght*side_lenght;
    }
}
