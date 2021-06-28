public class Game {

    public static final int DIRECTION_NONE = 0, DIRECTION_RIGHT = 1, DIRECTION_LEFT = -1, DIRECTION_UP = 2,
            DIRECTION_DOWN = -2;
    private Snake snake;
    private Board board;
    private int direction;
    private boolean gg;

    /**
     * Constructor for game
     * 
     * @param snake the snake for the game
     * @param board the board for the game
     */

    public Game(Snake snake, Board board) {
        this.snake = snake;
        this.board = board;
    }

    public int getDirection() {
        return this.direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Snake getSnake() {
        return this.snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Board getBoard() {
        return this.board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean isGG() {
        return this.gg;
    }

    public void setGG(boolean gg) {
        this.gg = gg;
    }

    public Cell getNextCell(Cell current) {
        int row = current.getRow();
        int col = current.getCol();
        if (direction == DIRECTION_RIGHT) {
            col++;
        } else if (direction == DIRECTION_LEFT) {
            col--;
        } else if (direction == DIRECTION_UP) {
            row--;
        } else if (direction == DIRECTION_DOWN) {
            row++;
        }

        return board.getBoard()[row][col];
    }

    public void update() {
        if (!gg) {
            if (direction != DIRECTION_NONE) {
                Cell nextCell = getNextCell(snake.getHead());
                if (snake.crashed(nextCell)) {
                    setDirection(DIRECTION_NONE);
                    gg = true;
                } else {
                    snake.move(nextCell);
                    if (nextCell.getCellType() == CellType.FOOD) {
                        snake.grow();
                        board.food();
                    }
                }
            }
        }
    }

}
