package chatbot.controller;

import java.util.ArrayList;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;

/**
 * removed The references to the popup view. Added documentation.
 * 
 * @author jwah4895
 * @version 1.5 10/31/13 Adding model to the project and changed GUI load. Added
 *          a getter for the Chatbot. Remove the references to the popup view. Added conversation helper and memeValidation.
 *          Added documentation.
 */

public class ChatbotController
{

	// private ChatbotView appView;
	private Chatbot appBot;
	private ChatbotFrame appFrame;

	public ChatbotController()
	{
		/**
		 * Tells it what to show in the controller.
		 */
		// appView = new ChatbotView();
		appBot = new Chatbot();
	}

	public Chatbot getAppBot()
	{
		return appBot;
		/**
		 * Returns appBot.
		 */
	}

	public void start()
	{
		appFrame = new ChatbotFrame(this);

		/**
		 * Tells it what to run.
		 */
		// appView.showApp();
	}
	public String memeValidation(String currentInput)
	/**
	 * This method strings memeChecker and then test it will memeValidation it will return an answer.
	 */
	{
		String memeReaction = "\n" + "why aren't you talking about the memes? ";
		if(appBot.memeChecker(currentInput))
		{
			memeReaction = currentInput + "\n" + "is the coolest meme huh! ";
		}
		return memeReaction;
		/**
		 * Returns the memeReaction.
		 */
	}		
	

		public String carBrandValidation(String currentInput)
		/**
		 * This method strings memecarBrandChecker and then test it will carBrandValidation it will return an answer.
		 */
		{
			String carBrandReaction = "\n" + "why aren't you talking about the cars? ";
			if(appBot.CarBrandChecker(currentInput))
			{
				carBrandReaction = currentInput + "\n" + "is the coolest car brand huh! ";
			}
			return carBrandReaction;
			/**
			 * Return the carBrandReaction.
			 */
			
	}
		
		public String colorValidation(String currentInput)
		/**
		 * This method strings colorsChecker and then test it will colorValidation it will return an answer.
		 */
		{
			String colorsReaction = "\n" + "why aren't you talking about the colors? ";
			if(appBot.ColorsChecker(currentInput))
			{
				colorsReaction = currentInput + "\n" + "is the coolest color huh! ";
			}
			return colorsReaction;
			/**
			 * Return the colorsReaction.
			 */
			
	}
	private String conversationHelper(ArrayList<String> currentList)
	/**
	 * Helps pull out sections of your conversation pieces, this returns phrases.
	 */
	{
		String currentPhrase = "";
		if(currentList.size() > 0)
		{
			currentPhrase = currentList.remove(0);
		}
	
		
	return currentPhrase;
	/**
	 * Returns the currentPhrase.
	 */
		
	}

	public String dominateTheConversation()
	/**
	 * This gets puts your conversation piece in.
	 */
	{
		String currentConversationpiece = "";
		
		currentConversationpiece  = conversationHelper(appBot.conversationPiece());
		
		
		return currentConversationpiece;
		/**
		 * Returns the currentConversationpiece.
		 */
	}
	
	
	public String processUserInput(String currentInput)
	/**
	 * Sets a variable and then sends it back.
	 */
	{
		String response = "";

		if (appBot.memeChecker(currentInput))
		{
			response = "memes!!!";
		}
		else if (true)
		{

		}

		return response;
		/**
		 * Returns the response.
		 */
	}

}
