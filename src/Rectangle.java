public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (a + b);
    }

    @Override
    public void draw() {
        System.out.println("⬜⬜");
    }
}
