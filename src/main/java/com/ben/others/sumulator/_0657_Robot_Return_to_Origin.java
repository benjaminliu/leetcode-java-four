package com.ben.others.sumulator;

public class _0657_Robot_Return_to_Origin {

    class Solution {
        public boolean judgeCircle(String moves) {
            int x = 0;
            int y = 0;

            for (char c : moves.toCharArray()) {
                if (c == 'U') {
                    y++;
                } else if (c == 'D') {
                    y--;
                } else if (c == 'R') {
                    x++;
                } else {
                    x--;
                }
            }

            return x == 0 & y == 0;
        }
    }
}
