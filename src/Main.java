public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 120);
        Triangle triangle = new Triangle("Треугольник", 4, 6, 8);
        Square square = new Square("Квадрат", 7);
        Rectangle rectangle = new Rectangle("Прямоугольник", 5, 6);

        //System.out.println(circle.getName() + ": " + circle.calculatePerimeter());
        //System.out.println(triangle.getName() + ": " + triangle.calculatePerimeter());
        // System.out.println(square.getName() + ": " + square.calculatePerimeter());
        // System.out.println(rectangle.getName() + ": " + rectangle.calculatePerimeter());

        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Bagira");

        //полиформизм
        Drawable[] drawables = {circle, triangle, square, rectangle, dog, cat};
        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure){
                System.out.println(((Figure)drawables[i]).getName() + ": " + ((Figure)drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }
        drawables[i].draw();
        }

        /*for (Figure figure : figures) {
            System.out.println(figure.getName() + ": " + figure.calculatePerimeter());
        }*/

    }
}