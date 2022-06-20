package prototype;

public class Movie extends Item {
    private long runtime;

    public long getRuntime() {
        return runtime;
    }

    public void setRuntime(long runtime) {
        this.runtime = runtime;
    }

    @Override
    protected Movie clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + "[" + "runtime=" + runtime + "]";
    }

}
