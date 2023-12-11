package Matchboxes;

public class Game {
    private final int GAME_STATES = 204;
    private Matchbox[] matchboxes = new Matchbox[GAME_STATES];

    public Game() {
        for (int i = 0; i < GAME_STATES; i++) {
            matchboxes[i] = new Matchbox();
        }
    }

    

}
