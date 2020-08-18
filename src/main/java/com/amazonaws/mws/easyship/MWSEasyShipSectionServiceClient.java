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
import com.amazonservices.mws.client.*;

/**
 * <p>MWSEasyShipSectionServiceClient class.</p>
 *
 * 
 * 
 */
public class MWSEasyShipSectionServiceClient implements MWSEasyShipSectionService {

    private static final String libraryName = "MWSEasyShipSectionService";

    private static final String libraryVersion = "2018-09-01";

    protected String servicePath;

    protected final MwsConnection connection;

    /**
     * <p>Constructor for MWSEasyShipSectionServiceClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.easyship.MWSEasyShipSectionServiceConfig} object.
     */
    public MWSEasyShipSectionServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSEasyShipSectionServiceConfig config) {
        connection = config.copyConnection();
        connection.setAwsAccessKeyId(accessKey);
        connection.setAwsSecretKeyId(secretKey);
        connection.setApplicationName(applicationName);
        connection.setApplicationVersion(applicationVersion);
        connection.setLibraryVersion(libraryVersion);
        servicePath = config.getServicePath();
    }

    /**
     * <p>Constructor for MWSEasyShipSectionServiceClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.easyship.MWSEasyShipSectionServiceConfig} object.
     */
    public MWSEasyShipSectionServiceClient(
            String accessKey,
            String secretKey,
            MWSEasyShipSectionServiceConfig config) {
        this(accessKey, secretKey, libraryName, libraryVersion, config);
    }

    /**
     * <p>Constructor for MWSEasyShipSectionServiceClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     */
    public MWSEasyShipSectionServiceClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        this(accessKey, secretKey, applicationName, 
                applicationVersion, new MWSEasyShipSectionServiceConfig());
    }

    /** {@inheritDoc} */
    public CreateScheduledPackageResponse createScheduledPackage(CreateScheduledPackageRequest request) {
        return connection.call(
            new RequestType("CreateScheduledPackage", CreateScheduledPackageResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetScheduledPackageResponse getScheduledPackage(GetScheduledPackageRequest request) {
        return connection.call(
            new RequestType("GetScheduledPackage", GetScheduledPackageResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public ListPickupSlotsResponse listPickupSlots(ListPickupSlotsRequest request) {
        return connection.call(
            new RequestType("ListPickupSlots", ListPickupSlotsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public UpdateScheduledPackagesResponse updateScheduledPackages(UpdateScheduledPackagesRequest request) {
        return connection.call(
            new RequestType("UpdateScheduledPackages", UpdateScheduledPackagesResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) {
        return connection.call(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    /**
     * <p>quoteAppName.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAppName(String s) {
        return MwsUtl.escapeAppName(s);
    }

    /**
     * <p>quoteAppVersion.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAppVersion(String s) {
        return MwsUtl.escapeAppVersion(s);
    }

    /**
     * <p>quoteAttributeName.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAttributeName(String s) {
        return MwsUtl.escapeAttributeName(s);
    }

    /**
     * <p>quoteAttributeValue.</p>
     *
     * @param s a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public static String quoteAttributeValue(String s) {
        return MwsUtl.escapeAttributeValue(s);
    }

    protected static class RequestType implements MwsRequestType {

        private final String operationName;
        private final Class<? extends MWSResponse> responseClass;
        private final String servicePath;

        public RequestType(String operationName, Class<? extends MWSResponse> responseClass, String servicePath) {
            this.operationName = operationName;
            this.responseClass = responseClass;
            this.servicePath = servicePath;
        }

        @Override
        public String getServicePath() {
            return this.servicePath;
        }

        @Override
        public String getOperationName() {
            return this.operationName;
        }

        @Override
        public Class<? extends MwsObject> getResponseClass() {
            return this.responseClass;
        }

        @Override
        public MwsException wrapException(Throwable cause) {
            return new MWSEasyShipSectionServiceException(cause);
        }

        @Override
        public void setRHMD(MwsObject response, MwsResponseHeaderMetadata rhmd) {
            ((MWSResponse)response).setResponseHeaderMetadata(new ResponseHeaderMetadata(rhmd));
        }
    }

}
