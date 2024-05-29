/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.djl;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class DJLEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DJLEndpoint target = (DJLEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "artifactid":
        case "artifactId": target.setArtifactId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "model": target.setModel(property(camelContext, java.lang.String.class, value)); return true;
        case "translator": target.setTranslator(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "artifactid":
        case "artifactId": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "model": return java.lang.String.class;
        case "translator": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DJLEndpoint target = (DJLEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "artifactid":
        case "artifactId": return target.getArtifactId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "model": return target.getModel();
        case "translator": return target.getTranslator();
        default: return null;
        }
    }
}

