package lec4.drawing;

import edu.princeton.cs.algs4.Picture;

import java.awt.Color;
public class Grayscale
{
    public static void main(String[] args)
    {
        args = args.length!=0 ? args :
                new String[]{"data/mandrill.jpg"};
        Picture pic = new Picture(args[0]);
        for (int col = 0; col < pic.width(); col++)
            for (int row = 0; row < pic.height(); row++)
            {
                Color color = pic.get(col, row);
                Color gray = Luminance.toGray(color);
                pic.set(col, row, gray);
            }
        pic.show();
    }
}
