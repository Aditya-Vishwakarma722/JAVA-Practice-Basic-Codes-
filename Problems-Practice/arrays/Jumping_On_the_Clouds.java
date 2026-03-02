/*
Problem: Jumping on the Clouds: Revisited

A character is playing a game on a circular array of clouds.

Each cloud has one of two types:
0 → Safe cloud
1 → Thundercloud (dangerous)

The character starts at cloud index 0 with 100 energy.

Rules:
1. The character jumps in fixed steps of size k.
2. The clouds are arranged in a circle.
   After the last cloud, it wraps back to the beginning.
3. Each jump costs 1 unit of energy.
4. If the character lands on a thundercloud (value = 1),
   they lose an additional 2 units of energy.
5. The game ends when the character returns to cloud index 0.

Task:
Determine how much energy remains after completing the game.

Input:
- n → number of clouds
- k → jump size
- An array c of size n containing only 0s and 1s

Constraints:
- 2 ≤ n ≤ 25
- 1 ≤ k ≤ n
- c[i] ∈ {0, 1}

Output:
- Print the remaining energy.

Example:

Input:
8 2
0 0 1 0 0 1 1 0

Output:
92
*/

import java.util.Scanner;

class solutionsMade{
    public int solution(int [] c, int k){
        int energy = 100;
        int n = c.length;
        int position = 0;

        do {
            position = (position + k) % n;   // jump
            energy--;                        // cost of jump
            if (c[position] == 1) {
                energy -= 2;                 // thundercloud penalty
            }
        } while (position != 0);

        return energy;
    }
}

public class Jumping_On_the_Clouds {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        solutionsMade sld = new solutionsMade();
        System.out.println(sld.solution(arr, k));
    }
}
