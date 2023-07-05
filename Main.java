import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.imageio.ImageIO;

public class Main {
    private static List<Episode> episodes;
    private static int score = 0;
  private static int trys = 0;
  private static int index;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeEpisodes();

        playGame();
    }

    private static void initializeEpisodes() {
        episodes = new ArrayList<>();

        episodes.add(new Episode("Pilot","s1e1", "pilot.jpg"));
        episodes.add(new Episode("Spellingg Bee","s1e2", "spellingbee.jpg"));
        episodes.add(new Episode("Speak Now or Forever Hold Your Piece","s1e3", "s1e3.jpg"));
      episodes.add(new Episode("Woman Seeking Dead Husband - Smokers Okay, No Pets","s1e4", "s1e4.jpg"));
      episodes.add(new Episode("9 Lives","s1e5", "9lives.jpg"));
      episodes.add(new Episode("Weekend Warriors","s1e6", "s1e6.jpg"));
      episodes.add(new Episode("Who Ya Gonna Call?","s1e7", "s1e7.jpg"));
      episodes.add(new Episode("Shawn Vs. The Red Phantom","s1e8", "s1e8.jpg"));
      episodes.add(new Episode("Forget Me Not","s1e9", "s1e9.jpg"));
      episodes.add(new Episode("From the Earth to Starbucks","s1e10", "s1e10.jpg"));
      episodes.add(new Episode("He Loves Me, He Loves Me Not, He Loves Me, Oops He's Dead","s1e11", "s1e11.jpg"));
      episodes.add(new Episode("Cloudy...With A Chance Of Murder","s1e12", "s1e12.jpg"));
      episodes.add(new Episode("Game Set... Muuurder","s1e13", "s1e13.jpg"));
      episodes.add(new Episode("Poker? I Barely Now Her","s1e14", "s1e14.jpg"));
      episodes.add(new Episode("Scary Sherry: Bianca's Toast","s1e15", "s1e15.jpg"));
      episodes.add(new Episode("American Duos","s2e1", "s2e1.jpg"));
        episodes.add(new Episode("65 Million Years Off","s2e2", "s2e2.jpg"));
        episodes.add(new Episode("Psy vs. Psy","s2e3", "s2e3.jpg"));
        episodes.add(new Episode("Zero to Murder in Sixty Seconds","s2e4", "s2e4.jpg"));
        episodes.add(new Episode("And Down The Stretch Comes Murder","s2e5", "s2e5.jpg"));
        episodes.add(new Episode("Meat Is Murder, But Murder Is Also Murder","s2e6", "s2e6.jpg"));
        episodes.add(new Episode("If You're So Smart, Then Why Are You Dead?","s2e7", "s2e7.jpg"));
        episodes.add(new Episode("Rob-a-Bye Baby","s2e8", "s2e8.jpg"));
        episodes.add(new Episode("Bounty Hunters!","s2e9", "s2e9.jpg"));
        episodes.add(new Episode("Gus' Dad May Have Killed An Old Guy!","s2e10", "s2e10.jpg"));
        episodes.add(new Episode("There's Something About Mira","s2e11", "s2e11.jpg"));
        episodes.add(new Episode("The Old and the Restless","s2e12", "s2e12.jpg"));
        episodes.add(new Episode("Lights, Camera... Homicidio","s2e13", "s2e13.jpg"));
        episodes.add(new Episode("Dis-Lodged","s2e14", "s2e14.jpg"));
        episodes.add(new Episode("Black and Tan: A Crime of Fashion","s2e15", "s2e15.jpg"));
        episodes.add(new Episode("Shawn (and Gus) of the Dead","s2e16", "s2e16.jpg"));
      episodes.add(new Episode("Ghosts", "s3e1", "s3e1.jpg"));
        episodes.add(new Episode("Murder?... Anyone?... Anyone?... Bueller?", "s3e2", "s3e2.jpg"));
        episodes.add(new Episode("Daredevils!", "s3e3", "s3e3.jpg"));
        episodes.add(new Episode("The Greatest Adventure in the History of Basic Cable", "s3e4", "s3e4.jpg"));
        episodes.add(new Episode("Disco Didn't Die. It Was Murdered!", "s3e5", "s3e5.jpg"));
        episodes.add(new Episode("There Might Be Blood", "s3e6", "s3e6.jpg"));
        episodes.add(new Episode("Talk Derby to Me", "s3e7", "s3e7.jpg"));
        episodes.add(new Episode("Gus Walks into a Bank", "s3e8", "s3e8.jpg"));
        episodes.add(new Episode("Christmas Joy", "s3e9", "s3e9.jpg"));
        episodes.add(new Episode("Six Feet Under the Sea", "s3e10", "s3e10.jpg"));
        episodes.add(new Episode("Lassie Did a Bad, Bad Thing", "s3e11", "s3e11.jpg"));
        episodes.add(new Episode("Earth, Wind, and... Wait for It", "s3e12", "s3e12.jpg"));
        episodes.add(new Episode("Any Given Friday Night at 10PM, 9PM Central", "s3e13", "s3e13.jpg"));
        episodes.add(new Episode("Truer Lies", "s3e14", "s3e14.jpg"));
        episodes.add(new Episode("Tuesday the 17th", "s3e15", "s3e15.jpg"));
        episodes.add(new Episode("An Evening with Mr. Yang", "s3e16", "s3e16.jpg"));
      
         episodes.add(new Episode("Extradition: British Columbia", "s4e1", "s4e1.jpg"));
        episodes.add(new Episode("He Dead", "s4e2", "s4e2.jpg"));
        episodes.add(new Episode("High Noon-ish", "s4e3", "s4e3.jpg"));
        episodes.add(new Episode("The Devil's in the Details... and in the Upstairs... and in the Script", "s4e4", "s4e4.jpg"));
        episodes.add(new Episode("Shawn Gets the Yips", "s4e5", "s4e5.jpg"));
        episodes.add(new Episode("Bollywood Homicide", "s4e6", "s4e6.jpg"));
        episodes.add(new Episode("High Top Fade Out", "s4e7", "s4e7.jpg"));
        episodes.add(new Episode("Let's Get Hairy", "s4e8", "s4e8.jpg"));
        episodes.add(new Episode("Shawn Takes a Shot in the Dark", "s4e9", "s4e9.jpg"));
        episodes.add(new Episode("You Can't Handle This Episode", "s4e10", "s4e10.jpg"));
        episodes.add(new Episode("Thrill Seekers And Hell-Raisers", "s4e11", "s4e11.jpg"));
        episodes.add(new Episode("A Very Juliet Episode", "s4e12", "s4e12.jpg"));
        episodes.add(new Episode("Death is in the Air", "s4e13", "s4e13.jpg"));
        episodes.add(new Episode("Think Tank", "s4e14", "s4e14.jpg"));
        episodes.add(new Episode("The Head, the Tail, the Whole Damn Episode", "s4e15", "s4e15.jpg"));
       episodes.add(new Episode("Mr. Yin Presents...", "s4e16", "s4e16.jpg"));
      
      episodes.add(new Episode("Romeo and Juliet and Juliet", "s5e1", "s5e1.jpg"));
        episodes.add(new Episode("Feet Don't Kill Me Now", "s5e2", "s5e2.jpg"));
        episodes.add(new Episode("Not Even Close... Encounters", "s5e3", "s5e3.jpg"));
        episodes.add(new Episode("Chivalry Is Not Dead... But Someone Is", "s5e4", "s5e4.jpg"));
        episodes.add(new Episode("Shawn and Gus in Drag (Racing)", "s5e5", "s5e5.jpg"));
        episodes.add(new Episode("Viagra Falls", "s5e6", "s5e6.jpg"));
        episodes.add(new Episode("Ferry Tale", "s5e7", "s5e7.jpg"));
        episodes.add(new Episode("Shawn 2.0", "s5e8", "s5e8.jpg"));
        episodes.add(new Episode("One, Maybe Two, Ways Out", "s5e9", "s5e9.jpg"));
        episodes.add(new Episode("Extradition II: The Actual Extradition Part", "s5e10", "s5e10.jpg"));
        episodes.add(new Episode("In Plain Fright", "s5e11", "s5e11.jpg"));
        episodes.add(new Episode("Dual Spires", "s5e12", "s5e12.jpg"));
        episodes.add(new Episode("We'd Like to Thank the Academy", "s5e13", "s5e13.jpg"));
        episodes.add(new Episode("The Polarizing Express", "s5e14", "s5e14.jpg"));
        episodes.add(new Episode("Dead Bear Walking", "s5e15", "s5e15.jpg"));
        episodes.add(new Episode("Yang 3 in 2D", "s5e16", "s5e16.jpg"));
      
         episodes.add(new Episode("Shawn Rescues Darth Vader", "s6e1", "s6e1.jpg"));
        episodes.add(new Episode("Last Night Gus", "s6e2", "s6e2.jpg"));
        episodes.add(new Episode("This Episode Sucks", "s6e3", "s6e3.jpg"));
        episodes.add(new Episode("The Amazing Psych-Man & Tap Man, Issue #2", "s6e4", "s6e4.jpg"));
        episodes.add(new Episode("Dead Man's Curveball", "s6e5", "s6e5.jpg"));
        episodes.add(new Episode("Shawn, Interrupted", "s6e6", "s6e6.jpg"));
        episodes.add(new Episode("In for a Penny...", "s6e7", "s6e7.jpg"));
        episodes.add(new Episode("The Tao of Gus", "s6e8", "s6e8.jpg"));
        episodes.add(new Episode("Neil Simon's Lover's Retreat", "s6e9", "s6e9.jpg"));
        episodes.add(new Episode("Indiana Shawn and the Temple of the Kinda Crappy, Rusty Old Dagger", "s6e10", "s6e10.jpg"));
        episodes.add(new Episode("Heeeeere's Lassie", "s6e11", "s6e11.jpg"));
        episodes.add(new Episode("Shawn and the Real Girl", "s6e12", "s6e12.jpg"));
        episodes.add(new Episode("Let's Doo-Wop It Again", "s6e13", "s6e13.jpg"));
        episodes.add(new Episode("Autopsy Turvy", "s6e14", "s6e14.jpg"));
        episodes.add(new Episode("True Grits", "s6e15", "s6e15.jpg"));
        episodes.add(new Episode("Santabarbaratown", "s6e16", "s6e16.jpg"));

      episodes.add(new Episode("Santabarbaratown 2", "s7e1", "s7e1.jpg"));
        episodes.add(new Episode("Juliet Takes a Luvvah", "s7e2", "s7e2.jpg"));
        episodes.add(new Episode("Lassie Jerky", "s7e3", "s7e3.jpg"));
        episodes.add(new Episode("No Country for Two Old Men", "s7e4", "s7e4.jpg"));
        episodes.add(new Episode("100 Clues", "s7e5", "s7e5.jpg"));
        episodes.add(new Episode("Cirque du Soul", "s7e6", "s7e6.jpg"));
        episodes.add(new Episode("Deez Nups", "s7e7", "s7e7.jpg"));
        episodes.add(new Episode("Right Turn or Left for Dead", "s7e8", "s7e8.jpg"));
        episodes.add(new Episode("Juliet Wears the Pantsuit", "s7e9", "s7e9.jpg"));
        episodes.add(new Episode("Santabarbarian Candidate", "s7e10", "s7e10.jpg"));
        episodes.add(new Episode("Office Space", "s7e11", "s7e11.jpg"));
        episodes.add(new Episode("Dead Air", "s7e12", "s7e12.jpg"));
        episodes.add(new Episode("Nip and Suck It!", "s7e13", "s7e13.jpg"));
      episodes.add(new Episode("No Trout About It", "s7e14", "s7e14.jpg"));
      episodes.add(new Episode("Psych: The Musical", "s7e15", "s7e15.jpg"));

         episodes.add(new Episode("Lock, Stock, Some Smoking Barrels and Burton Guster's Goblet of Fire", "s8e1", "s8e1.jpg"));
        episodes.add(new Episode("S.E.I.Z.E. the Day", "s8e2", "s8e2.jpg"));
        episodes.add(new Episode("Remake A.K.A. Cloudy... With a Chance of Improvement", "s8e3", "s8e3.jpg"));
        episodes.add(new Episode("Someone's Got a Woody", "s8e4", "s8e4.jpg"));
        episodes.add(new Episode("COG Blocked", "s8e5", "s8e5.jpg"));
        episodes.add(new Episode("1967: A Psych Odyssey", "s8e6", "s8e6.jpg"));
        episodes.add(new Episode("Shawn and Gus Truck Things Up", "s8e7", "s8e7.jpg"));
        episodes.add(new Episode("A Touch of Sweevil", "s8e8", "s8e8.jpg"));
        episodes.add(new Episode("A Nightmare on State Street", "s8e9", "s8e9.jpg"));
        episodes.add(new Episode("The Break-Up", "s8e10", "s8e10.jpg"));



        // Add more episodes and frame paths as needed
    }
  
    private static void getRandomIndex() {
        Random random = new Random();
        index = random.nextInt(episodes.size());
    }

    private static void playGame() {
      Image display = new Image();
      while(score >= -1){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Input your answer either by typing the name of the episode EXACTLY, or by entering the season and episode number Ex: \"Pilot\" or \"s1e1\" Enter \"X\" to stop the game");
        getRandomIndex();
      display.displayImage(episodes.get(index).getFrame());
      System.out.println(score + "/" + trys);
        System.out.print("Guess: ");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase(episodes.get(index).getTitle()) || answer.equalsIgnoreCase(episodes.get(index).getEpNum()) ){
          score++;
          trys++;
        }  else if (answer.equalsIgnoreCase("X")) {  break;  }
           else{     trys++;
        }
        episodes.remove(index);
        if(episodes.size() == 0){ break; }
        }
      
      System.out.println("Game Over! You got " + (double)score/trys * 100 + "% correct."); 
      if(((double)score/trys * 100) == 100){
        System.out.println("You're the Psych Master!"); 
      } else if(((double)score/trys * 100) >= 90){
        System.out.println("You really looove this show!");
      } else if(((double)score/trys * 100) >= 80){
        System.out.println("You like Psych, Don't you?");
    } else  if(((double)score/trys * 100) >= 60){
        System.out.println("You should be ashamed to call yourself a fan.");
      } else  {
        System.out.println("you definitely have never seen Psych, watch the show please.");
      }
    }
}





