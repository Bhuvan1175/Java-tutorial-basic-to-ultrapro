public class doubleProb {
    public static void main(String[] args) {
        double z = 9 / 4;
        double a = 4 / 7;
        double y = 9 / 4.0;
        double x = 4.0 / 7;
        System.out.println(z);
        System.out.println(a);
        System.out.println(y);
        System.out.println(x);
    }
}
// double z = 9/4;: Here, you're performing integer division, because both
// operands (9 and 4) are integers. The result of 9/4 in integer division is 2,
// so z will be 2.0 after promotion to a double.

// double a = 4/7;: Similarly, you're performing integer division. The result of
// 4/7 in integer division is 0, so a will be 0.0 after promotion to a double.

// double y = 9/4.0;: In this case, one of the operands (4.0) is a
// floating-point number, so the division operation will be performed as
// floating-point division. The result of 9/4.0 is 2.25, so y will be 2.25.

// double x = 4.0/7;: Here, one of the operands (4.0) is a floating-point
// number, so the division operation will also be performed as floating-point
// division. The result of 4.0/7 is 0.5714285714285714, so x will be
// approximately 0.5714285714285714.
