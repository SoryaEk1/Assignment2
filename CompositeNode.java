import javax.swing.tree.DefaultMutableTreeNode;

public abstract class CompositeNode extends DefaultMutableTreeNode {
	public abstract void addChild(NodeVisitor visitor);

}
