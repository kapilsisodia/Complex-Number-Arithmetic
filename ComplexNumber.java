/**
 * Represents mathematical complex numbers of the form a + bi,
 * where a and b are both doubles
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
    
    /**,
     * Adds two complex numbers
     * 
     * @param addend1 the first number
     * @param addend2 the second number
     * @return the sum of the two complex numbers
     */
    public Complex add(Complex addend1, Complex addend2)
    {
        //need to implement
        return new Complex();
    }
    
    
}
