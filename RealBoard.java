import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.CompoundBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class RealBoard extends JFrame {

	private JFrame Frame;
	private JPanel Panel;
	private JPanel panelButton;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf11;
	private JTextField tf12;
	private JTextField tf13;
	private JTextField tf14;
	private JTextField tf15;
	private JTextField tf16;
	private JButton btnPlay;
	private JButton btnReset;
	private JButton btnQuit;

	

	/**
	 * Launch the application.
	 */
	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealBoard rb = new RealBoard();
					rb.Frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RealBoard() {
	   
		//table
		/*table = new JTable();
		table.setLocation(22, 26);
		table.setBackground(Color.WHITE);
		table.setColumnSelectionAllowed(true);
		table.setRowHeight(55);
		table.setSize(540,220);
		
		table.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, new Color(30, 144, 255), null, new Color(0, 0, 0), null), new BevelBorder(BevelBorder.LOWERED, null, new Color(30, 144, 255), null, null)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"", "", "", ""
			}
		));*/
		
		
		tf1 = new JTextField(1);
		tf1.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf2 = new JTextField(1);
		tf2.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf3 = new JTextField(1);
		tf3.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf4 = new JTextField(1);
		tf4.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf5 = new JTextField(1);
		tf5.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf6 = new JTextField(1);
		tf6.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf7 = new JTextField(1);
		tf7.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf8 = new JTextField(1);
		tf8.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf9 = new JTextField(1);
		tf9.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf10 = new JTextField(1);
		tf10.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf11 = new JTextField(1);
		tf11.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf12 = new JTextField(1);
		tf12.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf13 = new JTextField(1);
		tf13.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf14 = new JTextField(1);
		tf14.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf15 = new JTextField(1);
		tf15.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		tf16 = new JTextField(1);
		tf16.setFont(new Font("Century Gothic", Font.PLAIN, 56));
		
		//BtnPlay
		btnPlay = new JButton("Play");
		btnPlay.setFont(new Font("Arial", Font.PLAIN, 20));
		btnPlay.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent b)
			{
						
			}
				
		});
				
		//BtnReset
		btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Arial", Font.PLAIN, 20));
		btnReset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent b)
			{
						
			}
				
		});	

		//BtnQuit
		btnQuit = new JButton("Quit");
		btnQuit.setFont(new Font("Arial", Font.PLAIN, 20));
		btnQuit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent b)
			{
				System.exit(0);	
			}
						
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		//PanelButton
	    panelButton = new JPanel();
	    panelButton.setLocation(0, 301);
	    panelButton.add(btnPlay);
	    panelButton.add(btnReset);
	    panelButton.add(btnQuit);
	    panelButton.setSize(540,50);
	    panelButton.setBackground(new Color(9, 132, 227));
	    
	    //Panel
	    Panel = new JPanel();
		Panel.setLayout(new GridLayout(4, 4));
		Panel.setBackground(new Color(9, 132, 227));
		Panel.add(tf1);
		Panel.add(tf2);
		Panel.add(tf3);
		Panel.add(tf4);
		Panel.add(tf5);
		Panel.add(tf6);
		Panel.add(tf7);
		Panel.add(tf8);
		Panel.add(tf9);
		Panel.add(tf10);
		Panel.add(tf11);
		Panel.add(tf12);
		Panel.add(tf13);
		Panel.add(tf14);
		Panel.add(tf15);
		Panel.add(tf16);
	    
		Frame = new JFrame();
		Frame.getContentPane().add(Panel, "North");
		Frame.getContentPane().add(panelButton, "South");
	    Frame.setSize(549, 381);
		Frame.setVisible(true);
		Frame.setLocationRelativeTo(null);
	}
}
