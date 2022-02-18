// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The event type for which this notification is enabled (i.e. AutoShutdown, Cost)
     * 
     */
    @EnumType
    public enum NotificationChannelEventType {
        AutoShutdown("AutoShutdown"),
        Cost("Cost");

        private final String value;

        NotificationChannelEventType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NotificationChannelEventType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
