/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.dataformat.protobuf;

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
public class ProtobufDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        ProtobufDataFormat dataformat = (ProtobufDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "contenttypeheader":
        case "contentTypeHeader": dataformat.setContentTypeHeader(property(camelContext, boolean.class, value)); return true;
        case "contenttypeformat":
        case "contentTypeFormat": dataformat.setContentTypeFormat(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

