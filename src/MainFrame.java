import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
 static  BST tre;
    public MainFrame( BST tree) {
     tre=tree;
        final JFrame frame = new JFrame();
        frame.setTitle("Operation Available");
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setPreferredSize(new Dimension(400, 400));
        Container pane = frame.getContentPane(); // Use a content pane
        pane.setLayout(null);


        JButton button = new RoundButton("insert");
        button.setBackground(new Color(205, 186, 150));
        button.setForeground(Color.white);
        button.setFont(new Font("Segoe Print", Font.BOLD, 10));

        button.addActionListener(

                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        try{
                            String s=JOptionPane.showInputDialog(new Frame("Values"),"Please enter the key");
                        int k =Integer.parseInt(s);
                        String d =JOptionPane.showInputDialog(new Frame("Values"),"Please enter the data");
                            if(d!=null  && !"".equals(d)){
                       tre.Insert(k,d,tre.getRoot());}
                            else
                                throw new  Exception();
                        }
                        catch (Exception e1) {
                            JOptionPane.showMessageDialog(new Frame(),
                                    "Error there is no accepted data",
                                    "Error message",
                                    JOptionPane.ERROR_MESSAGE);
                        }

                    }
                }
        );

        JButton button1 = new RoundButton("Get String");
        button1.setBackground(new Color(205, 186, 150));
        button1.setForeground(Color.white);
        button1.setFont(new Font("Segoe Print", Font.BOLD, 10));

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                int k =Integer.parseInt(JOptionPane.showInputDialog(new Frame("Values"),"Please enter the key"));
            tre.LookUp(k,tre.getRoot());
            }
            catch(Exception e1)
            {
                JOptionPane.showMessageDialog(new Frame(),
                        "Error there is no accepted data",
                        "Error message",
                        JOptionPane.ERROR_MESSAGE);
            }
            }



        } );


        JButton button2 = new RoundButton("Find");
        button2.setBackground(new Color(205, 186, 150));
        button2.setForeground(Color.white);
        button2.setFont(new Font("Segoe Print", Font.BOLD, 10));

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                try{
                int k =Integer.parseInt(JOptionPane.showInputDialog(new Frame("Values"),"Please enter the key"));
               tre.found=false;
                tre.ContainKey(k,tre.getRoot());
                if(tre.found==true)
                    JOptionPane.showMessageDialog(new Frame(),
                            "the key with value of "+k+" is founded",
                            "A plain message",
                            JOptionPane.PLAIN_MESSAGE);

                else
                    JOptionPane.showMessageDialog(new Frame(),
                            "the key with value of "+k+" is  not founded",
                            "A plain message",
                            JOptionPane.PLAIN_MESSAGE);

            }
            catch (Exception e1)
            {
                JOptionPane.showMessageDialog(new Frame(),
                        " Error there is no accepted data",
                        "Error message",
                        JOptionPane.ERROR_MESSAGE);

            }
            }


        } );

        JButton button3 = new RoundButton("Modify");
        button3.setBackground(new Color(205, 186, 150));
        button3.setForeground(Color.white);
        button3.setFont(new Font("Segoe Print", Font.BOLD, 10));

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                try{
                    String s=JOptionPane.showInputDialog(new Frame("Values"),"Please enter the key");
                    int k =Integer.parseInt(s);
                    String d =JOptionPane.showInputDialog(new Frame("Values"),"Please enter the data");
                    if(d!=null  && !"".equals(d)){

                        tre.Modify(k,d,tre.getRoot());}
                    else
                        throw new  Exception();
                }
                catch (Exception e1) {
                    JOptionPane.showMessageDialog(new Frame(),
                            "Error there is no accepted data",
                            "Error message",
                            JOptionPane.ERROR_MESSAGE);
                }


            }


        } );

        JButton button4 = new RoundButton("Mod Insert");
        button4.setBackground(new Color(205, 186, 150));
        button4.setForeground(Color.white);
        button4.setFont(new Font("Segoe Print", Font.BOLD, 10));

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String s=JOptionPane.showInputDialog(new Frame("Values"),"Please enter the key");
                    int k =Integer.parseInt(s);
                    String d =JOptionPane.showInputDialog(new Frame("Values"),"Please enter the data");
                    if(d!=null  && !"".equals(d)){
                        tre.modInsert(k,d,tre.getRoot());}
                    else
                        throw new  Exception();
                }
                catch (Exception e1) {
                    JOptionPane.showMessageDialog(new Frame(),
                            "Error there is no accepted data",
                            "Error message",
                            JOptionPane.ERROR_MESSAGE);
                }
            }


        } );
        JButton button5 = new RoundButton("Show Tree");
        button5.setBackground(new Color(205, 186, 150));
        button5.setForeground(Color.white);
        button5.setFont(new Font("Segoe Print", Font.BOLD, 10));


        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame=new JFrame();
                if(tre.getRoot()!=null){
                tre.print(tre.getRoot(),600,0,frame);
                    System.out.print("[");
                tre.print(tree.getRoot());
                    System.out.print("]");

                }
                else
                    JOptionPane.showMessageDialog(new Frame(),
                            "the tree is empty",
                            "A plain message",
                            JOptionPane.INFORMATION_MESSAGE);

            }


        } );


        JLabel l = new JLabel("..choose the operation..");
        l.setFont(new Font("Segoe Print", Font.BOLD, 20));
        l.setForeground(new Color(205, 186, 150));
        l.setLocation(90, 0);
        l.setSize(300, 50);
        pane.add(l);

        button.setLocation(30, 60);
        button.setSize(70, 70);
        pane.add(button);

        button3.setLocation(160, 60);
        button3.setSize(70, 70);
        pane.add(button3);

        button2.setLocation(280, 60);
        button2.setSize(70, 70);
        pane.add(button2);


        button4.setLocation(80, 150);
        button4.setSize(90, 90);
        pane.add(button4);

        button1.setLocation(210, 150);
        button1.setSize(90, 90);
        pane.add(button1);

        button5.setLocation(130, 250);
        button5.setSize(110, 110);
        pane.add(button5);

        frame.pack();
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}