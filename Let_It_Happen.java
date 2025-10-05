import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Let_It_Happen {
    public static void main() throws InterruptedException {
        /*

        String[] Lyrics = {"Try", "to", "get", "through", "it", "try", "to", "push", "through", "it",
        "You", "were", "not", "thinking", "that", "I", "will", "not", "do", "it",
        "They", "be", "lovin'", "someone", "and", "I'm", "another", "story",
        "Take", "the", "next", "ticket", "get", "the", "next", "train",
        "Why", "would", "I", "do", "it?", "Anyone'd", "think", "that..."};

        for(String words : Lyrics){
            System.out.print(words+" ");
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println();

         */


        /*
                String[] lyrics = {
                        "I cannot vanish", "you will not scare me",
                        "Try to get through it", "try to push through it",
                        "You were not thinking that", "I will not do it",
                        "They be lovin' someone", "and I'm another story",
                        "Take the next ticket", "get the next train",
                        "Why would I do it?", "Anyone'd think that"
                };

                for (String line : lyrics) {
                    System.out.println(line);

                    try {
                        Thread.sleep(1900); // 1.8 seconds pause between lines
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

         */


        String[] part1 = {"I", "cannot", "vanish", "you", "will", "not", "scare", "me"};
        String[] part2 = {"Try", "to", "get", "through", "it"};
        String[] part3 = {"Try", "to", "push", "through", "it"};
        String[] part4 = {"You", "were", "not", "thinking", "that", "I", "will", "not", "do", "it"};
        String[] part5 = {"They", "be", "lovin'", "someone", "and", "I'm", "another", "story"};
        String[] part6 = {"Take", "the", "next", "ticket", "get", "the", "next", "train"};
        String[] part7 = {"Why", "would", "I", "do", "it?", "Anyone'd", "think", "that"};

        // ✅ Store actual arrays, not strings
        ArrayList<String[]> song = new ArrayList<>();
        song.add(part1);
        song.add(part2);
        song.add(part3);
        song.add(part4);
        song.add(part5);
        song.add(part6);
        song.add(part7);

        // ✅ Print each word with delay
        for (String[] part : song) {
            for (String word : part) {
                System.out.print(word + " ");
                Thread.sleep(200); // delay per word
            }
            System.out.println(); // new line between parts
            Thread.sleep(600); // slightly longer delay between parts
        }

        }
    }
