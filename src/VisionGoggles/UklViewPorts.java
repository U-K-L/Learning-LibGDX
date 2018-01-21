package VisionGoggles;

import com.badlogic.gdx.utils.ArrayMap;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by Noah on 1/20/2018.
 *
 * Purpose: Resizes the screen to fit different types of screens.
 */

public class UklViewPorts {
    public static ArrayMap<String, Viewport> views;

    public static void create(){
        views.put("FillScreen", new FitViewport(544.0f,416.0f, Scene.camera.cam));
    }

    public static void resize(int width, int height, String view){
        views.get("FillScreen").update(width, height);
    }
}
