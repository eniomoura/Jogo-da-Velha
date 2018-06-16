package TicTac;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TicTac {
	private JFrame frame;
	private String inicioJogo = "X";
	private int xContador = 0;
	private int oContador = 0;

	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JTextField rkX;
	private JTextField rkO;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTac window = new TicTac();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTac() {
		initialize();
		// rankingJogo();
	}

	private void rankingJogo() {
	rkX.setText(String.valueOf(xContador));	
	rkO.setText(String.valueOf(oContador));
	}
	
	private void escolheJogador() {
		if(inicioJogo.equalsIgnoreCase("X")) {
			inicioJogo = "O";
		} else {
			inicioJogo = "X";
		}
	}
	
	public void teste() {
		xContador = xContador + 2;
		rankingJogo();
	}
	
	
	private void vencer() {
		String b1 = btn1.getText();
		String b2 = btn2.getText();
		String b3 = btn3.getText();
		String b4 = btn4.getText();
		String b5 = btn5.getText();
		String b6 = btn6.getText();
		String b7 = btn7.getText();
		String b8 = btn8.getText();
		String b9 = btn9.getText();
		
		if ((b1 == ("X")) && (b2 == ("X")) && (b3 == ("X"))) {
			JOptionPane.showMessageDialog(null, "Jogador X Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			xContador++;
			rankingJogo();
			
		}
		
		if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
			JOptionPane.showMessageDialog(null, "Jogador X Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			xContador++;
			rankingJogo();
			
		}
		
		if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
			JOptionPane.showMessageDialog(null, "Jogador X Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			xContador++;
			rankingJogo();
			
		}
		
		
		if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
			JOptionPane.showMessageDialog(null, "Jogador X Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			xContador++;
			rankingJogo();
			
		}
		
		if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
			JOptionPane.showMessageDialog(null, "Jogador X Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			xContador++;
			rankingJogo();
			
		}
		
		if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
			JOptionPane.showMessageDialog(null, "Jogador X Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			xContador++;
			rankingJogo();
			
		}
		
		if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
			JOptionPane.showMessageDialog(null, "Jogador X Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			xContador++;
			rankingJogo();
			
		}
		
		if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
			JOptionPane.showMessageDialog(null, "Jogador X Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			xContador++;
			rankingJogo();
			
		}
		
		if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
			JOptionPane.showMessageDialog(null, "Jogador O Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			oContador++;
			rankingJogo();
			
		}
		
		if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
			JOptionPane.showMessageDialog(null, "Jogador O Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			oContador++;
			rankingJogo();
			
		}
		
		if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
			JOptionPane.showMessageDialog(null, "Jogador O Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			oContador++;
			rankingJogo();
			
		}
		
		
		if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
			JOptionPane.showMessageDialog(null, "Jogador O Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			oContador++;
			rankingJogo();
			
		}
		
		if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
			JOptionPane.showMessageDialog(null, "Jogador O Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			oContador++;
			rankingJogo();
			
		}
		
		if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
			JOptionPane.showMessageDialog(null, "Jogador O Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			oContador++;
			rankingJogo();
			
		}
		
		if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
			JOptionPane.showMessageDialog(null, "Jogador O Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			oContador++;
			rankingJogo();
			
		}
		
		if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
			JOptionPane.showMessageDialog(null, "Jogador O Ganhou", "Tictac", JOptionPane.INFORMATION_MESSAGE);
			oContador++;
			rankingJogo();
			
		}
		
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
                btn1=new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(inicioJogo);
				if (inicioJogo.equalsIgnoreCase("X")) {
					btn1.setForeground(Color.RED);
				} else {
					btn1.setForeground(Color.BLACK);
				}
				escolheJogador();
                                System.out.println(btn1.getText());
				vencer();
			}
		});
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
                btn2=new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn2.setText(inicioJogo);
				
				if (inicioJogo.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.RED);
				} else {
					btn2.setForeground(Color.BLACK);
				}
				escolheJogador();
				vencer();
				teste();
			}
		});
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
                btn3=new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(inicioJogo);
				if (inicioJogo.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.RED);
				} else {
					btn3.setForeground(Color.BLACK);
				}
				escolheJogador();		
				vencer();
			}
		});
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblJogadorX = new JLabel("Jogador X");
		panel_4.add(lblJogadorX, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		rkX = new JTextField();
		rkX.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(rkX, BorderLayout.CENTER);
		rkX.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
                btn4=new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(inicioJogo);
				if (inicioJogo.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.RED);
				} else {
					btn4.setForeground(Color.BLACK);
				}
				escolheJogador();
				vencer();
			}
		});
		panel_8.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
                btn5=new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn5.setText(inicioJogo);
				if (inicioJogo.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.RED);
				} else {
					btn5.setForeground(Color.BLACK);
				}
				escolheJogador();
				vencer();
			}
		});
		panel_9.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
                btn6=new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn6.setText(inicioJogo);
				if (inicioJogo.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.RED);
				} else {
					btn6.setForeground(Color.BLACK);
				}
				escolheJogador();
				vencer();
			}
		});
		panel_10.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblP = new JLabel("Jogador O");
		panel_7.add(lblP, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		rkO = new JTextField();
		rkO.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(rkO, BorderLayout.CENTER);
		rkO.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
                btn7=new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(inicioJogo);
				if (inicioJogo.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.RED);
				} else {
					btn7.setForeground(Color.BLACK);
				}
				escolheJogador();
				vencer();
			}
		});
		panel_11.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
                btn8=new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(inicioJogo);
				if (inicioJogo.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.RED);
				} else {
					btn8.setForeground(Color.BLACK);
				}
				escolheJogador();
				vencer();
			}
		});
		panel_12.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
                btn9=new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(inicioJogo);
				if (inicioJogo.equalsIgnoreCase("X")) {
					btn9.setForeground(Color.RED);
				} else {
					btn9.setForeground(Color.BLACK);
				}
				escolheJogador();
				vencer();
			}
		});
		panel_13.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				
			}
		});
		panel_14.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Mas já tá indo? Joga mais. Mas se não quiser, pode ir.",
					null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		panel_15.add(btnExit, BorderLayout.CENTER);
	}
}
