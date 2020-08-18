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
 * Scheduled Package Id
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonaws.mws.easyship.model;

import com.amazonservices.mws.client.*;

/**
 * ScheduledPackageId complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ScheduledPackageId"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="PackageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * 
 * 
 */
public class ScheduledPackageId extends AbstractMwsObject {

    private String amazonOrderId;

    private String packageId;

    /**
     * Get the value of AmazonOrderId.
     *
     * @return The value of AmazonOrderId.
     */
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    /**
     * Set the value of AmazonOrderId.
     *
     * @param amazonOrderId
     *            The new value to set.
     */
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    /**
     * Check to see if AmazonOrderId is set.
     *
     * @return true if AmazonOrderId is set.
     */
    public boolean isSetAmazonOrderId() {
        return amazonOrderId != null;
    }

    /**
     * Set the value of AmazonOrderId, return this.
     *
     * @param amazonOrderId
     *             The new value to set.
     * @return This instance.
     */
    public ScheduledPackageId withAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * Get the value of PackageId.
     *
     * @return The value of PackageId.
     */
    public String getPackageId() {
        return packageId;
    }

    /**
     * Set the value of PackageId.
     *
     * @param packageId
     *            The new value to set.
     */
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    /**
     * Check to see if PackageId is set.
     *
     * @return true if PackageId is set.
     */
    public boolean isSetPackageId() {
        return packageId != null;
    }

    /**
     * Set the value of PackageId, return this.
     *
     * @param packageId
     *             The new value to set.
     * @return This instance.
     */
    public ScheduledPackageId withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        amazonOrderId = r.read("AmazonOrderId", String.class);
        packageId = r.read("PackageId", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("AmazonOrderId", amazonOrderId);
        w.write("PackageId", packageId);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "ScheduledPackageId",this);
    }

    /**
     * Value constructor.
     *
     * @param amazonOrderId a {@link java.lang.String} object.
     */
    public ScheduledPackageId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }    

    /**
     * Default constructor.
     */
    public ScheduledPackageId() {
        super();
    }

}
