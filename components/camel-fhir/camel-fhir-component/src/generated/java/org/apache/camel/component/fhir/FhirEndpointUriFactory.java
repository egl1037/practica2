/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.fhir;

import javax.annotation.processing.Generated;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateEndpointUriFactoryMojo")
public class FhirEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiName/methodName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(81);
        props.add("accessToken");
        props.add("apiName");
        props.add("asynchronous");
        props.add("backoffErrorThreshold");
        props.add("backoffIdleThreshold");
        props.add("backoffMultiplier");
        props.add("bridgeErrorHandler");
        props.add("bundle");
        props.add("client");
        props.add("clientFactory");
        props.add("compress");
        props.add("connectionTimeout");
        props.add("count");
        props.add("cutoff");
        props.add("deferModelScanning");
        props.add("delay");
        props.add("encoding");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("extraParameters");
        props.add("fhirContext");
        props.add("fhirVersion");
        props.add("forceConformanceCheck");
        props.add("greedy");
        props.add("iCutoff");
        props.add("iUrl");
        props.add("id");
        props.add("ifVersionMatches");
        props.add("inBody");
        props.add("initialDelay");
        props.add("lazyStartProducer");
        props.add("log");
        props.add("longId");
        props.add("meta");
        props.add("metaType");
        props.add("methodName");
        props.add("msgBundle");
        props.add("name");
        props.add("outputParameterType");
        props.add("parameters");
        props.add("password");
        props.add("patchBody");
        props.add("pollStrategy");
        props.add("preferReturn");
        props.add("prettyPrint");
        props.add("proxyHost");
        props.add("proxyPassword");
        props.add("proxyPort");
        props.add("proxyUser");
        props.add("repeatCount");
        props.add("resource");
        props.add("resourceAsString");
        props.add("resourceClass");
        props.add("resourceType");
        props.add("resources");
        props.add("respondToUri");
        props.add("responseClass");
        props.add("returnNull");
        props.add("returnResource");
        props.add("returnType");
        props.add("runLoggingLevel");
        props.add("scheduledExecutorService");
        props.add("scheduler");
        props.add("schedulerProperties");
        props.add("sendEmptyMessageWhenIdle");
        props.add("serverUrl");
        props.add("sessionCookie");
        props.add("socketTimeout");
        props.add("startScheduler");
        props.add("stringBundle");
        props.add("stringId");
        props.add("summary");
        props.add("throwError");
        props.add("timeUnit");
        props.add("type");
        props.add("url");
        props.add("useFixedDelay");
        props.add("useHttpGet");
        props.add("username");
        props.add("validationMode");
        props.add("version");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(5);
        secretProps.add("accessToken");
        secretProps.add("password");
        secretProps.add("proxyPassword");
        secretProps.add("proxyUser");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "fhir".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "methodName", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}
