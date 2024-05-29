/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.grok;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.PackageDataFormatMojo")
@SuppressWarnings("unchecked")
public class GrokDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        GrokDataFormat dataformat = (GrokDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowmultiplematchesperline":
        case "allowMultipleMatchesPerLine": dataformat.setAllowMultipleMatchesPerLine(property(camelContext, boolean.class, value)); return true;
        case "flattened": dataformat.setFlattened(property(camelContext, boolean.class, value)); return true;
        case "namedonly":
        case "namedOnly": dataformat.setNamedOnly(property(camelContext, boolean.class, value)); return true;
        case "pattern": dataformat.setPattern(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}
