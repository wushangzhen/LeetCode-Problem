思路：观察给定的二叉树可知，二叉树中任何节点：左节点的值 < 根节点的值 < 右节点的值。根据这个性质，可以做出如下判断：

如果p、q都比根节点小，则在左子树中递归查找最低公共祖先节点。
如果p、q都比根节点大，则在右子树中递归查找最低公共祖先节点。
如果p、q一个比根节点大，一个比根节点小，或者有一个等于根节点，则根节点即为最低公共祖先节点。