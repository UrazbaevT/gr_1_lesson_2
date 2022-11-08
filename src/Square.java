public class Square extends Figure {
    private int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public int calculatePerimeter() {
        return a * 4;
    }

    @Override
    public void draw() {
        System.out.println("⬜");
    }
}
