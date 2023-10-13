package lab12.ex2.thermo3.view;

import lab12.ex2.thermo3.model.Thermometer;
import lab12.ex2.thermo3.model.ThermometerListener;

public class ConsoleDisplay implements ThermometerListener {

	
// The Unicode symbol for degrees
private static final char DEGREE_SYMBOL = '\u00B0';

/** The thermometer whose temperature is being displayed */
protected Thermometer thermometer;

protected int tempField;

/**
 * Creates a digital thermometer
 * @param t the thermometer whose temperature is displayed
 */
public ConsoleDisplay(Thermometer t, int tf) {
    thermometer = t;
    tempField = tf;

    setCurrent(t.getTemperature());
}

/**
 * Create the string to display in the console
 * @return the string to display in the console
 */
private String getDisplayString() {
    return "" + thermometer.getTemperature() + DEGREE_SYMBOL + "F";
}

@Override
public String toString() {
    return "Your temperature is " + getDisplayString();
}

/**
 * React to changes to the temperature.
 */
@Override
public void temperatureChanged() {
    setCurrent(thermometer.getTemperature());
}

protected void setCurrent(int cur) {
    // tempLabel.setText(getDisplayString());
    System.out.println(toString());
}
}
