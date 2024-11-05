package com.dingproj.dgeo.demo;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.triangulate.DelaunayTriangulationBuilder;

import java.util.Arrays;


/**
 * ProjectName: jts
 * ClassName: Demo01
 * Package: com.dingproj.dgeo.demo
 * Description:
 *
 * @Author: ding
 * @Create 2024/9/20 16:09
 * @Version 1.0
 **/
public class Demo01 {
    public static void main(String[] args) {
        GeometryFactory geometryFactory = new GeometryFactory();
        Coordinate[] coordinates = new Coordinate[]{
                new Coordinate(1.0,1.0),
                new Coordinate(1.0,3.0),
                new Coordinate(2.0,3.0),
                new Coordinate(2.0,1.0)

        };
        DelaunayTriangulationBuilder delaunayTriangulationBuilder = new DelaunayTriangulationBuilder();
        delaunayTriangulationBuilder.setSites(Arrays.asList(coordinates));

    }
}
