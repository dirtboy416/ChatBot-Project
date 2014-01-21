package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatbotController;

public class ChatbotFrame extends JFrame
/**
 * Establishes data members.
 */
{
	private ChatbotController baseController;
	private ChatbotPanel basePanel;

	public ChatbotFrame(ChatbotController baseController)
	/**
	 * Sets up the chatbot frame.
	 */
	{
		this.baseController = baseController;
		basePanel = new ChatbotPanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	/**
	 * Sets up the chatbot frame.
	 */
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
