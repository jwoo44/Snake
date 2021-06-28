import java.util.LinkedList;

public class Snake {
    private LinkedList<Cell> snakePartList = new LinkedList<>();
    private Cell head;

    /**
     * Constructor for snake
     * 
     * @param initialPos initial position for snake
     */
    public Snake(Cell initialPos) {
        head = initialPos;
        snakePartList.add(head);
        head.setCellType(CellType.SNAKE_NODE);
    }

    /**
     * Grow function to increase snake
     */
    public void grow() {
        snakePartList.add(head);
    }

    /**
     * Move function
     * 
     * @param nextCell the cell the snake is moving to
     */
    public void move(Cell nextCell) {
        Cell tail = snakePartList.removeLast();
        tail.setCellType(CellType.EMPTY);
        head = nextCell;
        head.setCellType(CellType.SNAKE_NODE);
        snakePartList.addFirst(head);
    }

    /**
     * Check if snake has crashed
     * 
     * @param nextCell the next cell in the direction snake is moving
     * @return true if crashed, false if not
     */
    public boolean crashed(Cell nextCell) {
        for (Cell cell : snakePartList) {
            if (cell == nextCell) {
                return true;
            }
        }
        return false;
    }

    /**
     * Getter for snake parts
     * 
     * @return snake part list
     */
    public LinkedList<Cell> getSnakePartList() {
        return this.snakePartList;
    }

    /**
     * Setter for snake part list
     * 
     * @param snakePartList new snake part list
     */
    public void setSnakePartList(LinkedList<Cell> snakePartList) {
        this.snakePartList = snakePartList;
    }

    /**
     * Getter for snake head
     * 
     * @return head of snake
     */
    public Cell getHead() {
        return this.head;
    }

    /**
     * Setter for head
     * 
     * @param head the new head
     */
    public void setHead(Cell head) {
        this.head = head;
    }
}
