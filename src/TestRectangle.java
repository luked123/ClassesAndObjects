public class TestRectangle {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(4, 40);
        Rectangle rect3 = new Rectangle(3.5, 35.9);

        System.out.printf("The default rectangle has width %.2f, height %.2f, area %.2f, and perimeter %.2f\n",
                           rect1.getWidth(), rect1.getHeight(), rect1.getArea(), rect1.getPerimeter());

        System.out.printf("The rect2 has width %.2f, height %.2f, area %.2f, and perimeter %.2f\n",
                rect2.getWidth(), rect2.getHeight(), rect2.getArea(), rect2.getPerimeter());

        System.out.printf("The rect3 has width %.2f, height %.2f, area %.2f, and perimeter %.2f\n",
                rect3.getWidth(), rect3.getHeight(), rect3.getArea(), rect3.getPerimeter());

        System.out.println("Changing rect3 width and height...");
        rect3.setWidth(10);
        rect3.setHeight(50);
        System.out.printf("The rect3 has width %.2f, height %.2f, area %.2f, and perimeter %.2f\n",
                rect3.getWidth(), rect3.getHeight(), rect3.getArea(), rect3.getPerimeter());

    }
}
