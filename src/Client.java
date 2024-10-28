public class Client {
    public static void main(String[] args) {
        // Create some shapes with specified color
        Shape square = new Square("Red", 5.0);
        Shape circle = new Circle("Blue", 3.0);

        // Uncomment the following after implementing your drawing class
        // // Retrieve the stance of drawing
         Drawing drawing = Drawing.getInstance();

        // // Draw shapes on the instances
        drawing.drawShape(square);
        drawing.drawShape(circle);
    }
}