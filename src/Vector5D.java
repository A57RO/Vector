public class Vector5D extends BaseVector {

    public Vector5D(double[] coordinates) {
        super(coordinates);
    }

    public Vector5D(int dimension)
    {
        super(dimension);
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
    protected BaseVector Copy(double[] coordinates) {
        return new Vector5D(coordinates);
    }
}
