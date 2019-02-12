public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Chevrolet");
        car.setMiles(100000);
        car.setModel("Camaro");
        car.setYear(1969);
        System.out.println(car.toString());



        Rectangle rectangle = new Rectangle(12,45);
        rectangle.setLength(12);
        System.out.print(rectangle.isSquare());
        System.out.print(rectangle.getDiagonal());
        System.out.print(rectangle.getArea());



    }


}
