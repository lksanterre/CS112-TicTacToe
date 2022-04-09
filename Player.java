public class Player{
	String name;
	XOPiece piece;
	public Player(String name , XOPiece p){
		this.name = name;
		this.piece = p;
	}
	public XOPiece getPiece(){
		return this.piece;
	}

}