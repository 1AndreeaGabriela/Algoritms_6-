

class MinimumTriangulation
{



    public static double MWT(Point[] vertices, int i, int j)
    {


        if (j < i + 2)
        {
            return 0;
        }


        double cost = Double.MAX_VALUE;


        for (int k = i + 1; k <= j - 1; k++)
        {


            double weight = vertices[i].dist(vertices[j])
                    + vertices[j].dist(vertices[k])
                    + vertices[k].dist(vertices[i]);


            cost = Double.min(cost,
                    weight + MWT(vertices, i, k)
                            + MWT(vertices, k, j));
        }
        return cost;
    }



}


