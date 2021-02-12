import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{
	
	//Construct variable;
	
	JMenuItem newFile;
	JMenuItem saveItem;
	JMenuItem exitItem;
	JMenuItem editFile;
	JMenuItem colorFile;
	JMenuItem helpFile;

	//===Construct Frame====
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(250,250);
		this.setLayout(new FlowLayout());
		
		//====Menu Bar====
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");
		
		//==File Part===
		newFile = new JMenuItem("New File");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
	    newFile.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		fileMenu.add(newFile);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		//===Edit part===
		editFile = new JMenuItem("Preferences");
		colorFile = new JMenuItem("Change Colour");
		editFile.addActionListener(this);
		colorFile.addActionListener(this);
		editMenu.add(editFile);
		editMenu.add(colorFile);
		
		//===Help Part 
		helpFile = new JMenuItem("Tanya Naufal");
		helpFile.addActionListener(this);
		helpMenu.add(helpFile);
		
		
		
		
		//=====FrontEnd=======
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
	
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==newFile) {
			System.out.println("New File");
		}
		if(e.getSource()==saveItem) {
			System.out.println("Save File");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
		
	}
}
