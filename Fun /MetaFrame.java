import javax.swing.JFrame;

public class MetaFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame("MetaFrame");		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(600, 600);

		MetaMask r = new MetaMask();

		frame.add(r);

		frame.setVisible(true);
	}
}
