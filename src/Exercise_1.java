public class Exercise_1 {
        public static void main(String[] args) {
            double radius = 5.0; // радіус кола
            double area = calculateCircleArea(radius);
            System.out.println("Площа кола: " + area);
        }

        public static double calculateCircleArea(double radius) {
            double area = Math.PI * Math.pow(radius, 2);
            return area;
        }
    }


