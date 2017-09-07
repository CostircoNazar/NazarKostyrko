package lesson_04.Hospitality;

public class History {
    private String history;

    public History(String history) {
        this.history = history;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "History{" +
                "history='" + history + '\'' +
                '}';
    }
}
