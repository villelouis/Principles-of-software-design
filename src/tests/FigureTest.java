package tests;

import figures.Circle;
import figures.Figure;
import figures.Rectangle;
import figures.Square;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FigureTest {
    private static final double  RADIUS = 10;
    private static final double  WIDTH = 10;
    private static final double  HEIGHT = 10;
    private static final double  SIDE_LENGTH = 10;
    
    private Figure circle = new Circle(RADIUS);
    private Figure rectangle = new Rectangle(WIDTH,HEIGHT);
    private Figure square = new Square(SIDE_LENGTH);

    @Test
    void calculateArea() {
        Assert.assertEquals(Math.PI*Math.pow(RADIUS,2),circle.calculateArea(),0.01);
        Assert.assertEquals(WIDTH*HEIGHT,rectangle.calculateArea(),0.01);
        Assert.assertEquals(Math.pow(SIDE_LENGTH,2),square.calculateArea(),0.01);
    }

}