import edu.macalester.graphics.CanvasWindow;

public class TicTacToeManager {
    private static final int CANVAS_WIDTH = 600;
    private static final int CANVAS_HEIGHT = 800;

    private CanvasWindow canvas;

    public TicTacToeManager() {
        canvas = new CanvasWindow("Tic-Tac-Toe!", CANVAS_WIDTH, CANVAS_HEIGHT);
    }
    public static void main(String[] args){
        new TicTacToeManager();
    }
}
