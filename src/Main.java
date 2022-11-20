import java.util.Scanner;
/*Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
        Expected Output :
        Hello
        Alexandra Abramov*/


public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello ");
        //System.out.println("Alexander Abramov ");


/* 2 Write a Java program to print the sum of two numbers. Go to the editor
Test Data:
74 + 36
Expected Output :
110 */

/*int a=74,b=36;

System.out.println(a+b);
//or
  System.out.println(74+36); */
  /*3
  Write a Java program to divide two numbers and print on the screen. Go to the editor
Test Data :
50/3
Expected Output :
16*/

     /*   System.out.println(50/3);
        //or
        int c=50,d=3;
        System.out.println(c/d);
*/
/*Write a Java program to print the result of the following operations. Go to the editor
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13*/
       /* System.out.println(-5+(8*6));
        System.out.println((55+9)%9);
        System.out.println(20+(-3*5)/8);
        System.out.println(5+15/3*2-8%3);
*/

/* Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

Scanner myobj = new Scanner(System.in);

System.out.println("Input first number :");

int  num = myobj.nextInt();

System.out.println("Input second number :");

int num1 = myobj.nextInt();

System.out.println(num + "x" + num1 + "=" + num * num1);
















    }
    }