import javax.swing.*;
import java.awt.*;

public class BST {
    private NodeTree root;
  static BST tee;
  public boolean found;
    private NodeTree FoundTree=new NodeTree();

    public BST()
    {
        this.root=null;
        tee=this;
    }

    public void ContainKey(int key, NodeTree tree)
    {
       if (tree==null) {
           this.found = false;
       return;
       }
           else{
            if (tree.getKey() == key)
            {  FoundTree=tree;
               this.found=true;
                return;
            }
            else if (key > tree.getKey()) {
                ContainKey(key, tree.getRightChild());
            }
            else
            { ContainKey(key, tree.getLeftChild());
            }

        }

    }

    public NodeTree Insert(int key, String data , NodeTree tree) {
        found=false;
        ContainKey(key,this.getRoot());
        if (!found) {
            if (tree == null) {
                tree = new NodeTree(key, data);
           if(root==null)
               root=tree;
            }
            else
            {
                 if (key <= tree.getKey())
                    tree.setLeftChild(Insert(key, data,tree.getLeftChild()));
                else
                    tree.setRightChild(Insert(key,data ,tree.getRightChild()));
            }
            return tree;

        }


    else
    {

            JOptionPane.showMessageDialog(new Frame(),
                   " there is an entry with this key !!",
                    "A plain message",
                    JOptionPane.ERROR_MESSAGE);
return null;
}}

public NodeTree getRoot()
{
    return this.root;
}
public void LookUp(int key, NodeTree tree)
{found=false;
    FoundTree=null;
    ContainKey(key,tree);
if(found){
    JOptionPane.showMessageDialog(new Frame(),
            "the Data of the key value of "+key+" is "+FoundTree.getData(),
            "A plain message",
            JOptionPane.PLAIN_MESSAGE);}
else
{
    JOptionPane.showMessageDialog(new Frame(),
            "the Data of the key value of "+key+" is not available in the tree ",
            "Error message",
            JOptionPane.ERROR_MESSAGE);
}

}

    public void Modify(int key, String data, NodeTree tree)
    {
        found=false;
        FoundTree=null;
        ContainKey(key,tree);

        if(found)
        {
          FoundTree.setData(data);
        }

        else
            JOptionPane.showMessageDialog(new Frame(),
                    "the Data of the key value of "+key+" is not available in the tree ",
                    "Error message",
                    JOptionPane.ERROR_MESSAGE);
    }

public void setRoot(NodeTree r)
{
    this.root=r;
}
    public void modInsert(int key, String data, NodeTree tree)
    {

        found=false;
        ContainKey(key,tree);

        if(found==false)
           this.Insert(key,data,tree);
        else
            this.Modify(key,data,tree);

    }

    JFrame frame=new JFrame();
    String dis="";
    NodeTree current=this.getRoot();
    public void print(NodeTree nodeTree, int m, int n, JFrame frame)
    {

        Container pane = frame.getContentPane();
        frame.setSize(1000,1000);
        frame.setTitle("Operation Available");
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        //frame.setPreferredSize(new Dimension(400, 400));
        pane.setLayout(null);

    JButton bnt=new RoundButton("");
        bnt.setText(nodeTree.getKey()+"\n "+ nodeTree.getData());


    bnt.setBackground(new Color(205, 186, 150));
    bnt.setForeground(Color.white);
    bnt.setFont(new Font("Segoe Print", Font.BOLD, 10));

    bnt.setLocation(m,n);
    bnt.setSize(80, 80);
    pane.add(bnt);

        if(nodeTree.getRightChild()!=null){
            JLabel lb0=new JLabel("");
            ImageIcon imgThisImg = new ImageIcon("s1.png");
            lb0.setIcon(imgThisImg);
            lb0.setSize(70,70);
            if(nodeTree.getRightChild()==getRoot().getRightChild()){
                lb0.setLocation(m+130,n+100);
                pane.add(lb0);
                print(nodeTree.getRightChild(),m+260,n+210,frame);
            }

            else{
            lb0.setLocation(m+90,n+90);
                pane.add(lb0);
                print(nodeTree.getRightChild(),m+160,n+160,frame);
            }
        }

        if(nodeTree.getLeftChild()!=null) {

            JLabel lb0=new JLabel("");
            ImageIcon imgThisImg = new ImageIcon("s2.png");
            lb0.setIcon(imgThisImg);
            lb0.setSize(70,70);
            if(nodeTree.getLeftChild()==getRoot().getLeftChild()){
                lb0.setLocation(m-130,n+100);
                pane.add(lb0);
                print(nodeTree.getLeftChild(),m-260,n+210,frame);
            }

            else {
                lb0.setLocation(m - 90, n + 90);
                pane.add(lb0);
                print(nodeTree.getLeftChild(), m - 160, n + 160, frame);
            }}
        frame.setVisible(true);

    }

public  void print(NodeTree tree){
    if(tree.getLeftChild()!=null)
    {
        System.out.print("[");
        print(tree.getLeftChild());
        System.out.print("],");
    }
    System.out.print(tree.getKey()+":"+"\""+tree.getData()+"\"");
    if(tree.getRightChild()!=null)
    {
        System.out.print(",[");
        print(tree.getRightChild());
        System.out.print("]");
    }
}

}
