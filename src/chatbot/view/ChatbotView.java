package chatbot.view;

import javax.swing.JOptionPane;
/**
 * GUI VIew for the chatbot project.
 * @author jwah4895
 * @version 1.3 10/13/13
 */
import chatbot.model.Chatbot;
public class ChatbotView

{
	/**
	 * Chatbot view used for internal chat methods.
	 * 
	 */
	
	private Chatbot myChatbot;
	
	public ChatbotView()
	/**
	 * Makes new chatbot to myChatbot.
	 */
	{
		myChatbot = new Chatbot();
		
	}
	
	public void showApp()
	/**
	 * Shows the showApp method.
	 */
	{
		String input = "keep going";

		while (input == null || !input.equals("no"))
		{
//			JOptionPane.showMessageDialog(null, myChatbot.getRandomTopic());
			JOptionPane.showMessageDialog(null, myChatbot.getRandomMeme());
			input = getInput();
			useInput(input);
		}
		myChatbot.conversationPiece();
		/**
		 * Captures the users input based on a question.
		 * @returns The String object typed by the user.
		 */
	}

 
	private String getInput()
	/**
	 * strings input.
	 */
	{
		String input = "";
		input = JOptionPane
				.showInputDialog("What do you want to talk with about?");

		return input;
		/**
		 * Returns input.
		 */

	}
	/**
	 * 
	 * @param userInput
	 */
	private void useInput(String userInput)
	{
		if(myChatbot.memeChecker(userInput))
		{
			JOptionPane.showMessageDialog(null, "I knew that " + userInput + " is a meme!!");
		}
		if(myChatbot.ColorsChecker(userInput))
		{
			JOptionPane.showMessageDialog(null, "I knew that " + userInput + " is a color!!");
		}
		if(myChatbot.CarBrandChecker(userInput))
		{
			JOptionPane.showMessageDialog(null, "I knew that " + userInput + " is a Car Brand!!");
		}
		JOptionPane.showMessageDialog(null,
				"Wow that is so interesting that you want to talk with me about "
						+ userInput);
/**
 * Gives a answer to the user with a pulled in value from the checkers if it pass the test.
 */
	}
	
}
