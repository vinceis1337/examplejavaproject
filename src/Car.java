public class Car {
    public double value;
    public int yearMade;
    public String owner;
    public String model;
    public double depreciationTimeFactor;
    public double depreciationMilesFactor;
    public double milesPerGallon;

    public Car(String model, String owner) {
        this.model = model;
        this.owner = owner;
        this.yearMade = 2018;

        switch (model) {
            case "Cherokee":
                this.value = 24395;
                this.depreciationMilesFactor = 0.0000007;
                this.depreciationTimeFactor = 0.04;
                this.milesPerGallon = 18;
                break;
            case "Camry":
                this.value = 23495;
                this.depreciationMilesFactor = 0.0000002;
                this.depreciationTimeFactor = 0.02;
                this.milesPerGallon = 35;
            case "Model S":
                this.value = 74500;
                this.depreciationMilesFactor = 0.0000002;
                this.depreciationTimeFactor = 0.03;
                this.milesPerGallon = 100;
        }
    }

    public double valueAfter(int years, double milesDriven) {
        //value * depreciationMilesFactor * milesDriven
        double depreciatedMilesValue = value * depreciationMilesFactor * milesDriven;
        //value x depreciationTimeFactor * years
        double depreciatedTimeValue = value * depreciationTimeFactor * years;
        //subtract both top from value initial.
        double depreciatedValue = value - depreciatedMilesValue - depreciatedTimeValue;
        return depreciatedValue;
    }

    public double costOfGas(double milesDriven) {
        //costOfGas = milesDriven / milesPerGallon * gasPrice
        double overallGasCost = milesDriven / milesPerGallon * 2;
        return overallGasCost;
    }

    public double lifetimeGasUsed(double milesDriven) {
        //how many int miles drive / mile per gallon return
        double lifetimeGasUsed = milesDriven / milesPerGallon;
        return lifetimeGasUsed;
    }
}
