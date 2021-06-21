package com.shinkson47.SplashX6.rendering

import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.viewport.ScalingViewport
import com.shinkson47.SplashX6.Client
import com.shinkson47.SplashX6.utility.GraphicalConfig

/**
 * A screen adapter that contains a stage for scaling UI according t
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 14/06/2021
 * @since v1
 * @version 1
 */
abstract class ScalingScreenAdapter() : ScreenAdapter() {

    @JvmField var width =  GraphicalConfig.displayMode.width.toFloat() .coerceAtLeast(GraphicalConfig.MIN_STAGE_WITDH.toFloat())
    @JvmField var height = GraphicalConfig.displayMode.height.toFloat().coerceAtLeast(GraphicalConfig.MIN_STAGE_HEIGHT.toFloat())

    private val view = ScalingViewport(GraphicalConfig.scalingMode, width, height)
    @JvmField protected val stage = Stage(view)

    init {
        stage.isDebugAll = Client.DEBUG_MODE
    }

    abstract fun doResize(width: Int, height: Int)
    override fun resize(width: Int, height: Int) {
        view.scaling = GraphicalConfig.scalingMode

        view.setWorldSize(this.width, this.height)
        stage.viewport.update(width, height)

        doResize(this.width.toInt(), this.height.toInt())
    }


}