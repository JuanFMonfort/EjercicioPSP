import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
		setBounds(100, 100, 357, 153);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_pdf = new JButton("");
		btn_pdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ProcessBuilder pb=new ProcessBuilder("\"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe\"", "");
					pb.start();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Exception "+e);
				}
			}
		});
		btn_pdf.setIcon(new ImageIcon("E:\\2DAM\\Servicion_y_procesos\\adobe-pdf-icon.png"));
		btn_pdf.setBounds(10, 11, 100, 100);
		contentPane.add(btn_pdf);
		
		JButton btn_calc = new JButton("");
		btn_calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ProcessBuilder pb=new ProcessBuilder("\"C:\\Program Files\\LibreOffice\\program\\scalc.exe\"", "");
					pb.start();
				} catch (Exception ed) {
					// TODO: handle exception
					System.out.println("Exception "+ed);
				}
			}
		});
		btn_calc.setIcon(new ImageIcon("E:\\2DAM\\Servicion_y_procesos\\calc-icon.png"));
		btn_calc.setBounds(120, 11, 100, 100);
		contentPane.add(btn_calc);
		
		JButton btn_java = new JButton("");
		btn_java.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String cmd[]= {"cmd.exe", "/c", "start "};
				final String commands[]= {"cmd.exe", "/c", "java -version"};

					try {
						Process cmdStrt=new ProcessBuilder(cmd).start();
						Process process=new ProcessBuilder(commands).start();
						
						InputStream is=process.getInputStream();
						InputStreamReader isr=new InputStreamReader(is);
						BufferedReader br=new BufferedReader(isr);
						
						String line;
						while ((line=br.readLine())!=null) {
							System.out.println(line);
						}
						
						try {
							int exitValue = process.waitFor();
							System.out.println("\nCodigo de salida: "+exitValue);
						} catch (InterruptedException ed) {
							// TODO: handle exception
							ed.printStackTrace(System.err);
						}
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}
		});
		btn_java.setIcon(new ImageIcon("E:\\2DAM\\Servicion_y_procesos\\java-icon.png"));
		btn_java.setBounds(230, 11, 100, 100);
		contentPane.add(btn_java);
	}

}
