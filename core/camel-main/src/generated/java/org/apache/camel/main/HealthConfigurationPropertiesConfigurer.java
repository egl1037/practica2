/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.HealthConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class HealthConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.HealthConfigurationProperties target = (org.apache.camel.main.HealthConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "consumersenabled":
        case "consumersEnabled": target.setConsumersEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "enabled": target.setEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "excludepattern":
        case "excludePattern": target.setExcludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "exposurelevel":
        case "exposureLevel": target.setExposureLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "initialstate":
        case "initialState": target.setInitialState(property(camelContext, java.lang.String.class, value)); return true;
        case "producersenabled":
        case "producersEnabled": target.setProducersEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "registryenabled":
        case "registryEnabled": target.setRegistryEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "routesenabled":
        case "routesEnabled": target.setRoutesEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "consumersenabled":
        case "consumersEnabled": return java.lang.Boolean.class;
        case "enabled": return java.lang.Boolean.class;
        case "excludepattern":
        case "excludePattern": return java.lang.String.class;
        case "exposurelevel":
        case "exposureLevel": return java.lang.String.class;
        case "initialstate":
        case "initialState": return java.lang.String.class;
        case "producersenabled":
        case "producersEnabled": return java.lang.Boolean.class;
        case "registryenabled":
        case "registryEnabled": return java.lang.Boolean.class;
        case "routesenabled":
        case "routesEnabled": return java.lang.Boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.HealthConfigurationProperties target = (org.apache.camel.main.HealthConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "consumersenabled":
        case "consumersEnabled": return target.getConsumersEnabled();
        case "enabled": return target.getEnabled();
        case "excludepattern":
        case "excludePattern": return target.getExcludePattern();
        case "exposurelevel":
        case "exposureLevel": return target.getExposureLevel();
        case "initialstate":
        case "initialState": return target.getInitialState();
        case "producersenabled":
        case "producersEnabled": return target.getProducersEnabled();
        case "registryenabled":
        case "registryEnabled": return target.getRegistryEnabled();
        case "routesenabled":
        case "routesEnabled": return target.getRoutesEnabled();
        default: return null;
        }
    }
}
