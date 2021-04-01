package za.ac.cput;

public class Square
{
    private int length;
    private int height;

    public Square()
    {

    }

    public Square(int length, int height)
    {
        this.length = length;
        this.height = height;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "Square{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }

}
