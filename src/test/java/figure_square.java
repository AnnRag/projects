import figures.*;
import org.junit.Test;
import org.junit.Assert;

public class figure_square {

    @Test
    public void test(){
        circle Circle = new circle(1);
        square Square = new square(2);
        rectangle Rectangle = new rectangle(3,4);
        Assert.assertEquals(Circle.square(),Math.PI,0);
        Assert.assertEquals(Square.square(),4.0,0);
        Assert.assertEquals(Rectangle.square(),12.0,0);
    }
}
