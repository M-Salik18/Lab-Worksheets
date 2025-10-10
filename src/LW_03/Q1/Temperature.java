package LW_03.Q1;

public class Temperature {
    private double celsius;
    private double fahrenheit;

    public Temperature() {
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }


    public double toCelsius() {
         return celsius;
    }

    public void setCelsius() {
        celsius = (fahrenheit-32) *5/9;
    }

    public double toFahrenheit() {

        return fahrenheit;
    }

    public void setFahrenheit() {
        fahrenheit = celsius * 9/5 + 32;
    }
}
