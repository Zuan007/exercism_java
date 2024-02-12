public class Lasagna {
    // define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x) {
        return expectedMinutesInOven() - x;
    }

    // define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int x) {
        return x * 2;
    }

    // define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int x, int y) {
        return preparationTimeInMinutes(x) + y;
    }
}