/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty;

import javax.annotation.processing.Generated;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.TypeConverterLoaderGeneratorMojo")
@SuppressWarnings("unchecked")
@DeferredContextBinding
public final class NettyConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public NettyConverterLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, byte[].class, io.netty.buffer.ByteBuf.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.NettyConverter.toByteArray((io.netty.buffer.ByteBuf) value, exchange));
        addTypeConverter(registry, io.netty.buffer.ByteBuf.class, byte[].class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.NettyConverter.toByteBuffer((byte[]) value));
        addTypeConverter(registry, io.netty.buffer.ByteBuf.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.NettyConverter.toByteBuffer((java.lang.String) value, exchange));
        addTypeConverter(registry, java.io.InputStream.class, io.netty.buffer.ByteBuf.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.NettyConverter.toInputStream((io.netty.buffer.ByteBuf) value, exchange));
        addTypeConverter(registry, java.io.ObjectInput.class, io.netty.buffer.ByteBuf.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.NettyConverter.toObjectInput((io.netty.buffer.ByteBuf) value, exchange));
        addTypeConverter(registry, java.lang.String.class, io.netty.buffer.ByteBuf.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.NettyConverter.toString((io.netty.buffer.ByteBuf) value, exchange));
        addTypeConverter(registry, javax.xml.transform.dom.DOMSource.class, io.netty.buffer.ByteBuf.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.NettyConverter.toDOMSource((io.netty.buffer.ByteBuf) value, exchange));
        addTypeConverter(registry, javax.xml.transform.sax.SAXSource.class, io.netty.buffer.ByteBuf.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.NettyConverter.toSAXSource((io.netty.buffer.ByteBuf) value, exchange));
        addTypeConverter(registry, javax.xml.transform.stax.StAXSource.class, io.netty.buffer.ByteBuf.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.NettyConverter.toStAXSource((io.netty.buffer.ByteBuf) value, exchange));
        addTypeConverter(registry, javax.xml.transform.stream.StreamSource.class, io.netty.buffer.ByteBuf.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.NettyConverter.toStreamSource((io.netty.buffer.ByteBuf) value, exchange));
        addTypeConverter(registry, org.w3c.dom.Document.class, io.netty.buffer.ByteBuf.class, false,
            (type, exchange, value) -> org.apache.camel.component.netty.NettyConverter.toDocument((io.netty.buffer.ByteBuf) value, exchange));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) {
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }
}
