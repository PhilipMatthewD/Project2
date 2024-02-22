public class ToDo {
    private String title;
    private String desc;
    private int priority;

    public ToDo(String title, String desc, int priority) {
        this.title = title;
        this.desc = desc;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "ToDo" + "; title = " + title + ", desc = " + desc + ", priority = " + priority;
    }
}
