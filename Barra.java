import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Barra extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Barra frame = new Barra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Barra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 162);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_vb = new JButton("");
		btn_vb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ProcessBuilder pb=new ProcessBuilder("\"C:\\Program Files (x86)\\Microsoft Visual Studio\\2017\\Professional\\Common7\\IDE\\devenv.exe\"", "");
					pb.start();
				} catch (Exception ed) {
					// TODO: handle exception
					System.out.println("Exception "+ed);
				}
			}
		});
		btn_vb.setIcon(new ImageIcon("E:\\2DAM\\Servicion_y_procesos\\visualBasic-icon.png"));
		btn_vb.setBounds(119, 11, 100, 100);
		contentPane.add(btn_vb);
		
		JButton btn_eclipse = new JButton("");
		btn_eclipse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ProcessBuilder pb=new ProcessBuilder("\"C:\\Program Files\\eclipse\\eclipse.exe\"", "");
					pb.start();
				} catch (Exception es) {
					// TODO: handle exception
					System.out.println("Exception "+es);
				}
			}
		});
		btn_eclipse.setIcon(new ImageIcon("E:\\2DAM\\Servicion_y_procesos\\eclipse-icon.png"));
		btn_eclipse.setBounds(229, 11, 100, 100);
		contentPane.add(btn_eclipse);
		
		JButton btn_calc = new JButton("");
		btn_calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ProcessBuilder pb=new ProcessBuilder("\"C:\\Windows\\System32\\calc.exe\"");
					pb.start();
				} catch (Exception eq) {
					// TODO: handle exception
					System.out.println("Exception "+eq);
				}
			}
		});
		btn_calc.setIcon(new ImageIcon("E:\\2DAM\\Servicion_y_procesos\\calculadora-icon.png"));
		btn_calc.setBounds(339, 11, 100, 100);
		contentPane.add(btn_calc);
		
		JButton btn_andriod = new JButton("");
		btn_andriod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ProcessBuilder pb=new ProcessBuilder("\"C:\\Program Files\\Android\\Android Studio\\bin\\studio64.exe\"", "");
					pb.start();
				} catch (Exception ew) {
					// TODO: handle exception
					System.out.println("Exception "+ew);
				}
			}
		});
		btn_andriod.setIcon(new ImageIcon("E:\\2DAM\\Servicion_y_procesos\\studio-icon.png"));
		btn_andriod.setBounds(10, 11, 100, 100);
		contentPane.add(btn_andriod);
	}
}
