public class BadOPractice {
    // class Rectangle {

    void drawRectangle() {
        // Code to draw a rectangle
    }
    }

    class Circle {
    void drawCircle() {
        // Code to draw a circle
    }
}
//Open Close Principle (OCP) is violated because if we want to add a new shape, we need to modify the existing code of the Rectangle and Circle classes, which can lead to bugs and maintenance issues. Instead, we should create an interface or an abstract class for shapes and implement it for each specific shape, allowing us to add new shapes without modifying existing code.
