package triangle;

public class PyramidMain {
    public static void main(String[] args) {
        ShapePyramid printer = new ShapePyramid();

        // 테스트
        printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);
    }
}