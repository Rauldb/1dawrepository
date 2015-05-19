package imitador;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ImitadorUI extends JFrame implements ActionListener {
	
	
	JPanel nwpanel=new JPanel();
	JPanel ncpanel=new JPanel();
	JPanel nepanel=new JPanel();
	JPanel swpanel=new JPanel();
	JPanel scpanel=new JPanel();
	JPanel sepanel=new JPanel();
	ButtonGroup opciones=new ButtonGroup();
	ButtonGroup copciones=new ButtonGroup();	
	JRadioButton o1=new JRadioButton("Opcion 1");
	JRadioButton o2=new JRadioButton("Opcion 2");
	JRadioButton o3=new JRadioButton("Opcion 3");
	JRadioButton co1=new JRadioButton("Opcion 1");
	JRadioButton co2=new JRadioButton("Opcion 2");
	JRadioButton co3=new JRadioButton("Opcion 3");
	JCheckBox o4=new JCheckBox("Opcion 4");
	JCheckBox o5=new JCheckBox("Opcion 5");
	JCheckBox o6=new JCheckBox("Opcion 6");
	JCheckBox co4=new JCheckBox("Opcion 4");
	JCheckBox co5=new JCheckBox("Opcion 5");
	JCheckBox co6=new JCheckBox("Opcion 6");
	
	ImitadorUI(){
		
		this.setTitle("Imitador");
		this.setSize(640, 480);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		initUI();
		this.setVisible(true);
				
	}
	
	public void initUI(){
		
		this.setLayout(new GridLayout(2,2));
		this.add(nwpanel);
		nwpanel.setLayout(new GridLayout(3,1));
		this.add(ncpanel);
		ncpanel.setLayout(new GridLayout(3,1));
		this.add(nepanel);
		nepanel.setLayout(new GridLayout(3,1));
		this.add(swpanel);
		swpanel.setLayout(new GridLayout(3,1));
		this.add(scpanel);
		scpanel.setLayout(new GridLayout(3,1));
		this.add(sepanel);
		sepanel.setLayout(new GridLayout(3,1));
		opciones.add(o1);
		opciones.add(o2);
		opciones.add(o3);
		copciones.add(co1);
		copciones.add(co2);
		copciones.add(co3);
		nwpanel.add(o1);
		nwpanel.add(o2);
		nwpanel.add(o3);
		swpanel.add(co1);
		swpanel.add(co2);
		swpanel.add(co3);
		ncpanel.add(o4);
		ncpanel.add(o5);
		ncpanel.add(o6);
		scpanel.add(co4);
		scpanel.add(co5);
		scpanel.add(co6);
		
		o1.addActionListener(this);
		o2.addActionListener(this);
		o3.addActionListener(this);
		o4.addActionListener(this);
		o5.addActionListener(this);
		o6.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(o1)){
			co1.setSelected(true);
			
		}
		if(e.getSource().equals(o2)){
			co2.setSelected(true);
		}
		if(e.getSource().equals(o3)){
			co3.setSelected(true);
		}
		
		if(e.getSource().equals(o4)){
			co4.doClick(1);
		}
		
		if(e.getSource().equals(o5)){
			co5.doClick(1);
		}
		
		if(e.getSource().equals(o6)){
			
			co6.doClick(1);
			
			
		}
		
	}

}
