public class NodeTree {
    private int key;
    private String data;
  private NodeTree leftChild;
   private NodeTree rightChild;
    public NodeTree(){
        this.rightChild=null;
        this.leftChild=null;
        this.key=0;
        this.data="";
    }
    public NodeTree(int key, String data){
        this.key = key;
        this.data=data;
        this.leftChild = null;
        this.rightChild = null;
    }
    public int getKey()
    {
        return this.key;
    }
    public NodeTree getLeftChild()
    {
        return this.leftChild;
    }

    public NodeTree getRightChild()
    {
        return this.rightChild;
    }

    public String getData()
    {
        return this.data;
    }
    public void setRightChild(NodeTree nodeTree)
    {
        this.rightChild= nodeTree;
    }
    public void setLeftChild(NodeTree nodeTree)
    {
        this.leftChild= nodeTree;
    }

    public void setData(String data)
    {
        this.data=data;
    }
}
