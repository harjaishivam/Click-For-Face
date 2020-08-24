import acm.graphics.*;
import acm.util.*;



public class GFace extends GCompound {


    private static final double EYE_HEIGHT = 0.15;
    private static final double EYE_WIDTH = 0.15;
    private static final double NOSE_HEIGHT = 0.25;
    private static final double NOSE_WIDTH = 0.25;
    private static final double MOUTH_HEIGHT = 0.10;
    private static final double MOUTH_WIDTH = 0.40;


    private GOval face;
    private GOval right_eye,left_eye;
    private GPolygon nose;
    private GRect mouth;

    public GFace(double width , double height)
    {


        face = new GOval(width,height);
        right_eye = new GOval(width*EYE_WIDTH,height*EYE_HEIGHT);
        left_eye = new GOval(width*EYE_WIDTH,height*EYE_HEIGHT);
        nose = createNose(NOSE_WIDTH*width,NOSE_HEIGHT*height);
        mouth = new GRect(width*MOUTH_WIDTH,height*MOUTH_HEIGHT);





        //ALL THE add() STATEMENTS .

        add(face,0,0);
        add(right_eye,width/4 - (width*EYE_WIDTH)/2,height/4 - (height*EYE_HEIGHT)/2);
        add(left_eye,(3*width)/4 - (width*EYE_WIDTH)/2,height/4 - (height*EYE_HEIGHT)/2);
        add(nose,width/2,height/2);
        add(mouth,width/2 - (MOUTH_WIDTH*width)/2,(3*height)/4 - (MOUTH_HEIGHT*height)/2);




    }


    private GPolygon createNose(double nwidth,double nheight)
    {
        GPolygon poly = new GPolygon();
        poly.addVertex(0,-nheight/2);
        poly.addVertex(nwidth/2,nheight/2);
        poly.addVertex(-nwidth/2,nheight/2);
        return poly;
    }




}
