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
 * Update Scheduled Packages Result
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonaws.mws.easyship.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * UpdateScheduledPackagesResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="UpdateScheduledPackagesResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ScheduledPackageList" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}Package" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * 
 * 
 */
public class UpdateScheduledPackagesResult extends AbstractMwsObject {

    private List<Package> scheduledPackageList;

    /**
     * Get the value of ScheduledPackageList.
     *
     * @return The value of ScheduledPackageList.
     */
    public List<Package> getScheduledPackageList() {
        if (scheduledPackageList==null) {
            scheduledPackageList = new ArrayList<Package>();
        }
        return scheduledPackageList;
    }

    /**
     * Set the value of ScheduledPackageList.
     *
     * @param scheduledPackageList
     *            The new value to set.
     */
    public void setScheduledPackageList(List<Package> scheduledPackageList) {
        this.scheduledPackageList = scheduledPackageList;
    }

    /**
     * Clear ScheduledPackageList.
     */
    public void unsetScheduledPackageList() {
        this.scheduledPackageList = null;
    }

    /**
     * Check to see if ScheduledPackageList is set.
     *
     * @return true if ScheduledPackageList is set.
     */
    public boolean isSetScheduledPackageList() {
        return scheduledPackageList != null && !scheduledPackageList.isEmpty();
    }

    /**
     * Add values for ScheduledPackageList, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.easyship.model.Package} object.
     */
    public UpdateScheduledPackagesResult withScheduledPackageList(Package... values) {
        List<Package> list = getScheduledPackageList();
        for (Package value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        scheduledPackageList = r.readList("ScheduledPackageList", "Package", Package.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("ScheduledPackageList", "Package", scheduledPackageList);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "UpdateScheduledPackagesResult",this);
    }

    /**
     * Value constructor.
     *
     * @param scheduledPackageList a {@link java.util.List} object.
     */
    public UpdateScheduledPackagesResult(List<Package> scheduledPackageList) {
        this.scheduledPackageList = scheduledPackageList;
    }    

    /**
     * Default constructor.
     */
    public UpdateScheduledPackagesResult() {
        super();
    }

}
