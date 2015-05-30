/**
 * 
 */
package com.myprojects.examples.java.basic.innerclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Admin An anonymous inner class is one that is declared and used to
 *         create one object (typically as a parameter to a method), all within
 *         a single statement.
 *         
 *         An anonymous inner class may extend a class: new SuperClass(parameters){ class body }
 *         An anonymous inner class may implement an interface: new Interface(){ class body }
 *
 */
public class AnonymousInnerClassDemo extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnonymousInnerClassDemo outer = new AnonymousInnerClassDemo();
		JButton button = new JButton("Don't click Me!");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ouch!");
			}
		});
		outer.add(button);
		outer.pack();
		outer.setVisible(true);

	}

}
