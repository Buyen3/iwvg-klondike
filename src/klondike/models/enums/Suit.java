package klondike.models.enums;

public enum Suit {

    HEARTS(Color.RED, 'H'),
    DIAMONDS(Color.RED, 'D'),
    CLOVERS(Color.BLACK, 'C'),
    PIKES(Color.BLACK, 'P');

    private final Color color;
    private final char initial;
    

    Suit(Color color, char initial) {
        this.color = color;
        this.initial = initial;
    }


	public Color getColor() {
		return color;
	}


	public char getInitial() {
		return initial;
	}


   

}
