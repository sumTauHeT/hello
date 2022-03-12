public class BiTreeNode {

    public Integer data;

    public BiTreeNode lchild;
    public BiTreeNode rchild;

    public BiTreeNode(){
        this(null);
    }
    public BiTreeNode(Integer data){
        this(data, null ,null);
    }

    public BiTreeNode(Integer data,BiTreeNode lchild,BiTreeNode rchild){
        this.data=data;
        this.lchild=lchild;
        this.rchild=rchild;
    }
}
