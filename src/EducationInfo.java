import java.util.HashMap;

public class EducationInfo {
    private HashMap<IObserver, Integer> mark;

    public EducationInfo() {
        mark = new HashMap<>();
    }

    public HashMap<IObserver, Integer> getMark() {
        return mark;
    }
}
