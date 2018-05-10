public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println();
        Car lanceCar = new Car("Cherokee", "Lance Champion"); // Lance drives his car until 2025 and puts 100000 miles on his car.
        Car joeCar = new Car("Camry", "Joe Chen"); // Joe drives his car until 2040 and puts 400000 miles on his car.
        Car markCar = new Car("Model S", "Mark Warbles"); // Mark drives his car until 2021 and puts 20000 miles on his car.

        Car[] arrayOfCars = new Car[]{lanceCar, joeCar, markCar};


        printStatement(lanceCar, 100000, 2025);

        printStatement(joeCar, 400000, 2040);

        printStatement(markCar, 20000, 2021);
    }

    public static void printStatement(Car car, int miles, int lastYearDriven) {
        int carYears = lastYearDriven - car.yearMade;
        double carDepreciatedValue = car.valueAfter(carYears, miles);
        double carCostOfGas = car.costOfGas(miles);
        double totalCarCost = car.value - carDepreciatedValue + carCostOfGas;
        double gasUsed = car.lifetimeGasUsed;
        System.out.println(car.owner + "'s car is " + String.valueOf(carYears) + " years old.");
        System.out.println("They have driven the car for " + String.valueOf(carYears) + " years and " + String.valueOf(miles) + " miles.");
        System.out.println("The value of the car is now " + String.valueOf(carDepreciatedValue) + ".");
        System.out.println("The cost of gasoline/electricity is " + String.valueOf(carCostOfGas) + ".");
        System.out.println("The total cost of owning this vehicle (without insurance included) is " + String.valueOf(totalCarCost) + ".");
        System.out.println("The car has used " + String.valueOf(gasUsed) + " gallons of gas.");
        System.out.println();

    }
}

/*
    %NameOfDriver%'s car is X years old.
    They have driven the car for X years and X miles.
    The value of the car is now X.
    The cost of gasoline/electricity is X.
    The total cost of owning this vehicle (without insurance included) is X.
 */

