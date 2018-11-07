abstract class BaseVector {
    protected double[] coordinates;
    protected int getDimension(){
        return coordinates.length;
    }
    protected BaseVector add (BaseVector secondVector)
    {
        var newCoordinates = this.coordinates.clone();
        for (var i = 0; i < this.getDimension(); i++)
        {
            newCoordinates[i] += secondVector.coordinates[i];
        }
        return Copy(newCoordinates);
    }

    protected BaseVector subtraction(BaseVector secondVector)
    {
        var newCoordinates = this.coordinates.clone();
        for (var i = 0; i < this.getDimension(); i++)
        {
            newCoordinates[i] -= secondVector.coordinates[i];
        }
        return Copy(newCoordinates);
    }

    protected double scalarProduct(BaseVector secondVector)
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
        if (o == null)
            return false;

        if (this.getClass() != o.getClass())
            throw new IllegalArgumentException();

        if (this == o)
            return true;

        if (this.hashCode() != o.hashCode())
            return false;

        BaseVector vector = (BaseVector)o;
        for (var i = 0; i < this.getDimension(); i++)
        {
            if (this.coordinates[i] != vector.coordinates[i])
                return false;
        }
        return true;
    }

    public int hashCode()
    {
        var hash = 0;
        for (var i = 1; i <= this.getDimension(); i++) {
            hash += this.coordinates[i-1] * i;
        }
        return hash;
    }

    protected BaseVector(double[] coordinates)
    {
        this.coordinates = coordinates;
    }

    abstract BaseVector Copy(double[] coordinates);
}
