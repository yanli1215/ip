package duke.task;

import duke.task.Task;

public class Todo extends Task {

    public Todo(String content) {
        super(content);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    public String strAddToTxt() { return "T" + super.strAddToTxt(); }
}
