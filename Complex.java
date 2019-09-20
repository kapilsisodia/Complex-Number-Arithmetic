import java.lang.Math;

/**
 * Represents mathematical complex numbers of the form a + bi,
 * where a and b are both doubles
 * @author kenneth
 * @version 9/20/29
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
     * Tests if a complex number equals another object
     * @param other the other object
     * @return true if both real and imaginary
     * parts match, false otherwise
     */
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        else if (this.getClass() != other.getClass())
        {
            return false;
        }
        else if (this == other)
        {
            return true;
        }
        else if ((Math.abs(this.real() - ((Complex) other).real()) < 0.000001) &&
                 Math.abs(this.imag() - ((Complex) imag).real()) < 0.000001))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**,
     * Adds two complex numbers
     * 
     * @param second the second number
     * @return the sum of the two complex numbers
     */
    public Complex add(Complex second)
    {
        Complex sum = new Complex(this.real() + second.real(), this.imag() + second.imag());
        return sum;
    }
    
    /**,
     * Subtractss two complex numbers
     * 
     * @param second the second number
     * @return the difference of the two complex numbers
     */
    public Complex subtract(Complex second)
    {
        Complex difference = new Complex(this.real() - second.real(), this.imag() - second.imag());
        return difference;
    }
    
    /**,
     * finds the conjugate of a complex number
     * 
     * @return the conjugate of this number
     */
    public Complex conj()
    {
        Complex conjugate = new Complex(this.real(), (-1) * this.imag());
        return conjugate;
    }
    
    /**
     * Finds the magnitude of a complex number
     * @return magnitude (double)
     */
    public double mag()
    {
        return Math.sqrt(a * a + b * b);
    }
    
    /**
     * Finds the magnitude of a complex number
     * @return magnitude (Complex)
     */
    public double magAsComplex()
    {
        return new Complex(Math.sqrt(a * a + b * b), 0);
    }
    
    /**
     * Converts a double to a Complex
     * @param the original double
     * @return a Complex equivalent to the double
     */
    public static Complex toComplex(double double) //haha
    {
        return new Complex(double, 0);
    }
    
    /**
     * Converts an int to a Complex
     * @param the original int
     * @return a Complex equivalent to the int
     */
    public static Complex toComplex(int int)
    {
        return new Complex((double) int, 0);
    }
    
    /**
     * Converts a Complex to a double (imaginary part must be zero!)
     * @throws IllegalArgumentException
     * @return the converted Complex
     */
    public double toDouble()
    {
        if (Math.abs(this.imag()) < 0.000001)
        {
            throw new IllegalArgumentException();
        }
        else()
        {
            return this.a;
        }
    }
    
    
}
