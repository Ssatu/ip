package duke;

public class Task {
    private boolean done;
    private String title;
    private types type;
    private enum types{TODO, DEADLINE, EVENT}

    public Task(String title, String type, boolean done) {
        switch(type) {
        case "todo":
            this.type = types.TODO;
            break;

        case "deadline":
            this.type = types.DEADLINE;
            break;

        case "event":
            this.type = types.EVENT;
            break;
        }
        this.done = done;
        this.title = title;
    }

    @Override
    public String toString() {
        return "[" + getType() + "]" + "[" + (isDone()?"X":" ") + "] " + title;
    }

    /**
     * This marks the task as being done.
     * Changing the boolean done to true.
     */
    public void mark() {
        this.done = true;
    }

    /**
     * This marks the task as not done.
     * Changing the boolean done to false.
     */
    public void unmark() {
        this.done = false;
    }

    /**
     * This method returns whether the task has been completed.
     *
     * @return boolean If the task has been completed
     */
    public boolean isDone() {
        return this.done;
    }

    /**
     * This method retrieves the type of the task.
     *
     * @return String Type of the task.
     */
    public String getType() {
        switch(this.type) {
            case TODO:
                return "T";
            case DEADLINE:
                return"D";
            case EVENT:
                return "E";
            default:
                //Should catch erroneous types
                return "T";
        }
    }

    /**
     * Returns the title of the task.
     *
     * @return The title of the task.
     */
    public String getTitle() {
        return title;
    }
}
