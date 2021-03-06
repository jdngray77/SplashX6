/*░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 ░ FOSS 2022. The Splash Project.                                                                                                                                                 ░
 ░ https://www.shinkson47.in/SplashX6                                                                                                                                             ░
 ░ Jordan T. Gray.                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░                                                                                                                                                                                ░
 ░           _____                    _____                    _____            _____                    _____                    _____                                           ░
 ░          /\    \                  /\    \                  /\    \          /\    \                  /\    \                  /\    \                         ______           ░
 ░         /::\    \                /::\    \                /::\____\        /::\    \                /::\    \                /::\____\                       |::|   |          ░
 ░        /::::\    \              /::::\    \              /:::/    /       /::::\    \              /::::\    \              /:::/    /                       |::|   |          ░
 ░       /::::::\    \            /::::::\    \            /:::/    /       /::::::\    \            /::::::\    \            /:::/    /                        |::|   |          ░
 ░      /:::/\:::\    \          /:::/\:::\    \          /:::/    /       /:::/\:::\    \          /:::/\:::\    \          /:::/    /                         |::|   |          ░
 ░     /:::/__\:::\    \        /:::/__\:::\    \        /:::/    /       /:::/__\:::\    \        /:::/__\:::\    \        /:::/____/                          |::|   |          ░
 ░     \:::\   \:::\    \      /::::\   \:::\    \      /:::/    /       /::::\   \:::\    \       \:::\   \:::\    \      /::::\    \                          |::|   |          ░
 ░   ___\:::\   \:::\    \    /::::::\   \:::\    \    /:::/    /       /::::::\   \:::\    \    ___\:::\   \:::\    \    /::::::\    \   _____                 |::|   |          ░
 ░  /\   \:::\   \:::\    \  /:::/\:::\   \:::\____\  /:::/    /       /:::/\:::\   \:::\    \  /\   \:::\   \:::\    \  /:::/\:::\    \ /\    \          ______|::|___|___ ____  ░
 ░ /::\   \:::\   \:::\____\/:::/  \:::\   \:::|    |/:::/____/       /:::/  \:::\   \:::\____\/::\   \:::\   \:::\____\/:::/  \:::\    /::\____\        |:::::::::::::::::|    | ░
 ░ \:::\   \:::\   \::/    /\::/    \:::\  /:::|____|\:::\    \       \::/    \:::\  /:::/    /\:::\   \:::\   \::/    /\::/    \:::\  /:::/    /        |:::::::::::::::::|____| ░
 ░  \:::\   \:::\   \/____/  \/_____/\:::\/:::/    /  \:::\    \       \/____/ \:::\/:::/    /  \:::\   \:::\   \/____/  \/____/ \:::\/:::/    /          ~~~~~~|::|~~~|~~~       ░
 ░   \:::\   \:::\    \               \::::::/    /    \:::\    \               \::::::/    /    \:::\   \:::\    \               \::::::/    /                 |::|   |          ░
 ░    \:::\   \:::\____\               \::::/    /      \:::\    \               \::::/    /      \:::\   \:::\____\               \::::/    /                  |::|   |          ░
 ░     \:::\  /:::/    /                \::/____/        \:::\    \              /:::/    /        \:::\  /:::/    /               /:::/    /                   |::|   |          ░
 ░      \:::\/:::/    /                  ~~               \:::\    \            /:::/    /          \:::\/:::/    /               /:::/    /                    |::|   |          ░
 ░       \::::::/    /                                     \:::\    \          /:::/    /            \::::::/    /               /:::/    /                     |::|   |          ░
 ░        \::::/    /                                       \:::\____\        /:::/    /              \::::/    /               /:::/    /                      |::|   |          ░
 ░         \::/    /                                         \::/    /        \::/    /                \::/    /                \::/    /                       |::|___|          ░
 ░          \/____/                                           \/____/          \/____/                  \/____/                  \/____/                         ~~               ░
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.game.world

import box2dLight.PointLight
import box2dLight.RayHandler
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.maps.tiled.TiledMap
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer
import com.badlogic.gdx.maps.tiled.TiledMapTileSet
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.Vector3
import com.badlogic.gdx.physics.box2d.World
import com.shinkson47.SplashX6.game.world.generation.stages.NavigationDataMiscStage
import com.shinkson47.SplashX6.utility.Assets
import com.shinkson47.SplashX6.utility.Assets.TEX_HITTEST
import com.shinkson47.SplashX6.utility.Assets.TILED_TILESETS
import com.shinkson47.SplashX6.utility.Assets.TILED_TILESETS_DATA
import com.shinkson47.SplashX6.utility.PartiallySerializable
import com.shinkson47.SplashX6.utility.Utility
import org.xguzm.pathfinding.gdxbridge.NavigationTiledMapLayer
import java.awt.image.BufferedImage
import java.util.function.Consumer
import kotlin.math.floor

/**
 * # The terrain for a game world.
 * Does not contain unit etc that are in the world.
 *
 * Container for terrain and terrain navigation data in both
 * raw [Tile] form (For generation, interpretation, and serialization) and
 * [TiledMap] / [TiledMapTileLayer] form (for game engine & rendering).
 *
 * > n.b : [TiledMap] and it's layers are not serializable, hence this class is
 * [PartiallySerializable] and the Tiled components are transient. See [WorldTerrain.deserialize].
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 29/06/2021
 * @since PRE-ALPHA 0.0.1
 * @version 2 (Superceedes 'World')
 */
class WorldTerrain(val width : Int, val height : Int) : TiledMap(), PartiallySerializable {
    constructor() : this(DEFAULT_WIDTH, DEFAULT_HEIGHT)

    //==============================================
    //#region fields
    //==============================================


    //#region layers
    /**
     * # The final tile layer holding the world's tiles.
     */
    @Transient private lateinit var LerpedTileLayer: TiledMapTileLayer

    /**
     * # the final tile layer holding the world's tiles.
     */
    @Transient private lateinit var SpriteLayer: TiledMapTileLayer

    /**
     * # the final tile layer holding the world's tiles.
     */
    @Transient private lateinit var FoliageLayer: TiledMapTileLayer

    /**
     * # the final tile layer holding the world's tiles.
     */
    @Transient private lateinit var HeightLayer: TiledMapTileLayer

    //#endregion layers
    //#region Tiles

    /**
     * # The worlds tiles prior to interpolation
     * Note well : raw x and y are inverted. <c>worldTile[y][x]</c>
     */
    val worldTiles: Array<Array<Tile?>> = Array(width) { arrayOfNulls(height) }


    /**
     * # The worlds tiles prior to interpolation
     * Note well : raw x and y are inverted. <c>worldTile[y][x]</c>
     */
    val heightTiles: Array<Array<Tile?>> = Array(width) { arrayOfNulls(height) }


    /**
     * # The foliage tiles
     * Note well : raw x and y are inverted. <c>worldTile[y][x]</c>
     */
    val FoliageLayerTiles:Array<Array<Tile?>> = Array(width) { arrayOfNulls(height) }

    //#endregion Tiles
    //#region navigation



    /**
     * # Pathfinder
     * Usage : pathfinder.find(fromx, fromy, tox, toy, [WorldTerrain.navigationLayer]).
     */


    /**
     * # Map layer containing navigation data.
     *
     * Used for calculating navigation data when pathfinding.
     */
    @Transient lateinit var navigationLayer : NavigationTiledMapLayer

    //#endregion navigation
    //#region lighting
    @Transient val world = World(Vector2(0f,0f),false)

    @Transient var rayHandler = RayHandler(world).also { it.setCulling(false); }


    fun staticLight(vector3: Vector3, radius: Float = 400f) =
        staticLight(vector3.x, vector3.y, radius)

    fun staticLight(vector2: Vector2, radius: Float = 400f) =
        staticLight(vector2.x, vector2.y, radius)

    fun staticLight(x: Float, y: Float, radius: Float = 400f, rays: Int = 10): PointLight {
        isoToCartesian(x.toInt(),y.toInt()).apply {
           return PointLight(rayHandler, rays, Color.WHITE, radius, this.x, this.y)
        }
    }


    //#region

    //==============================================
    //#region fields
    //==============================================

    init {
        initLayers()
        configGDX()
    }

    private fun initLayers() {
        LerpedTileLayer = TiledMapTileLayer(width, height, TILE_WIDTH, TILE_HEIGHT)
        SpriteLayer     = TiledMapTileLayer(width, height, TILE_WIDTH, TILE_HEIGHT)
        FoliageLayer    = TiledMapTileLayer(width, height, TILE_WIDTH, TILE_HEIGHT)
        HeightLayer     = TiledMapTileLayer(width, height, TILE_WIDTH, TILE_HEIGHT)

        navigationLayer = NavigationTiledMapLayer(Array(height) { arrayOfNulls(width) })
        navigationLayer.width  = width
        navigationLayer.height = height
    }

    /**
     * Prepares the GDX tilemap to display data. </h2>
     * Configures tileset and layers.
     */
    private fun configGDX() {
        setTileSets()
        placeLayers(LerpedTileLayer)
    }

    /**
     * Re-creates the world layers after loading this instance from stream.
     */
    override fun deserialize() {
        rayHandler = RayHandler(world).also { it.setCulling(false); }

        // Create transient layers
        initLayers()

        // Re-populate navigation data.
        NavigationDataMiscStage().execute(this)

        // Import layers and load tilesets.
        configGDX()

        //TODO We do not know what areas of the map should
        //     or should not be defogged / have been explored.
        // STOPSHIP: 03/02/2022 This permits a player to save and load a world to skip exploration of the world.
        removeFogOfWar()
    }

    /**
     * <h2>Replaces all tilesets with those stored in [Assets.TILESETS]</h2>
     * @param map The map whose tilesets should be replaced
     * @return map, after mutating.
     */
    fun setTileSets() {
        // Just to be sure, remove any tilesets from map. There's no .Clear, so i have to do this BS.
        tileSets.forEach(Consumer { o: TiledMapTileSet? ->
            tileSets.removeTileSet(o)
        })
        // Copy all tilesets over to the map.
        Assets.get<TiledMap>(TILED_TILESETS).tileSets.forEach(Consumer { o: TiledMapTileSet? ->
            tileSets.addTileSet(o)
        })
    }


    /**
     * Removes and re-places all layers into the GDX map.
     * @param base The first layer.
     */
    fun placeLayers(base: TiledMapTileLayer?) {
        layers.forEach { o -> layers.remove(o) }
        layers.add(base)
        layers.add(HeightLayer)
        layers.add(FoliageLayer)
        layers.add(SpriteLayer)
    }


    /**
     * <h2>Sub routine for [com.shinkson47.SplashX6.game.world.WorldTerrain.removeFogOfWar]. Constructs cells containing tiles, and adds them to the map layer.</h2>
     * @param tileName The resource name of the tile to be used.
     * @param x The mapspace x to place it, within layer.
     * @param y The mapspace y to place it, within layer.
     */
    private fun createCell(tileName: String, x: Int, y: Int, layer: TiledMapTileLayer) {
        val c = TiledMapTileLayer.Cell()
        c.tile = tileSets.getTile(Assets.get<HashMap<String, Any>>(TILED_TILESETS_DATA)[tileName] as Int)
        layer.setCell(x, y, c)
    }


    /**
     * Gets tile at x,y from the source.
     *
     * @return tile in worldTiles at index x, y.
     * @apiNote Does not acknowledge that rows are staggered when rendered.
     * @see com.shinkson47.SplashX6.game.world.WorldTerrain.getStaggeredTile
     */
    fun getTile(x: Int, y: Int, source : Array<Array<Tile?>> = worldTiles): Tile? = if (Utility.checkIn2DBounds(y, x, source)) null else source[y][x]

    fun getTile(vec: Vector3) = getTile(vec.x.toInt(), vec.y.toInt())

    /**
     * <h2>Gets the tile at x, y, offset to ignore the isometric row stagger</h2>
     * Where on every odd y, x is shifted left by 1.
     * <br></br>
     * <blockquote>
     * if y == odd then x -= 1;
    </blockquote> *
     *
     * <br></br>
     * Useful when getting a tile relative to another.
     *
     *
     * <br></br><br></br>
     * Let's pick a tile at [x][y], and say we'd like to get the tile to it's north east side. <br></br><br></br>
     * On screen, we could describe this position as *up and right*, or [x+1][y+1] quite easily.
     *
     * <br></br><br></br> However, since the rows stagger back and forth by one tile, we can't simply read the tile at x+1, y+1 from the array and get the tile we're after.
     *
     * <br></br><br></br>That's what this method is for, it corrects for this stagger offset such that [x+1][y+1] would always return the tile which can be seen to the north east side of another.
     * @return if on an odd row, tile at raw array position [x - 1][y], if even at [x][y].
     */
    fun getStaggeredTile(x: Int, y: Int, source : Array<Array<Tile?>> = worldTiles): Tile? = getStaggeredISO(x,y).let { getTile(it.x.toInt(), it.y.toInt(), source) }



    /**
     * Remove fog of war from this world.
     *
     * Converts all map data into a single, total, complete map.
     */
    fun removeFogOfWar() {
        defog(width / 2, height / 2, Math.max(width, height))
        rayHandler.removeAll()
        rayHandler.setAmbientLight(Color.WHITE)
    }

    /**
     * <h2>
     * Removes the 'fog of war' area around a given point and radius. </h2>
     *
     * Achieved by using [WorldTerrain.createCell] to insert cells
     * from the [WorldTerrain.worldTiles] memory into [WorldTerrain.LerpedTileLayer]
     * to the displayable map.
     * @param x Positition of the center
     * @param y Positition of the center
     * @param radius Size of the area to de-fog.
     */
    fun defog(x: Int, y: Int, radius: Int) {
        val halfRad = (radius * 0.5).toInt()

        for (ix in Math.max(x - halfRad, 0)..Math.min(
            x + halfRad,
            worldTiles[0].size - 1
        )) for (iy in Math.max(y - radius, 0)..Math.min(radius * 2 + y, worldTiles.size - 1)) {
            // TODO can this be abstracted?
            createCell(worldTiles[iy][ix]!!.tileName, ix, iy, LerpedTileLayer)
            FoliageLayerTiles[iy][ix]?.let { createCell(it.tileName, ix, iy, FoliageLayer) }
            heightTiles[iy][ix]?.let { createCell(it.tileName, ix, iy, HeightLayer) }
        }
    }

    /**
     * Chooses a random point in the world.
     *
     * Has no regard for water / land.
     *
     * TODO not seed based.
     */
    fun randomPoint() = Vector3(
            MathUtils.random(0, width - 1).toFloat(),
            MathUtils.random(0, height - 1).toFloat(), 0f)

    /**
     * Chooses a random tile in the world that may be walked on,
     * according to [isNavligable]
     */
    fun randomNavigableTile(): Vector3 {
        while (true) {
            randomPoint().apply {
                    if (isNavligable(x,y)) return this
                }
            }
        }

    /**
     * Determines if a vector is within the boundaries of the world
     */
    fun isInWorld(vec: Vector3) = isInWorld(vec.x.toInt(), vec.y.toInt())

    /**
     * Determines if a vector is within the boundaries of the world
     */
    fun isInWorld(vec: Vector2) = isInWorld(vec.x.toInt(), vec.y.toInt())

    /**
     * Determines if a co-ordinate is within the boundaries of the world
     */
    fun isInWorld(x: Int, y: Int) = x in 0..width && y in 0..height


    /**
     * # Iterates through y then x in [worldTiles], performing [action] on each tile.
     */
    fun forEachTile(action: (Int, Int, Tile?) -> Unit) = forEachTile(worldTiles, action)

    /**
     * Applies [action] to every tile in [source].
     *
     * @param action (X, Y, Tile) The function invoked with every tile.
     */
    fun forEachTile(source : Array<Array<Tile?>>, action: (Int, Int, Tile?) -> Unit) {
        var x: Int; var y = 0
        source.forEach {
            x = 0;
            it.forEach {
                action.invoke(x, y, it)
                x++
            }
            y++
        }
    }

    /**
     * Replaces every tile in [worldTiles] with the result of [mutation]
     *
     * [mutation] is some function that either modifies the given tile, or returns the same tile.
     *
     * Used in world generation to apply some function world-wide.
     */
    fun putEachTile(mutation: (Int, Int, Tile?) -> Tile?) =
        putEachTile(worldTiles, mutation)

    /**
     * Replaces every tile in [source] with the result of [mutation]
     *
     * [mutation] is some function that either modifies the given tile, or returns the same tile.
     *
     * Used in world generation to apply some function world-wide.
     */
    fun putEachTile(source : Array<Array<Tile?>>, mutation: (Int, Int, Tile?) -> Tile?) =
        forEachTile(source) { x, y, tile -> source[y][x] = mutation.invoke(x,y, tile) }

    /**
     * Returns true if [x], [y] can be navigated, according to the landscape at that location.
     *
     * Conditions :
     *  - Must be land
     *  - There must be no foliage
     *  - There must be no hill or mountain
     *
     * > n.b this does not apply navigation data of units, or peek the [navigationLayer].
     * > In fact, this function is used to define the pathfinding graph in the [navigationLayer].
     */
    fun isNavligable(x : Float, y : Float) = isNavligable(x.toInt(), y.toInt())

    /**
     * Returns true if [x], [y] can be navigated, according to the landscape at that location.
     *
     * Conditions :
     *  - Must be land
     *  - There must be no foliage
     *  - There must be no hill or mountain
     *
     * > n.b this does not apply navigation data of units, or peek the [navigationLayer].
     * > In fact, this function is used to define the pathfinding graph in the [navigationLayer].
     */
    fun isNavligable(x : Int, y : Int) : Boolean =
        isInWorld(x, y)
     && getTile(x,y)!!.isLand
     && getTile(x,y,heightTiles) == null
     && getTile(x,y,FoliageLayerTiles) == null

    companion object {

        /**
         * Adjusts a co-ordinate to match the staggered isometric co-ordinate space.
         *
         * Where [y] is even. [x] is shifted left.
         */
        fun getStaggeredISO(x: Int, y: Int): Vector2 = Vector2((x + if (x != 0) if (y % 2 == 0) -1 else 0 else 0).toFloat(), y.toFloat())


        init { RayHandler.useDiffuseLight(true) }

        /**
         * # Width of tiles in pixels
         */
        const val TILE_WIDTH = 64

        /**
         * # Height of tiles in pixels
         */
        const val TILE_HEIGHT = 32

        /**
         * # Half height of tiles in pixels
         */
        const val TILE_HALF_HEIGHT = TILE_HEIGHT / 2

        /**
         * # Half width of tiles in pixels
         */
        const val TILE_HALF_WIDTH = TILE_WIDTH / 2

        /**
         * # Level of noise at which terrain is treated as land.
         *
         * Between -1 and 1.
         *
         * Any area of the map higher than this value will
         * be treated as land, lower is water.
         */
        const val SEA_LEVEL = 0f

        /**
         * # The smallest permitted world width
         */
        const val MIN_WORLD_WIDTH = 6

        /**
         * # The smallest permitted world height
         */
        const val MIN_WORLD_HEIGHT = 6

        /**
         * # The default world width
         */
        const val DEFAULT_WIDTH = 100

        /**
         * # The smallest permitted world size
         */
        const val DEFAULT_HEIGHT = 100

        /**
         * # The smallest permitted world size
         */
        const val FOLIAGE_QUANTITY_MAX = 400

        private var hittestResult = 0
        private val hitTest = Assets.get<BufferedImage>(TEX_HITTEST)

        /**
         * <h2>(Badly) Converts WORLD SPACE co-ordinates to map space co-ordinates</h2>
         * Look, he's trying his best - alright?
         * @param x WORLD SPACE x
         * @param y WORLD SPACE y
         * @return The tile under x, y
         */
        fun cartesianToIso(x: Int, y: Int): Vector3 {
            var x = x
            var y = y
            val mapSpace = Vector3()
            if (x < 0) x = -x
            if (y < 0) y = -y
            val eventilex = Math.floor((x % TILE_WIDTH).toDouble()).toInt()
            val eventiley = Math.floor((y % TILE_HEIGHT).toDouble()).toInt()
            hittestResult = hitTest.getRGB(eventilex, eventiley)
            if (hittestResult != -16777216) {
                /* On even tile */
                mapSpace.x = (floor(((x + TILE_WIDTH) / TILE_WIDTH).toDouble()).toInt() - 2).toFloat()
                mapSpace.y = (2 * (floor(((y + TILE_HEIGHT) / TILE_HEIGHT).toDouble()) - 1)).toFloat()
            } else {
                /* On odd tile */
                mapSpace.x = (floor(((x + TILE_WIDTH / 2) / TILE_WIDTH).toDouble()).toInt() - 1).toFloat()
                mapSpace.y = (2 * floor(((y + TILE_HEIGHT / 2) / TILE_HEIGHT).toDouble()) - 1).toFloat()
            }
            mapSpace.add(1f, 1f, 0f)
            return mapSpace
        }


        @JvmStatic
        fun isoToCartesian(x: Int, y: Int): Vector3 {
            val _y = y * TILE_HEIGHT / 2
            var _x = x * TILE_WIDTH
            if (y % 2 == 0) _x += (TILE_WIDTH * 0.5f).toInt()
            return Vector3(_x.toFloat(), _y + TILE_WIDTH * 0.25f, 0f)
        }
    }
}