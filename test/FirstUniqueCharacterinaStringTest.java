/**
 * Created by taosong on 3/25/17.
 */

package com.github.aiyasong.codingfun.leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class FirstUniqueCharacterinaStringTest {
    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void firstUniqCharEasy() throws Exception {
        String testStr = "abcaefg";
        assertEquals(1, FirstUniqueCharacterinaString.firstUniqChar(testStr));
    }
    @Test
    public void firstUniqCharNull() throws Exception {
        String testStr = "";
        assertEquals(-1, FirstUniqueCharacterinaString.firstUniqChar(testStr));
    }

}

