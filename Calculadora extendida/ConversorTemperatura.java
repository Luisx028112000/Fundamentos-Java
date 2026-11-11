
/**
 * Clase ConversorTemperatura
 * Convierte temperaturas entre Fahrenheit y Celsius.
 *
 * Fórmulas:
 *   °C = (°F - 32) × 5/9
 *   °F = (°C × 9/5) + 32
 *
 * @author Luis E.Vargas
 * 
 */
public class ConversorTemperatura {

    /**
     * Convierte grados Fahrenheit a Celsius.
     * @param fahrenheit temperatura en Fahrenheit
     * @return temperatura equivalente en Celsius
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    /**
     * Convierte grados Celsius a Fahrenheit.
     * @param celsius temperatura en Celsius
     * @return temperatura equivalente en Fahrenheit
     */
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}