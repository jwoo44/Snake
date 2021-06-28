public class Cell {
    private final int row, col;
    private CellType cellType;

    /**
     * Constructor for a singular cell
     * 
     * @param row the row of the cell
     * @param col the col of the cell
     */
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * Returns the cell type of the cell
     * 
     * @return the cell type of the cell
     */
    public CellType getCellType() {
        return this.cellType;
    }

    /**
     * Setter for celltype
     * 
     * @param cellType the new cell type for the cell
     */
    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    /**
     * Getter for row
     * 
     * @return row of cell
     */
    public int getRow() {
        return this.row;
    }

    /**
     * Getter for col
     * 
     * @return col of cell
     */
    public int getCol() {
        return this.col;
    }
}
