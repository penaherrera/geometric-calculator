import javax.swing.*;

public class GeometricCalculator {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        String[] options = {
                "Calculate area of a Square",
                "Calculate area of a Rectangle",
                "Calculate area of a Trapezoid",
                "Calculate area of a Circle",
                "Calculate area of a Rhomboid",
                "Exit"
        };

        int userChoice = JOptionPane.showOptionDialog(
                null,
                "Geometric Calculator Menu",
                "Choose an option",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        switchOptions(userChoice);
    }

    public static void switchOptions(int choice) {
        Figure figure = new Figure("", 0,
                0, 0, 0,
                0);
        switch (choice) {
            case 0:
                figure.calculateSquareArea();
                break;
            case 1:
                figure.calculateRectangleArea();
                break;
            case 2:
                figure.calculateTrapezoidArea();
                break;
            case 3:
                figure.calculateCircleArea();
                break;
            case 4:
                figure.calculateRhomboidArea();
                break;
            case 5:
                exitProgram();
                break;
            default:
                invalidOption();
        }
    }
    public static void exitProgram() {
        JOptionPane.showMessageDialog(null, "Exiting the program.");
    }

    public static void invalidOption() {
        JOptionPane.showMessageDialog(null, "Invalid option. Please choose a valid option.");
        showMenu();
    }
}
