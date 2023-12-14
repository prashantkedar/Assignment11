/*Create a class "Song" with instance variables (title, artist, and duration)
and override the toString method. The toString method should return a
string representation of the song's information. Write a java program to
print the information. */

import java.util.Scanner;

class Song {
    String title;
    String artist;
    double duration;
public Song (String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public double getDuration() {
        return this.duration;
    }

    public String toString() {
        return this.title + " , " +this.artist + " , " +this.duration + " min";
    }

}

public class Question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the title of song: ");
        String title = sc.nextLine();
        System.out.print("Enter the artist of song: ");
        String artist = sc.nextLine();
        System.out.print("Enter the Duration of song in min.sec (ex: 4.40): ");
        double duration = sc.nextDouble();

        Song s = new Song(title, artist, duration);

        System.err.println(s.toString());


    }
}