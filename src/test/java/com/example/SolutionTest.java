package com.example;

import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    int[] position;
    int result;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void twoPositionsTwoChips(){

        position = new int[] {1,2};
        result = 1;

        assertEquals(result, solution.minCostToMoveChips(position));
    }

    @Test
    public void twoPositionsFourChips(){

        position = new int[] {1,2,2,2};
        result = 1;

        assertEquals(result, solution.minCostToMoveChips(position));
    }

    @Test
    public void fivePositionsFiveChips(){

        position = new int[] {1,2,3,4,5};
        result = 2;

        assertEquals(result, solution.minCostToMoveChips(position));
    }
}
