public class Program {
    public static void main(String args[])
    {
        var vector = new VectorND(1, 2, 3);
        var vector1 = new VectorND(9, 5, 1);
        var vector2 = new VectorND(1, 2, 3);
        var cmp = vector.scalarProduct(vector1);
        var equ = vector.equals(vector1);
        var sub = vector.equals(vector2);
    }
}
