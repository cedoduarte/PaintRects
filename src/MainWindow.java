import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
	public static void main(String[] args) {
		MainWindow w = new MainWindow();
		w.setVisible(true);
	}
	
	private MyRectangle filledRect;
	private MyRectangle rect;
	private JButton moveButton;
	
	public MainWindow() {
		super("Paint");
		setup();
		init();		
	}
	
	private void setup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(600, 600);
		setLocationRelativeTo(null);
	}
	
	private void init() {
		filledRect = makeFilledRectangle();
		rect = makeRectangle();
		moveButton = makeMoveButton();
	}
	
	private MyRectangle makeFilledRectangle() {
		MyRectangle filledRect = new MyRectangle();
		filledRect.setX(100);
		filledRect.setY(100);
		filledRect.setW(50);
		filledRect.setH(50);
		filledRect.setFilled(false);
		filledRect.setColor(Color.RED);
		return filledRect;
	}
	
	private MyRectangle makeRectangle() {
		MyRectangle rect = new MyRectangle();
		rect.setX(300);
		rect.setY(300);
		rect.setW(60);
		rect.setH(60);
		rect.setFilled(true);
		rect.setColor(Color.GREEN);
		return rect;
	}
	
	private JButton makeMoveButton() {
		JButton button = new JButton("Move rects");		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow.this.setTitle("Move button clicked");
				rect.setX(rect.getX() + 10);
				filledRect.setY(filledRect.getY() + 30);
				MainWindow.this.repaint();
			}
		});
		add(button);
		return button;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		filledRect.paint(g);
		rect.paint(g);
	}
}
