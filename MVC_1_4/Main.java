package MVC_1_4;

import java.io.File;
import java.io.IOException;

// Main class
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Load data from file
        try {
            File inputFile = new File("D:\\Hoc\\Java\\MidTerm\\input.txt");
            controller.loadFromFile(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display lines
        controller.displayLines();

        // Save data to file
        try {
            File outputFile = new File("D:\\Hoc\\Java\\MidTerm\\output.txt");
            controller.saveToFile(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
