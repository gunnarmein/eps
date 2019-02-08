package langtonant;

/**
 *
 * @author gmein
 */
public interface Ant {
    void init(String directions);
    Action next(int currentSymbol);
}
