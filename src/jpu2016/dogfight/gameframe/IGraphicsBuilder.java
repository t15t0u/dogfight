package jpu2016.dogfight.gameframe;


import java.awt.*;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {
    public void applyModelToGraphic(Graphics graphics, ImageObserver observer);

    public int getGlobalWidth();

    public int getGlobalHeight();
}
