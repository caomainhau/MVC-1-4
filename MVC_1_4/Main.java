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
            File inputFile = new File("/Users/manhhaucao/IdeaProjects/MVC_1_4-main/MVC_1_4/input.txt");
            controller.loadFromFile(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display lines
        controller.displayLines();

        // Save data to file
        try {
            File outputFile = new File("/Users/manhhaucao/IdeaProjects/MVC_1_4-main/MVC_1_4/output.txt");
            controller.saveToFile(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
