import java.Math.random;
public class Player {

	String name;
	Scorecard card;

	public Player() {
		this.name = null;
		this.card = null;
	}

	public Player(String name) {
		this.name = name;
		this.card = new Scorecard();
	}

	/**
	* Roll dice
	* var dice is for dice that have already been rolled
	* var reroll is for specifying which dice should be rerolled
	* return array of rolled dice values
	**/
	public int[] roll(int[] dice, boolean[] reroll) {
		try {
			for (int i = 0; i < dice.length; i++) {
				if (reroll[i]) dice[i] = (int) Math.random() * 6 + 1;
			}
		} catch (Exception e) {
			int[] dice = new int[5];
			for (int i = 0; i < 5; i++) {
				dice[i] = (int) Math.random() * 6 + 1;
			}
		}
		return dice;
	}


/*
player turn
- player rolls dice
- decides whether to keep rolling
	- yes? pick dice to keep, start over
	- no? pick scoreColumn to add to; end turn
*/
	public void playTurn() {
		int dice = {0, 0, 0, 0, 0};
		boolean rollDice = {true, true, true, true, true};
		for (int rollNumber = 1; rollNumber <= 3; rollNumber++) {
			dice = roll(dice, rollDice);
			
		}
	}

}

