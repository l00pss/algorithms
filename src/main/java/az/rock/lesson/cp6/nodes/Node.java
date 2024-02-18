package az.rock.lesson.cp6.nodes;

public class Node<T extends Comparable<T>> extends AbstractNode<T> {
    public Node(T value, AbstractNode<T> parent, AbstractNode<T> left, AbstractNode<T> right) {
        super(value, parent, left, right);
    }

    @Override
    public void insert(AbstractNode<T> data) {

    }

    @Override
    public AbstractNode<T> remove(T data) {
        return null;
    }

    @Override
    public AbstractNode<T> balance() {
        return null;
    }

    @Override
    public AbstractNode<T> rotateLeft() {
        return null;
    }

    @Override
    public AbstractNode<T> rotateRight() {
        return null;
    }

    @Override
    public AbstractNode<T> getGrandParent() {
        return null;
    }

    @Override
    public AbstractNode<T> reColor() {
        return null;
    }

    @Override
    public RedNode<T> toRedNode() {
        if (!(this instanceof RedNode))
            return new RedNode<T>(this.getValue(), this.getParent(), this.getLeft().toBlackNode(), this.getRight().toBlackNode());
        else return (RedNode<T>) this;
    }

    @Override
    public BlackNode<T> toBlackNode() {
        if (!(this instanceof BlackNode))
            return new BlackNode<T>(this.getValue(), this.getParent(), this.getLeft().toBlackNode(), this.getRight().toBlackNode());
        else return (BlackNode<T>) this;
    }
}
