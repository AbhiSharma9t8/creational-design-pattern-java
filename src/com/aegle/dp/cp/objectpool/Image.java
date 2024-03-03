package com.aegle.dp.cp.objectpool;

public interface Image extends Poolable {
    void draw();
    Point2D getLocation();
    void setLocation(Point2D location);
}
