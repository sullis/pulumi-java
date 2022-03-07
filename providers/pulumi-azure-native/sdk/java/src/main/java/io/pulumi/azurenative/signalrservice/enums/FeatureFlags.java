// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * FeatureFlags is the supported features of Azure SignalR service.
     * - ServiceMode: Flag for backend server for SignalR service. Values allowed: "Default": have your own backend server; "Serverless": your application doesn't have a backend server; "Classic": for backward compatibility. Support both Default and Serverless mode but not recommended; "PredefinedOnly": for future use.
     * - EnableConnectivityLogs: "true"/"false", to enable/disable the connectivity log category respectively.
     * 
     */
    @EnumType
    public enum FeatureFlags {
        ServiceMode("ServiceMode"),
        EnableConnectivityLogs("EnableConnectivityLogs"),
        EnableMessagingLogs("EnableMessagingLogs");

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