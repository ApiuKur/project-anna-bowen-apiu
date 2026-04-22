import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Image;

public class TicTacToeManager {
    private static final int CANVAS_WIDTH = 600;
    private static final int CANVAS_HEIGHT = 800;

    private CanvasWindow canvas;

    public TicTacToeManager() {
        canvas = new CanvasWindow("Tic-Tac-Toe!", CANVAS_WIDTH, CANVAS_HEIGHT);
        Image exSymbol = new Image(200, 200, "ex.png");
        canvas.add(exSymbol);
        Image ohSymbol = new Image(300, 300, "oh.png");
        canvas.add(ohSymbol);
    }
    public static void main(String[] args){
        new TicTacToeManager();
    }
}
