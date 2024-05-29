/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.gson;

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
public class GsonDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        GsonDataFormat dataformat = (GsonDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "unmarshaltype":
        case "unmarshalType": dataformat.setUnmarshalType(property(camelContext, java.lang.Class.class, value)); return true;
        case "prettyprint":
        case "prettyPrint": dataformat.setPrettyPrint(property(camelContext, boolean.class, value)); return true;
        case "dateformatpattern":
        case "dateFormatPattern": dataformat.setDateFormatPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "contenttypeheader":
        case "contentTypeHeader": dataformat.setContentTypeHeader(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}
