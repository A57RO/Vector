public class Program {
    public static void main(String args[])
    {
        var coords1 = new double[]{ 1, 2, 3 };
        var coords2 = new double[]{ 9, 5, 1, 2 };
        var vector = new Vector3D(coords2);
        var vector1 = new Vector3D(coords1);
        var cmp = vector.scalarProduct(vector1);
        var equ = vector.equals(vector1);
        var sub = vector == vector1;
        var sub1 = vector == vector;
    }
}
