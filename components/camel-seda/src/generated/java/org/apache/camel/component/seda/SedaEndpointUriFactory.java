/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.seda;

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
public class SedaEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":name";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(19);
        props.add("blockWhenFull");
        props.add("bridgeErrorHandler");
        props.add("concurrentConsumers");
        props.add("discardIfNoConsumers");
        props.add("discardWhenFull");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("failIfNoConsumers");
        props.add("lazyStartProducer");
        props.add("limitConcurrentConsumers");
        props.add("multipleConsumers");
        props.add("name");
        props.add("offerTimeout");
        props.add("pollTimeout");
        props.add("purgeWhenStopping");
        props.add("queue");
        props.add("size");
        props.add("timeout");
        props.add("waitForTaskToComplete");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "seda".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "name", null, true, copy);
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
