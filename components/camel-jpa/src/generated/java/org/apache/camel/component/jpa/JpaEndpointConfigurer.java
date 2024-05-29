/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jpa;

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
public class JpaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JpaEndpoint target = (JpaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumedelete":
        case "consumeDelete": target.setConsumeDelete(property(camelContext, boolean.class, value)); return true;
        case "consumelockentity":
        case "consumeLockEntity": target.setConsumeLockEntity(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "deletehandler":
        case "deleteHandler": target.setDeleteHandler(property(camelContext, org.apache.camel.component.jpa.DeleteHandler.class, value)); return true;
        case "entitymanagerproperties":
        case "entityManagerProperties": target.setEntityManagerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "findentity":
        case "findEntity": target.setFindEntity(property(camelContext, boolean.class, value)); return true;
        case "firstresult":
        case "firstResult": target.setFirstResult(property(camelContext, int.class, value)); return true;
        case "flushonsend":
        case "flushOnSend": target.setFlushOnSend(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "jointransaction":
        case "joinTransaction": target.setJoinTransaction(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "lockmodetype":
        case "lockModeType": target.setLockModeType(property(camelContext, jakarta.persistence.LockModeType.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "maximumresults":
        case "maximumResults": target.setMaximumResults(property(camelContext, int.class, value)); return true;
        case "namedquery":
        case "namedQuery": target.setNamedQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "nativequery":
        case "nativeQuery": target.setNativeQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "outputtarget":
        case "outputTarget": target.setOutputTarget(property(camelContext, java.lang.String.class, value)); return true;
        case "parameters": target.setParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "persistenceunit":
        case "persistenceUnit": target.setPersistenceUnit(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "predeletehandler":
        case "preDeleteHandler": target.setPreDeleteHandler(property(camelContext, org.apache.camel.component.jpa.DeleteHandler.class, value)); return true;
        case "query": target.setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "remove": target.setRemove(property(camelContext, boolean.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "resultclass":
        case "resultClass": target.setResultClass(property(camelContext, java.lang.Class.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "sharedentitymanager":
        case "sharedEntityManager": target.setSharedEntityManager(property(camelContext, boolean.class, value)); return true;
        case "singleresult":
        case "singleResult": target.setSingleResult(property(camelContext, boolean.class, value)); return true;
        case "skiplockedentity":
        case "skipLockedEntity": target.setSkipLockedEntity(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "transacted": target.setTransacted(property(camelContext, boolean.class, value)); return true;
        case "useexecuteupdate":
        case "useExecuteUpdate": target.setUseExecuteUpdate(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "usepassedinentitymanager":
        case "usePassedInEntityManager": target.setUsePassedInEntityManager(property(camelContext, boolean.class, value)); return true;
        case "usepersist":
        case "usePersist": target.setUsePersist(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "consumedelete":
        case "consumeDelete": return boolean.class;
        case "consumelockentity":
        case "consumeLockEntity": return boolean.class;
        case "delay": return long.class;
        case "deletehandler":
        case "deleteHandler": return org.apache.camel.component.jpa.DeleteHandler.class;
        case "entitymanagerproperties":
        case "entityManagerProperties": return java.util.Map.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "findentity":
        case "findEntity": return boolean.class;
        case "firstresult":
        case "firstResult": return int.class;
        case "flushonsend":
        case "flushOnSend": return boolean.class;
        case "greedy": return boolean.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "jointransaction":
        case "joinTransaction": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "lockmodetype":
        case "lockModeType": return jakarta.persistence.LockModeType.class;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return int.class;
        case "maximumresults":
        case "maximumResults": return int.class;
        case "namedquery":
        case "namedQuery": return java.lang.String.class;
        case "nativequery":
        case "nativeQuery": return java.lang.String.class;
        case "outputtarget":
        case "outputTarget": return java.lang.String.class;
        case "parameters": return java.util.Map.class;
        case "persistenceunit":
        case "persistenceUnit": return java.lang.String.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "predeletehandler":
        case "preDeleteHandler": return org.apache.camel.component.jpa.DeleteHandler.class;
        case "query": return java.lang.String.class;
        case "remove": return boolean.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "resultclass":
        case "resultClass": return java.lang.Class.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "sharedentitymanager":
        case "sharedEntityManager": return boolean.class;
        case "singleresult":
        case "singleResult": return boolean.class;
        case "skiplockedentity":
        case "skipLockedEntity": return boolean.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "transacted": return boolean.class;
        case "useexecuteupdate":
        case "useExecuteUpdate": return java.lang.Boolean.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        case "usepassedinentitymanager":
        case "usePassedInEntityManager": return boolean.class;
        case "usepersist":
        case "usePersist": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JpaEndpoint target = (JpaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumedelete":
        case "consumeDelete": return target.isConsumeDelete();
        case "consumelockentity":
        case "consumeLockEntity": return target.isConsumeLockEntity();
        case "delay": return target.getDelay();
        case "deletehandler":
        case "deleteHandler": return target.getDeleteHandler();
        case "entitymanagerproperties":
        case "entityManagerProperties": return target.getEntityManagerProperties();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "findentity":
        case "findEntity": return target.isFindEntity();
        case "firstresult":
        case "firstResult": return target.getFirstResult();
        case "flushonsend":
        case "flushOnSend": return target.isFlushOnSend();
        case "greedy": return target.isGreedy();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "jointransaction":
        case "joinTransaction": return target.isJoinTransaction();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "lockmodetype":
        case "lockModeType": return target.getLockModeType();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return target.getMaxMessagesPerPoll();
        case "maximumresults":
        case "maximumResults": return target.getMaximumResults();
        case "namedquery":
        case "namedQuery": return target.getNamedQuery();
        case "nativequery":
        case "nativeQuery": return target.getNativeQuery();
        case "outputtarget":
        case "outputTarget": return target.getOutputTarget();
        case "parameters": return target.getParameters();
        case "persistenceunit":
        case "persistenceUnit": return target.getPersistenceUnit();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "predeletehandler":
        case "preDeleteHandler": return target.getPreDeleteHandler();
        case "query": return target.getQuery();
        case "remove": return target.isRemove();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "resultclass":
        case "resultClass": return target.getResultClass();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "sharedentitymanager":
        case "sharedEntityManager": return target.isSharedEntityManager();
        case "singleresult":
        case "singleResult": return target.isSingleResult();
        case "skiplockedentity":
        case "skipLockedEntity": return target.isSkipLockedEntity();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "transacted": return target.isTransacted();
        case "useexecuteupdate":
        case "useExecuteUpdate": return target.getUseExecuteUpdate();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "usepassedinentitymanager":
        case "usePassedInEntityManager": return target.isUsePassedInEntityManager();
        case "usepersist":
        case "usePersist": return target.isUsePersist();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "deletehandler":
        case "deleteHandler": return java.lang.Object.class;
        case "entitymanagerproperties":
        case "entityManagerProperties": return java.lang.Object.class;
        case "parameters": return java.lang.Object.class;
        case "predeletehandler":
        case "preDeleteHandler": return java.lang.Object.class;
        case "resultclass":
        case "resultClass": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

