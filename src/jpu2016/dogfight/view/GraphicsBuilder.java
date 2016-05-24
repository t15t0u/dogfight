package jpu2016.dogfight.view;


import jpu2016.dogfight.gameframe.IGraphicsBuilder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class GraphicsBuilder implements IGraphicsBuilder{
    public GraphicsBuilder(IDogfightModel dogfightModel) {
        BufferedImage bufferedImage = new BufferedImage(1, 1, 1);
    }

    @Override
    public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

    }

    private void buildEmptySky(){

    }

    private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer){

    }

    @Override
    public int getGlobalWidth() {
        return 0;
    }

    @Override
    public int getGlobalHeight() {
        return 0;
    }
}
