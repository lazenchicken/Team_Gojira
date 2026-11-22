public class CaptureRules {
//called after card is placed on board

	public static int applyCaptures(Board board, int row, int col, int playerId) {
		int captured = 0;
//get new placed cared
		PlacedCard played = board.getCell(row, col);
		if (played == null || played.getOwnerId() != playerId) {
			return 0;
		}

		Card card = played.getCard();

// check up from cardplacement -1 if not null(within board), and compared above cards down to placed cards up
    //following this method for below, left and right
		PlacedCard above = board.getCell(row - 1, col);
		if (above != null && tryCapture(board, row - 1, col, card.getUp(), above.getCard().getDown(), playerId)) {
			captured++;
		}
//TODO: check down
		PlacedCard below = board.getCell(row + 1, col);
		if (above != null && tryCapture(board, row + 1, col, card.getDown(), above.getCard().getUp(), playerId)) {
			captured++;
		}
//TODO: check left
		PlacedCard left = board.getCell(row, col - 1);
		if (above != null && tryCapture(board, row - 1, col, card.getLeft(), above.getCard().getRight(), playerId)) {
			captured++;
		}
//TODO: check right
		PlacedCard right = board.getCell(row, col + 1);
		if (above != null && tryCapture(board, row - 1, col, card.getRight(), above.getCard().getLeft(), playerId)) {
			captured++;
		}
		return captured;
	}

//checks if one neighbor card can be captured if not owned by you
	private static boolean tryCapture(Board board, int row, int col, int attack, int defense, int playerId) {
		// checks to see if nieghbor
		PlacedCard neighbor = board.getCell(row, col);
		if (neighbor == null) {
			return false;
		}
		// if there is a nieghbor, check if it owned by self
		if (neighbor.getOwnerId() == playerId) {
			return false;
		}
		// TODO: Compare card attack from placed card to defense of played card and change ownership if loss
		// return true if captured
		if (attack > defense) {
			neighbor.setOwnerId(playerId);
			return true;
		}

		return false;
	}
}
