public class Shape {
    String name = "Unknown";
    private int numSides = 0;

    Shape(String name, int numSides) {
        this.name = name;
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    class Rectangle extends Shape {
        public double length;
        public double width;

        public Rectangle(double length, double width) {
            super(String.valueOf(length), (int) width);
            this.length = Double.parseDouble(String.valueOf(length));
            this.width = width;
        }

        @Override
        public double getPerimeter() {
            double output = 2 * (length + width);
            System.out.println(output);

            return 1;
        }
    }
    class Circle extends Shape{
        public double radius;

        public Circle(String name,double radius){
            super(name, (int)radius);
            this.name = name;
            this.radius = radius;
        }
        @Override
        public double getArea(){
            return Math.PI * Math.pow(radius, 2);
        }
    }
    class RightTriangle extends Shape{
        private double base;
        private double height;
        private double hypotenuse;

        public RightTriangle(double base, double height, double hypotenuse) {
            super(String.valueOf(base), (int) height);
            this.base = base;
            this.height = height;
            this.hypotenuse = hypotenuse;
        }
        public double getArea(){
            return 0.5 * base * height;
        }
    }
    public static void main(String[]args){
        Shape shape = new Shape("Rectangle", 4);
        Shape.Rectangle rec = shape.new Rectangle(5,6);
        Shape.Circle circle = shape.new Circle("Circle", 4);
        Shape.RightTriangle rt = shape.new RightTriangle(4,5,6);
        circle.getArea();
    }
}
