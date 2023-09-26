package Assignment_04;

import java.util.*;

public class Game {
    // The function that states the rules
    public static void gameRules() {
        // Prints welcome message with into to the game
        System.out.println("Welcome to Lagkapten!\r\n");
        System.out.println(
                "To pass the time during long winters, the ancient Nordic people would play the two-player game of Lagkapten.\r\n "
                        + //
                        "You will have a chance to play this game, but your opponent will be the All-Father....");
        System.out.println("");
        // Prints the opponent name and symbol
        System.out.println("                     .d88888b.  8888888b. 8888888 888b    888 \r\n" + //
                "                    d88P\" \"Y88b 888  \"Y88b  888   8888b   888 \r\n" + //
                "                    888     888 888    888  888   88888b  888 \r\n" + //
                "                    888     888 888    888  888   888Y88b 888 \r\n" + //
                "                    888     888 888    888  888   888 Y88b888 \r\n" + //
                "                    888     888 888    888  888   888  Y88888 \r\n" + //
                "                    Y88b. .d88P 888  .d88P  888   888   Y8888 \r\n" + //
                "                     \"Y88888P\"  8888888P\" 8888888 888    Y888 \r\n" + //
                "                                                       \r\n" + //
                "                                                 ");
        System.out.print(
                "                                   @@.                                 \r\n" + //
                        "                                  @@@@@                                         \r\n" + //
                        "                                @@@@@@@@.     @%                                \r\n" + //
                        "                               @@@@% @@@@&  %@@@@                               \r\n" + //
                        "                             #@@@@.   /@@@*@@@@@@@/                             \r\n" + //
                        "                            @@@@@  @@@  &*@@@@(@@@@@                            \r\n" + //
                        "                          *@@@@. /@@@@@.@@@@@(. ,@@@@,                          \r\n" + //
                        "                         @@@@@  @@@@@@@@##@%@@@&  @@@@@                         \r\n" + //
                        "                       ,@@@@* ,@@@@* %@@@@  #@@@@  (@@@@.                       \r\n" + //
                        "                      @@@@@  &@@@@  @@ @@@@( .@@@@#  @@@@&                      \r\n" + //
                        "                    .@@@@(  @@@@* .@@@@,&@@@@  @@@@@  %@@@@                     \r\n" + //
                        "                   %@@@@@@@@@@@@,&@@@@#@@@@@@@@@@@@@@/  @@@@#                   \r\n" + //
                        "                 ,@@@@@@@@@@@@@ @@@@(@@@@@@@@@@@@@@@@@@  &@@@@                  \r\n" + //
                        "                       &@@@@. #@@@@,,,,,,,,,.@@@@ .,,,,,,,*@@@@(                \r\n" + //
                        "                      @@@@@  @@@@@@@@@@@@@@@@/@@@@#(@@@@@@@@@@@@@               \r\n" + //
                        "                    #@@@@*                     ,@@@@                            \r\n" + //
                        "                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(                          \r\n" + //
                        "                 (@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n\r");
        System.out.println("");

        System.out.println("The game is similar to rock, paper, scissors. However there are some twist.");
        System.out.println(
                "During each round, you will choose a \"move\", which may be either Olserod, Knarrevik, Utespelare, Yngvar, or Meltorp.");
        System.out.println("Each move can beat another, or be beaten by another. See below:\r\n");
        System.out.print(
                "// Meltorp -> Utespelare, Olserod\r" + //
                        "// Utespelare -> Knarrevik, Yngvar\r\n" + //
                        "// Knarrevik -> Melltorp, Olserod\r\n" + //
                        "// Olserod -> Yngvar, Utespelare\r\n" + //
                        "// Yngvar -> Melltorp, Knarrevik\r\n");
        System.out.println("");
        System.out
                .println(
                        "However, if both you and Odin pick the same move, Odin wins. He is the All-Father afterall.");

    }

    // Ask user if they would like to play a round
    public static boolean askYorN() {
        // Variables for function
        boolean falseInput = true;
        String userChoice = "";
        boolean continueGame = false;
        Scanner userInput = new Scanner(System.in);
        // Checks if falseInput is true, code needs to run once for it to get through
        // user prompts.
        while (falseInput) {
            System.out.println("Would you like to play? Press 'y' for Yes, or 'n' for No.");
            userChoice = userInput.next();
            userChoice = userChoice.toLowerCase();
            if (userChoice.equals("y")) {
                System.out.println("\r\nFor Valhalla!");
                continueGame = true;
                falseInput = false;
            } else if (userChoice.equals("n")) {
                System.out.println("\r\nMay the brave deeds you performed in life echo in your great hall.\r\n");
                falseInput = false;
            } else {
                System.out.print(
                        "The gods did not understand your answer, please try with the correct choice (choose either 'y' or 'n' on the keyboard).\r\n");
            }
        }
        return continueGame;

    }

    // A function to return a random number between 1 and 5
    public static int randomChoice() {
        Random rand = new Random();
        int randNumber = rand.nextInt(5) + 1;
        return randNumber;
    }

    // Function that has all the 5 possible choices to play the game
    public static HashMap<Integer, String> moveDictionary() {
        // Create a HashMap to make a "dictionary" of all the possible choices
        HashMap<Integer, String> moveDictionary = new HashMap<Integer, String>();
        moveDictionary.put(1, "Melltorp");
        moveDictionary.put(2, "Utespelare");
        moveDictionary.put(3, "Knarrevik");
        moveDictionary.put(4, "Olserod");
        moveDictionary.put(5, "Yngvar");
        return moveDictionary;
    }

    // A function that will take input if user, but will take number if computer.
    public static String moveSelection(HashMap<Integer, String> moveDictionary, int keySelection, boolean isUser) {
        int moveChoice = 0;
        String move = "";
        // Checks if passed user boolean and if it is true, it will run user prompts
        if (isUser) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please select using numbers listed next to the option\r\n");
            // loop to run through the "dictionary" of moves and prints to the user
            for (int i : moveDictionary.keySet()) {
                System.out.println(i + ".)" + moveDictionary.get(i));
            }
            // takes user input

            // If user types a string, the game crashes. Need to fix
            moveChoice = userInput.nextInt();
            // Checks if choice is equal to 0 or greater than 5, it will prompt the user to
            // try again.
            while (((moveChoice <= 0) || (moveChoice > 5))) {
                System.out.println("Please choose a number between 1 and 5 on the keyboard.");
                moveChoice = userInput.nextInt();
            }
            // A for loop for if the user choice matches a key index of the dictionary, to
            // save the move in move variable.
            for (int i : moveDictionary.keySet()) {
                if (moveChoice == i) {
                    move = moveDictionary.get(i);
                }
            }
            // Runs this else statement if user boolean is false and is computer,
            // keyselection is for the random number function as an input.
        } else {
            moveChoice = keySelection;
            for (int i : moveDictionary.keySet()) {
                if (moveChoice == i) {
                    move = moveDictionary.get(i);
                }
            }
        }
        return move;
    }

    // Function to check two inputs and verify one is the winner.
    public static String checkforwinner(String userChoice, String computerChoice) {
        // Create winner variable to return later
        String winner = "";
        // Print the player's and the computer's choices
        System.out.println("\r\nYou chose " + userChoice);
        System.out.println("Odin chose " + computerChoice);
        // If statement to check if computer and user match, and if they do computer
        // wins.
        // else if for what the user picks and if it beats the computer choice.
        // else the computer wins the round.
        if (userChoice.equals(computerChoice)) {
            System.out.println("Odin wins this round!");
            winner += "odin";
        } else if (userChoice.equals("Melltorp")
                && (computerChoice.equals("Utespelare") || computerChoice.equals("Olserod"))) {
            System.out.println("You won this round!\r\n");
            winner += "user";
        } else if (userChoice.equals("Utespelare")
                && (computerChoice.equals("Knarrevik") || computerChoice.equals("Yngvar"))) {
            System.out.println("You won this round!\r\n");
            winner += "user";
        } else if (userChoice.equals("Knarrevik")
                && (computerChoice.equals("Melltrop") || computerChoice.equals("Olserod"))) {
            System.out.println("You won this round!\r\n");
            winner += "user";
        } else if (userChoice.equals("Olserod")
                && (computerChoice.equals("Yngvar") || computerChoice.equals("Utespelare"))) {
            System.out.println("You won this round!\r\n");
            winner += "user";
        } else if (userChoice.equals("Yngvar")
                && (computerChoice.equals("Melltrop") || computerChoice.equals("Knarrevik"))) {
            System.out.println("You won this round!\r\n");
            winner += "user";
        } else {
            System.out.println("Odin wins this round!\r\n");
            winner += "odin";
        }
        // Returns the winner.
        return winner;
    }

    // JUnit test function to test all outcomes of checkWinner function

    public static void main(String[] args) {
        // Game variables
        int roundsPlayed = 0;
        int userWonRound = 0;
        int computerWonRound = 0;
        String userChoice = "";
        String computerChoice = "";
        boolean continueGame = true;
        String winner = "";
        // State the rules
        gameRules();
        // Ask user if they would like to play a round
        // If 'y' then the round is played
        // If 'no' then the program stops
        // Until user types 'n', another round is played.
        continueGame = askYorN();
        while (continueGame) {
            // How the game works
            // The user is asked to enter a move, which may be either Olserod, Knarrevik,
            // Utespelare, Yngvar, or Melltorp.
            // The program should continue to prompt the
            // user until a valid move is entered.
            // For user choice, moveSelection function should have a keySelection of 0 to
            // work.
            userChoice += moveSelection(moveDictionary(), 0, true);
            // The computer makes a move at random by passing randomChoice function to
            // keySelection in moveSelection function.
            computerChoice += moveSelection(moveDictionary(), randomChoice(), false);
            // Print computer's move, user's move, and who won.

            roundsPlayed++;
            // Print computer's move, user's move, and who won.
            winner = checkforwinner(userChoice, computerChoice);
            if (winner.equals("odin")) {
                computerWonRound++;
            } else {
                userWonRound++;
            }
            userChoice = "";
            computerChoice = "";
            // Prompt the user if they would like to play again.
            continueGame = askYorN();
        }
        // When the user says 'n', the program prints the number of
        // rounds played
        System.out.println("Number of rounds played: " + roundsPlayed);
        // times the user won
        System.out.println("How many times you won: " + userWonRound);
        // times the computer won
        System.out.println("How many times Odin won: " + computerWonRound);
        // Print yggdrasil tree for the hell of it.
        System.out.print(
                "                             %%  #%  %%.%%  %%% #%                              \r\n" + //
                        "                         % / .(%%#   %% # %%    #%%/ % %                        \r\n" + //
                        "                    %%%%# % (% #%%#%%%%% % %%%% #. %% #  %##%                   \r\n" + //
                        "                 % % % .   %%%% ,%%% %%%%%%%%*%   %.%%%    ( %#%                \r\n" + //
                        "               #%%/#%/ %.%%  %%%%%   *%%%%% %%  %%  %%  %  #%% %%%/             \r\n" + //
                        "             %%#%  %%%,#%#%  %%%%%%%# %%%% %%%  ##%%%%%%%%%%#%%/% %%            \r\n" + //
                        "           #.%%.       %%% %      %%%%%%%%   %%%%    %%   %%#%    #%, (         \r\n" + //
                        "          %,%%   .% %%  %%%, %%%%%%%%%%%%%%%%% (  % (% #%%   % /%  %% %         \r\n" + //
                        "        % %    %%%% %%%%%%%%%%%  %/%%%%%%%%%/ %% % #%%%%%%%%%%%%%%% , % %       \r\n" + //
                        "        %  % % %%*  %   %%  %%%%%%*   %%%%%%  %%%%%%%#  /%%    %%% ./%  %.      \r\n" + //
                        "       %%%, %#%  %#  %%/%   %%   %%%%%%%%%%%%%%%%%  %%%  .% %%  %% #%  %%       \r\n" + //
                        "      # %%(% %%      %       #%%   %%%%%%%%%%%     %%*    %   #  (% #  %( /     \r\n" + //
                        "      %% %#   %                      %%%%%%%%%                     %# #%  %     \r\n" + //
                        "     % %% %                           %%%%%%%%                        % %% %    \r\n" + //
                        "     %.  % ,                          %%%%%%%                         (%  %     \r\n" + //
                        "     /  % #                           %%%%%%%                         # %  %    \r\n" + //
                        "      %# % #                         %%%%%%%%                         /, %%     \r\n" + //
                        "      %/  %%                       %%%%%%%%%%#                       #%  %%     \r\n" + //
                        "       % %%,%                     %%%%%%%%%%%%%%                      %%        \r\n" + //
                        "        %#%. %                %%%%%%%%%%%%%%%%%%%%%                % .%%%       \r\n" + //
                        "         %%   %% .%%%%%%%%%%%%%%%   %%%%%%%%%    %%%%%%%%%%%%%.  %% # %%        \r\n" + //
                        "          % % .% %%,( #%%%%%%   %%%%%%%   %%%%%%%%  %%%%#%** %%/# % % %         \r\n" + //
                        "           % #% / ,  %%   %% %%    %%# %.% (%%.   %% %%.  %%   # /(# %          \r\n" + //
                        "              % %%  /     %% %  % % %# % %  %% (   % %%     *. %*%#             \r\n" + //
                        "                /%%%  %( %  % %  %   % %/% %   %, % %% %  %  %##%               \r\n" + //
                        "                   %%. %/  %%%%((% #%  % #. .% %%.#% %   %%.*%                  \r\n" + //
                        "                      #%  %# %  %.   #%% #%%    %  % #   ##                     \r\n" + //
                        "                            %%  %##%    %   %%# % #.#                           \r\n" + //
                        "                                    %#%%%%%%#\r\n");
        // Thank you for playing message.
        System.out.println("Thanks for playing!");
    }
}