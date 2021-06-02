package com.shinkson47.SplashX6.rendering.screens.gameutils

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.List
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
import com.badlogic.gdx.utils.Array
import com.shinkson47.SplashX6.game.GameData
import com.shinkson47.SplashX6.game.GameHypervisor
import com.shinkson47.SplashX6.game.units.Unit
import com.shinkson47.SplashX6.game.units.UnitAction
import com.shinkson47.SplashX6.rendering.StageWindow
import com.shinkson47.SplashX6.utility.Assets

/**
 * # TODO
 * @author [Jordan T. Gray](https://www.shinkson47.in) on 20/05/2021
 * @since v1
 * @version 1
 */
class units : StageWindow("Units"), Runnable {

    private val waiting: List<Unit> = List(Assets.SKIN)
    private val busy: List<Unit> = List(Assets.SKIN)

    private val actions: List<UnitAction> = List(Assets.SKIN)

    /**
     * A click listener for a list of units, that selects the unit clicked within the game engine.
     */
    private class SELECT_LISTENER(val parent: units, val list: List<Unit>) : LambdaClickListener({
        list.selected?.let { // Only if an item is selected,
            GameHypervisor.unit_select(it)
            parent.refreshSelected()
        }
    })


    init { constructContent() }

    /**
     * <h2>Constructs the content to be displayed in this window</h2>
     */
    override fun constructContent() {
        if (FIRST_CONSTRUCTION) return
        waiting.selection.required = false
        actions.selection.required = false
        busy.selection.required    = false

        setPosition(0f, Gdx.graphics.height.toFloat())

        // Unit panes
        seperate("waiting")
        tooltip("ttWaiting")
        addList(waiting, "ttWaiting")

        waiting.addListener(SELECT_LISTENER(this, waiting))
        busy.addListener(SELECT_LISTENER(this, busy))

        seperate("busy")
        tooltip("ttBusy")
        addList(busy, "ttBusy")

        // seperate, label, button, tooltop

        seperate("manage")
        tooltip("ttManage")
        // Buttons
        // TODO localise
        // TODO lots of repeating code here
        add(button("moveUnitToCursor") { t -> GameHypervisor.unit_setDestination(); refresh() }).row()
        tooltip("ttMoveUnitToCursor")

        add(button("viewDestination") { t -> GameHypervisor.unit_viewDestination(); refresh() }).row()
        tooltip("ttViewDestination")

        add(button("cancleAction") { t -> GameHypervisor.unit_selected()?.cancelAction(); refresh() }).row()
        tooltip("ttCancleAction")

        add(button("disband") { t -> GameHypervisor.unit_disband(); refresh() }).row()
        tooltip("ttDisband")

        seperate("actions")
        tooltip("ttActions")
        add(actions)
        tooltip("ttActions")


        actions.addListener(
            LambdaClickListener {
                GameData.selectedUnit?.let {
                        it1 -> GameHypervisor.unit_selected()?.onTurnAction = actions.selected
                        refresh()
                }
            }
        )

        refresh()
        pack()
    }

    /**
     * # Adds a list in a scrollable pane of a fixed height
     */
    private fun addList(list: List<Unit>, tooltipKey: String) {
        val sp = ScrollPane(list, skin)
        add(sp).fillX()
        tooltip(tooltipKey)
        getCell(sp).height(200f)
        row()
    }

    private fun refresh() {
        refreshSelected()
        refreshUnits()
    }

    private fun refreshSelected() {
        refreshActions()
        pack()
    }

    private fun refreshUnits() {
        val _waiting : Array<Unit> = Array()
        val _busy : Array<Unit> = Array()


        GameData.units.forEach {            // Go through all units,
            if (it.onTurnAction == null)    // and add them to the
                _waiting.add(it)            // Right list.
            else
                _busy.add(it)
        }

        populate(waiting, _waiting)
        populate(busy   , _busy   )
    }

    private fun populate(list: List<Unit>, array: Array<Unit>){
        list.setItems(array)
        list.selected = GameHypervisor.unit_selected()
    }

    private fun refreshActions() {
        val arr : Array<UnitAction> = Array();
        GameHypervisor.unit_selected()?.actions?.forEach { arr.add(it) } // TODO copy of above. abstract.
        // TODO use gdx array in units to avoid this on every refresh.

        actions.setItems(arr)

        actions.selected = GameHypervisor.unit_selected()?.onTurnAction

        }



    // ============================================================
    // endregion initalisation
    //#region turn hook
    // ============================================================

    init {
        GameHypervisor.turn_hook(this)
    }

    override fun onClose() {
        GameHypervisor.turn_unhook(this)
    }

    /**
     * Refresh performed on every new turn.
     */
    override fun run() {
        refresh()
    }


}