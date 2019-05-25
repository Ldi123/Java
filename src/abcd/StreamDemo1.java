package abcd;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class StreamDemo1 extends JFrame
{
	private static final long serialVersionUID = -8189097464792417464L;
	private ScrollPane scrollPane;
	private JTextArea area;
	private JButton openbutton, savebutton, writebutton;
	private JPanel panel;
	private BufferedReader input;
	private BufferedWriter output;
	private StringBuffer buffer;
	
	public StreamDemo1()
	{
		super( "文件输入输出演示" );
		getContentPane().setLayout( new BorderLayout() );
		scrollPane = new ScrollPane();
		area = new JTextArea();
		openbutton = new JButton( "打开文件" );
		savebutton = new JButton( "保存文件" );
		savebutton.setEnabled( false );
		writebutton = new JButton( "展示文件内容" );
		writebutton.setEnabled( false );
		
		panel = new JPanel();
		panel.setLayout( new FlowLayout() );
		
		openbutton.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed( ActionEvent event )
				{
					openFile();
				}
			}
		);
		savebutton.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed( ActionEvent event )
				{
					saveFile();
				}
			}
		);
		writebutton.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed( ActionEvent event )
				{
					displayFileContent();
				}
			}
		);
		scrollPane.add( area );
		panel.add( openbutton );
		panel.add( savebutton );
		panel.add( writebutton );
		getContentPane().add( scrollPane, BorderLayout.CENTER );
		getContentPane().add( panel, BorderLayout.NORTH );
		
		setSize( 350, 200 );
		setVisible( true );
	}
	
	private void openFile()
	{
		JFileChooser open = new JFileChooser( new File( "d://" ) );
		open.setFileSelectionMode( JFileChooser.FILES_ONLY );
		int result = open.showOpenDialog( this );
		if( result == JFileChooser.CANCEL_OPTION )
		return;
		File inputfilename = open.getSelectedFile();
		if( inputfilename == null || inputfilename.getName().equals( "" ))
		{
			JOptionPane.showMessageDialog( this, "没有正确选择文件", "错误提示", JOptionPane.ERROR_MESSAGE );
		}
		else
		{
			try{
				if( input == null )input = new BufferedReader( new FileReader( inputfilename ) );
			}
			catch( IOException ioe)
			{
				JOptionPane.showMessageDialog( this, "打开文件出错", "错误提示", 
					JOptionPane.ERROR_MESSAGE );
			}
			savebutton.setEnabled( true );
		}
	}
	
	private void saveFile()
	{
		JFileChooser save = new JFileChooser( new File( "d://" ) );
		save.setFileSelectionMode( JFileChooser.FILES_ONLY );
		int result = save.showSaveDialog( this );
		if( result == JFileChooser.CANCEL_OPTION )
		return;
		File outputfilename = save.getSelectedFile();
		if( outputfilename == null || outputfilename.getName().equals( "" ))
		{
			JOptionPane.showMessageDialog( this, "没有正确选择文件", "错误提示", JOptionPane.ERROR_MESSAGE );
		}
		else
		{
			try{
				if( output == null )output = new BufferedWriter( new FileWriter( outputfilename ) );
				buffer = new StringBuffer();
				String text;
				while( (text = input.readLine())!=null )
				{
					output.write( text );
					output.newLine();
					buffer.append( text+"\n" );
				}
				output.flush();
				input.close();
				output.close();
				input = null;
				output = null;
			}
			catch( IOException ioe)
			{
				JOptionPane.showMessageDialog( this, "打开文件出错", "错误提示", 
					JOptionPane.ERROR_MESSAGE );
			}
			writebutton.setEnabled( true );
		}
	}
	
	private void displayFileContent()
	{
		area.setText( buffer.toString() );
	}
	
	public static void main(String[] args)
	{
		StreamDemo1 demo = new StreamDemo1();
		demo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}

 

