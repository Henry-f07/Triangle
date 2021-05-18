
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class triangle extends JFrame {

	private JPanel contentPane;
	private JLabel title, edgeA, edgeB, edgeC, shape;//���⣬���������ߣ���״
	private JTextField textA, textB, textC, textShape;//���������ߣ���״
	private JButton btn_check,btn_reinput;//�ж���״����������
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					triangle frame = new triangle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public triangle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		//�������
		title = new JLabel("����������1��200��������");
    	edgeA = new JLabel("A");
    	edgeB = new JLabel("B");
    	edgeC = new JLabel("C");
       	shape = new JLabel("��״");
    	textA = new JTextField(10); 
    	textB = new JTextField(10);
    	textC = new JTextField(10);
    	textShape = new JTextField(10); 
    	btn_check = new JButton("�ж���״");
    	btn_reinput = new JButton("��������");
    	setLayout(null);
    	
    	//������
    	add(title);
    	add(edgeA);
    	add(edgeB);
    	add(edgeC);
    	add(shape);
    	add(textA);
    	add(textB);
    	add(textC);
    	add(textShape);
    	add(btn_check);
    	add(btn_reinput);
    	
    	//�������λ�ÿ��
    	title.setBounds(130, 50, 200, 30);
    	edgeA.setBounds(130, 90, 80, 20);
    	edgeB.setBounds(130, 130, 80, 20);
    	edgeC.setBounds(130, 170, 80, 20);
    	shape.setBounds(130, 210, 80, 20);
    	textA.setBounds(200, 90, 160, 20);
    	textB.setBounds(200, 130, 160, 20);
    	textC.setBounds(200, 170, 160, 20);
    	textShape.setBounds(200, 210, 160, 20);
    	btn_check.setBounds(130, 235, 100, 30);
    	btn_reinput.setBounds(240, 235, 100, 30);

    	btn_check.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try{
					int a = Integer.parseInt(textA.getText()); 
					int b = Integer.parseInt(textB.getText()); 
					int c = Integer.parseInt(textC.getText());
					if(a>200||b>200||c>200||a<0||b<0||c<0)
					{
						JOptionPane.showMessageDialog(null,"�������볬�ޣ�");
					}
					else{
						if(a>0 && b>0 && c>0)
						{
							if(a+b>c && a-b<c)
							{
								if(a==b && a==c)
								{
									textShape.setText("�ȱ�������");
								}
								else if(a==b||a==c||b==c)
								{
									textShape.setText("����������");
								}
								else{
									textShape.setText("һ��������");
								}
							}
							else{
								textShape.setText("���ܹ���������");

							}
						}
						else{
							textShape.setText("���ܹ���������");

						}
					}
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"��������Ƿ���");
				}

			}
    		
    	});
    	btn_reinput.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textA.setText("");
				textB.setText("");
				textC.setText("");
				textShape.setText("");
				
			}
		});

		
		
	}

}
