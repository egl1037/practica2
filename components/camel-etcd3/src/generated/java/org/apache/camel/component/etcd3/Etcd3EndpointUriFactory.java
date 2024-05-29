/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.etcd3;

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
public class Etcd3EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":path";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(26);
        props.add("authHeaders");
        props.add("authority");
        props.add("bridgeErrorHandler");
        props.add("connectionTimeout");
        props.add("endpoints");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("fromIndex");
        props.add("headers");
        props.add("keepAliveTime");
        props.add("keepAliveTimeout");
        props.add("keyCharset");
        props.add("lazyStartProducer");
        props.add("loadBalancerPolicy");
        props.add("maxInboundMessageSize");
        props.add("namespace");
        props.add("password");
        props.add("path");
        props.add("prefix");
        props.add("retryDelay");
        props.add("retryMaxDelay");
        props.add("retryMaxDuration");
        props.add("servicePath");
        props.add("sslContext");
        props.add("userName");
        props.add("valueCharset");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("password");
        secretProps.add("userName");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(2);
        prefixes.add("authHeaders.");
        prefixes.add("headers.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "etcd3".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "path", null, false, copy);
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
