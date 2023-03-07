package parser;

public class IndexRange {
    private int fromIndex;
    private int toIndex;

    public IndexRange(int fromIndex, int toIndex) {
        this.fromIndex = fromIndex;
        this.toIndex = toIndex;
    }

    public int getFromIndex(){
        return this.fromIndex;
    }
    public int getToIndexIndex(){
        return this.toIndex;
    }

}
