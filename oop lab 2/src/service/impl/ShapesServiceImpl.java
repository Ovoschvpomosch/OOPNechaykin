package service.impl;

import colors.Color;
import service.ShapesService;
import shapes.Circle;
import shapes.Point;
import shapes.Rectangle;
import shapes.Shape;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class ShapesServiceImpl implements ShapesService {
    @Override
    public double getSquares(List<Shape> shapeList) {
        // TODO
        double S=0;
        for (int i=0; i<shapeList.size(); i++)
            S+=shapeList.get(i).getArea();
        return S;
    }

    @Override
    public double getMaxPerimeters(List<Shape> shapeList) {
        // TODO
        double P=shapeList.get(0).getPerimeter();
        for (int i=1; i<shapeList.size(); i++) {
            if(shapeList.get(i).getPerimeter()>P)
                P = shapeList.get(i).getPerimeter();
        }
        return P;
    }

    @Override
    public Set<Color> getColors(List<Shape> shapeList) {
        // TODO
        // Set<Color> setOfColors = null;
        Set<Color> setOfColors = new HashSet<>();
        for (int i=0; i<shapeList.size(); i++)
        {setOfColors.add(shapeList.get(i).getColor());
        }

        for (Color c : setOfColors)
            System.out.print(c+ " ");

        return setOfColors;
    }

}