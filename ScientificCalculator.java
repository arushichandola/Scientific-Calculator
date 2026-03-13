/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scientificcalculator;

/**
 *
 * @author chand
 */
import java.util.*;
public class ScientificCalculator 
{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int choice;
        do 
        {
            showMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1: // TODO: Implement addition
                {
                    System.out.println("Enter number of terms to add: ");
                    int num = sc.nextInt();
                    System.out.println("Enter numbers: ");
                    double[] numbers = new double[num];
                    for (int i = 0; i < num; i++)
                    {
                        numbers[i] = sc.nextDouble();
                    }
                    double result = add(numbers);
                    System.out.println("The sum is: " +result);
                    break;
                }
                case 2: // TODO: Implement subtraction
                {
                    System.out.println("Enter number 1 to subtract: ");
                    int a = sc.nextInt();
                    System.out.println("Enter number 2 to subtract: ");
                    int b = sc.nextInt();
                    double result = subtract(a, b);
                    System.out.println("The difference is: " +result);
                    break;
                }
                case 3: // TODO: Implement multiplication
                {
                    System.out.println("Enter number of terms to multiply: ");
                    int num = sc.nextInt();
                    System.out.println("Enter numbers: ");
                    double[] numbers = new double[num];
                    for (int i = 0; i < num; i++)
                    {
                        numbers[i] = sc.nextDouble();
                    }
                    double result = multiply(numbers);
                    System.out.println("The product is: " +result);
                    break;
                }
                case 4: // TODO: Implement division
                {
                    System.out.println("Enter divisor: ");
                    double divis = sc.nextDouble();
                    System.out.println("Enter divident: ");
                    double divid = sc.nextDouble();
                    double result = division(divis, divid);
                    System.out.println("The division result is: " +result);
                    break;
                }
                case 5: // TODO: Implement modulus
                {
                    System.out.println("Enter number: ");
                    double a = sc.nextDouble();
                    double result = modulus(a);
                    System.out.println("The modulus of given number is: " +result);
                    break;
                }
                case 6: // TODO: Implement square
                {
                    System.out.println("Enter number: ");
                    double a = sc.nextDouble();
                    double result = square(a);
                    System.out.println("The square of given number is: " +result);
                    break;
                }
                case 7: // TODO: Implement cube
                {
                    System.out.println("Enter number: ");
                    double a = sc.nextDouble();
                    double result = cube(a);
                    System.out.println("The cube of given number is: " +result);
                    break;
                }
                case 8: // TODO: Implement square root
                {
                    System.out.println("Enter number: ");
                    double a = sc.nextDouble();
                    double result = squareroot(a);
                    System.out.println("The square root of given number is: " +result);
                    break;
                }
                case 9: // TODO: Implement cube root
                {
                    System.out.println("Enter number: ");
                    double a = sc.nextDouble();
                    double result = cuberoot(a);
                    System.out.println("The cube root of given number is: " +result);
                    break;
                }
                case 10: // TODO: Implement power (x^y)
                {
                    System.out.println("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.println("Enter power: ");
                    int pow = sc.nextInt();
                    double result = power(base, pow);
                    System.out.println("The result is: " +result);
                    break;
                }
                case 11: // TODO: Implement exponential (e^x)
                {
                    System.out.println("Enter power: ");
                    int x = sc.nextInt();
                    double result = expo(x);
                    System.out.println("The value is: " +result);
                    break;
                }
                case 12: // TODO: Implement log10
                {
                    System.out.println("Enter argument for log: ");
                    double argu = sc.nextDouble();
                    double result = loga(argu);
                    System.out.println("The logarithm of given number is: " +result);
                    break;
                }
                case 13: // TODO: Implement natural log (ln)
                {
                    System.out.println("Enter argument for natural log: ");
                    double argu = sc.nextDouble();
                    double result = natloga(argu);
                    System.out.println("The natural logarithm of given number is: " +result);
                    break;
                }
                case 14: // TODO: Implement sine
                {
                    System.out.println("Enter angle in degrees: ");
                    double angle = sc.nextDouble();
                    double result = sin(angle);
                    System.out.println("The sine value is: " +result);
                    break;
                }
                case 15: // TODO: Implement cosine
                {
                    System.out.println("Enter angle in degrees: ");
                    double angle = sc.nextDouble();
                    double result = cos(angle);
                    System.out.println("The cosine value is: " +result);
                    break;
                }
                case 16: // TODO: Implement tangent
                {
                    System.out.println("Enter angle in degrees: ");
                    double angle = sc.nextDouble();
                    double result = tan(angle);
                    System.out.println("The tangent value is: " +result);
                    break;
                }
                case 17: // TODO: Implement inverse sine
                {
                    System.out.println("Enter sine value: ");
                    double value = sc.nextDouble();
                    double result = invsin(value);
                    System.out.println("The sine inverse is: " +result);
                    break;
                }
                case 18: // TODO: Implement inverse cosine
                {
                    System.out.println("Enter cosine value: ");
                    double value = sc.nextDouble();
                    double result = invcos(value);
                    System.out.println("The cosine inverse is: " +result);
                    break;
                }
                case 19: // TODO: Implement inverse tangent
                {
                    System.out.println("Enter tangent value: ");
                    double value = sc.nextDouble();
                    double result = invtan(value);
                    System.out.println("The tangent inverse is: " +result);
                    break;
                }
                case 20: // TODO: Implement factorial
                {
                    System.out.println("Enter number for factorial: ");
                    int a = sc.nextInt();
                    double result = factorial(a);
                    System.out.println("The factorial is: " +result);
                    break;
                }
                case 21: // TODO: Display value of PI
                {
                    double result = pi();
                    System.out.println("The value of PI is: " +result);
                    break;
                }
                case 22: // TODO: Display value of e
                {
                    double result = e();
                    System.out.println("The value of 'e' is: " +result);
                    break;
                }
                case 23: // TODO: Degree to Radian conversion
                {
                    System.out.println("Enter angle: ");
                    double angle = sc.nextDouble();
                    double result = degtorad(angle);
                    System.out.println("The value in radians is: " +result);
                    break;
                }
                case 24: // TODO: Radian to Degree conversion
                {
                    System.out.println("Enter radians: ");
                    double angle = sc.nextDouble();
                    double result = radtodeg(angle);
                    System.out.println("The value in degrees is: " +result);
                    break;
                }
                case 25: // TODO: Statistics: Mean
                {
                    System.out.println("Enter number of terms: ");
                    int num = sc.nextInt();
                    double[] numbers = new double[num];
                    for (int i = 0; i < num; i++)
                    {
                        numbers[i] = sc.nextDouble();
                    }
                    double result = mean(numbers);
                    System.out.println("The mean is: " +result);
                    break;
                }
                case 26: // TODO: Statistics: Median
                {
                    System.out.println("Enter number of terms: ");
                    int num = sc.nextInt();
                    double[] numbers = new double[num];
                    for (int i = 0; i < num; i++)
                    {
                        numbers[i] = sc.nextDouble();
                    }
                    double result = median(numbers);
                    System.out.println("The median is: " +result);
                    break;
                }
                case 27: // TODO: Statistics: Mode
                {
                    System.out.println("Enter number of terms: ");
                    int num = sc.nextInt();
                    double[] numbers = new double[num];
                    for (int i = 0; i < num; i++)
                    {
                        numbers[i] = sc.nextDouble();
                    }
                    double result = mode(numbers);
                    System.out.println("The mode is: " +result);
                    break;
                }
                case 28: // TODO: Permutations
                {
                    System.out.println("Enter 'n': ");
                    int n = sc.nextInt();
                    System.out.println("Enter 'r': ");
                    int r = sc.nextInt();
                    double result = permu(n, r);
                    System.out.println("The permutation is: " +result);
                    break;
                }
                case 29: // TODO: Combinations
                {
                    System.out.println("Enter 'n': ");
                    int n = sc.nextInt();
                    System.out.println("Enter 'r': ");
                    int r = sc.nextInt();
                    double result = combi(n, r);
                    System.out.println("The combination is: " +result);
                    break;
                }
                case 30: // TODO: Prime number checker
                {
                    System.out.println("Enter number to check: ");
                    int a = sc.nextInt();
                    primenum(a);
                    break;
                }
                case 31: // TODO: LCM
                {
                    System.out.println("Enter number 1: ");
                    int a = sc.nextInt();
                    System.out.println("Enter number 2: ");
                    int b = sc.nextInt();
                    int result = lcm(a, b);
                    System.out.println("The LCM is: " +result);
                    break;
                }
                case 32: // TODO: HCF
                {
                    System.out.println("Enter number 1: ");
                    int a = sc.nextInt();
                    System.out.println("Enter number 2: ");
                    int b = sc.nextInt();
                    int result = hcf(a, b);
                    System.out.println("The HCF is: " +result);
                    break;
                }
                case 0:
                System.out.println("Exiting Calculator. Goodbye!");
                break;
                default:
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }
    private static void showMenu() 
    {
        System.out.println("\n=== Scientific Calculator ===\n");

        System.out.println("1. Addition                 2. Subtraction                    3. Multiplication");
        System.out.println("4. Division                 5. Modulus                        6. Square");
        System.out.println("7. Cube                     8. Square Root                    9. Cube Root");
        System.out.println("10. Power (x^y)             11. Exponential (e^x)             12. Logarithm (log10)");
        System.out.println("13. Natural Logarithm (ln)  14. Sine                          15. Cosine");
        System.out.println("16. Tangent                 17. Inverse Sine                  18. Inverse Cosine");
        System.out.println("19. Inverse Tangent         20. Factorial                     21. Value of PI");
        System.out.println("22. Value of e              23. Degree to Radian Conversion   24. Radian to Degree Conversion");
        System.out.println("25. Statistics: Mean        26. Statistics: Median            27. Statistics: Mode");
        System.out.println("28. Permutations            29. Combinations                  30. Prime number checker");
        System.out.println("31. LCM                     32. HCF                                                     ");
        System.out.println("0. Exit");
    }
    // TODO: Implement helper methods for each operation
    
    static double add (double [] numbers)                                       //addition
    {
        double sum = 0;
        for (int i=0; i<numbers.length; i++)
        {
            sum = sum + numbers[i];
        }
        return sum;
    }
    
    static double subtract (double a, double b)                                 //subtraction
    {
        return a-b;
    }
    
    static double multiply (double [] numbers)                                  //multiplication
    {
        double prod = 1;
        for (int i=0; i<numbers.length; i++)
        {
            prod = prod*numbers[i];
        }
        return prod;
    }
    
    static double division (double divis, double divid)                         //division
    {
        if(divis==0)
        {
            System.out.println("Division by zero not allowed!");
            return Double.NaN;
        }
        else
        {
            return divid/divis;
        }
    }
    
    static double modulus (double a)                                            //modulus
    {
        if(a<0)
        {
            return a*-1;
        }
        else
        {
            return a;
        }
    }
    
    static double square (double a)                                             //square
    {
        return a*a;
    }
    
    static double cube (double a)                                               //cube
    {
        return a*a*a;
    }
    
    static double squareroot (double a)                                         //square root
    {
        if(a<0)                     //condition check for negative nos. 
        { 
            System.out.println("Real square root of a negative number does not exist!"); 
            return Double.NaN;                      //invalid result
        } 
        else if (a==0)                    //condition check for 0 
        { 
            System.out.println("The square root of 0.0 is 0.0"); 
            return 0;
        } 
        else 
        { 
            double x = a/2;                    //estimated square root 
            double check = 0;             //check var initialised to 0 
            while (true) 
            { 
                x = (x + (a / x)) / 2;                //refer NOTE1 
                if (check == x)                 //2 consecutive values are compared for equality 
                { 
                    break;       //loop stops when est. value stabilises 
                } 
                check = x;         //check var stores the updated value of x for comparing in next iteration 
            }
            return x;
        }
    }

    static double cuberoot (double a)                                           //cube root
    {
        double x = 0;
        if (a==0)                    //condition check for 0 
        { 
            System.out.println("The cube root of 0.0 is 0.0"); 
        } 
        else 
        {
            x = a/3;             //estimated cube root
            double check = 0;           //check var initialised to 0
            while (true)
            {
                x = (2 * x + (a / (x * x))) / 3;            //refer NOTE2
                if (check==x)               //2 consecutive values are compared for equality
                {
                    break;              //loop stops when est. value stabilises
                }
                check = x;              //check var stores the updated value of x for comparing in next iteration
            }
        }
        return x;
    }

    static double power (double base, int pow)                                  //power
    {
        double power = 1;
        if(pow>=0)
        {
            for (int i=0; i<pow; i++)
            {
                power=power*base;
            }
            return power;           //postive normal exponents
        }
        else
        {
            for (int i=0; i<-pow; i++)
            {
                power=power*base;
            }
            return 1/power;         //for negative exponents, the value is reciprocated
        }
    }
    
    static double expo (int x)                                                  //exponential: e^x
    {                               //Taylor series appprox.; logic: term(n) = term(n-1) * (x/n)
        double first = 1;
        double sum = 1;
        for (int i=1; i<=90000; i++)               //i<=20 used for better approx.
        {
            first = (first*(x))/i;
            sum = sum + first;
        }
        return sum;
    }
    
    static double loga (double argu)                                            //logarithm base 10
    {
        double sum = natloga(argu)/natloga(10);         //using: log x (base 10) = lnx/ln10
        return sum;
    }
    
    static double natloga(double argu) {                                        //logarith base 'e'
    double sum = 0.0;

    if(argu <= 0) {
        System.out.println("Domain error!");
        return Double.NaN;
    } 
    else if(argu == 1) {
        return 0.0;
    }
    else if(argu > 0 && argu < 2) {             //taylor series based around x=1, used
        double x = argu - 1.0;
        double term;
        double check;           //for comapring the previous value with current one and seeing if they are equal and stable, if yes, the process finishes

        for(int i = 1; i <= 100000; i++) {
            term = power(x, i) / i;
            if(i % 2 == 0) 
            {
                term = -term;
            }
            check = sum;
            sum += term;

            if(sum == check) 
            {
                break;
            }
        }

        return sum;
    } 
    else {
        return (-natloga(1 / argu));
    }
}

    
    static double sin (double angle)                                            //sine
    {                                               //using Taylor series expansion for sine(x)
        angle = degtorad(angle);
        angle = angle % (2 * pi());     //to keept the angle within the range of 0, 2pi
        if(angle < 0)           //negative angles
        {
            angle += 2 * pi();
        }
        double term = angle;   //1st term
        double sum = angle;    //sum from 1st term
        double check;
        int sign = -1;      //for sign change
        for (int i=3; i<90000; i+=2)           //starts with 3 (as series has odd values) and uses step of 2
        {
            check = sum;
            term = term * (angle*angle)/(i*(i-1));
            sum = sum + (sign*term);
            sign = -sign;         //for changing consecutive signs in series
            if(sum - check == 0)
            {
                break;
            }
        }
        return sum;
    }
    
    static double cos (double angle)                                            //cosine
    {                                           //using the taylor series expansion for cosine (x)
        angle = degtorad(angle);
        angle = angle % (2 * pi());     //to keept the angle within the range of 2pi
        if(angle < 0)               //for negative values
        {
            angle += 2 * pi();
        }
        double term = 1;   //1st term
        double sum = 1;    //summ from 1st term
        double check;
        int sign = -1;      //for sign change
        for (int i=2; i<90000; i+=2)           //starts with 2 (as series has even values) and uses step of 2
        {
            check = sum;
            term = term * (angle*angle)/(i*(i-1));
            sum = sum + (sign*term);
            sign = -sign;         //for changing consecutive signs in series
            if(sum - check == 0)
            {
                break;
            }
        }
        return sum;
    }
    
    static double tan (double angle)                                            //tangent
    {
        double sinang = sin(angle);
        double cosang = cos(angle);
        double tanang = 0;
        if(cosang == 0)
        {
            System.out.println("Undefined.");               //as tan(x) = sin(x)/cos(x)
        }
        else
        {
            tanang = sinang/cosang;
        }
        return tanang;
    }
    
    static double invsin (double value)                                         //inverse of sine
    {
        if(value>=-1 && value<=1)                           //Taylor series expansion of sin inverse used
        {
            double current = value;     //first value in expansion
            double sum=value;           //fist value to be added
            double check = 0.0;         //for breaking the loop afterwards, when the consequent approx. values are close enough
            for (int i=1; i<90000; i++)     //higher ending value for better approx.
            {
                check = sum;        //value stored for check
                double term = (current*(2.0 * i - 1) * (2.0 * i - 1)*value * value) / ((2.0 * i) * (2.0 * i + 1));
                current = term;
                sum = sum + current;
                if (sum - check == 0)           //logic ends the loop when values are close enough or stabilised; prevents the infinity case
                {
                    break;
                }
            }
            return radtodeg(sum);
        }
        else
        {
            System.out.println("Can take values between and inclusive of -1, 1 only!");
            return Double.NaN;                              //invalid result
        }
    }
    
    static double invcos (double value)                                         //inverse of cosine
            
    {
        if(value>=-1 && value<=1)                           
        {
            return 90.0 - invsin(value);
        }
        else
        {
            System.out.println("Can take values between and inclusive of -1, 1 only!");
            return Double.NaN;                          //invalid result
        }
    }
    
    static double invtan (double value)                                         //inverse of tangent
    {   
        double sum = value/squareroot(1+ value*value);
        return invsin(sum);
    }
    
    static double factorial (int a)                                             //factorial
    {
        if(a<0)
        {
            System.out.println("Only non-negative numbers allowed!");
            return Double.NaN;                                          //invalid result
        }
        else
        {
            int prod = 1;
            for (int i=1; i<=a; i++)
            {
                prod = prod*i;
            }
            return prod;
        }
    }
    
    static double pi ()                                                         //value of 'PI'
    {
        double sum = 0.0;           //using Leibniz series for PI/4
        int sign = 1;      
        for (int i=0; i<90000; i++)
        {
            double term = 1.0/((2*i)+1);
            sum = sum + (sign*term);
            sign = sign*-1;
        }
        return sum*4;
    }
    
    static double e ()                                                          //value of 'e'
    {
        double exp = expo(1);
        return exp;
    }
    
    static double degtorad (double angle)                                       //degrees to radians conversion
    {
        double deg = angle*(pi()/180);
        return deg;
    }
    
    static double radtodeg (double angle)                                       //radians to degrees conversion
    {
        double rad = angle*(180/pi());
        return rad;
    }
    
    static double mean (double [] numbers)                                     //statistics: mean
    {
        double sum = 0;
        int len = numbers.length;
        for (int i=0; i<numbers.length; i++)
        {
            sum = sum + numbers[i];
        }
        return sum/len;
    }
    
    static double median (double [] numbers)                                    //statistics: median
    {
        Arrays.sort(numbers);
        int len = numbers.length;
        double med;
        if(len%2==0)                                    //even
        {
            med = (numbers[len/2-1] + numbers[(len/2)])/2.0;          //even series (array indexing starts with 0)
        }
        else
        {
            med = numbers[(len)/2];           //odd series
        }
        return med;
    }
    
    static double mode (double [] numbers)                                      //statistics: mode
    {
        int len = numbers.length;
        double mode = numbers[0];
        int maxcount = 0;
        for (int i =0; i<len; i++)
        {
            int count = 0;
            for (int j=0; j<len; j++)           //both i and j loops take each value (i) and check all other values (j) for each number
            {
                if(numbers[j] == numbers[i])
                        {
                            count++;
                        }
            }
            if(count>maxcount)      //count variable gets updated whenver the newly computed frequency is greater than the previous frequency
            {
                maxcount = count;
                mode = numbers[i];
            }
        }
        if(maxcount == 1)               //prevents repeptition
        {
            System.out.println("No mode!");
            return Double.NaN;
        }
        return mode;
    }
        
    static double permu (int n, int r)                                          //permutations (nPr)
    {
        double ans = factorial(n)/factorial(n-r);
        return ans;
    }
    
    static double combi (int n, int r)                                          //combinations (nCr)
    {
        double ans = factorial(n)/(factorial(r) * factorial(n-r));
        return ans;
    }
    
    static void primenum (int a)                                              //prime number check
    {
        int count = 0;
        if(a==0 || a==1)
        {
            System.out.println("Neither prime nor composite!");
        }
        else
        {
            for (int i=1; i<=a; i++)
            {
                if(a%i==0)
                {
                    count++;                //records the factors of number
                }
            }
            if(count>2)
            {
                System.out.println("Composite number!");
            }
            else
            {
                System.out.println("Prime number!");
            }
            }
    }
    
    static int lcm (int a, int b)                                       //lcm
    {                                                       //lcm(a,b) = a*b/hcf(a,b)
        int lcm = (a * b)/hcf(a, b);
        return lcm;
    }
    
    static int hcf (int a, int b)                                       //hcf
    {                                               //a is smaller than b
        int hcf = 1;
        if(a == b)
        {
            return a;
        }
        else if(b<a)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i=1; i<=a; i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf = i;
            }
        }
        return (hcf);
    }
}