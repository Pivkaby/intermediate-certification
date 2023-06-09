import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Node {
    private File folder;
    private long limit;
    private ArrayList<Node> children;
    private long size;
    private int level;

    public Node(File folder) {
        this.folder = folder;
        children = new ArrayList<>();
    }

    public Node(File folder, long limit) {
        this(folder);
        this.limit = limit;
    }

    public File getFolder() {
        return folder;
    }

    private long setLimit(long limit) {
        return limit;
    }

    public void addChild(Node node) {
        node.setLevel(level + 1);
        node.setLimit(limit);
        children.add(node);
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        String size = SizeCalculator.getHumanReadableSize(getSize());
        builder.append(folder.getName() + " - " + size + "\n");
        for (Node child : children) {
            if (child.getSize() < limit) {
                continue;
            }
            builder.append("  ".repeat(level + 1) + child.toString());
        }
        return builder.toString();
    }
}
