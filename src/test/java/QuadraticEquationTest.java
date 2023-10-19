import org.example.Complex;
import org.example.QuadraticEquation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticEquationTest {
    @Test
    public void solutionTwoRoots() throws Exception {
        QuadraticEquation twoRoots = new QuadraticEquation(1, -5, 6);
        Complex[] roots = twoRoots.solve();
        Assert.assertTrue(roots.length == 2 && roots[0].equals(3.0) && roots[1].equals(2.0));
    }

    @Test
    public void solutionOneRoot() throws Exception {
        QuadraticEquation oneRoot = new QuadraticEquation(1, -4, 4);
        Complex[] roots = oneRoot.solve();
        Assert.assertTrue(roots.length == 1 && roots[0].equals(2.0));
    }

    @Test
    public void solutionComplexRoots() throws Exception {
        QuadraticEquation complexRoots = new QuadraticEquation(1, 0, 4);
        Complex[] roots = complexRoots.solve();
        Assert.assertTrue(roots.length == 2
                && roots[0].equals(new Complex(0, 2))
                && roots[1].equals(new Complex(0, -2)));
    }

    @Test(expectedExceptions = Exception.class)
    public void solutionDoesNotExist() throws Exception {
        QuadraticEquation solutionDoesNotExist = new QuadraticEquation(0, 3, 4);
    }
}
