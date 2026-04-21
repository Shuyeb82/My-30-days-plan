class Car {
    String brand;
    String color;
    int year;

    Car() {
        this("Honda", "White", 2020);
    }

    Car(String brand) {
        this(brand, "Red", 2022);
    }

    Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year  = year;
    }

    void display() {
        System.out.println(brand + " | " + color + " | " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Toyota");
        Car c3 = new Car("BMW", "Black", 2025);

        c1.display();
        c2.display();
        c3.display();
    }
}
