


	import javax.swing.JFrame;
	import javax.swing.JOptionPane;

	public class GameFrame extends JFrame implements GameConstants {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public GameFrame(){
			setSize(GAME_WIDTH,GAME_HEIGHT);
			
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Board board = new Board(askUser());
			setResizable(true);
			setTitle("DOT BALLS-2017");
			add(board);
			setVisible(true);
			//setLocation(100, 100);
		}
		
		private int askUser(){
			int noOfBalls = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the No of Balls"));
			return noOfBalls;
		}
		public static void main(String[] args) {
			GameFrame obj= new GameFrame();
			

	}

	}
