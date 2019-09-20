/**
 * Represents mathematical complex numbers of the form a + bi
 */
public class Complex()
{
    /**
     * Real part
     */
    private double a;
    /**
     * Imaginary part
     */
    private double b;
    
    /**
     * Creates a complex number equal to zero
     */
    public Complex()
    {
        a = 0;
        b = 0;
    }
    
    /**
     * Creates a complex number with the given
     * real and imaginary parts
     */
     public Complex(double a, double b)
     {
         this.a = a;
         this.b = b;
     }
    
    
}
