public class VectorOperations {
    public static void main(String[] args) {

        try {
            Vector v1 = new Vector(2, 3, 4);
            Vector v2 = new Vector(1, 5, 6);
            Vector v3 = new Vector(7, 8); // 2D vector

            System.out.print("v1 + v2 = ");
            Vector sum = v1.add(v2);
            sum.display();

            System.out.print("v1 - v2 = ");
            Vector diff = v1.subtract(v2);
            diff.display();

            System.out.print("v1 . v2 = ");
            System.out.println(v1.dotProduct(v2));

            // Dimension mismatch test
            System.out.println("Trying to add 3D and 2D:");
            v1.add(v3);

        } catch (InvalidVectorException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}