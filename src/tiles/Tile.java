package tiles;

import utility.Debug;

import java.util.Arrays;

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
    //#region constants
    public String tileName;
    public String tileSetName;
    public int cachedID;

    // 4 strings that reperesent the quadrants of the tile, N/E/S/W
    public String north;
    public String east;
    public String south;
    public String west;

    //#endregion constants

    //#region fields

    //#endregion fields

    //#region constructors
    public Tile(){
        this(genRandomTileString());
    }

    public Tile(String TileName){
        if (TileName.contains(".")) TileName = TileName.substring(TileName.indexOf(".") + 1);
        String[] tileNames = TileName.substring(TileName.indexOf(".") + 1).split("_");

        if (tileNames.length == 1) {String e = tileNames[0]; tileNames = new String[4]; Arrays.fill(tileNames, TileName);}
        init(tileNames[0], tileNames[1], tileNames[2], tileNames[3]);
    }

    public Tile(String _north, String _east, String _south, String _west){
        init(_north, _east, _south, _west);
    }

    private void init(String _north, String _east, String _south, String _west){
        north = _north;
        east  = _east;
        south = _south;
        west  = _west;

        String tileNameT =  _north + "_" + _east + "_" + _south + "_" + _west;
        tileSetName = TileSet.findSet(tileNameT);
        tileName = tileSetName + '.' + tileNameT;

        cachedID = TileSet.FindTileTexture(tileName);
    }
    //#endregion constructors

    //#region operations
    //#endregion operations
    public void updateCache(){
        cachedID = TileSet.FindTileTexture(tileSetName + "." + north + "_" + east  + "_" + south  + "_" + west);
    }
    //#region static


    final static String sheetchars = "padgst";
    private static String lastGen;
    private static char randomchar(){
        return sheetchars.charAt(Debug.random.nextInt(sheetchars.length()));
    }

    public static int genRandomTile(){
        int id = -1;
        while (id == -1) {
            lastGen = randomchar() + "." + randomchar() + "_" + randomchar() + "_" + randomchar() + "_" + randomchar();
            id = TileSet.FindTileTexture(lastGen);
        }
        return id;
    }

    public static String genRandomTileString(){
        genRandomTile();
        return lastGen;
    }

    public static String genResourceString(String s) {
        return s + "." + s + "_" + s + "_" + s + "_" + s;
    }

    /**
     * <h2>Modifies this tile to blend it with surrounding tiles.</h2>
     */
    public Tile interpolate(Tile nw, Tile ne, Tile se, Tile sw) {
        // Good luck reading this garbage lol

        if (nw == null) nw = new Tile((sw == null) ? west : sw.tileName);
        if (ne == null) ne = new Tile((se == null) ? east : se.tileName);
        if (se == null) se = new Tile(ne.tileName);
        if (sw == null) sw = new Tile(nw.tileName);

        String north = nw.east.equals(ne.west)   ? nw.east  : this.north;
        String east  = ne.south.equals(se.north) ? ne.south : this.east;
        String south = sw.east.equals(se.west)   ? sw.east  : this.south;
        String west  = nw.south.equals(sw.north) ? nw.south : this.west;

        //updateCache();
        return new Tile(north, east, south, west);

//        north = nw.east.equals(north)   ? ne.west.equals(north) ?    north : nw.east : ne.west ;
//        east  = ne.south.equals(east)   ? se.north.equals(east) ?    east  : ne.south: se.north;
//        south = se.west.equals(south)   ? sw.east.equals(south) ?    south : se.west : sw.east;
//        west  = sw.north.equals(west)   ? nw.south.equals(west) ?    west  : sw.north: nw.south;

    }
    //#endregion static
}