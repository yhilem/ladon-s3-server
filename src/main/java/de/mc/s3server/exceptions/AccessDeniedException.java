/*
 * Copyright (c) 2016 Mind Consulting UG(haftungsbeschränkt)
 */

package de.mc.s3server.exceptions;

import de.mc.s3server.entities.api.S3RequestId;

import java.net.HttpURLConnection;

/**
 * @author Ralf Ulrich on 20.02.16.
 */
public class AccessDeniedException extends S3ServerException {

    public AccessDeniedException(String resource, S3RequestId requestId) {
        super("Access Denied", resource, requestId, HttpURLConnection.HTTP_FORBIDDEN);
    }

    public AccessDeniedException(String message, String resource, S3RequestId requestId) {
        super(message, resource, requestId, HttpURLConnection.HTTP_FORBIDDEN);
    }

}
