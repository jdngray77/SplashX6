package com.shinkson47.SplashX6.game.world;

import java.util.Arrays;

import static com.shinkson47.SplashX6.utility.Assets.TILESET_MAP;

/**
 * <h1></h1>
 * <br>
 * <p>
 *
 * </p>
 *
 * @author Dylan Brand 23/03/2021
 * @version 1
 */
public class Tile {
    // TODO not a single docstring here. idk what half this shit does anymore lol
    //#region constants
    public static final String
            OCEANS = "o_o_o_o",
            WATER  = "s_s_s_s";

    public String tileName;
    public String tileSetName;
    public int cachedID;
    public boolean isBase = true;

    // 4 strings that reperesent the quadrants of the tile, N/E/S/W
    public String north;
    public String east;
    public String south;
    public String west;

    //#endregion constants

    //#region fields

    //#endregion fields

    //#region constructors
    public Tile(String TileName){
        if (TileName.contains(".")) {
            this.tileName = TileName.substring(0, TileName.indexOf(".") + 1);
            TileName = TileName.substring(TileName.indexOf(".") + 1);
            isBase = false;
        }

        String[] tileNames = TileName.substring(TileName.indexOf(".") + 1).split("_");

        if (tileNames.length == 1)                              // only one section in name?
            if (TILESET_MAP.get(TileName) != null)              // If exists in map,
               init(TileName);                                  // create as single name
            else {                                              // create multi sector from a single segment
                tileNames = new String[4];
                Arrays.fill(tileNames, TileName);
                init(tileNames[0], tileNames[1], tileNames[2], tileNames[3]);
            }
        else                                                  // more than one section, treat as a multi section tile
            init(tileNames[0], tileNames[1], tileNames[2], tileNames[3]);
    }

    public Tile(String _north, String _east, String _south, String _west){
        init(_north, _east, _south, _west);
    }

    private void init(String _name){
        init(_name, _name, _name, _name);
        tileName = _name;// TODO This is dumb, it's set twice
    }

    private void init(String _north, String _east, String _south, String _west){
        north = _north;
        east  = _east;
        south = _south;
        west  = _west;

        tileName = ((!isBase) ? tileName : "") + _north + "_" + _east + "_" + _south + "_" + _west;
//        cachedID = (int) World.tilesetMap.get(tileName);
    }

    /**
     * <h2>Returns a tile that represent this one after being blended with provided tiles</h2>
     */
    public Tile interpolate(Tile sw, Tile se, Tile ne, Tile nw) {
        if (!isBase || nw != null && !nw.isBase || ne != null && !ne.isBase || se != null && !se.isBase || sw != null && !sw.isBase) return this;

        if (nw == null) nw = new Tile((sw == null) ? west : sw.tileName);
        if (ne == null) ne = new Tile((se == null) ? east : se.tileName);
        if (se == null) se = new Tile(ne.tileName);
        if (sw == null) sw = new Tile(nw.tileName);

        String north = nw.east.equals(ne.west)   ? nw.east  : this.north;
        String east  = ne.south.equals(se.north) ? ne.south : this.east;
        String south = sw.east.equals(se.west)   ? sw.east  : this.south;
        String west  = nw.south.equals(sw.north) ? nw.south : this.west;

        return new Tile(north, east, south, west);
    }

    public Tile interpolateHill(Tile nw, Tile ne, Tile se, Tile sw) {
        String _nw = (nw == null) ? "0" : "1";
        String _ne  = (ne == null) ? "0" : "1";
        String _sw = (sw == null) ? "0" : "1";
        String _se  = (se == null) ? "0" : "1";
        return new Tile("hills." + _ne + "_" + _se + "_" + _sw + "_" + _nw);
    }

    public boolean isLand() {
        return !isWater();
    }

    public boolean isWater() {
        return tileName.equals(OCEANS) || tileName.equals(WATER);
    }
    //#endregion static
}