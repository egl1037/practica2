/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.twilio.CallEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class CallEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApiName", org.apache.camel.component.twilio.internal.TwilioApiName.class);
        map.put("ApplicationSid", java.lang.String.class);
        map.put("From", com.twilio.type.Endpoint.class);
        map.put("MethodName", java.lang.String.class);
        map.put("PathAccountSid", java.lang.String.class);
        map.put("PathSid", java.lang.String.class);
        map.put("To", com.twilio.type.Endpoint.class);
        map.put("Twiml", com.twilio.type.Twiml.class);
        map.put("Url", java.net.URI.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.twilio.CallEndpointConfiguration target = (org.apache.camel.component.twilio.CallEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": target.setApiName(property(camelContext, org.apache.camel.component.twilio.internal.TwilioApiName.class, value)); return true;
        case "applicationsid":
        case "applicationSid": target.setApplicationSid(property(camelContext, java.lang.String.class, value)); return true;
        case "from": target.setFrom(property(camelContext, com.twilio.type.Endpoint.class, value)); return true;
        case "methodname":
        case "methodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "pathaccountsid":
        case "pathAccountSid": target.setPathAccountSid(property(camelContext, java.lang.String.class, value)); return true;
        case "pathsid":
        case "pathSid": target.setPathSid(property(camelContext, java.lang.String.class, value)); return true;
        case "to": target.setTo(property(camelContext, com.twilio.type.Endpoint.class, value)); return true;
        case "twiml": target.setTwiml(property(camelContext, com.twilio.type.Twiml.class, value)); return true;
        case "url": target.setUrl(property(camelContext, java.net.URI.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": return org.apache.camel.component.twilio.internal.TwilioApiName.class;
        case "applicationsid":
        case "applicationSid": return java.lang.String.class;
        case "from": return com.twilio.type.Endpoint.class;
        case "methodname":
        case "methodName": return java.lang.String.class;
        case "pathaccountsid":
        case "pathAccountSid": return java.lang.String.class;
        case "pathsid":
        case "pathSid": return java.lang.String.class;
        case "to": return com.twilio.type.Endpoint.class;
        case "twiml": return com.twilio.type.Twiml.class;
        case "url": return java.net.URI.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.twilio.CallEndpointConfiguration target = (org.apache.camel.component.twilio.CallEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "apiName": return target.getApiName();
        case "applicationsid":
        case "applicationSid": return target.getApplicationSid();
        case "from": return target.getFrom();
        case "methodname":
        case "methodName": return target.getMethodName();
        case "pathaccountsid":
        case "pathAccountSid": return target.getPathAccountSid();
        case "pathsid":
        case "pathSid": return target.getPathSid();
        case "to": return target.getTo();
        case "twiml": return target.getTwiml();
        case "url": return target.getUrl();
        default: return null;
        }
    }
}
