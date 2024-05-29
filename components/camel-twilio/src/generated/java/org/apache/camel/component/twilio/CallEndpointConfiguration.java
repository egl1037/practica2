/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Call}.
 */
@ApiParams(apiName = "call", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", signatures={"com.twilio.rest.api.v2010.account.CallCreator creator(com.twilio.type.Endpoint to, com.twilio.type.Endpoint from, String applicationSid)", "com.twilio.rest.api.v2010.account.CallCreator creator(com.twilio.type.Endpoint to, com.twilio.type.Endpoint from, com.twilio.type.Twiml twiml)", "com.twilio.rest.api.v2010.account.CallCreator creator(com.twilio.type.Endpoint to, com.twilio.type.Endpoint from, java.net.URI url)", "com.twilio.rest.api.v2010.account.CallCreator creator(String pathAccountSid, com.twilio.type.Endpoint to, com.twilio.type.Endpoint from, String applicationSid)", "com.twilio.rest.api.v2010.account.CallCreator creator(String pathAccountSid, com.twilio.type.Endpoint to, com.twilio.type.Endpoint from, com.twilio.type.Twiml twiml)", "com.twilio.rest.api.v2010.account.CallCreator creator(String pathAccountSid, com.twilio.type.Endpoint to, com.twilio.type.Endpoint from, java.net.URI url)"}), @ApiMethod(methodName = "deleter", signatures={"com.twilio.rest.api.v2010.account.CallDeleter deleter(String pathSid)", "com.twilio.rest.api.v2010.account.CallDeleter deleter(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", signatures={"com.twilio.rest.api.v2010.account.CallFetcher fetcher(String pathSid)", "com.twilio.rest.api.v2010.account.CallFetcher fetcher(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "reader", signatures={"com.twilio.rest.api.v2010.account.CallReader reader()", "com.twilio.rest.api.v2010.account.CallReader reader(String pathAccountSid)"}), @ApiMethod(methodName = "updater", signatures={"com.twilio.rest.api.v2010.account.CallUpdater updater(String pathSid)", "com.twilio.rest.api.v2010.account.CallUpdater updater(String pathAccountSid, String pathSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class CallEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private String applicationSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private com.twilio.type.Endpoint from;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator"), @ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader"), @ApiMethod(methodName = "updater")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "updater")})
    private String pathSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private com.twilio.type.Endpoint to;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private com.twilio.type.Twiml twiml;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private java.net.URI url;

    public String getApplicationSid() {
        return applicationSid;
    }

    public void setApplicationSid(String applicationSid) {
        this.applicationSid = applicationSid;
    }

    public com.twilio.type.Endpoint getFrom() {
        return from;
    }

    public void setFrom(com.twilio.type.Endpoint from) {
        this.from = from;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }

    public com.twilio.type.Endpoint getTo() {
        return to;
    }

    public void setTo(com.twilio.type.Endpoint to) {
        this.to = to;
    }

    public com.twilio.type.Twiml getTwiml() {
        return twiml;
    }

    public void setTwiml(com.twilio.type.Twiml twiml) {
        this.twiml = twiml;
    }

    public java.net.URI getUrl() {
        return url;
    }

    public void setUrl(java.net.URI url) {
        this.url = url;
    }
}