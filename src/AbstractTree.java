/**
 * Class: AbstractTree
 *
 * @author Chester Waye
 * @version 1.0 Course : ITEC 3150, Spring, 2021 Written: 4/14/2021
 * <p>
 * <p>
 * This class � Describes what the class does
 * <p>
 * Purpose: � Describe the purpose of this class.
 */
public abstract class AbstractTree<E> implements Tree<E> {
    @Override /** Inorder traversal from the root*/
    public void inorder() {
    }

    @Override /** Postorder traversal from the root */
    public void postorder() {
    }

    @Override /** Preorder traversal from the root */
    public void preorder() {
    }

    @Override /** Return true if the tree is empty */
    public boolean isEmpty() {
        return getSize() == 0;
    }
}
