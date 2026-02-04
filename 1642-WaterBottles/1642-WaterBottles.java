// Last updated: 2/4/2026, 8:28:09 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int empty = numBottles;
        while(empty>=numExchange){
            int newD = empty/numExchange;
            empty = (empty%numExchange)+newD;
            drink+=newD;
        }
    return drink;
    }
}