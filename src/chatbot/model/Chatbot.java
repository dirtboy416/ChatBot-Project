package chatbot.model;

import java.util.ArrayList;
/**
 * Model for the chatbot project. Contains methods for evaluating String.
 * @author jwah4895
 * @version 1.6
 */

import javax.swing.JOptionPane;

public class Chatbot
{
	/**
	 * Strings an ArrayList which pulls a value from the myMemes and the
	 * myColor.
	 */
	private ArrayList<String> myMemes;
	private ArrayList<String> myColors;
	private ArrayList<String> myRandomList;
	private ArrayList<String> myCarBrandList;
	private ArrayList<String> conversationList;
	
	public Chatbot()
	/**
	 * Initializes the methods.
	 */
	{
		myRandomList = new ArrayList<String>();
		myMemes = new ArrayList<String>();
		myColors = new ArrayList<String>();
		myCarBrandList = new ArrayList<String>();
		conversationList = new ArrayList<String>();
		
		fillTheMemeList();
		fillTheColorsList();
		fillTheRandomList();
		fillTheCarBrandList();
		fillTheConversationList();
	}

	/**
	 * Helper Method to fill the myRandomList with strings.
	 */
	private void fillTheRandomList()
	{
		myRandomList.add("penguins");
		myRandomList.add("Nathan");
		myRandomList.add("cat");
		myRandomList.add("Dude");
		myRandomList.add("thing");
		myRandomList.add("hospital");
		myRandomList.add("Boat");
		myRandomList.add("dog");
		
		 
		 

	}

	private void fillTheCarBrandList()
	{
		myCarBrandList.add("bentley");
		myCarBrandList.add("toyota");
		myCarBrandList.add("Pontiac");
		myCarBrandList.add("Jeep");
		myCarBrandList.add("Ford");
		/**
		 * Helper Method to fill the myCarBrandList with strings.
		 */
	}

	private void fillTheMemeList()
	/**
	 * Give the MemeList a value to look for.
	 */
	{
		myMemes.add("my jammies are rustled");
		myMemes.add("cats");
		myMemes.add("What does the fox say");
		myMemes.add("Philosoraptor");
		myMemes.add("iamdisappoint");
	}

	public String getRandomTopic()
	{
		/**
		 * Shoves in random words randomly into JOptionPane.showMessageDialog.
		 * 
		 */
		String randomTopic = "";

		double myRandomNumber = Math.random();
		int myRandomListPosition = (int) (myRandomNumber * myRandomList.size());
		randomTopic = myRandomList.get(myRandomListPosition);

		return randomTopic;
		/**
		 * Returns randomTopic.
		 */
	}
	
	public String getRandomMeme()
	{
		/**
		 * Shoves in random words randomly into JOptionPane.showMessageDialog.
		 * 
		 */
		String randomMeme = "";

		double myRandomNumber = Math.random();
		int myRandomMemePosition = (int) (myRandomNumber * myMemes.size());
		randomMeme = myMemes.get(myRandomMemePosition);

		return randomMeme;
		/**
		 * Returns the randomMeme.
		 */
	}

	public boolean memeChecker(String currentPhrase)
	{
		/**
		 * Checks your input and compares it to the arraylist to see if its a
		 * meme.
		 */
		boolean isMeme = false;

		if (currentPhrase != null)
			for (String currentMeme : myMemes)
			{
				if (currentPhrase.equalsIgnoreCase(currentMeme))
				{
					isMeme = true;
				}
			}

		return isMeme;
		/**
		 * Returns a value.
		 */
	}
	public String usesContent(String current)
	{
		/**
		 * Looks threw the users input and if it sees anything that has a value of boo it returns a string anything else it returns a different string.
		 */
		String processedString = "";
		if(current.contains("boo"))
		{
			processedString = " woooo scary!!!";
		}
		else 
		{
			processedString = "boooooring";
		}
		
		
		
		return processedString;
		/**
		 * Returns the value.
		 */
		
	}
	public String putNameInAlphabeticOrder(String first, String middle, String last)
	{
		/**
		 * its a string that compares a full name in alphabetical order.
		 */
		
		String sortedName = "";
		
		if(first.compareTo(middle) < 0)
		{
			if(first.compareTo(last) < 0)
			{
				if(middle.compareTo(last) < 0)
				{
					sortedName = first + ", " + middle + ", " + last;
				}
				else 
				{
					sortedName = first + ", " + last + ", " + middle;
				}
			}
			else
			{
				sortedName = last + ", " + first + ", " + middle;
			}
		}
		else 
		{
			if(middle.compareTo(last) < 0)
			{
				if(last.compareTo(first) < 0)
				{
					sortedName = middle + ", " + last + ", " + first;
				}
				else
				{
					sortedName = middle + ", " + first + ", " + last;
					
				}
			}
			
				else
				{
					sortedName = last + ", " + middle + ", " + first;
				}
			
		}
		
		
		return sortedName;
		/**
		 * returns the value of the sorted name
		 */
	}

	public boolean CarBrandChecker(String currentPhrase)
	{
		/**
		 * Checks your input and compares it to the Arraylist to see if its a
		 * car.
		 */
		boolean isCar = false;

		if (currentPhrase != null)
			for (String currentCar : myCarBrandList)
			{
				if (currentPhrase.equalsIgnoreCase(currentCar))
				{
					isCar = true;
				}
			}

		return isCar;
		/**
		 * Returns a value
		 */
	}

	private void fillTheColorsList()
	{
		myColors.add("red");
		myColors.add("blue");
		myColors.add("green");
		myColors.add("brown");
		myColors.add("orange");
		myColors.add("yellow");
		myColors.add("gray");
		myColors.add("purple");
		myColors.add("pink");
		myColors.add("tan");
		myColors.add("KTM orange");
		myColors.add("honda red");
		myColors.add("kawasaki green");
		myColors.add("suzuki yellow");
		/**
		 * Gives fillTheColorList a value.
		 */
	}

	public boolean ColorsChecker(String currentPhrase)
	/**
	 * Checks the users input and sees if it matches any of your colors in myColors
	 */
	{
		boolean isColors = false;

		if (currentPhrase != null)
			for (String currentColors : myColors)
			{
				if (currentPhrase.equalsIgnoreCase(currentColors))
				{
					isColors = true;
				}
			}

		return isColors;
		/**
		 * Checks dialog and compares it to your color input, and tests it.
		 */
	}
	private void fillTheConversationList()
	/**
	 * This method fills the fillTheConversationList.
	 */
	{
		conversationList.add("What else would you like to talk about?");
		conversationList.add("You want to talk about "
								+ " I think thats dumb!"
								+ "\n"
								+ " Lets talk about the weather. What do you think about the weather? ");
		conversationList.add("  You think the weather is"
				+ " What do you think of Motorcross?");
		conversationList.add(" Well I dont care what you think, whod do you think will win the championship!?");
		conversationList.add(" YOU THINK THAT  WILL WIN!!!!  HAHAHAH WHO DO YOU THINK YOU ARE !" );
		conversationList.add(" Well  was cute!!!  Are we like best friends?");
		conversationList.add(" well I dont care  cause you are just whatever!");
		conversationList.add(
						" well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"
								+ " well have a nice day!!!!!!!!!!!!!!!  well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!! well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!well have a nice day!!!!!!!!!!!!!!!vwell have a nice day!!!!!!!!!!!!!!!"
								+ "\n"

								+ " youre dumb!");
		
	}

	public ArrayList<String> conversationPiece()
	{
		
			
		
		return conversationList;
		/**
		 * Returns conversationList.
		 */
	}
	
		

	
}
