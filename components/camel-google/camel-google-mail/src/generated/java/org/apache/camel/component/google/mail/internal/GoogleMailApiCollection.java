/*
 * Camel ApiCollection generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.mail.internal;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.component.google.mail.GoogleMailConfiguration;
import org.apache.camel.component.google.mail.GmailUsersThreadsEndpointConfiguration;
import org.apache.camel.component.google.mail.GmailUsersMessagesEndpointConfiguration;
import org.apache.camel.component.google.mail.GmailUsersMessagesAttachmentsEndpointConfiguration;
import org.apache.camel.component.google.mail.GmailUsersLabelsEndpointConfiguration;
import org.apache.camel.component.google.mail.GmailUsersHistoryEndpointConfiguration;
import org.apache.camel.component.google.mail.GmailUsersDraftsEndpointConfiguration;
import org.apache.camel.component.google.mail.GmailUsersEndpointConfiguration;

import org.apache.camel.support.component.ApiCollection;
import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodHelper;

/**
 * Camel {@link ApiCollection} for GoogleMail
 */
public final class GoogleMailApiCollection extends ApiCollection<GoogleMailApiName, GoogleMailConfiguration> {

    private static GoogleMailApiCollection collection;

    private GoogleMailApiCollection() {
        final Map<String, String> aliases = new HashMap<>();
        final Map<GoogleMailApiName, ApiMethodHelper<? extends ApiMethod>> apiHelpers = new EnumMap<>(GoogleMailApiName.class);
        final Map<Class<? extends ApiMethod>, GoogleMailApiName> apiMethods = new HashMap<>();

        List<String> nullableArgs;

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleMailApiName.THREADS, new ApiMethodHelper<>(GmailUsersThreadsApiMethod.class, aliases, nullableArgs));
        apiMethods.put(GmailUsersThreadsApiMethod.class, GoogleMailApiName.THREADS);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleMailApiName.MESSAGES, new ApiMethodHelper<>(GmailUsersMessagesApiMethod.class, aliases, nullableArgs));
        apiMethods.put(GmailUsersMessagesApiMethod.class, GoogleMailApiName.MESSAGES);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleMailApiName.ATTACHMENTS, new ApiMethodHelper<>(GmailUsersMessagesAttachmentsApiMethod.class, aliases, nullableArgs));
        apiMethods.put(GmailUsersMessagesAttachmentsApiMethod.class, GoogleMailApiName.ATTACHMENTS);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleMailApiName.LABELS, new ApiMethodHelper<>(GmailUsersLabelsApiMethod.class, aliases, nullableArgs));
        apiMethods.put(GmailUsersLabelsApiMethod.class, GoogleMailApiName.LABELS);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleMailApiName.HISTORY, new ApiMethodHelper<>(GmailUsersHistoryApiMethod.class, aliases, nullableArgs));
        apiMethods.put(GmailUsersHistoryApiMethod.class, GoogleMailApiName.HISTORY);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleMailApiName.DRAFTS, new ApiMethodHelper<>(GmailUsersDraftsApiMethod.class, aliases, nullableArgs));
        apiMethods.put(GmailUsersDraftsApiMethod.class, GoogleMailApiName.DRAFTS);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(GoogleMailApiName.USERS, new ApiMethodHelper<>(GmailUsersApiMethod.class, aliases, nullableArgs));
        apiMethods.put(GmailUsersApiMethod.class, GoogleMailApiName.USERS);

        setApiHelpers(apiHelpers);
        setApiMethods(apiMethods);
    }

    public GoogleMailConfiguration getEndpointConfiguration(GoogleMailApiName apiName) {
        GoogleMailConfiguration result = null;
        switch (apiName) {
            case THREADS:
                result = new GmailUsersThreadsEndpointConfiguration();
                break;
            case MESSAGES:
                result = new GmailUsersMessagesEndpointConfiguration();
                break;
            case ATTACHMENTS:
                result = new GmailUsersMessagesAttachmentsEndpointConfiguration();
                break;
            case LABELS:
                result = new GmailUsersLabelsEndpointConfiguration();
                break;
            case HISTORY:
                result = new GmailUsersHistoryEndpointConfiguration();
                break;
            case DRAFTS:
                result = new GmailUsersDraftsEndpointConfiguration();
                break;
            case USERS:
                result = new GmailUsersEndpointConfiguration();
                break;
        }
        return result;
    }

    public static synchronized GoogleMailApiCollection getCollection() {
        if (collection == null) {
            collection = new GoogleMailApiCollection();
        }
        return collection;
    }
}