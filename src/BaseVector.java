abstract class BaseVector {
    protected double[] coordinates;
    public int getDimension(){
        return coordinates.length;
    }
    public BaseVector add (BaseVector secondVector)
    {
        var newCoordinates = this.coordinates.clone();
        for (var i = 0; i < this.getDimension(); i++)
        {
            newCoordinates[i] += secondVector.coordinates[i];
        }
        return Copy(newCoordinates);
    }

    public BaseVector subtraction(BaseVector secondVector)
    {
        var newCoordinates = this.coordinates.clone();
        for (var i = 0; i < this.getDimension(); i++)
        {
            newCoordinates[i] -= secondVector.coordinates[i];
        }
        return Copy(newCoordinates);
    }

    public double scalarProduct(BaseVector secondVector)
    {
        var scalarProduct = 0;
        for (var i = 0; i < this.getDimension(); i++)
        {
            scalarProduct += this.coordinates[i] * secondVector.coordinates[i];
        }
        return scalarProduct;
    }

    public boolean equals(Object o)
    {
        if (this == o)
            return true;

        if (this.getClass() != o.getClass())
            return false;

//        for (var i = 0; i < this.getDimension(); i++)
//        {
//
//        }
        return true;
    }

    public int hashCode()
    {
        var hash = 0;
        for (var i = 1; i <= this.getDimension(); i++) {
            hash += this.coordinates[i] * i;
        }
        return hash;
    }

    public BaseVector(double[] coordinates)
    {
        this.coordinates = coordinates;
    }

    public BaseVector(int dimension)
    {
        this.coordinates = new double[dimension];
    }

    abstract BaseVector Copy(double[] coordinates);
}
