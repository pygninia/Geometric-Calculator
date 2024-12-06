/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icy;

import java.util.Scanner;

/**
 *
 * @author Billey
 */
public class Icy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        double total = 0; // Variable to accumulate all results

        // Display menu
        System.out.println("Choose a number to calculate");
        System.out.println("1. Area of the Triangle");
        System.out.println("2. Area of the Circle");
        System.out.println("3. Area of the Rectangle");
        System.out.println("4. Volume of the Sphere");
        System.out.println("5. Volume of the Cylinder");
        System.out.println("6. Law of Cosines");
        System.out.println("7. Area of Circle Segment");
        System.out.println("8. Volume of Sphere");
        System.out.println("9. Surface Area of Sphere\n");
        System.out.print("Type a number of your choice:");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter base of the triangle: \n");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: \n");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of the triangle: " + triangleArea);

                total += triangleArea; // Add to total
                break;

            case 2:
                System.out.print("Enter radius of the circle: \n");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + circleArea);

                total += circleArea; // Add to total
                break;

            case 3:
                System.out.print("Enter length of the rectangle: \n");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: \n");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Area of the rectangle: " + rectangleArea);

                total += rectangleArea; // Add to total
                break;

            case 4:
                System.out.print("Enter radius of the sphere: \n");
                double sphereRadius = scanner.nextDouble();
                double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);
                System.out.println("Volume of the sphere: " + sphereVolume);

                total += sphereVolume; // Add to total
                break;

            case 5:
                System.out.print("Enter radius of the cylinder: \n");
                double cylinderRadius = scanner.nextDouble();
                System.out.print("Enter height of the cylinder: \n");
                double cylinderHeight = scanner.nextDouble();
                double cylinderVolume = Math.PI * Math.pow(cylinderRadius, 2) * cylinderHeight;
                System.out.println("Volume of the cylinder: " + cylinderVolume);

                total += cylinderVolume; // Add to total
                break;

            case 6:
                System.out.print("Enter side a: \n");
                double a = scanner.nextDouble();
                System.out.print("Enter side b: \n");
                double b = scanner.nextDouble();
                System.out.print("Enter angle C in degrees: \n");
                double angleC = scanner.nextDouble();
                double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(angleC)));
                System.out.println("Length of side c: " + c);

                total += c; // Add the calculated side length to total
                break;

            case 7:
                System.out.print("Enter radius of the circle: \n");
                double segmentRadius = scanner.nextDouble();
                System.out.print("Enter angle of the segment in degrees: \n");
                double angle = scanner.nextDouble();
                double segmentArea = (Math.PI * Math.pow(segmentRadius, 2) * angle) / 360 -
                        0.5 * Math.pow(segmentRadius, 2) * Math.sin(Math.toRadians(angle));
                System.out.println("Area of the circle segment: " + segmentArea);

                total += segmentArea; // Add to total
                break;

            case 8:
                System.out.print("Enter radius of the sphere: \n");
                double sphereVolumeRadius = scanner.nextDouble();
                double volumeSphere = (4.0 / 3.0) * Math.PI * Math.pow(sphereVolumeRadius, 3);
                System.out.println("Volume of the sphere: " + volumeSphere);

                total += volumeSphere; // Add to total
                break;

            case 9:
                System.out.print("Enter radius of the sphere: \n");
                double sphereSurfaceRadius = scanner.nextDouble();
                double surfaceArea = 4 * Math.PI * Math.pow(sphereSurfaceRadius, 2);
                System.out.println("Surface area of the sphere: " + surfaceArea);

                total += surfaceArea; // Add to total
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }

        // Display total of all calculations
        if (total > 0) {
            System.out.println("Cumulative Total of Calculations: " + total);
        }

        scanner.close();
    }
}
