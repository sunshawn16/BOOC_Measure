package com.tw.measure;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by xiaosun on 11/19/15.
 */
public class MeasureTest {
    @Test
    public void should1InchEqual1Inch() throws Exception {
        Measure inch1 = Measure.createInch(Unit.INCH, 1);
        Measure inch2 = Measure.createInch(Unit.INCH, 1);

        assertEquals(inch1, inch2);
    }

    @Test
    public void should1InchNotEqual2Inch() throws Exception {
        Measure inch1 = Measure.createInch(Unit.INCH, 1);
        Measure inch2 = Measure.createInch(Unit.INCH, 2);

        assertThat(inch1, not(inch2));
    }

    @Test
    public void should12InchEqual1Feet() throws Exception {
        Measure inch12 = Measure.createInch(Unit.INCH, 12);
        Measure fect1 = Measure.createFect(Unit.FECT, 1);

        assertEquals(inch12, fect1);
    }

    @Test
    public void should13InchPlus11InchEquals2Fect() throws Exception {
        Measure inch13 = Measure.createInch(Unit.INCH, 13);
        Measure inch11 = Measure.createFect(Unit.INCH, 11);
        Measure fect2 = Measure.createFect(Unit.FECT,2);
        Measure inchResult = inch11.plus(inch13);

        assertEquals(inchResult,fect2);
    }

    @Test
    public void should3FectPlus2YardEquals3Yard() throws Exception {
        Measure fect3 = Measure.createFect(Unit.FECT, 3);
        Measure yard2 = Measure.creatYard(Unit.YARD,2);
        Measure yard3 = Measure.creatYard(Unit.YARD, 3);
        Measure result = fect3.plus(yard2);

        assertEquals(result, yard3);

    }
}