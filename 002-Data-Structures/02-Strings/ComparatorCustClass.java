import java.util.*;
/**
 * Title       : Custom Object Sorting using Java Comparator
 * Platform    : HackerRank
 * Language    : Java 8+
 * Concept     : Comparator Interface & Object-Oriented Design
 * 
 * Overview:
 * Implements a dual-level sorting algorithm for 'Player' entities.
 * 
 * Sorting Specifications:
 * 1. Primary Criteria   : Rank by Score in Descending Order (Highest to Lowest).
 * 2. Secondary Criteria : Rank by Name in Lexicographical Order (Alphabetical A-Z) 
 *                         when scores are identical.
 * 
 * Technical Implementation:
 * - Custom 'Checker' class implements Comparator<Player> to override compare().
 * - Uses String.compareTo() for alphabetical string comparison.
 * - Uses arithmetic subtraction (b.score - a.score) for descending integer evaluation.
 * 
 * Performance Metrics:
 * - Time Complexity  : O(N log N) - Leverages TimSort via Arrays.sort()
 * - Space Complexity : O(N)       - Memory allocation for N Player instances
 */

class Checker implements Comparator<Player>{
    public int compare(Player a, Player b){
        if(a.score==b.score){
            return a.name.compareTo(b.name);
        }else{
            return b.score-a.score;
        }
    }
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class ComparatorCustClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}