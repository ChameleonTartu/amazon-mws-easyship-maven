/*******************************************************************************
 * Copyright 2009-2018 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Invoice Data
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonaws.mws.easyship.model;

import javax.xml.datatype.XMLGregorianCalendar;

import com.amazonservices.mws.client.*;

/**
 * InvoiceData complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="InvoiceData"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * 
 * 
 */
public class InvoiceData extends AbstractMwsObject {

    private String invoiceNumber;

    private XMLGregorianCalendar invoiceDate;

    /**
     * Get the value of InvoiceNumber.
     *
     * @return The value of InvoiceNumber.
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Set the value of InvoiceNumber.
     *
     * @param invoiceNumber
     *            The new value to set.
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * Check to see if InvoiceNumber is set.
     *
     * @return true if InvoiceNumber is set.
     */
    public boolean isSetInvoiceNumber() {
        return invoiceNumber != null;
    }

    /**
     * Set the value of InvoiceNumber, return this.
     *
     * @param invoiceNumber
     *             The new value to set.
     * @return This instance.
     */
    public InvoiceData withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * Get the value of InvoiceDate.
     *
     * @return The value of InvoiceDate.
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Set the value of InvoiceDate.
     *
     * @param invoiceDate
     *            The new value to set.
     */
    public void setInvoiceDate(XMLGregorianCalendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * Check to see if InvoiceDate is set.
     *
     * @return true if InvoiceDate is set.
     */
    public boolean isSetInvoiceDate() {
        return invoiceDate != null;
    }

    /**
     * Set the value of InvoiceDate, return this.
     *
     * @param invoiceDate
     *             The new value to set.
     * @return This instance.
     */
    public InvoiceData withInvoiceDate(XMLGregorianCalendar invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        invoiceNumber = r.read("InvoiceNumber", String.class);
        invoiceDate = r.read("InvoiceDate", XMLGregorianCalendar.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("InvoiceNumber", invoiceNumber);
        w.write("InvoiceDate", invoiceDate);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "InvoiceData",this);
    }

    /**
     * Value constructor.
     *
     * @param invoiceNumber a {@link java.lang.String} object.
     */
    public InvoiceData(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }    

    /**
     * Default constructor.
     */
    public InvoiceData() {
        super();
    }

}
