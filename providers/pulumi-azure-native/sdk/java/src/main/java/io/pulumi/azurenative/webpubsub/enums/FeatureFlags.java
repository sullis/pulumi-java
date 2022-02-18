// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * FeatureFlags is the supported features of Azure SignalR service.
     *  - EnableConnectivityLogs: "true"/"false", to enable/disable the connectivity log category respectively.
     *  - EnableMessagingLogs: "true"/"false", to enable/disable the connectivity log category respectively.
     *  - EnableLiveTrace: Live Trace allows you to know what's happening inside Azure SignalR service, it will give you live traces in real time, it will be helpful when you developing your own Azure SignalR based web application or self-troubleshooting some issues. Please note that live traces are counted as outbound messages that will be charged. Values allowed: "true"/"false", to enable/disable live trace feature.
     * 
     */
    @EnumType
    public enum FeatureFlags {
        EnableConnectivityLogs("EnableConnectivityLogs"),
        EnableMessagingLogs("EnableMessagingLogs"),
        EnableLiveTrace("EnableLiveTrace");

        private final String value;

        FeatureFlags(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FeatureFlags[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
