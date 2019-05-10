import java.awt.GridLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.TextArea;


public class InfoPage extends JFrame {

	private JFrame frame;
	private JLabel bg;
	private JLabel bg_1;
	private JLabel labelBtn;
	private JPanel panel;
	private JPanel panelButton;
	private JButton btnBack;
	

	/**
	 * Launch the application.
	 */
	public static void InfoPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoPage info = new InfoPage();
					info.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
		
	
	/**
	 * Create the frame.
	 */
	public InfoPage() {
		Info();
	}

	private void Info(){
		
		
		
		
		//Label
		bg =  new JLabel();
		bg.setBounds(100,100,500,500);
		labelBtn = new JLabel();
		labelBtn.setLayout(new FlowLayout());
		
		//Image
		bg_1 = new JLabel();
		bg_1.setBounds(0, 5, 565, 500);
		bg_1.setLayout(new FlowLayout());
		Image img1 = new ImageIcon(this.getClass().getResource("/BOBONIPRINCE.png")).getImage();
		bg_1.setIcon(new ImageIcon(img1));
		
		//BtnBack
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent b)
			{
				MainFrame mframe = new MainFrame();
				mframe.main(null);
        		frame.dispose();
			}
		
		});
	
		//AddingToPanel
		panel = new JPanel();
		panel.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setSelectionStart(2);
		textArea.setSelectionEnd(2);
		textArea.setBounds(87, 62, 385, 393);
		panel.add(textArea);
		
		panel.add(bg_1);
		panelButton = new JPanel();
		panelButton.add(btnBack);
		panelButton.setBackground(new Color(9, 132, 227));
		
		//AddingToFrame
		 frame = new JFrame();
		 frame.getContentPane().add(panel);
		 frame.getContentPane().add(panelButton, "South");
	     frame.setSize(575, 576);
		 frame.setLocationRelativeTo(null);
	}
}
