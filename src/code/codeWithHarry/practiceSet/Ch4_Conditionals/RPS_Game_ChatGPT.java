package code.codeWithHarry.practiceSet.Ch4_Conditionals;

import java.util.Scanner;

enum Move {
    ROCK, PAPER, SCISSORS;

    public int compareMoves(Move otherMove) {
        if (this == otherMove) {
            return 0;
        }

        switch (this) {
            case ROCK:
                return (otherMove == SCISSORS) ? 1 : -1;
            case PAPER:
                return (otherMove == ROCK) ? 1 : -1;
            case SCISSORS:
                return (otherMove == PAPER) ? 1 : -1;
        }

        return 0;
    }
}

class Player {
    private String name;
    private Move move;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", enter your move (ROCK, PAPER, SCISSORS): ");
        String input = scanner.nextLine().toUpperCase();
        move = Move.valueOf(input);
    }

    public Move getMove() {
        return move;
    }
}

public class RPS_Game_ChatGPT {
    private Player player1;
    private Player player2;

    public RPS_Game_ChatGPT(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
    }

    public void play() {
        player1.makeMove();
        player2.makeMove();

        Move move1 = player1.getMove();
        Move move2 = player2.getMove();

        System.out.println(player1.getName() + " chose " + move1);
        System.out.println(player2.getName() + " chose " + move2);

        int result = move1.compareMoves(move2);

        if (result > 0) {
            System.out.println(player1.getName() + " wins!");
        } else if (result < 0) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        RPS_Game_ChatGPT game = new RPS_Game_ChatGPT("Player 1", "Player 2");
        game.play();
    }
}
