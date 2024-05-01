public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            double circleRadius = 5;
            double circlePerimeter = calculator.calculateCirclePerimeter(circleRadius);
            double circleArea = calculator.calculateCircleArea(circleRadius);
            System.out.println("Периметр круга: " + circlePerimeter);
            System.out.println("Площа круга: " + circleArea);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            double rectangleLength = 4;
            double rectangleWidth = 3;
            double rectanglePerimeter = calculator.calculateRectanglePerimeter(rectangleLength, rectangleWidth);
            double rectangleArea = calculator.calculateRectangleArea(rectangleLength, rectangleWidth);
            System.out.println("Периметр прямокутника: " + rectanglePerimeter);
            System.out.println("Площа прямокутника: " + rectangleArea);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

    }
}