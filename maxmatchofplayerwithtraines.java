class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0, j = 0; // Pointers for players and trainers
        int count = 0; // To count the number of valid matches
        
        // Use two-pointer technique to find matches
        while (i < players.length && j < trainers.length) {
            if (players[i] <= trainers[j]) {
                // If the current player can be matched with the current trainer
                count++;
                i++; // Move to the next player
                j++; // Move to the next trainer
            } else {
                // If the current player cannot be matched with the current trainer
                j++; // Try the next trainer
            }
        }
        
        return count;
        
    }
}
