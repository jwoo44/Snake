import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;

public class App extends Application {

    private Scene titleScene;
    private Scene gameScene;
    private Game game;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setResizable(false);

        Board board = new Board(20, 20);
        Cell initialPos = new Cell((int) (Math.random() * board.rowCount), (int) (Math.random() * board.colCount));
        Snake initialSnake = new Snake(initialPos);
        Game game = new Game(initialSnake, board);
        game.setGG(false);
        game.setDirection(1);

        VBox titlePane = new VBox();
        titlePane.setSpacing(20);
        titlePane.setAlignment(Pos.CENTER);
        titlePane.setStyle("-fx-background-color: lavender;");
        titleScene = new Scene(titlePane, 1000, 750);
        Text name = new Text("Snake");
        Button start = new Button("Start Game");
        Button quit = new Button("Quit");
        start.setOnAction(e -> primaryStage.setScene(gameScene));
        quit.setOnAction(e -> primaryStage.close());

        titlePane.getChildren().addAll(name, start, quit);

        gameScreen(primaryStage);

        primaryStage.setScene(titleScene);
        primaryStage.setTitle("Snake");
        primaryStage.show();
    }

    public void gameScreen(Stage primaryStage) {
        VBox gamePane = new VBox();
        gameScene = new Scene(gamePane, 1000, 750);
        gamePane.setPadding(new Insets(10, 10, 10, 10));
        gamePane.setStyle("-fx-background-color: lavender;");

        GridPane grid = new GridPane();

        for (int i = 0; i < game.getBoard().rowCount; i++) {
            for (int j = 0; j < game.getBoard().colCount; j++) {
                StackPane stack = new StackPane();
                Rectangle rec = new Rectangle();
            }
        }

    }
}