/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * Generated by Agitar build: AgitarOne Version 5.3.0.000022 (Build date: Jan 04, 2012) [5.3.0.000022]
 * JDK Version: 1.6.0_14
 *
 * Generated on 29 Jul, 2013 5:05:18 PM
 * Time to generate: 00:25.590 seconds
 *
 */

package com.huawei.unibi.molap.engine.util;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.unibi.molap.engine.aggregator.MeasureAggregator;
import com.huawei.unibi.molap.engine.aggregator.impl.MinAggregator;
import java.util.ArrayList;
import java.util.List;
import mondrian.rolap.SqlStatement;

public class MolapResultHolderAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return MolapResultHolder.class;
    }
    
    public void testConstructor() throws Throwable {
        List dataTypes = new ArrayList(100);
        MolapResultHolder molapResultHolder = new MolapResultHolder(dataTypes);
        assertEquals("molapResultHolder.next", -1, ((Number) getPrivateField(molapResultHolder, "next")).intValue());
        assertSame("molapResultHolder.getDataTypes()", dataTypes, molapResultHolder.getDataTypes());
        assertNull("molapResultHolder.result", getPrivateField(molapResultHolder, "result"));
    }
    
    public void testCreateData() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        MeasureAggregator[] d = new MeasureAggregator[0];
        molapResultHolder.createData(d);
        assertEquals("molapResultHolder.getColumnCount()", 0, molapResultHolder.getColumnCount());
    }
    
    public void testCreateData1() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        MeasureAggregator[] d = new MeasureAggregator[1];
        d[0] = new MinAggregator();
        molapResultHolder.createData(d);
        assertEquals("molapResultHolder.getColumnCount()", 1, molapResultHolder.getColumnCount());
    }
    
    public void testGetColumnCount() throws Throwable {
        Object[][] data = new Object[1][];
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        molapResultHolder.setObject(data);
        int result = molapResultHolder.getColumnCount();
        assertEquals("result", 1, result);
    }
    
    public void testGetDataType() throws Throwable {
        List dataTypes = new ArrayList(100);
        dataTypes.add(SqlStatement.Type.OBJECT);
        MolapResultHolder molapResultHolder = new MolapResultHolder(dataTypes);
        SqlStatement.Type result = molapResultHolder.getDataType(0);
        assertSame("result", SqlStatement.Type.OBJECT, result);
        assertSame("molapResultHolder.getDataTypes()", dataTypes, molapResultHolder.getDataTypes());
    }
    
    public void testGetDoubleWithAggressiveMocks() throws Throwable {
        MolapResultHolder molapResultHolder = (MolapResultHolder) Mockingbird.getProxyObject(MolapResultHolder.class, true);
        Object[][] objects = new Object[1][0];
        Object[] objects2 = new Object[1];
        molapResultHolder.setObject(objects);
        setPrivateField(molapResultHolder, "next", new Integer(0));
        objects[0] = objects2;
        objects2[0] = "";
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(true, Double.class, "parseDouble", "(java.lang.String)double", new Double(2.802596928649634E-45), 1);
        Mockingbird.enterTestMode(MolapResultHolder.class);
        double result = molapResultHolder.getDouble(1);
        assertEquals("result", 2.802596928649634E-45, result, 1.0E-6);
        assertFalse("molapResultHolder.wasNull()", molapResultHolder.wasNull());
    }
    
    public void testGetIntWithAggressiveMocks() throws Throwable {
        MolapResultHolder molapResultHolder = (MolapResultHolder) Mockingbird.getProxyObject(MolapResultHolder.class, true);
        Object[][] objects = new Object[1][0];
        Object[] objects2 = new Object[1];
        molapResultHolder.setObject(objects);
        setPrivateField(molapResultHolder, "next", new Integer(0));
        objects[0] = objects2;
        objects2[0] = null;
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(true, Integer.class, "parseInt", "(java.lang.String)int", new Integer(0), 1);
        Mockingbird.enterTestMode(MolapResultHolder.class);
        int result = molapResultHolder.getInt(1);
        assertEquals("result", 0, result);
        assertTrue("molapResultHolder.wasNull()", molapResultHolder.wasNull());
    }
    
    public void testGetLongWithAggressiveMocks() throws Throwable {
        MolapResultHolder molapResultHolder = (MolapResultHolder) Mockingbird.getProxyObject(MolapResultHolder.class, true);
        Object[][] objects = new Object[1][0];
        Object[] objects2 = new Object[1];
        molapResultHolder.setObject(objects);
        setPrivateField(molapResultHolder, "next", new Integer(0));
        objects[0] = objects2;
        objects2[0] = "";
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(true, Long.class, "parseLong", "(java.lang.String)long", new Long(0L), 1);
        Mockingbird.enterTestMode(MolapResultHolder.class);
        long result = molapResultHolder.getLong(1);
        assertEquals("result", 0L, result);
        assertFalse("molapResultHolder.wasNull()", molapResultHolder.wasNull());
    }
    
    public void testGetObject() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        MeasureAggregator[] d = new MeasureAggregator[1];
        d[0] = new MinAggregator();
        molapResultHolder.createData(d);
        molapResultHolder.isNext();
        Double result = (Double) molapResultHolder.getObject(1);
        assertEquals("result", Double.MAX_VALUE, result.doubleValue(), 1.0E-6);
        assertFalse("molapResultHolder.wasNull()", molapResultHolder.wasNull());
    }
    
    public void testIsNext() throws Throwable {
        Object[] objects = new Object[0];
        Object[][] data = new Object[3][];
        data[0] = objects;
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        molapResultHolder.setObject(data);
        boolean result = molapResultHolder.isNext();
        assertEquals("molapResultHolder.next", 0, ((Number) getPrivateField(molapResultHolder, "next")).intValue());
        assertFalse("result", result);
    }
    
    public void testIsNext1() throws Throwable {
        Object[] objects = new Object[1];
        Object[][] data = new Object[2][];
        data[0] = objects;
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        molapResultHolder.setObject(data);
        boolean result = molapResultHolder.isNext();
        assertEquals("molapResultHolder.next", 0, ((Number) getPrivateField(molapResultHolder, "next")).intValue());
        assertTrue("result", result);
    }
    
    public void testIsNext2() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        boolean result = molapResultHolder.isNext();
        assertEquals("molapResultHolder.next", 0, ((Number) getPrivateField(molapResultHolder, "next")).intValue());
        assertFalse("result", result);
    }
    
    public void testReset() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        molapResultHolder.reset();
        assertEquals("molapResultHolder.next", -1, ((Number) getPrivateField(molapResultHolder, "next")).intValue());
    }
    
    public void testSetDataTypes() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        List types = new ArrayList(1000);
        molapResultHolder.setDataTypes(types);
        assertSame("molapResultHolder.getDataTypes()", types, molapResultHolder.getDataTypes());
    }
    
    public void testSetObject() throws Throwable {
        Object[][] data = new Object[1][];
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        molapResultHolder.setObject(data);
        assertEquals("molapResultHolder.getColumnCount()", 1, molapResultHolder.getColumnCount());
    }
    
    public void testWasNull() throws Throwable {
        boolean result = new MolapResultHolder(new ArrayList(100)).wasNull();
        assertFalse("result", result);
    }
    
    public void testCreateDataThrowsNullPointerException() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        MeasureAggregator[] d = new MeasureAggregator[3];
        try {
            molapResultHolder.createData(d);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("molapResultHolder.getColumnCount()", 3, molapResultHolder.getColumnCount());
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
        }
    }
    
    public void testCreateDataThrowsNullPointerException1() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        try {
            molapResultHolder.createData((MeasureAggregator[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
            assertNull("molapResultHolder.result", getPrivateField(molapResultHolder, "result"));
        }
    }
    
    public void testGetColumnCountThrowsNullPointerException() throws Throwable {
        try {
            new MolapResultHolder(new ArrayList(100)).getColumnCount();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
        }
    }
    
    public void testGetDataTypeThrowsArrayIndexOutOfBoundsException() throws Throwable {
        List dataTypes = new ArrayList(100);
        MolapResultHolder molapResultHolder = new MolapResultHolder(dataTypes);
        try {
            molapResultHolder.getDataType(-1);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "-1", ex.getMessage());
            assertThrownBy(ArrayList.class, ex);
            assertSame("molapResultHolder.getDataTypes()", dataTypes, molapResultHolder.getDataTypes());
        }
    }
    
    public void testGetDataTypeThrowsIndexOutOfBoundsException() throws Throwable {
        List dataTypes = new ArrayList(100);
        MolapResultHolder molapResultHolder = new MolapResultHolder(dataTypes);
        try {
            molapResultHolder.getDataType(100);
            fail("Expected IndexOutOfBoundsException to be thrown");
        } catch (IndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "Index: 100, Size: 0", ex.getMessage());
            assertThrownBy(ArrayList.class, ex);
            assertSame("molapResultHolder.getDataTypes()", dataTypes, molapResultHolder.getDataTypes());
        }
    }
    
    public void testGetDataTypeThrowsNullPointerException() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(null);
        try {
            molapResultHolder.getDataType(100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
            assertNull("molapResultHolder.getDataTypes()", molapResultHolder.getDataTypes());
        }
    }
    
    public void testGetDoubleThrowsArrayIndexOutOfBoundsException() throws Throwable {
        Object[] objects = new Object[1];
        Object[][] data = new Object[1][];
        data[0] = objects;
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        molapResultHolder.setObject(data);
        try {
            molapResultHolder.getDouble(100);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "99", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
            assertFalse("molapResultHolder.wasNull()", molapResultHolder.wasNull());
        }
    }
    
    public void testGetDoubleThrowsNullPointerException() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        try {
            molapResultHolder.getDouble(100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
            assertFalse("molapResultHolder.wasNull()", molapResultHolder.wasNull());
        }
    }
    
    public void testGetDoubleThrowsNumberFormatException() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(molapResultHolder.getObject(1), "");
        Mockingbird.setException(true, Double.class, "parseDouble", "(java.lang.String)double", new Object[] {""}, (Throwable) Mockingbird.getProxyObject(NumberFormatException.class), 1);
        Mockingbird.enterTestMode(MolapResultHolder.class);
        try {
            molapResultHolder.getDouble(1);
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetIntThrowsArrayIndexOutOfBoundsException() throws Throwable {
        Object[][] data = new Object[1][];
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        molapResultHolder.setObject(data);
        try {
            molapResultHolder.getInt(100);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "99", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
            assertFalse("molapResultHolder.wasNull()", molapResultHolder.wasNull());
        }
    }
    
    public void testGetIntThrowsNullPointerException() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        try {
            molapResultHolder.getInt(100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
            assertFalse("molapResultHolder.wasNull()", molapResultHolder.wasNull());
        }
    }
    
    public void testGetIntThrowsNumberFormatException() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(molapResultHolder.getObject(1), "");
        Mockingbird.setException(true, Integer.class, "parseInt", "(java.lang.String)int", new Object[] {""}, (Throwable) Mockingbird.getProxyObject(NumberFormatException.class), 1);
        Mockingbird.enterTestMode(MolapResultHolder.class);
        try {
            molapResultHolder.getInt(1);
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException ex) {
            assertTrue("Test call resulted in expected outcome", true);
        }
    }
    
    public void testGetLongThrowsArrayIndexOutOfBoundsException() throws Throwable {
        Object[][] data = new Object[1][];
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        molapResultHolder.setObject(data);
        try {
            molapResultHolder.getLong(100);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "99", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
            assertFalse("molapResultHolder.wasNull()", molapResultHolder.wasNull());
        }
    }
    
    public void testGetLongThrowsClassCastException() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(molapResultHolder.getObject(1), new Double(Double.MAX_VALUE));
        Mockingbird.enterTestMode(MolapResultHolder.class);
        try {
            molapResultHolder.getLong(1);
            fail("Expected ClassCastException to be thrown");
        } catch (ClassCastException ex) {
            assertEquals("ex.getClass()", ClassCastException.class, ex.getClass());
            assertThrownBy(MolapResultHolder.class, ex);
        }
    }
    
    public void testGetLongThrowsNullPointerException() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        try {
            molapResultHolder.getLong(100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
            assertFalse("molapResultHolder.wasNull()", molapResultHolder.wasNull());
        }
    }
    
    public void testGetObjectThrowsArrayIndexOutOfBoundsException() throws Throwable {
        Object[] objects = new Object[0];
        Object[][] data = new Object[1][];
        data[0] = objects;
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        molapResultHolder.setObject(data);
        try {
            molapResultHolder.getObject(100);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "99", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
            assertFalse("molapResultHolder.wasNull()", molapResultHolder.wasNull());
        }
    }
    
    public void testGetObjectThrowsNullPointerException() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        try {
            molapResultHolder.getObject(100);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
            assertFalse("molapResultHolder.wasNull()", molapResultHolder.wasNull());
        }
    }
    
    public void testIsNextThrowsArrayIndexOutOfBoundsException() throws Throwable {
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        MeasureAggregator[] d = new MeasureAggregator[0];
        molapResultHolder.createData(d);
        try {
            molapResultHolder.isNext();
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertEquals("molapResultHolder.next", 0, ((Number) getPrivateField(molapResultHolder, "next")).intValue());
            assertEquals("ex.getMessage()", "0", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
        }
    }
    
    public void testIsNextThrowsNullPointerException() throws Throwable {
        Object[][] data = new Object[1][];
        MolapResultHolder molapResultHolder = new MolapResultHolder(new ArrayList(100));
        molapResultHolder.setObject(data);
        try {
            molapResultHolder.isNext();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertEquals("molapResultHolder.next", 0, ((Number) getPrivateField(molapResultHolder, "next")).intValue());
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(MolapResultHolder.class, ex);
        }
    }
}
