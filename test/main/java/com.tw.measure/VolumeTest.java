package com.tw.measure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xiaosun on 11/25/15.
 */
public class VolumeTest {
    @Test
    public void shouldEquals1TBSPAnd3TSP() throws Exception {
        Volume TBSP = Volume.createVolumn(Unit.TBSP, 1);
        Volume TSP = Volume.createVolumn(Unit.TSP, 3);

        assertEquals(TBSP,TSP);
    }

    @Test
    public void shouldEquals1OZAnd2TBSP() throws Exception {
        Volume OZ = Volume.createVolumn(Unit.OZ,1);
        Volume TBSP = Volume.createVolumn(Unit.TBSP,2);

        assertEquals(OZ,TBSP);
    }

    @Test
    public void shouldEquals1OZPlus1TBSPAnd3TBSP()throws Exception{
        Volume OZ = Volume.createVolumn(Unit.OZ,1);
        Volume TBSP = Volume.createVolumn(Unit.TBSP,1);
        Volume result = Volume.createVolumn(Unit.TBSP,3);

        assertEquals(result,OZ.plus(TBSP));
    }
}