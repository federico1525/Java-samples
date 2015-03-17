package com.fede.testjunit;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FirstDayAtSchoolTest {

    FirstDayAtSchool scuola = new FirstDayAtSchool();


    @Test
    public void testPrepareBag(){
        String[] actual = {"Books", "Notebooks", "Pens"};
        String[] expected = scuola.prepareMyBag();

        assertThat (actual, is(expected));
    }

    @Test
    public void testAddPencils(){
        String[] actual = {"Books", "Notebooks", "Pens", "Pencils"};
        String[] expected = scuola.addPencils();

        assertThat(actual, is(expected));
    }

}
