package ru.job4j.chess.firuges.black;


import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        Figure bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position(), is(Cell.C8));
    }

    @Test
    public void copy() {
        Figure bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.copy(Cell.A6).position(), is(Cell.A6));
    }

    @Test
    public void wayC8toF5() {
        Figure bishopBlack = new BishopBlack(Cell.C8);
        Cell[] stepsActual = {Cell.D7, Cell.E6, Cell.F5};
        Cell[] steps = bishopBlack.way(Cell.F5);
        assertArrayEquals(steps, stepsActual);
    }
}
