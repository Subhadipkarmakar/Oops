public class interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.move();
    }
}
/**
 * chessplayer
 */
 interface chessplayer {
void move();
    
}
class Queen implements chessplayer{

    public void move(){
        System.out.println("up,down,,left,right,diagonal");
    }
}
class rook implements chessplayer{

    public void move(){
        System.out.println("up,down,left,right");
    }
}
class King implements chessplayer{

    public void move(){
        System.out.println("up,down,left,right...in one step");
    }
}