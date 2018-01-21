package VisionGoggles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.*;

/**
 * Created by Noah on 1/21/2018.
 */

public class UklParticleEffects {
    private ParticleEffect[] particles;

    public void create(){
        //Creates particle effects.
        particles = new ParticleEffect[1];
        particles[0] = new ParticleEffect();
        //The first is the particle text file, the second is WHERE to find the texture for the particle.
        particles[0].load( Gdx.files.internal("data/flare.p"), Gdx.files.internal("data"));

        for (ParticleEffect effect : particles)
            effect.start();


    }
}
