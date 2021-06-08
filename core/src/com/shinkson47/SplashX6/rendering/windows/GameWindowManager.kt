package com.shinkson47.SplashX6.rendering.windows

import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.badlogic.gdx.utils.Array
import com.badlogic.gdx.utils.Select
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.gameutils.units
import com.shinkson47.SplashX6.utility.Assets.SKIN

/**
 * # Utility that manages tool windows within the game screen
 * The aim is that the user has some way to better manage and access all the
 * game tool windows.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 04/06/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
object GameWindowManager {

    /**
     * # All windows that have been created for use in game.
     */
    @JvmStatic private val GAME_WINDOWS: Array<StageWindow> = Array()
    @JvmStatic private var currentWindow: StageWindow? = null

    /**
     * # The dock window that's used to access [GAME_WINDOWS]
     */
    @JvmStatic val WINDOW_DOCK : SelectBox<StageWindow> = SelectBox(SKIN, "window-dock")
    init {
        with (WINDOW_DOCK) {
            setPosition(0f, 0f)
            addListener(StageWindow.LambdaClickListener {
                toggleCurrent()
                if (currentWindow == selected) return@LambdaClickListener
                currentWindow = selected
                toggleCurrent()
            })
        }
    }

    /**
     * # Adds a [StageWindow] to the dock for the user to use in-game.
     * Automatically  places the window onto the in-game HUD stage.
     */
    @JvmStatic fun add(sw: StageWindow) {
        GameHypervisor.gameRenderer!!.hudStage.addActor(sw)
        sw.isVisible = false
        sw.dontClose()

        sw.setPosition(0f,0f)

        GAME_WINDOWS.add(sw)
        update()
    }

    /**
     * # Instantiates all game windows.
     * As a part of the post game load stage, creates all game windows.
     */
    fun create() {
        GameHypervisor.gameRenderer!!.menu.add(WINDOW_DOCK)


        add(units())
    }

    fun update () {
        WINDOW_DOCK.items = GAME_WINDOWS
    }

    private fun toggleCurrent() {
        currentWindow?.let { WINDOW_DOCK.selected.toggleShown() }
    }

    /**
     * Destroys all windows.
     */
    fun dispose() {
        GAME_WINDOWS.clear()
    }
}