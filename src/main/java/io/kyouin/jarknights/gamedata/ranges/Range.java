package io.kyouin.jarknights.gamedata.ranges;

import java.util.Arrays;
import java.util.List;

public class Range {

    private String id;
    private List<RangeElement> grids;

    public String getID() {
        return id;
    }

    public List<RangeElement> getGrids() {
        return grids;
    }

    // OTHERS

    public String getRange() {
        int gridSize = 11;
        char[][] grid = new char[gridSize][];

        for (int i = 0; i < gridSize; i++) {
            grid[i] = new char[gridSize];
            Arrays.fill(grid[i], ' ');
        }

        int center = gridSize / 2;

        grids.forEach(element -> grid[element.getRow() + center][element.getCol() + center] = '□');
        grid[center][center] = '■';

        StringBuilder sb = new StringBuilder();

        for (char[] chars : grid) {
            for (int i = 0; i < gridSize; i++) {
                sb.append(chars[i]);
            }

            sb.append("\n");
        }

        return sb.toString().replaceAll("(?m)^[ \t]*\r?\n", "");
    }
}
