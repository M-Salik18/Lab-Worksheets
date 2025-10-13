package LW_03.Q2;

public class temp {
    private double celsius;
    private double fahrenheit;

    public temp() {
    }

    public temp(double fahrenheit) {
        this.fahrenheit = fahrenheit;
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
