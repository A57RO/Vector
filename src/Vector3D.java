public class Vector3D extends BaseVector{

    public Vector3D(double[] coordinates) {
        super(coordinates);
        if (coordinates.length != 3) {
        }
    }

    public Vector3D(int dimension)
    {
        super(dimension);
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
    protected BaseVector Copy(double[] coordinates) {
        return new Vector3D(coordinates);
    }
}
