/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarno_joelrazzle_circle;

import javax.swing.JOptionPane;


/**
 *
 * @author Billey
 */
public class Sarno_JoelRazzle_Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Circle myCircle = null;

        while (true) {
            // Step 1: Ask the user to input the radius using JOptionPane
            String input = JOptionPane.showInputDialog("Enter the radius of the circle (or click Cancel to exit):");

            // Handle the case where the user clicks "Cancel" or closes the dialog
            if (input == null) {
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Thank you! Exiting the program.");
                    System.exit(0);
                } else {
                    continue; // Go back to the main loop
                }
            }

            try {
                // Step 2: Convert the input string to a double
                double radius = Double.parseDouble(input);

                // Check if the radius is 0
                if (radius == 0) {
                    JOptionPane.showMessageDialog(null, "A circle with a radius of 0 doesn't exist. Please enter a valid radius.");
                    continue; // Prompt the user again
                }

                // Step 3: Create a Circle object using the radius
                myCircle = new Circle(radius);

                // Step 4: Display the initial circle details
                double area = myCircle.getArea();
                double circumference = myCircle.getCircumference();
                double diameter = myCircle.getDiameter();

                JOptionPane.showMessageDialog(null, 
                    "Initial Circle Details:\n"
                    + "Radius: " + myCircle.getRadius() + " units\n"
                    + "Area: " + area + " square units\n"
                    + "Circumference: " + circumference + " units\n"
                    + "Diameter: " + diameter + " units"
                );

                // Step 5: Ask for a new radius to update the circle
                while (true) {
                    String newRadiusInput = JOptionPane.showInputDialog("Enter a new radius for the circle (or click Cancel to skip):");

                    // Handle the case where the user clicks "Cancel"
                    if (newRadiusInput == null) {
                        JOptionPane.showMessageDialog(null, "No changes made to the circle.");
                        break;
                    }

                    try {
                        // Convert the new radius input to a double
                        double newRadius = Double.parseDouble(newRadiusInput);

                        // Check if the new radius is 0
                        if (newRadius == 0) {
                            JOptionPane.showMessageDialog(null, "A circle with a radius of 0 doesn't exist. Please enter a valid radius.");
                            continue; // Prompt the user again
                        }

                        // Update the circle's radius
                        myCircle.setRadius(newRadius);

                        // Step 6: Display the updated circle details
                        area = myCircle.getArea();
                        circumference = myCircle.getCircumference();
                        diameter = myCircle.getDiameter();

                        JOptionPane.showMessageDialog(null, 
                            "Updated Circle Details:\n"
                            + "Radius: " + myCircle.getRadius() + " units\n"
                            + "Area: " + area + " square units\n"
                            + "Circumference: " + circumference + " units\n"
                            + "Diameter: " + diameter + " units"
                        );

                        break; // Exit the inner loop after updating the circle
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number for the radius.");
                    }
                }

                // Ask if the user wants to perform another transaction
                int continueTransaction = JOptionPane.showConfirmDialog(null, "Do you want to perform another transaction?", "Continue?", JOptionPane.YES_NO_OPTION);
                if (continueTransaction == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Thank you! Exiting the program.");
                    System.exit(0);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number for the radius.");
            }
        }
    }
}
