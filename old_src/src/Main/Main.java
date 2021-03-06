package Main;

import misc.ArmyDataBaseConnector;
import misc.CoreGeneralConfig;
import misc.GuiGeneralConfig;
import Core.CoreGame;
import DesktopGUI.MainWindow;

// Special fonts have to be installed in  the ~/.fonts
/** @brief Class starting the game, load the graphic interface and the game core behind*/
public class Main {

	/**
	 * @brief Entry point for the application, start the Gui and the game behind
	 * @param args Application argument - not used
	 * */
	public static void main(String[] args) 
	{
		//Starting the Gui
		MainWindow window = new MainWindow();
		
		//Starting the Game core, that will handle the game
		CoreGame core = CoreGame.getCoreGameSingleton();
	}
}
