import static java.awt.AWTEventMulticaster.add;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        int sumTwo = add(2, 4);
        System.out.println("The sum is: " + sumTwo);

        int sumFour = add(2, 4, 6, 8);
        System.out.println("The sum is: " + sumFour);

        String morningGreet = morningGreeting("Michael");
        System.out.println(morningGreet);

        String afternoonGreet = afternoonGreeting("Michael");
        System.out.println(afternoonGreet);

        String tripled = triple("hi");
        System.out.println(tripled);

        int halved = half(24);
        System.out.println(halved);

        int roundPos = roundPosToNearInt(9.49);
        System.out.println(roundPos);

        int roundNeg = roundNegToNearInt(-11.51);
        System.out.println(roundNeg);


    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(a, b) + add(c, d);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "Good morning, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "Good afternoon, " + name + "!";
    }

    // 5. triple

    public static String triple(String name) {
        return name + name + name;
    }
    // 6. half

    public static int half(int a) {
        return a / 2;
    }

    // 7. roundPositiveValueToNearestInteger

    public static int roundPosToNearInt(double a) {
        return (int) Math.round(a);
    }

    // 8. roundNegativeValueToNearestInteger

    public static int roundNegToNearInt(double a) {
        return (int) Math.round(a);
    }
}

