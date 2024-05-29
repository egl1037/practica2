/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.braintreegateway.OAuthGateway;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.braintreegateway.OAuthGateway
 */
public enum OAuthGatewayApiMethod implements ApiMethod {

    CONNECT_URL(
        String.class,
        "connectUrl",
        arg("connectRequest", com.braintreegateway.OAuthConnectUrlRequest.class)),

    CREATE_TOKEN_FROM_CODE(
        com.braintreegateway.Result.class,
        "createTokenFromCode",
        arg("request", com.braintreegateway.OAuthCredentialsRequest.class)),

    CREATE_TOKEN_FROM_REFRESH_TOKEN(
        com.braintreegateway.Result.class,
        "createTokenFromRefreshToken",
        arg("request", com.braintreegateway.OAuthCredentialsRequest.class)),

    REVOKE_ACCESS_TOKEN(
        com.braintreegateway.Result.class,
        "revokeAccessToken",
        arg("accessToken", String.class));

    private final ApiMethod apiMethod;

    private OAuthGatewayApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(OAuthGateway.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
