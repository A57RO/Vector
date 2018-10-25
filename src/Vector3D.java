public class Vector3D extends BaseVector{

    public Vector3D(double x1, double x2, double x3) {
        super(new double[]{x1, x2, x3});
    }

    public Vector3D add(Vector3D secondVector)
    {
        return (Vector3D) super.add(secondVector);
    }

    public Vector3D subtraction(Vector3D secondVector)
    {
        return (Vector3D) super.subtraction(secondVector);
    }

    @Override
    protected BaseVector Copy(double[] coord) {
        return new Vector3D(coord[0], coord[1], coord[2]);
    }
}
