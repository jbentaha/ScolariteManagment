package scolarite;

import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScolariteInterface extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 10L;

	public ScolariteInterface() {
		
	    JPanel p = new JPanel();
	    p.setLayout(new BorderLayout());
	    
	    Box studentBox = Box.createHorizontalBox();
	    studentBox.add(new JLabel("Information étudiant : "));
	    	Box studentInfos = Box.createHorizontalBox();
	    	studentInfos.add(new JLabel("JEE"));
	    	studentInfos.add(new TextArea());
	    	studentInfos.add(new JLabel("Android"));
	    	studentInfos.add(new TextArea());
	    studentBox.add(studentInfos);
	    
	    p.add(studentBox, BorderLayout.NORTH);
	    this.setContentPane(p);
	}
	
	public static void main(String[] args) {
		JFrame myf = new JFrame();
		myf.setTitle("Gestion de scolarité");
	    myf.setSize(500,500);
	    myf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    myf.setLocationRelativeTo(null);
		System.out.println("everything !");
	}

}
