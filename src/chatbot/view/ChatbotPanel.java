package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatbotController;
import chatbot.model.Chatbot;

public class ChatbotPanel extends JPanel
/**
 * Establishes data members.
 */

{
	private ChatbotController baseController;
	private Chatbot appBot;
	private SpringLayout baseLayout;
	private JButton submitChatButton;
	private JTextField userTextField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private int clickCount;

	/**
	 * creates a Chatbot
	 * 
	 * @param baseController
	 */

	public ChatbotPanel(ChatbotController baseController)
	{
		this.baseController = baseController;
		this.appBot = baseController.getAppBot();

		submitChatButton = new JButton("Click here to type to the chatbot!");
		baseLayout = new SpringLayout();
		userTextField = new JTextField(30);
		chatArea = new JTextArea(10, 30);
		chatPane = new JScrollPane(chatArea);

		clickCount = 0;
		
		setupPanel();
		setupLayout();
		setupListener();
		setupChat();
	}

	/**
	 * Starts the chatbot chat screen with a topic.
	 */
	private void setupChat()

	{
		chatArea.setText(appBot.getRandomTopic());
//		chatArea.setText(appBot.getRandomMeme());
		
	}

	/**
	 * Loads all components into the panel and sets the layout manager and
	 * color.
	 */
	private void setupPanel()

	{
		this.setLayout(baseLayout);
		this.setBackground(Color.MAGENTA);
		
		this.add(submitChatButton);
		this.add(userTextField);
		this.add(chatPane);

		chatArea.setWrapStyleWord(true);
		chatArea.setLineWrap(true);

	}

	

	private void setupListener()
	/**
	 * Creates listeners for all user-interactive objects in the panel.
	 */
	
	{
		submitChatButton.addActionListener(new ActionListener()
		{
			
			
			 

			public void actionPerformed(ActionEvent click)
			/**
			 * This is a method that works when a selected number of clicks have occurred, then it will check threw your checkers. 
			 */
			{
				clickCount++;
				String userInput = userTextField.getText();
				
				if(clickCount % 7 ==0)
				{
					String currentPhrase = baseController.dominateTheConversation();
					if(currentPhrase.length() != 0)
					{
						chatArea.append("\n" + currentPhrase);
						clickCount--;
					} 
				}
					else if( clickCount % 5 ==0)
					{
						chatArea.append(baseController.memeValidation(userInput));
						
					}
					else if( clickCount % 4 ==0)
					{
						chatArea.append(baseController.colorValidation(userInput));
					}
					
					else if( clickCount % 3 ==0)
					{
						chatArea.append(baseController.carBrandValidation(userInput));
					}
				
				else
				{
					chatArea.append("\n" + userInput);
					
				
				String processedInput = baseController.processUserInput(userInput);
				chatArea.append(processedInput);
				userTextField.setText("");
				chatArea.append("\n" + appBot.getRandomTopic());
				//chatArea.append("\n" + appBot.getRandomMeme());
				
				//This should be a method in the controller that would be returned a string to place in the chatArea.
				String me, you, other;
				me = "Jake ";
				you = "Ryan ";
				other = "Devvin ";
				chatArea.append(appBot.putNameInAlphabeticOrder(me, you, other));
			

				// chatArea.append("smile! \n");
			}
		}
		});
	}
/**
 * Places all objects with the computer generated code.
 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, submitChatButton, 128,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, userTextField, 17,
				SpringLayout.SOUTH, submitChatButton);
		baseLayout.putConstraint(SpringLayout.WEST, userTextField, 102,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitChatButton, 17,
				SpringLayout.SOUTH, chatPane);
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 0,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 102,
				SpringLayout.WEST, this);
	}
}
