package VisionGoggles;

import com.badlogic.gdx.utils.ArrayMap;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by Noah on 1/20/2018.
 *
 * Purpose: Resizes the screen to fit different types of screens.
 */

public class UklViewPorts {
    public static ArrayMap<String, Viewport> views;
    private float MAXWIDTH = 2560;
    private float MAXHEIGHT = 2560;
    private float MINWIDTH = 544;
    private float MINHEIGHT = 416;

    public static void create(){
        views = new ArrayMap<String, Viewport>();
        views.put("Fit", new FitViewport(544.0f,416.0f, Scene.camera.cam));
        views.put("Extend", new ExtendViewport(544.0f,416.0f, Scene.camera.cam));
    }

    public static void resize(int width, int height, String view){
        views.get(view).update(width, height);
    }
}
