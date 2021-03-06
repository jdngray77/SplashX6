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

package com.shinkson47.SplashX6.rendering.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.GlyphLayout
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.scenes.scene2d.utils.Drawable
import com.shinkson47.SplashX6.Client.Companion.client
import com.shinkson47.SplashX6.rendering.ui.ScalingScreenAdapter
import com.shinkson47.SplashX6.utility.Assets.REF_SKIN_W95

/**
 * A screen which can display text and a texture.
 *
 * Prints the contents of `generic/credits.txt` character by character
 * on the top of the menu background, complete with automatic scrolling.
 *
 * This class is autonomus. It does not need to be modified in order to display
 * changes in credits text file. Simply change the text, the display logic
 * will handle it.
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 23/05/2021
 * @since v1
 * @version 1
 */
open class TextScreen (
    text: String,
    var onESC: Screen? = null,
    var onComplete: Screen? = null,
    fontColor: Color = Color.WHITE,
    val font : BitmapFont = REF_SKIN_W95.getFont("Serif"),
    val background: Drawable? = null,

    /**
     * # The time to wait between each charater stamp.
     */
    val delay : Float = .01f
) : ScalingScreenAdapter() {

    var lines : List<String> = text.split("\n")
    /**
     * # Array of strings from credit text
     * where each entry is one line from the text.
     *
     * Modified to have the first line removed when [lineIndex] reaches [maxLines]
     */

    init {
        font.color = fontColor
    }

    /**
     * # Current string to be rendered by [font]
     */
    private var glyph : GlyphLayout = GlyphLayout(font, "")

    /**
     * # Batch renderer used by [font] to draw.
     * scaled with [stage].
     */
    private val batch : SpriteBatch = SpriteBatch()

    /**
     * # Time since progressing to the next character.
     */
    @Volatile
    private var characterDelta: Float = 0f

    /**
     * # Index in [lines] of the line we are currently stamping the letters of.
     * Once reaches [maxLines], stops incrementing. Instead, the first line of [lines] is removed
     * to create the scrolling effect.
     */
    var lineIndex = 0f

    /**
     * # The index of character last stamped in the current line
     */
    var charIndex = 0



    /**
     * # Calculated max number of lines that can fit within the window before we have to start stripping the
     * topmost line.
     */
    private var maxLines = 0

    init { calcMaxLines() }

    /**
     * # Draws the next frame of the credits.
     * Performs all logic and calculation.
     *
     * Mutates this object with information for next frame.
     *
     * Renders the credits screen in the current state.
     *
     *
     * Will wait [delay] before increasing [charIndex] to
     * render one more character of the current line. Thus after x frames
     * one more character is drawn than the last.
     *
     * After reaching the end of the current line, [charIndex] is reset
     * and [lineIndex] is incremented. This is repeated until [lineIndex]
     * reaches [maxLines], at which point no more lines can fit in the window.
     *
     * From then on, [maxLines] remains the same, and the first line of [lines]
     * is removed when moving to next line to create the scrolling effect.
     *
     * Once there are no more lines to progress to stamp, the remaining contents of [lines]
     * is drawn with no changes.
     */
    override fun render(delta: Float) {

        // If the user is pressing escape, return to desired.
        onESC?.let {
            if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE))
                client.fadeScreen(it)
        }

        // Increase time since last character
        characterDelta += delta

        if (characterDelta > delay)  {      // If we've waited longer than DELAY
            charIndex++                     // Move to the next character
            characterDelta = 0f             // and reset the timer.
        }


        var currentLineIndex = 0            // Line we're currently drawing to vram in this frame.
        var currentLineText: String         // Text of the the line identified by above.


        batch.begin()                       // Begin GL render semaphore

        // If there's a background, draw it.
        background?.draw(batch,0f,0f,width, height)

        // For every line up to the line we are stamping
        while (currentLineIndex <= lineIndex && currentLineIndex < lines.size) {
            // Get the text
            currentLineText = lines[currentLineIndex]

            // If it's the line we're stamping
            if (currentLineIndex.toFloat() == lineIndex) {
                // Then only take up to the character we're supposed to show.
                glyph.setText(font, if (currentLineText.isNotEmpty()) currentLineText.subSequence(0,  charIndex) else currentLineText)

                if (charIndex >= currentLineText.length) {  // If no more characters to stamp on this line, move to next line.
                    charIndex = 0                           // by resetting stamp character index.
                    if (lineIndex >= maxLines)              // If we're displaying max number of lines, remove first line.
                        lines = lines.drop(1)
                    else
                        lineIndex ++                        // otherwise, draw one more line.
                }
            } else // If it's not the line we're stamping, then just draw the entire line.
                glyph.setText(font, currentLineText)


            // draw whatever we need to draw for the current line.
            // TODO cache x and base of y
            font.draw(batch, glyph, (width - glyph.width) * 0.5f, height - 50 - (glyph.height * 2 * currentLineIndex))

            // move to next line to be drawn this frame
            currentLineIndex++
        }

// TODO figure out how to go to oncomplete when all text is done.
//        if (client.currentScreen == this)
//            client.fadeScreen(onComplete)

        batch.end() // end GL semaphore
        super.render(delta)
    }

    /**
     * Sets [maxLines] to the max number of lines that can be displayed with the given height.
     */
    private fun calcMaxLines() = calcMaxLines(height.toInt())
    private fun calcMaxLines(height: Int) { maxLines = (height - 100) / (glyph.height.toInt() * 2) }

    /**
     * # Updates the size of the viewport to match the screen.
     * Also updates [maxLines] to contain the correct number of lines that can be displayed.
     */
    override fun doResize(width: Int, height: Int) {
        batch.projectionMatrix = stage.camera.combined
        calcMaxLines(height)
    }

    override fun show() {
        if(batch.isDrawing) batch.end()
    }
}