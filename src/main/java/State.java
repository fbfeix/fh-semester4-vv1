import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class State {
    private List<State> possibleNextStates = new ArrayList<State>();

    public Optional<State> apply(String input) {
        return Optional.empty();
    }
}
