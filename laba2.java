public class laba2 {
    public static void main(String[] args) {
        double x = 1.5;
        double a = 2.5;
        double b = 1.0;

        // Задача 6
        double z6;
        if (x <= -1) {
            z6 = a * Math.tan(x * x);
        } else {
            z6 = (b + x * x) / (x * x + a);
        }
        System.out.println("Задача 6: y = {a * tg(x^2), x <= -1; (b + x^2) / (x^2 + a), x > -1}");
        System.out.printf("Для x = %.2f, y = %.2f%n", x, z6);

        // Задача 7
        double z7;
        if (x > 3) {
            z7 = (a + x) * Math.atan(a * x);
        } else {
            z7 = Math.cos(b + x * x * x) * Math.cos(b + x * x * x);
        }
        System.out.println("Задача 7: y = {(a + x) * arctg(ax), x > 3; cos^2(b + x^3), x <= 3}");
        System.out.printf("Для x = %.2f, y = %.2f%n", x, z7);

        // Задача 8
        double z8;
        if (x < 5) {
            double sinVal = Math.sin(a + x);
            z8 = sinVal * sinVal * sinVal;
        } else {
            z8 = Math.log(Math.sqrt(b - x));
        }
        System.out.println("Задача 8: y = {sin^3(a + x), x < 5; ln√(b - x), x >= 5}");
        System.out.printf("Для x = %.2f, y = %.2f%n", x, z8);

        // Задача 14
        double z14;
        if (x > -1) {
            z14 = 0.2 * x * x * x + a;
        } else {
            z14 = b * x * x + Math.log(Math.abs(x + 3));
        }
        System.out.println("Задача 14: y = {0.2x^3 + a, x > -1; bx^2 + ln|x + 3|, x <= -1}");
        System.out.printf("Для x = %.2f, y = %.2f%n", x, z14);

        // Задача 15
        double z15;
        if (x < 2) {
            z15 = Math.sin(x + a * a);
        } else {
            z15 = Math.log(x * x + 2 * x + b);
        }
        System.out.println("Задача 15: y = {sin(x + a^2), x < 2; ln(x^2 + 2x + b), x >= 2}");
        System.out.printf("Для x = %.2f, y = %.2f%n", x, z15);

        // Задача 16 )
        double z16;
        if (x < 2) {
            z16 = Math.cos(x + a * a);
        } else {
            z16 = Math.log(x * x + 2 * x + b);
        }
        System.out.println("Задача 16: y = {cos(x + a^2), x < 2; ln(x^2 + 2x + b), x >= 2}");
        System.out.printf("Для x = %.2f, y = %.2f", x, z16);
    }
}