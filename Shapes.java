import java.util.*;
public class Shapes {
    public static Cube genCube(double x, double y, double z) {
        //Cubes are 1x1x1
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(x,y,z));
        points.add(new Point(x+1,y,z));
        points.add(new Point(x,y+1,z));
        points.add(new Point(x+1,y+1,z));
        points.add(new Point(x,y,z+1));
        points.add(new Point(x+1,y,z+1));
        points.add(new Point(x,y+1,z+1));
        points.add(new Point(x+1,y+1,z+1));
        //GENERATE VECTORS 
        ArrayList<Vector> vectors = new ArrayList<Vector>();
        vectors.add(new Vector(points.get(0),points.get(1)));
        vectors.add(new Vector(points.get(0),points.get(4)));        
        vectors.add(new Vector(points.get(0),points.get(2))); 
        vectors.add(new Vector(points.get(1),points.get(3))); 
        vectors.add(new Vector(points.get(1),points.get(5))); 
        vectors.add(new Vector(points.get(2),points.get(3))); 
        vectors.add(new Vector(points.get(2),points.get(6))); 
        vectors.add(new Vector(points.get(3),points.get(7))); 
        vectors.add(new Vector(points.get(4),points.get(5))); 
        vectors.add(new Vector(points.get(4),points.get(6))); 
        vectors.add(new Vector(points.get(5),points.get(7))); 
        vectors.add(new Vector(points.get(6),points.get(7)));
        //GENERATE POLYGONS
        ArrayList<Polygon> polygons = new ArrayList<Polygon>();
        polygons.add(new Polygon(points.get(0),points.get(1),points.get(4)));
        polygons.add(new Polygon(points.get(1),points.get(3),points.get(5)));
        polygons.add(new Polygon(points.get(4),points.get(5),points.get(6)));
        polygons.add(new Polygon(points.get(1),points.get(4),points.get(5)));
        polygons.add(new Polygon(points.get(3),points.get(5),points.get(7)));
        polygons.add(new Polygon(points.get(5),points.get(6),points.get(7)));
        polygons.add(new Polygon(points.get(0),points.get(2),points.get(6)));
        polygons.add(new Polygon(points.get(0),points.get(4),points.get(6)));
        polygons.add(new Polygon(points.get(0),points.get(1),points.get(2)));
        polygons.add(new Polygon(points.get(2),points.get(3),points.get(6)));
        polygons.add(new Polygon(points.get(3),points.get(6),points.get(7)));
        polygons.add(new Polygon(points.get(1),points.get(2),points.get(3)));
        return new Cube(points, vectors, polygons);
    }
}