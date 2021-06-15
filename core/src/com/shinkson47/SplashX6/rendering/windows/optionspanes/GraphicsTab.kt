package com.shinkson47.SplashX6.rendering.windows.optionspanes

import com.badlogic.gdx.Graphics
import com.badlogic.gdx.scenes.scene2d.EventListener
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.badlogic.gdx.utils.Align
import com.badlogic.gdx.utils.Array
import com.badlogic.gdx.utils.Scaling
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.rendering.windows.OptionsWindow
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.SKIN
import com.shinkson47.SplashX6.utility.GraphicalConfig
import com.shinkson47.SplashX6.utility.Utility
import com.shinkson47.SplashX6.utility.Utility.local

/**
 * # A graphical wrapper for [GraphicalConfig]
 * Options tab containing graphical settings.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 09/06/2021
 * @since v1
 * @version 1
 */
class GraphicsTab(val parent : OptionsWindow) : Table() {

    init {

        // Resolution (Display modes)
        StageWindow.label("displayMode", this)
            .padRight(20f)

        var modesList : SelectBox<Graphics.DisplayMode>? = null;
        modesList = select(
            StageWindow.LambdaChangeListener { GraphicalConfig.displayMode = modesList!!.selected },
            GraphicalConfig.displayMode,
            *GraphicalConfig.getDisplayModes() + GraphicalConfig.displayMode
        )

        // Scaling mode
        StageWindow.label("scalingMode", this)
            .padRight(20f)

        var scaleList : SelectBox<Scaling>? = null
        scaleList = select(
            StageWindow.LambdaChangeListener { GraphicalConfig.scalingMode = scaleList!!.selected },
            GraphicalConfig.scalingMode,
            *GraphicalConfig.getScalingModes()
        )

        // Fullscreen
        val checkFullscreen = CheckBox(local("fullscreen"), SKIN)
        checkFullscreen.isChecked = GraphicalConfig.fullscreen
        checkFullscreen.addListener(StageWindow.LambdaChangeListener { GraphicalConfig.fullscreen = checkFullscreen.isChecked })
        add(checkFullscreen)
            .colspan(2)
            .center()
            .row()

        // Advanced
        StageWindow.seperate(this, "graphicalAdvanced")
        add(StageWindow.button("graphicalFrustum") { parent.toggleShown() })
            .colspan(2)
            .row()
    }

    private fun <T> select(listener : EventListener, selected : T, vararg items : T): SelectBox<T> {
        val list = SelectBox<T>(Assets.SKIN)
        with (list) {
            setItems(Array(items))
            setSelected(selected)
            addListener(listener)
        }

        add(list)
            .width(350f)
            .row()


        return list
    }

}