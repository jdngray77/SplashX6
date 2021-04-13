package com.shinkson47.game.rendering;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.maps.MapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.IsometricStaggeredTiledMapRenderer;
import com.shinkson47.game.world.World;

/**
 * <h1>Main rendering class</h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 12/04/2021</a>
 * @version 1
 * @since v1
 */
public class Renderer{

    /**
     * <h2>Camera used to observe the world</h2>
     */
    private static Camera camera = new Camera();
    /**
     * <h2>Renderer that renders {@link World#focusedWorld}</h2>
     * renders from perspective of {@link Renderer#camera}
     */
    private static MapRenderer r;

    //#region construction

    /**
     * <h2>Configures the rendering environment.</h2>
     */
    public static void create() {
        createObjects();
        configureGraphicEnv();
    }

    /**
     * <h2>Creates all class level objects needed to render.</h2>
     * @apinote calls {@link Renderer#configureObjects()}
     */
    private static void createObjects() {
        r = new IsometricStaggeredTiledMapRenderer(World.focusedWorld.getMap());
        configureObjects();
    }

    /**
     * <h2>Configures class level objects ready for use</h2>
     */
    private static void configureObjects() {
        resize(Gdx.graphics.getWidth(),
        Gdx.graphics.getHeight());
    }

    /**
     * <h2>Configures the graphical environment</h2>
     * i.e glfw and gl.
     */
    private static void configureGraphicEnv() {
        Gdx.gl.glClearColor(0,0,0, 1);
    }
    //#endregion construction


    //#region rendering operations

    /**
     * <h2>Renders the next frame</h2>
     */
    public static void render() {
        // Clear last frame,
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        r.setView(camera.getCam().combined,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        camera.update();
        r.render();
    }

    public static void resize(float width, float height) {
        camera.resize(width, height);
    }
    //#endregion rendering operations


    //#region get/set & misc
    public static Camera getCam() {
        return camera;
    }

    public static void dispose() {
    }
    //#engregion


}
