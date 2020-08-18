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
 * MWS Easy Ship Section Service
 * API Version: 2018-09-01
 * Library Version: 2018-09-01
 * Generated: Thu Sep 27 07:44:05 PDT 2018
 */
package com.amazonaws.mws.easyship;

import com.amazonaws.mws.easyship.model.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * <p>MWSEasyShipSectionServiceAsyncClient class.</p>
 *
 * 
 * 
 */
public class MWSEasyShipSectionServiceAsyncClient extends MWSEasyShipSectionServiceClient implements MWSEasyShipSectionServiceAsync {

    /**
     * <p>Constructor for MWSEasyShipSectionServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.easyship.MWSEasyShipSectionServiceConfig} object.
     * @param executor a {@link java.util.concurrent.ExecutorService} object.
     */
    public MWSEasyShipSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSEasyShipSectionServiceConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    /**
     * <p>Constructor for MWSEasyShipSectionServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.easyship.MWSEasyShipSectionServiceConfig} object.
     */
    public MWSEasyShipSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSEasyShipSectionServiceConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    /**
     * <p>Constructor for MWSEasyShipSectionServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.easyship.MWSEasyShipSectionServiceConfig} object.
     */
    public MWSEasyShipSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            MWSEasyShipSectionServiceConfig config) {
        super(accessKey, secretKey, config);
    }

    /**
     * <p>Constructor for MWSEasyShipSectionServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     */
    public MWSEasyShipSectionServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    /** {@inheritDoc} */
    public Future<CreateScheduledPackageResponse> createScheduledPackageAsync(
        CreateScheduledPackageRequest request) {
        return connection.callAsync(
            new RequestType("CreateScheduledPackage", CreateScheduledPackageResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetScheduledPackageResponse> getScheduledPackageAsync(
        GetScheduledPackageRequest request) {
        return connection.callAsync(
            new RequestType("GetScheduledPackage", GetScheduledPackageResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListPickupSlotsResponse> listPickupSlotsAsync(
        ListPickupSlotsRequest request) {
        return connection.callAsync(
            new RequestType("ListPickupSlots", ListPickupSlotsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<UpdateScheduledPackagesResponse> updateScheduledPackagesAsync(
        UpdateScheduledPackagesRequest request) {
        return connection.callAsync(
            new RequestType("UpdateScheduledPackages", UpdateScheduledPackagesResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }


}
