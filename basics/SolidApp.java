import java.util.Scanner;

public class SolidApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a solid figure: cube, cone, cylinder, sphere");
        String figure = scanner.nextLine().toLowerCase();

        System.out.println("Calculate surface area or volume? (Enter 'area' or 'volume')");
        String calculationType = scanner.nextLine().toLowerCase();

        switch (figure) {
            case "cube":
                System.out.print("Enter the side length: ");
                double side = scanner.nextDouble();
                if (calculationType.equals("area")) {
                    System.out.println("Surface Area of Cube: " + (6 * side * side));
                } else if (calculationType.equals("volume")) {
                    System.out.println("Volume of Cube: " + (side * side * side));
                }
                break;

            case "cone":
                System.out.print("Enter the radius: ");
                double radiusCone = scanner.nextDouble();
                System.out.print("Enter the height: ");
                double heightCone = scanner.nextDouble();
                if (calculationType.equals("area")) {
                    double slantHeight = Math.sqrt(radiusCone * radiusCone + heightCone * heightCone);
                    System.out.println("Surface Area of Cone: " + (Math.PI * radiusCone * (radiusCone + slantHeight)));
                } else if (calculationType.equals("volume")) {
                    System.out.println("Volume of Cone: " + (Math.PI * radiusCone * radiusCone * heightCone / 3));
                }
                break;

            case "cylinder":
                System.out.print("Enter the radius: ");
                double radiusCyl = scanner.nextDouble();
                System.out.print("Enter the height: ");
                double heightCyl = scanner.nextDouble();
                if (calculationType.equals("area")) {
                    System.out.println("Surface Area of Cylinder: " + (2 * Math.PI * radiusCyl * (radiusCyl + heightCyl)));
                } else if (calculationType.equals("volume")) {
                    System.out.println("Volume of Cylinder: " + (Math.PI * radiusCyl * radiusCyl * heightCyl));
                }
                break;

            case "sphere":
                System.out.print("Enter the radius: ");
                double radiusSph = scanner.nextDouble();
                if (calculationType.equals("area")) {
                    System.out.println("Surface Area of Sphere: " + (4 * Math.PI * radiusSph * radiusSph));
                } else if (calculationType.equals("volume")) {
                    System.out.println("Volume of Sphere: " + (4 / 3 * Math.PI * radiusSph * radiusSph * radiusSph));
                }
                break;

            default:
                System.out.println("Invalid solid figure selected.");
        }
        
    }
}
