public class Vector5D extends BaseVector {

    public Vector5D(double x1, double x2, double x3, double x4, double x5) {
        super(new double[]{x1, x2,x3, x4, x5});
    }

    public Vector5D add(Vector5D secondVector)
    {
        return (Vector5D) super.add(secondVector);
    }

    public Vector5D subtraction(Vector5D secondVector)
    {
        return (Vector5D) super.subtraction(secondVector);
    }

    @Override
    protected BaseVector Copy(double[] coord) {
        return new Vector5D(coord[0], coord[1], coord[2], coord[3], coord[4]);
    }
}
