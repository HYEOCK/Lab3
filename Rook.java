package Lab3;

public class Rook extends ChessPiece{

    public Rook(){
        super(5);
    }

    @Override
    public void move() {
        System.out.println("horizontally or vertically");
    }

    @Override
    public String toString() {
        return "Rook : 5";
    }
}
