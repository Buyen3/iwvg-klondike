package klondike.utils;

import klondike.models.enums.Suit;
import klondike.views.console.menu.Message;

public class SuitUtils {
	public static Suit read() {
		char initial = IO.readChar(Message.READ_SUIT, SuitUtils.initials());
		return SuitUtils.find(initial);
	}

	public static char[] initials() {
		char[] initials = new char[Suit.values().length];
		for (Suit suit : Suit.values()) {
			initials[suit.ordinal()] = suit.getInitial();
		}
		return initials;
	}

	public static Suit find(char initial) {
		for (Suit suit : Suit.values())
			if (initial == suit.getInitial()) {
				return suit;
			}
		return null;
	}
}
