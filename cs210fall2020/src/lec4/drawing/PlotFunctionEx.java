package lec4.drawing;

import edu.princeton.cs.algs4.StdDraw;

public class PlotFunctionEx
{
    public static void main(String[] args)
    {
        args = args.length!=0 ? args :
                new String[]{"10"};
        int N = Integer.parseInt(args[0]);
        double[] x = new double[N+1];
        double[] y = new double[N+1];
        for (int i = 0; i <= N; i++)
        {
            x[i] = Math.PI * i / N;
            y[i] = Math.sin(4*x[i]) + Math.sin(20*x[i]);
        }
        StdDraw.setXscale(0, Math.PI);
        StdDraw.setYscale(-2.0, +2.0);
        for (int i = 0; i < N; i++)
            StdDraw.line(x[i], y[i], x[i+1], y[i+1]);
    }
}
