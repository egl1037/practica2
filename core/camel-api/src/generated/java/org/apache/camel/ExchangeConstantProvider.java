/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpiGeneratorMojo")
public class ExchangeConstantProvider {

    private static final Map<String, String> MAP;
    static {
        Map<String, String> map = new HashMap<>(155);
        map.put("ACCEPT_CONTENT_TYPE", "CamelAcceptContentType");
        map.put("AGGREGATED_COLLECTION_GUARD", "CamelAggregatedCollectionGuard");
        map.put("AGGREGATED_COMPLETED_BY", "CamelAggregatedCompletedBy");
        map.put("AGGREGATED_CORRELATION_KEY", "CamelAggregatedCorrelationKey");
        map.put("AGGREGATED_SIZE", "CamelAggregatedSize");
        map.put("AGGREGATED_TIMEOUT", "CamelAggregatedTimeout");
        map.put("AGGREGATION_COMPLETE_ALL_GROUPS", "CamelAggregationCompleteAllGroups");
        map.put("AGGREGATION_COMPLETE_ALL_GROUPS_INCLUSIVE", "CamelAggregationCompleteAllGroupsInclusive");
        map.put("AGGREGATION_COMPLETE_CURRENT_GROUP", "CamelAggregationCompleteCurrentGroup");
        map.put("AGGREGATION_STRATEGY", "CamelAggregationStrategy");
        map.put("ASYNC_WAIT", "CamelAsyncWait");
        map.put("AUTHENTICATION", "CamelAuthentication");
        map.put("AUTHENTICATION_FAILURE_POLICY_ID", "CamelAuthenticationFailurePolicyId");
        map.put("BATCH_COMPLETE", "CamelBatchComplete");
        map.put("BATCH_INDEX", "CamelBatchIndex");
        map.put("BATCH_SIZE", "CamelBatchSize");
        map.put("BEAN_METHOD_NAME", "CamelBeanMethodName");
        map.put("BINDING", "CamelBinding");
        map.put("BREADCRUMB_ID", "breadcrumbId");
        map.put("CHARSET_NAME", "CamelCharsetName");
        map.put("CIRCUIT_BREAKER_STATE", "CamelCircuitBreakerState");
        map.put("CLAIM_CHECK_REPOSITORY", "CamelClaimCheckRepository");
        map.put("COMPILE_SCRIPT", "CamelCompileScript");
        map.put("CONTENT_ENCODING", "Content-Encoding");
        map.put("CONTENT_LENGTH", "Content-Length");
        map.put("CONTENT_SCHEMA", "CamelContentSchema");
        map.put("CONTENT_SCHEMA_TYPE", "CamelContentSchemaType");
        map.put("CONTENT_TYPE", "Content-Type");
        map.put("COOKIE_HANDLER", "CamelCookieHandler");
        map.put("CORRELATION_ID", "CamelCorrelationId");
        map.put("CREATED_TIMESTAMP", "CamelCreatedTimestamp");
        map.put("DATASET_INDEX", "CamelDataSetIndex");
        map.put("DEFAULT_CHARSET_PROPERTY", "org.apache.camel.default.charset");
        map.put("DESTINATION_OVERRIDE_URL", "CamelDestinationOverrideUrl");
        map.put("DISABLE_HTTP_STREAM_CACHE", "CamelDisableHttpStreamCache");
        map.put("DOCUMENT_BUILDER_FACTORY", "CamelDocumentBuilderFactory");
        map.put("DUPLICATE_MESSAGE", "CamelDuplicateMessage");
        map.put("ERRORHANDLER_BRIDGE", "CamelErrorHandlerBridge");
        map.put("ERRORHANDLER_CIRCUIT_DETECTED", "CamelErrorHandlerCircuitDetected");
        map.put("ERRORHANDLER_HANDLED", "CamelErrorHandlerHandled");
        map.put("EVALUATE_EXPRESSION_RESULT", "CamelEvaluateExpressionResult");
        map.put("EXCEPTION_CAUGHT", "CamelExceptionCaught");
        map.put("EXCEPTION_HANDLED", "CamelExceptionHandled");
        map.put("EXTERNAL_REDELIVERED", "CamelExternalRedelivered");
        map.put("FAILURE_ENDPOINT", "CamelFailureEndpoint");
        map.put("FAILURE_HANDLED", "CamelFailureHandled");
        map.put("FAILURE_ROUTE_ID", "CamelFailureRouteId");
        map.put("FATAL_FALLBACK_ERROR_HANDLER", "CamelFatalFallbackErrorHandler");
        map.put("FILE_CONTENT_TYPE", "CamelFileContentType");
        map.put("FILE_LAST_MODIFIED", "CamelFileLastModified");
        map.put("FILE_LENGTH", "CamelFileLength");
        map.put("FILE_LOCAL_WORK_PATH", "CamelFileLocalWorkPath");
        map.put("FILE_LOCK_CHANNEL_FILE", "CamelFileLockChannelFile");
        map.put("FILE_LOCK_EXCLUSIVE_LOCK", "CamelFileLockExclusiveLock");
        map.put("FILE_LOCK_FILE_ACQUIRED", "CamelFileLockFileAcquired");
        map.put("FILE_LOCK_FILE_NAME", "CamelFileLockFileName");
        map.put("FILE_LOCK_RANDOM_ACCESS_FILE", "CamelFileLockRandomAccessFile");
        map.put("FILE_NAME", "CamelFileName");
        map.put("FILE_NAME_CONSUMED", "CamelFileNameConsumed");
        map.put("FILE_NAME_ONLY", "CamelFileNameOnly");
        map.put("FILE_NAME_PRODUCED", "CamelFileNameProduced");
        map.put("FILE_PARENT", "CamelFileParent");
        map.put("FILE_PATH", "CamelFilePath");
        map.put("FILTER_MATCHED", "CamelFilterMatched");
        map.put("FILTER_NON_XML_CHARS", "CamelFilterNonXmlChars");
        map.put("GROUPED_EXCHANGE", "CamelGroupedExchange");
        map.put("HTTP_BASE_URI", "CamelHttpBaseUri");
        map.put("HTTP_CHARACTER_ENCODING", "CamelHttpCharacterEncoding");
        map.put("HTTP_CHUNKED", "CamelHttpChunked");
        map.put("HTTP_HOST", "CamelHttpHost");
        map.put("HTTP_METHOD", "CamelHttpMethod");
        map.put("HTTP_PATH", "CamelHttpPath");
        map.put("HTTP_PORT", "CamelHttpPort");
        map.put("HTTP_PROTOCOL_VERSION", "CamelHttpProtocolVersion");
        map.put("HTTP_QUERY", "CamelHttpQuery");
        map.put("HTTP_RAW_QUERY", "CamelHttpRawQuery");
        map.put("HTTP_RESPONSE_CODE", "CamelHttpResponseCode");
        map.put("HTTP_RESPONSE_TEXT", "CamelHttpResponseText");
        map.put("HTTP_SCHEME", "CamelHttpScheme");
        map.put("HTTP_SERVLET_REQUEST", "CamelHttpServletRequest");
        map.put("HTTP_SERVLET_RESPONSE", "CamelHttpServletResponse");
        map.put("HTTP_URI", "CamelHttpUri");
        map.put("HTTP_URL", "CamelHttpUrl");
        map.put("INTERCEPT_SEND_TO_ENDPOINT_WHEN_MATCHED", "CamelInterceptSendToEndpointWhenMatched");
        map.put("INTERCEPTED_ENDPOINT", "CamelInterceptedEndpoint");
        map.put("INTERRUPTED", "CamelInterrupted");
        map.put("LANGUAGE_SCRIPT", "CamelLanguageScript");
        map.put("LOG_DEBUG_BODY_MAX_CHARS", "CamelLogDebugBodyMaxChars");
        map.put("LOG_DEBUG_BODY_STREAMS", "CamelLogDebugStreams");
        map.put("LOG_EIP_NAME", "CamelLogEipName");
        map.put("LOOP_INDEX", "CamelLoopIndex");
        map.put("LOOP_SIZE", "CamelLoopSize");
        map.put("MAXIMUM_CACHE_POOL_SIZE", "CamelMaximumCachePoolSize");
        map.put("MAXIMUM_ENDPOINT_CACHE_SIZE", "CamelMaximumEndpointCacheSize");
        map.put("MAXIMUM_SIMPLE_CACHE_SIZE", "CamelMaximumSimpleCacheSize");
        map.put("MAXIMUM_TRANSFORMER_CACHE_SIZE", "CamelMaximumTransformerCacheSize");
        map.put("MAXIMUM_VALIDATOR_CACHE_SIZE", "CamelMaximumValidatorCacheSize");
        map.put("MESSAGE_HISTORY", "CamelMessageHistory");
        map.put("MESSAGE_HISTORY_HEADER_FORMAT", "CamelMessageHistoryHeaderFormat");
        map.put("MESSAGE_HISTORY_OUTPUT_FORMAT", "CamelMessageHistoryOutputFormat");
        map.put("MESSAGE_TIMESTAMP", "CamelMessageTimestamp");
        map.put("MULTICAST_COMPLETE", "CamelMulticastComplete");
        map.put("MULTICAST_INDEX", "CamelMulticastIndex");
        map.put("NOTIFY_EVENT", "CamelNotifyEvent");
        map.put("OFFSET", "CamelOffset");
        map.put("ON_COMPLETION", "CamelOnCompletion");
        map.put("ON_COMPLETION_ROUTE_IDS", "CamelOnCompletionRouteIds");
        map.put("OVERRULE_FILE_NAME", "CamelOverruleFileName");
        map.put("PARENT_UNIT_OF_WORK", "CamelParentUnitOfWork");
        map.put("RECEIVED_TIMESTAMP", "CamelReceivedTimestamp");
        map.put("RECIPIENT_LIST_ENDPOINT", "CamelRecipientListEndpoint");
        map.put("REDELIVERED", "CamelRedelivered");
        map.put("REDELIVERY_COUNTER", "CamelRedeliveryCounter");
        map.put("REDELIVERY_DELAY", "CamelRedeliveryDelay");
        map.put("REDELIVERY_EXHAUSTED", "CamelRedeliveryExhausted");
        map.put("REDELIVERY_MAX_COUNTER", "CamelRedeliveryMaxCounter");
        map.put("REST_HTTP_QUERY", "CamelRestHttpQuery");
        map.put("REST_HTTP_URI", "CamelRestHttpUri");
        map.put("REUSE_SCRIPT_ENGINE", "CamelReuseScripteEngine");
        map.put("ROLLBACK_ONLY", "CamelRollbackOnly");
        map.put("ROLLBACK_ONLY_LAST", "CamelRollbackOnlyLast");
        map.put("ROUTE_STOP", "CamelRouteStop");
        map.put("SAGA_LONG_RUNNING_ACTION", "Long-Running-Action");
        map.put("SAXPARSER_FACTORY", "CamelSAXParserFactory");
        map.put("SCHEDULER_POLLED_MESSAGES", "CamelSchedulerPolledMessages");
        map.put("SKIP_GZIP_ENCODING", "CamelSkipGzipEncoding");
        map.put("SKIP_WWW_FORM_URLENCODED", "CamelSkipWwwFormUrlEncoding");
        map.put("SLIP_ENDPOINT", "CamelSlipEndpoint");
        map.put("SLIP_PRODUCER", "CamelSlipProducer");
        map.put("SOAP_ACTION", "CamelSoapAction");
        map.put("SPLIT_COMPLETE", "CamelSplitComplete");
        map.put("SPLIT_INDEX", "CamelSplitIndex");
        map.put("SPLIT_SIZE", "CamelSplitSize");
        map.put("STEP_ID", "CamelStepId");
        map.put("STREAM_CACHE_UNIT_OF_WORK", "CamelStreamCacheUnitOfWork");
        map.put("TIMER_COUNTER", "CamelTimerCounter");
        map.put("TIMER_FIRED_TIME", "CamelTimerFiredTime");
        map.put("TIMER_NAME", "CamelTimerName");
        map.put("TIMER_PERIOD", "CamelTimerPeriod");
        map.put("TIMER_TIME", "CamelTimerTime");
        map.put("TO_ENDPOINT", "CamelToEndpoint");
        map.put("TRACE_EVENT", "CamelTraceEvent");
        map.put("TRACE_EVENT_EXCHANGE", "CamelTraceEventExchange");
        map.put("TRACE_EVENT_NODE_ID", "CamelTraceEventNodeId");
        map.put("TRACE_EVENT_TIMESTAMP", "CamelTraceEventTimestamp");
        map.put("TRACING_HEADER_FORMAT", "CamelTracingHeaderFormat");
        map.put("TRACING_OUTPUT_FORMAT", "CamelTracingOutputFormat");
        map.put("TRANSACTION_CONTEXT_DATA", "CamelTransactionContextData");
        map.put("TRANSFER_ENCODING", "Transfer-Encoding");
        map.put("TRY_ROUTE_BLOCK", "TryRouteBlock");
        map.put("UNIT_OF_WORK_EXHAUSTED", "CamelUnitOfWorkExhausted");
        map.put("XSLT_ERROR", "CamelXsltError");
        map.put("XSLT_FATAL_ERROR", "CamelXsltFatalError");
        map.put("XSLT_FILE_NAME", "CamelXsltFileName");
        map.put("XSLT_WARNING", "CamelXsltWarning");
        MAP = map;
    }

    public static String lookup(String key) {
        return MAP.get(key);
    }
}
