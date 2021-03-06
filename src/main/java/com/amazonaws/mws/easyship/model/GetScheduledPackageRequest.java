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
 * Get Scheduled Package Request
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonaws.mws.easyship.model;

import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsReader;
import com.amazonservices.mws.client.MwsWriter;

/**
 * GetScheduledPackageRequest complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetScheduledPackageRequest"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="ScheduledPackageId" type="{https://mws.amazonservices.com/EasyShip/2018-09-01}ScheduledPackageId"/&gt;
 *             &lt;element name="MarketplaceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * 
 * 
 */
public class GetScheduledPackageRequest extends AbstractMwsObject {

    private String sellerId;

    private String mwsAuthToken;

    private ScheduledPackageId scheduledPackageId;

    private String marketplaceId;

    /**
     * Get the value of SellerId.
     *
     * @return The value of SellerId.
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Set the value of SellerId.
     *
     * @param sellerId
     *            The new value to set.
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * Check to see if SellerId is set.
     *
     * @return true if SellerId is set.
     */
    public boolean isSetSellerId() {
        return sellerId != null;
    }

    /**
     * Set the value of SellerId, return this.
     *
     * @param sellerId
     *             The new value to set.
     * @return This instance.
     */
    public GetScheduledPackageRequest withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return mwsAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param mwsAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return mwsAuthToken != null;
    }

    /**
     * Set the value of MWSAuthToken, return this.
     *
     * @param mwsAuthToken
     *             The new value to set.
     * @return This instance.
     */
    public GetScheduledPackageRequest withMWSAuthToken(String mwsAuthToken) {
        this.mwsAuthToken = mwsAuthToken;
        return this;
    }

    /**
     * Get the value of ScheduledPackageId.
     *
     * @return The value of ScheduledPackageId.
     */
    public ScheduledPackageId getScheduledPackageId() {
        return scheduledPackageId;
    }

    /**
     * Set the value of ScheduledPackageId.
     *
     * @param scheduledPackageId
     *            The new value to set.
     */
    public void setScheduledPackageId(ScheduledPackageId scheduledPackageId) {
        this.scheduledPackageId = scheduledPackageId;
    }

    /**
     * Check to see if ScheduledPackageId is set.
     *
     * @return true if ScheduledPackageId is set.
     */
    public boolean isSetScheduledPackageId() {
        return scheduledPackageId != null;
    }

    /**
     * Set the value of ScheduledPackageId, return this.
     *
     * @param scheduledPackageId
     *             The new value to set.
     * @return This instance.
     */
    public GetScheduledPackageRequest withScheduledPackageId(ScheduledPackageId scheduledPackageId) {
        this.scheduledPackageId = scheduledPackageId;
        return this;
    }

    /**
     * Get the value of MarketplaceId.
     *
     * @return The value of MarketplaceId.
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * Set the value of MarketplaceId.
     *
     * @param marketplaceId
     *            The new value to set.
     */
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * Check to see if MarketplaceId is set.
     *
     * @return true if MarketplaceId is set.
     */
    public boolean isSetMarketplaceId() {
        return marketplaceId != null;
    }

    /**
     * Set the value of MarketplaceId, return this.
     *
     * @param marketplaceId
     *             The new value to set.
     * @return This instance.
     */
    public GetScheduledPackageRequest withMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        sellerId = r.read("SellerId", String.class);
        mwsAuthToken = r.read("MWSAuthToken", String.class);
        scheduledPackageId = r.read("ScheduledPackageId", ScheduledPackageId.class);
        marketplaceId = r.read("MarketplaceId", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("SellerId", sellerId);
        w.write("MWSAuthToken", mwsAuthToken);
        w.write("ScheduledPackageId", scheduledPackageId);
        w.write("MarketplaceId", marketplaceId);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/EasyShip/2018-09-01", "GetScheduledPackageRequest",this);
    }

    /**
     * Value constructor.
     *
     * @param sellerId a {@link java.lang.String} object.
     * @param scheduledPackageId a {@link com.amazonaws.mws.easyship.model.ScheduledPackageId} object.
     * @param marketplaceId a {@link java.lang.String} object.
     */
    public GetScheduledPackageRequest(String sellerId,ScheduledPackageId scheduledPackageId,String marketplaceId) {
        this.sellerId = sellerId;
        this.scheduledPackageId = scheduledPackageId;
        this.marketplaceId = marketplaceId;
    }    

    /**
     * Default constructor.
     */
    public GetScheduledPackageRequest() {
        super();
    }

}
