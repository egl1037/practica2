/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.remote;

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
public class FtpsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port/directoryName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(122);
        props.add("account");
        props.add("activePortRange");
        props.add("allowNullBody");
        props.add("antExclude");
        props.add("antFilterCaseSensitive");
        props.add("antInclude");
        props.add("autoCreate");
        props.add("backoffErrorThreshold");
        props.add("backoffIdleThreshold");
        props.add("backoffMultiplier");
        props.add("binary");
        props.add("bridgeErrorHandler");
        props.add("bufferSize");
        props.add("charset");
        props.add("checksumFileAlgorithm");
        props.add("chmod");
        props.add("connectTimeout");
        props.add("delay");
        props.add("delete");
        props.add("directoryName");
        props.add("disableSecureDataChannelDefaults");
        props.add("disconnect");
        props.add("disconnectOnBatchComplete");
        props.add("doneFileName");
        props.add("download");
        props.add("eagerDeleteTargetFile");
        props.add("eagerMaxMessagesPerPoll");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("exclude");
        props.add("excludeExt");
        props.add("exclusiveReadLockStrategy");
        props.add("execPbsz");
        props.add("execProt");
        props.add("fastExistsCheck");
        props.add("fileExist");
        props.add("fileName");
        props.add("filter");
        props.add("filterDirectory");
        props.add("filterFile");
        props.add("flatten");
        props.add("ftpClient");
        props.add("ftpClientConfig");
        props.add("ftpClientConfigParameters");
        props.add("ftpClientKeyStoreParameters");
        props.add("ftpClientParameters");
        props.add("ftpClientTrustStoreParameters");
        props.add("greedy");
        props.add("handleDirectoryParserAbsoluteResult");
        props.add("host");
        props.add("idempotent");
        props.add("idempotentKey");
        props.add("idempotentRepository");
        props.add("ignoreFileNotFoundOrPermissionError");
        props.add("implicit");
        props.add("inProgressRepository");
        props.add("include");
        props.add("includeExt");
        props.add("initialDelay");
        props.add("jailStartingDirectory");
        props.add("keepLastModified");
        props.add("lazyStartProducer");
        props.add("localWorkDirectory");
        props.add("maxDepth");
        props.add("maxMessagesPerPoll");
        props.add("maximumReconnectAttempts");
        props.add("minDepth");
        props.add("move");
        props.add("moveExisting");
        props.add("moveExistingFileStrategy");
        props.add("moveFailed");
        props.add("noop");
        props.add("onCompletionExceptionHandler");
        props.add("passiveMode");
        props.add("password");
        props.add("pollStrategy");
        props.add("port");
        props.add("preMove");
        props.add("preSort");
        props.add("processStrategy");
        props.add("readLock");
        props.add("readLockCheckInterval");
        props.add("readLockDeleteOrphanLockFiles");
        props.add("readLockLoggingLevel");
        props.add("readLockMarkerFile");
        props.add("readLockMinAge");
        props.add("readLockMinLength");
        props.add("readLockRemoveOnCommit");
        props.add("readLockRemoveOnRollback");
        props.add("readLockTimeout");
        props.add("reconnectDelay");
        props.add("recursive");
        props.add("repeatCount");
        props.add("resumeDownload");
        props.add("runLoggingLevel");
        props.add("scheduledExecutorService");
        props.add("scheduler");
        props.add("schedulerProperties");
        props.add("securityProtocol");
        props.add("sendEmptyMessageWhenIdle");
        props.add("sendNoop");
        props.add("separator");
        props.add("shuffle");
        props.add("siteCommand");
        props.add("soTimeout");
        props.add("sortBy");
        props.add("sorter");
        props.add("sslContextParameters");
        props.add("startScheduler");
        props.add("stepwise");
        props.add("streamDownload");
        props.add("tempFileName");
        props.add("tempPrefix");
        props.add("throwExceptionOnConnectFailed");
        props.add("timeUnit");
        props.add("timeout");
        props.add("transferLoggingIntervalSeconds");
        props.add("transferLoggingLevel");
        props.add("transferLoggingVerbose");
        props.add("useFixedDelay");
        props.add("useList");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(3);
        secretProps.add("account");
        secretProps.add("password");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(5);
        prefixes.add("ftpClient.");
        prefixes.add("ftpClient.keyStore.");
        prefixes.add("ftpClient.trustStore.");
        prefixes.add("ftpClientConfig.");
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "ftps".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, false, copy);
        uri = buildPathParameter(syntax, uri, "directoryName", null, false, copy);
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
