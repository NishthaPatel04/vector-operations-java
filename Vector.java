public class Vector {
    private double[] components;

    public Vector(double... components) throws InvalidVectorException {
        if (components.length != 2 && components.length != 3) {
            throw new InvalidVectorException("Vector must be 2D or 3D only.");
        }
        this.components = components;
    }

    private void checkDimension(Vector other) throws InvalidVectorException {
        if (this.components.length != other.components.length) {
            throw new InvalidVectorException("Dimensions must be same.");
        }
    }

    public Vector add(Vector other) throws InvalidVectorException {
        checkDimension(other);
        double[] result = new double[components.length];

        for (int i = 0; i < components.length; i++) {
            result[i] = components[i] + other.components[i];
        }
        return new Vector(result);
    }

    public Vector subtract(Vector other) throws InvalidVectorException {
        checkDimension(other);
        double[] result = new double[components.length];

        for (int i = 0; i < components.length; i++) {
            result[i] = components[i] - other.components[i];
        }
        return new Vector(result);
    }

    public double dotProduct(Vector other) throws InvalidVectorException {
        checkDimension(other);
        double sum = 0;

        for (int i = 0; i < components.length; i++) {
            sum += components[i] * other.components[i];
        }
        return sum;
    }

    public void display() {
        System.out.print("[");
        for (int i = 0; i < components.length; i++) {
            System.out.print(components[i]);
            if (i < components.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}