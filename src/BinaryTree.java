import java.util.function.Consumer;

class BinaryNode<T> {
    private T data;
    private BinaryNode<T> left;
    private BinaryNode<T> right;

    public BinaryNode(T d, BinaryNode<T> l, BinaryNode<T> r) {
        data = d; left = l; right = r;
    }

    public void preorder(Consumer<T> f) {
        // student implements
        throw new UnsupportedOperationException();
    }

    public void inorder(Consumer<T> f) {
        // student implements
        throw new UnsupportedOperationException();
    }

    public void postorder(Consumer<T> f) {
        // student implements
        throw new UnsupportedOperationException();
    }

}

public class BinaryTree<T> {
    private BinaryNode<T> root;

    public BinaryTree() { root = null; }
    public BinaryTree(BinaryNode<T> r) { root = r; }

    public void preorder(Consumer<T> f) { root.preorder(f); }
    public void inorder(Consumer<T> f) { root.inorder(f); }
    public void postorder(Consumer<T> f) { root.postorder(f); }

}
