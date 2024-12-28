import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);

        System.out.println("Enter the initial temperature: ");
        double initTemp = Double.parseDouble(uInput.nextLine());

        System.out.println("Enter the initial temperature unit: ");
        String initUnit = uInput.nextLine();

        System.out.println("Enter the target temperature unit: ");
        String targUnit = uInput.nextLine();

        double convertedTemp = 0;
        if (targUnit.equalsIgnoreCase("C")) {
            convertedTemp = convertToCelsius(initTemp, initUnit);
            uInput.close();
        } else if (targUnit.equalsIgnoreCase("F")) {
            convertedTemp = convertToFahrenheit(initTemp, initUnit);
            uInput.close();
        } else if (targUnit.equalsIgnoreCase("K")) {
            convertedTemp = convertToKelvin(initTemp, initUnit);
            uInput.close();
        }

        System.out.println("Converted temperature: " + convertedTemp);
    }

    public static double convertToCelsius(double initTemp, String initUnit) {
        if (initUnit.equalsIgnoreCase("F") || initUnit.equalsIgnoreCase("fahrenheit")) {
            return (initTemp - 32) * 5 / 9;
        } else if (initUnit.equalsIgnoreCase("K") || initUnit.equalsIgnoreCase("kelvin")) {
            return initTemp - 273.15;
        } else {
            return initTemp;
        }
    }

    public static double convertToFahrenheit(double initTemp, String initUnit) {
        if (initUnit.equalsIgnoreCase("C") || initUnit.equalsIgnoreCase("celsius")) {
            return (initTemp * 9 / 5) + 32;
        } else if (initUnit.equalsIgnoreCase("K") || initUnit.equalsIgnoreCase("kelvin")) {
            return (initTemp - 273.15) * 9 / 5 + 32;
        } else {
            return initTemp;
        }
    }

    public static double convertToKelvin(double initTemp, String initUnit) {
        if (initUnit.equalsIgnoreCase("C") || initUnit.equalsIgnoreCase("celsius")) {
            return initTemp + 273.15;
        } else if (initUnit.equalsIgnoreCase("F") || initUnit.equalsIgnoreCase("fahrenheit")) {
            return (initTemp - 32) * 5 / 9 + 273.15;
        } else {
            return initTemp;
        }
    }
}