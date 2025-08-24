package pack01;

// 01 Data types, variables, input/output, operators
import java.util.Scanner;

public class Basic {
  
  static void dataTypes() {
    // Primitive Data types
    // (String is a class not a primitive data type)

    byte byteType = 2; // Range: -128 to 127
    short shortType = 189; // Range: -32768 to 32767
    int intType = 18919; // Range: -2147483648 to 2147483647
    long longType = 69251973; // Range: -9223372036854775808 to 9223372036854775807
    float floatingType = 978.68f; // Range: 1.4E-45 to 3.4E38
    double doubleType = 1987.7629; // Range: 4.9E-324 to 1.7E308
    char charType = 'A'; // Range: \u0000 to \uFFFF
    boolean booleanType = true; // true or false
  }

  static void inputOutput() {
    // Input from the user
    Scanner sc = new Scanner(System.in);
    int intgerNum = sc.nextInt();
    char character = sc.next().charAt(0);
    // 0 indicates index of the character.
    String str = sc.nextLine();
    String str2 = sc.next();
    // String is a class. nextLine(), next() are methods of the class.

    // Output to the user
    
    System.out.print(intgerNum + " " + character + " " + str + " " + str2); // Doesn't print new line.
    System.out.println(intgerNum + " " + character + " " + str + " " + str2); // prints new Line
    
    // Prints the formatted output
    // %d is for int, %c is for char, %s is for string, %f for double or float
    System.out.printf("%d %c %s %s", intgerNum, character, str, str2);
    System.out.printf("%-10sRank: %02d","Anurag",17);

  }

  static void operators() {

    // Arithmetic operators
    int a = 10;
    int b = 20;
    int sum = a + b;
    int sub = a - b;
    int mul = a * b;
    int div = a / b;
    int mod = a % b;

    // Increment and decrement operators
    int c = 10;
    c++; // first use then increment
    c--; // first use then decrement
    ++c; // first increment then use
    --c; // first decrement then use

    // Assignment operators
    int d = 10;
    d += 5; // same as d = d + 5
    d -= 5;
    d *= 5;
    d /= 5;
    d %= 5;

    // Comparison operators
    int e = 10;
    int f = 20;
    boolean isEqual = e == f; // false
    boolean isNotEqual = e != f; // true
    boolean isGreater = e > f; // false
    boolean isLess = e < f; // true
    boolean isGreaterEqual = e >= f; // false
    boolean isLessEqual = e <= f; // true

    // Logical operators
    boolean isTrue = true;
    boolean isFalse = false;
    boolean and = isTrue && isFalse;
    boolean or = isTrue || isFalse;
    boolean not = !isTrue;

    // Bitwise operators
    int g = 10;
    int h = 20;
    int bitwiseAnd = g & h; // 0
    int bitwiseOr = g | h; // 30
    int bitwiseXor = g ^ h; // 10
    int bitwiseNot = ~g; // -11
    int bitwiseLeftShift = g << 2; // 100
    int bitwiseRightShift = g >> 2; // 1

    // Ternary operator
    int i = 10;
    int j = 20;
    int max = (i > j) ? i : j; // 20
    String j2 = (i > j) ? "i is greater" : "j is greater";
  }
  
  static void typeCasting() {
    
    // Type promotion
    int a = 10;
    double b = 20.5;
    double c = a+b; // 30.5

    // Type casting
    int k = 10;
    double l = (double) k; // 10.0 (int to double/ primitives)
    double m = 10.5;
    int n = (int) m; // 10 (double to int/primitives)
    
    String num = "10";
    int o = Integer.parseInt(num); // 10 (string to int/primitives)
    double p = 7.8;
    String q = String.valueOf(p); // (primitive to string)
    
    Double r = 12.7;
    String z = r.toString(); // (wrapper to string)
    String s = "12.6";
    Double t = Double.parseDouble(s); // string to primitives.

    // note: wrapper can automatically convert to primitives and vice-versa. (if didn't understand then read wrapper class, autoboxing, unboxing)

  }

  public static void main(String[] args) {
    dataTypes();
    inputOutput();
    typeCasting();

    /* This is a multi-line comment.
    Second line of this comment.*/
    // This is a single line comment.
    

  }
}
