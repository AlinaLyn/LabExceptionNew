public class Calculator {
    public double calculateCirclePerimeter(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радіус має бути додатнім числом.");
        }
        return 2 * Math.PI * radius;
    }
    public double calculateCircleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радіус має бути додатнім числом.");
        }
        return Math.PI * radius * radius;
    }
    public double calculateRectanglePerimeter(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Довжина та ширина мають бути додатніми числами.");
        }
        return 2 * (length + width);
    }
    public double calculateRectangleArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Довжина та ширина мають бути додатніми числами.");
        }
        return length * width;
    }
    public double calculateTrianglePerimeter(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("Довжина сторін трикутника має бути додатніми числами.");
        }
        return side1 + side2 + side3;
    }
}
