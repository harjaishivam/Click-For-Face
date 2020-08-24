import acm.program.*;
import acm.graphics.*;

import java.awt.event.*;

public class ClickForFace extends GraphicsProgram {

    public void init()
    {
        addMouseListeners();
    }

    public void mouseClicked(MouseEvent e)
    {
        GFace face = new GFace(FACE_DIAM,FACE_DIAM);
        add(face,e.getX()-15,e.getY()-15);
    }


    private static final double FACE_DIAM = 30.0;
}
