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
    
    /**
     * returns the real part of the number
     * @return the real part of the number
     */
    public double real()
    {
        return a;
    }
    
    /**
     * returns the real part of the number
     * @return the real part of the number
     */
    public Complex realAsComplex()
    {
        return new Complex(a, 0);
    }
    
    /**
     * returns the imaginary part of the number
     * @return the imaginary part of the number
     */
    public double imag()
    {
        return b;
    }
    
    /**
     * returns the imaginary part of the number
     * @return the imaginary part of the number
     * output has an imaginary part of zero and 
     * a real part of b
     */
    public Complex imagAsComplex()
    {
        return new Complex(b, 0);
    }
    
    /**
     * Represents the complex number as a String
     * of the form a + bi
     *
     * @return a String representation of the number
     * @Override
     */
    public String toString()
    {
        if (b > 0)
        {
            return a + " + " + b + "i";
        }
        else if (b < 0)
        {
            return a + " - " + (-1) * b + "i";
        }
        else
        {
            return "" + a;
        }
    }
    
    /**
     * Tests if two complex numbers are equal
     * @return true if both real and imaginary
     * parts match, false otherwise
     */
    public boolean equals(complex2)
    {
        //need to implement
        return false;
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
