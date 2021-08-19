package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Pentagon implements Shape {
    @Override
    public int getNumberOfEdges() {
        return 5;
    }
}
