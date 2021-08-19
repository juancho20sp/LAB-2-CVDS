package edu.eci.cvds.patterns.shapes;

public class ShapeMain {
//  mvn exec:java -Dexec.mainClass=edu.eci.cvds.patterns.shapes.ShapeMain -Dexec.args="Triangle"
    public static void main(String[] args) {
        if (args == null || args.length != 1){
            System.err.println("Parameter of type RegularShapeType is required.");
            return;
        }

        try {
            RegularShapeType type = RegularShapeType.valueOf(args[0]);
            Shape shape = ShapeFactory.create(type);

            System.out.println("\n\n");
            System.out.println(String.format("Successfully create a %s with %s sides.", type, shape.getNumberOfEdges()));
            System.out.println("\n\n");

        } catch(IllegalArgumentException ex){
            System.err.println("Parameter '" + args[0] + "' is not a valid RegularShapeType");
            return;
        }
    }
}
