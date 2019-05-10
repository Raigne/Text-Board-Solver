
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainFrame extends JFrame {


	private JFrame frame;
	private JPanel panel;
	private JPanel panelButton;
	private JLabel labelBG;
	private JButton btnStart;
	private JButton btnInfo;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame mainFrame = new MainFrame();
					mainFrame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
	//Frame
		 frame = new JFrame ();
		 frame.setBounds(100, 100, 450, 200);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//Panel
	     panel = new JPanel();
	     panel.setLayout(new FlowLayout());
	     panel.setBackground(new Color(255,255,255));
	     panelButton = new JPanel();
	     panelButton.setLayout(new FlowLayout());
	     panelButton.setBackground(new Color(9, 132, 227));
	     panel.setLayout(new FlowLayout());
	    
	    
	//Image
	    labelBG = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/TBSolverBG.png")).getImage();
		labelBG.setIcon(new ImageIcon(img1));
	
	//BtnStart
		btnStart= new JButton("Start");
		btnStart.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent m)
			{
				RealBoard rb= new RealBoard();
				rb.main(null);
        		frame.dispose();
			}
		});
	
	//BtnInfo
		btnInfo= new JButton("Mechanics");
		btnInfo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				InfoPage info = new InfoPage();
        		info.InfoPage();
        		frame.dispose();
			}
		});
		
		
	//BtnExit
		 btnExit= new JButton("Exit");
		 btnExit.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 System.exit(1);
			 }
		 });
		 
		 btnStart.setFont(new Font("Arial", Font.PLAIN, 20));
		 btnInfo.setFont(new Font("Arial", Font.PLAIN, 20));
		 btnExit.setFont(new Font("Arial", Font.PLAIN, 20));
		 	
		 //Image btn1 = new ImageIcon(this.getClass().getResource("/StartDefault.png")).getImage();
		 //btnStart.setIcon(new ImageIcon(btn1));
	
	     
	//AddingToPanel
		 panel.add(labelBG);
		 panelButton.add(btnStart);
		 panelButton.add(btnInfo);
		 panelButton.add(btnExit);
			
	//AddingToFrame
	     frame.getContentPane().add(panel);
	     frame.getContentPane().add(panelButton, "South");
	     frame.setSize(577, 588);
		 frame.setLocationRelativeTo(null);
	     
	}

}