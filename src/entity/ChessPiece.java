package entity;

public abstract class ChessPiece {
    private String color;
    private boolean check;


    public ChessPiece(String color) {
        this.color = color;
    }
    // возвращающий строку — должен вернуть цвет фигуры;
    public abstract String getColor();

    // возвращающий логическое (boolean) значение и принимающий в себя параметры
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    //  возвращающий строку — тип фигуры
    public abstract String getSymbol();


}
