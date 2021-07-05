import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Calculadora extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton numeros;
	public JButton suma,resta,multi,div,CE,igual;
	public JTextArea numero;
	
	
	
	public Calculadora() {
		GridLayout grid= new GridLayout(4,4);
		this.setLayout(grid);
		this.setSize(480,680);
		this.setVisible(true);
		Container c = this.getContentPane();
		int i;
		for(i=0;i<10;i++) {
			numeros =new JButton(" "+ i);
			numeros.addActionListener(null);
			c.add(numeros,i%4,i/4);
		}
		
	}

}
