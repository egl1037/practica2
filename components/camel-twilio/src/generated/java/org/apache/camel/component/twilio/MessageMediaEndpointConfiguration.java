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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.message.Media}.
 */
@ApiParams(apiName = "message-media", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "deleter", signatures={"com.twilio.rest.api.v2010.account.message.MediaDeleter deleter(String pathMessageSid, String pathSid)", "com.twilio.rest.api.v2010.account.message.MediaDeleter deleter(String pathAccountSid, String pathMessageSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", signatures={"com.twilio.rest.api.v2010.account.message.MediaFetcher fetcher(String pathMessageSid, String pathSid)", "com.twilio.rest.api.v2010.account.message.MediaFetcher fetcher(String pathAccountSid, String pathMessageSid, String pathSid)"}), @ApiMethod(methodName = "reader", signatures={"com.twilio.rest.api.v2010.account.message.MediaReader reader(String pathMessageSid)", "com.twilio.rest.api.v2010.account.message.MediaReader reader(String pathAccountSid, String pathMessageSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class MessageMediaEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader"), @ApiMethod(methodName = "reader")})
    private String pathMessageSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher")})
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathMessageSid() {
        return pathMessageSid;
    }

    public void setPathMessageSid(String pathMessageSid) {
        this.pathMessageSid = pathMessageSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
