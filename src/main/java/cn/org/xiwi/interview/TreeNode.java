package cn.org.xiwi.interview;

/**
 * 平衡 vs. 非平衡：平衡二叉树中，每个节点的左右子树的深度相差至多为1（1或0）。
满二叉树（Full Binary Tree）：除叶子节点以为的每个节点都有两个孩子。
完美二叉树（Perfect Binary Tree）：是具有下列性质的满二叉树：所有的叶子节点都有相同的深度或处在同一层次，且每个父节点都必须有两个孩子。
完全二叉树（Complete Binary Tree）：二叉树中，可能除了最后一个，每一层都被完全填满，且所有节点都必须尽可能想左靠。
 * */
public class TreeNode {
	public int value;
	public TreeNode left;
	public TreeNode right;
}
