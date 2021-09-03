package step2.domain;

import java.util.List;
import java.util.stream.Collectors;

public class LadderGameManager {
    private final LadderGameColumns ladderGameColumns;
    private final Result result;

    public LadderGameManager(Name name, Result result) {
        ladderGameColumns = new LadderGameColumns(name);
        this.result = result;
    }

    public LadderGameColumns getLadderGames() {
        return ladderGameColumns;
    }

    public void runGame(int height, Ladder ladder) {
        ladderGameColumns.runLadder(height, ladder);
        ladderGameColumns.calculateResult(result);
    }


}