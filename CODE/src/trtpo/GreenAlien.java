
package trtpo;

import javafx.scene.shape.Rectangle;

import java.awt.*;
import java.awt.image.BufferedImage;

import static trtpo.Constants.*;

public class GreenAlien extends Alien {

    public GreenAlien(Rectangle frames, int frameLivingLimit, int x, int y) {
        super(frames, frameLivingLimit, x, y, Color.GREEN);
        setMoveSpeed(GREEN_ALIEN_MOVE_SPEED);
        setScorePoint(GREEN_ALIEN_SCORE_POINTS);
        setHitPoints(GREEN_ALIEN_HIT_POINTS);
    }


    @Override
    public void shooting() {
        manIsDown = true;
    }

}
