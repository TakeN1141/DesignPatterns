import java.util.LinkedList;
import java.util.List;

abstract class Subject {
    private List<Observer> observersList = new LinkedList<Observer>();

    protected void notifyObserver() {
        for (Observer o : observersList)
            o.update();
    }

    public void register(Observer o) {
        observersList.add(o);
    }

    public void remove(Observer o) {
        observersList.remove(o);
    }
}
