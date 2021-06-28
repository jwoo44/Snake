public class Board {
    final int rowCount, colCount;
    private Cell[][] board;

    /**
     * Constructor for board, creates a 2d matrix representing the playing field
     * 
     * @param row # of rows
     * @param col # of cols
     */
    public Board(int row, int col) {
        this.rowCount = row;
        this.colCount = col;
        board = new Cell[row][col];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                Cell cell = new Cell(i, j);
                cell.setCellType(CellType.EMPTY);
                board[i][j] = cell;
            }
        }
    }

    /**
     * Getter for board
     * 
     * @return board
     */
    public Cell[][] getBoard() {
        return this.board;
    }

    /**
     * Setter for board
     * 
     * @param board new board to set to
     */
    public void setBoard(Cell[][] board) {
        this.board = board;
    }

    /**
     * Food generator for the board randomly
     */
    public void food() {
        while (true) {
            int row = (int) (Math.random() * rowCount);
            int col = (int) (Math.random() * colCount);
            if (board[row][col].getCellType() != CellType.SNAKE_NODE) {
                board[row][col].setCellType(CellType.FOOD);
                break;
            }
        }
    }
}
