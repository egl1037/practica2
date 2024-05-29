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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.incomingphonenumber.TollFree}.
 */
@ApiParams(apiName = "incoming-phone-number-toll-free", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", signatures={"com.twilio.rest.api.v2010.account.incomingphonenumber.TollFreeCreator creator(com.twilio.type.PhoneNumber phoneNumber)", "com.twilio.rest.api.v2010.account.incomingphonenumber.TollFreeCreator creator(String pathAccountSid, com.twilio.type.PhoneNumber phoneNumber)"}), @ApiMethod(methodName = "reader", signatures={"com.twilio.rest.api.v2010.account.incomingphonenumber.TollFreeReader reader()", "com.twilio.rest.api.v2010.account.incomingphonenumber.TollFreeReader reader(String pathAccountSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class IncomingPhoneNumberTollFreeEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator"), @ApiMethod(methodName = "reader")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private com.twilio.type.PhoneNumber phoneNumber;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public com.twilio.type.PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(com.twilio.type.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}