package com.shinkson47.SplashX6.game.world.generation.stages

import com.shinkson47.SplashX6.game.world.FastNoiseLite
import com.shinkson47.SplashX6.game.world.Tile
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.WorldTerrainGenerator
import com.shinkson47.SplashX6.game.world.generation.BaseGenerationStage
import com.shinkson47.SplashX6.game.world.generation.GenerationCompanion.SEA_LEVEL
import com.shinkson47.SplashX6.game.world.generation.GenerationCompanion.createNoiseGenerator
import com.shinkson47.SplashX6.game.world.generation.WorldGenerationStage

/**
 * # Generates base worlds using [FastNoiseLite]
 * Can generate terrain bases using multiple different noises and fractal types.
 * Just have to configure fnl.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 03/07/2021
 * @since PRE-ALPHA 0.0.2
 * @version 1
 */
class NoiseBaseStage : BaseGenerationStage() {

    /**
     * Noise used in generator.
     */
    private lateinit var perlin : FastNoiseLite

    override fun execute(it: WorldTerrain) {
        perlin = createNoiseGenerator()

        it.putEachTile { x: Int, y: Int, ignored -> generateBaseTile(x,y) }
    }

    private var f : Float = 0f
    private fun generateBaseTile (x: Int, y: Int) : Tile {
        f = perlin.GetNoise(x.toFloat(), y.toFloat())

        return Tile(
            if (f < WorldTerrain.SEA_LEVEL)                 // Will this tile be below sea level?
                if (f < WorldTerrain.SEA_LEVEL - 0.2)       // If lower than two points under sea level,
                    "o"                                     // Make ocean.
                else
                    "s_s_s_s"                               // Otherwise shallow water.
            else                                            // If it's on land, check it's height.
                    "g_g_g_g"                               // Otherwise, grass.
        )
    }
}