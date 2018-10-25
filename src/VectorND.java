public class VectorND extends BaseVector {
    public VectorND(double... coordinates) {
        super(coordinates);
    }

    public VectorND add(VectorND secondVector)
    {
        if (this.getDimension() != secondVector.getDimension())
            throw new IllegalArgumentException();
        return (VectorND) super.add(secondVector);

    }

    public VectorND subtraction(VectorND secondVector)
    {
        if (this.getDimension() != secondVector.getDimension())
            throw new IllegalArgumentException();
        return (VectorND) super.subtraction(secondVector);
    }

    @Override
    protected BaseVector Copy(double[] coordinates) {
        return new VectorND(coordinates);
    }
}
