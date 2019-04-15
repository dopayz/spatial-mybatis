package com.esri.util;

import com.esri.obj.PointObject;

import java.util.HashMap;

public class WktToObj {

    public static PointObject POINTWktToObj(String wkt, int wkid) {
        String[] strHead = wkt.split("\\(");
        String strContent = strHead[1].substring(0, strHead[1].length() - 1);
        String[] strResult = strContent.split(" ");
        PointObject pointObject = new PointObject();
        pointObject.setX(Double.parseDouble(strResult[0]));
        pointObject.setY(Double.parseDouble(strResult[1]));
        HashMap<String, Integer> spatialReference = new HashMap<String, Integer>();
        spatialReference.put("wkid", wkid);
        pointObject.setSpatialReference(spatialReference);
        return pointObject;
    }
}
