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
 ░                                                                                                                                                                                ░
 ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░*/

package com.shinkson47.SplashX6.rendering.screens.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.maps.MapRenderer
import com.badlogic.gdx.maps.tiled.renderers.IsometricStaggeredTiledMapRenderer
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.Vector3
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.Hypervisor
import com.shinkson47.SplashX6.game.Hypervisor.cm_isSelectingDestination
import com.shinkson47.SplashX6.game.Hypervisor.inGame
import com.shinkson47.SplashX6.game.Hypervisor.mouse_focusOnTile
import com.shinkson47.SplashX6.game.Hypervisor.unit_selected
import com.shinkson47.SplashX6.game.cities.Settlement
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.world.WorldTerrain
import com.shinkson47.SplashX6.game.world.WorldTerrain.Companion.isoToCartesian
import com.shinkson47.SplashX6.input.mouse.MouseHandler
import com.shinkson47.SplashX6.rendering.Camera
import com.shinkson47.SplashX6.rendering.renderers.KeyBindRenderer
import com.shinkson47.SplashX6.rendering.screens.Warroom
import com.shinkson47.SplashX6.rendering.ui.ScalingScreenAdapter
import com.shinkson47.SplashX6.rendering.ui.StageWindow
import com.shinkson47.SplashX6.rendering.windows.game.W_Help
import com.shinkson47.SplashX6.utility.debug.Debug
import org.xguzm.pathfinding.grid.GridCell

/**
 * <h1>The screen used to display and interact with the game</h1>
 *
 * @author [Jordan T. Gray on 12/04/2021](https://www.shinkson47.in)
 * @version 1
 * @since v1
 */
class GameScreen : ScalingScreenAdapter() {
    //========================================================================
    //#region fields
    //========================================================================

    var drawStage = true

    /**
     * <h2>Camera used to observe the world</h2>
     */
    val cam = Camera()

    /**
     * <h2>Renderer that renders [GameData.world]</h2>
     * renders from perspective of [this.cam]
     */
    var r: IsometricStaggeredTiledMapRenderer? = null

    /**
     * <h2>A renderer used to draw primative shapes</h2>
     */
    val sr: ShapeRenderer

    val kbr = KeyBindRenderer()

    /**
     * <h2>A font used for direct screen drawing</h2>
     */
    val font = BitmapFont()
    /**
     * <h2>Returns the world space sprite batch</h2>
     */
    /**
     * <h2>The sprite batch used for drawing bulk sprites in the world</h2>
     */
    val worldBatch = SpriteBatch()

    /**
     * x and y screenspace co-ords for the center of the screen
     */
    private val centerx = width * 0.5f
    private val centery = height * 0.5f
    val managementScreen = Warroom(this)
    var menu: Menu? = null
        private set

    /**
     * Creates a new tiledmap renderer.
     *
     * If a renderer exists, Changes it to display GameData.World.
     * (Used to display a world after creating or loading a new one without creating a new screen.)
     *
     * TODO Integrate a multiplayer load with the doNewGameCallback which creates
     * a new game screen.
     */
    fun newRenderer() {
        r = IsometricStaggeredTiledMapRenderer(GameData.world)
        //        if (r == null)
//
//        else
//            r.setMap(GameData.world);
    }

    /**
     * <h2>Constructs GUI shown within the game window</h2>
     */
    fun createUI() {
        with (stage) {
            addActor(Menu(this@GameScreen))
            addActor(StageWindow.getWINDOW_DOCK())
            addActor(kbr)
        }

        StageWindow.docked(W_Help::class.java)?.apply {
            stage.addActor(this)
            this.isVisible = true
        }
    }
    //========================================================================
    //#endregion construction
    //#region rendering operations
    //========================================================================

    /**
     * <h2>Renders the next frame</h2>
     */
    override fun render(delta: Float) {
        if (Hypervisor.isCinematingLocalTurn)
            Hypervisor.turn_end_cinemate_update()

        // Render the world
        r!!.render()

        // Update the camera (Movement, zoom, renders what it sees)
        cam.update()
        worldBatch.projectionMatrix = cam.combined
        sr.projectionMatrix = cam.combined

        // Get selected unit, and draw a circle under it.?
        sr.begin(ShapeRenderer.ShapeType.Line)
        GameData.selectedUnit?.let {
            sr.circle(
                it.x + WorldTerrain.TILE_HALF_WIDTH,
                it.y + WorldTerrain.TILE_HALF_HEIGHT,
                WorldTerrain.TILE_HALF_HEIGHT.toFloat()
            )
        }
        sr.end()
        sr.begin(ShapeRenderer.ShapeType.Filled)

        if (cm_isSelectingDestination || GameData.selectedUnit?.destination?.x != -1f)
            renderDestinationLine()

        var v = mouse_focusOnTile()
        v = isoToCartesian(v.x.toInt(), v.y.toInt())
        sr.circle(v.x, v.y, 10f)

        // Draw another in the center of the screen.
        sr.projectionMatrix = HUDBatch.projectionMatrix
        sr.circle(centerx, centery, 5f)

        sr.end()

        renderSprites()

        // Lighting

        GameData.world!!.rayHandler.setCombinedMatrix(cam.combined)
        GameData.world!!.rayHandler.updateAndRender()

        // META : Draw FPS as 10x, 10y in the world
        //font.draw(worldBatch, "FPS : " + Gdx.graphics.getFramesPerSecond(), 10, 10);

        if (drawStage) {
            // Update the UI (listen for inputs, etc)
            stage.act(delta)

            // Draw the UI
            stage.draw()
        }
        Debug.update()
        super.render(delta)
    }

    fun renderSprites() {
        worldBatch.begin()

        GameData.nations.forEach {

            it.units.forEach { sprite: Unit ->
                sprite.draw(worldBatch)
            }

            it.settlements.forEach {
                    city: Settlement -> city.draw(worldBatch)
                font.draw(worldBatch, city.name, city.cartesianPosition().x, city.cartesianPosition().y)
                font.draw(worldBatch, "Population : ${city.size}", city.cartesianPosition().x, city.cartesianPosition().y - 15)
            }
        }

        worldBatch.end()
    }

    /**
     * # Renders a line between the selected unit and it's destination.
     *
     * Has no effect if no unit is selected.
     */
    fun renderDestinationLine() {
        with (unit_selected()){
            if (this != null) { // If there's a selected unit

                // Cache the selected tile.
                val sel = Hypervisor.cm_selectedTile()

                // If we're selecting, calculate new destination.
                if (cm_isSelectingDestination)
                    setDestination(sel.x, sel.y)



                // If there's a path, render it. Else see below 'return'
                pathNodes?.let {
                    if (it.isEmpty()) return@let
                    sr.color = Color.PURPLE

                    // The grid cell we're currently operating on.
                    var it : GridCell = it[0]

                    // The position of the last node. Start with index 0.
                    var lastNode : Vector3 = isoToCartesian(it.x, it.y)

                    // Position of the current node.
                    var currentNode: Vector3

                    // Starting at the second node, draw lines between current and next node.
                    for (i in 1 until pathNodes!!.size) {

                        // Calculate node position
                        it = pathNodes!![i]
                        currentNode = isoToCartesian(it.x, it.y)

                        // Draw line
                        sr.rectLine(Vector2(lastNode.x, lastNode.y), Vector2( currentNode.x, currentNode.y), 5f)

                        // Set this node as the last one. Next.
                        lastNode = currentNode
                    }

                    sr.color = Color.WHITE
                    return
                }

                // If there's no path, do nothing if we're not selecting.
                if (!cm_isSelectingDestination) return

                // If we're selecting and have no path then we're selecting a bad path.
                // Draw a red line to the intended destination.
                sr.color = Color.RED
                val mouse = isoToCartesian(sel.x.toInt(), sel.y.toInt())
                sr.rectLine(Vector2(x, y), Vector2(mouse.x, mouse.y), 2f)
                sr.color = Color.WHITE
            }
        }
    }


    /**
     * <h2>Resizes the render space</h2>
     * @param width New width
     * @param height New height
     */
    override fun doResize(width: Int, height: Int) {
        if (inGame) cam.resize(width.toFloat(), height.toFloat())
    }
    //========================================================================
    //#endregion rendering operations
    //#region get/set & misc
    //========================================================================
    /**
     * <h2>Returns the GUI batch</h2>
     */
    val HUDBatch: Batch
        get() = stage.batch

    fun getR(): MapRenderer? {
        return r
    }

    override fun show() {
        super.show()
        sr.end()

    } //#endregion

    //========================================================================
    //#endregion fields
    //#region construction
    //========================================================================
    init {
        MouseHandler.create() //FIXME This really shouldn't be here.

        // Create objects
        sr = ShapeRenderer()
        newRenderer()

        //r.setView(camera.getCam());

        // Configure UI
        resize(Gdx.graphics.width, Gdx.graphics.height)
    }
}