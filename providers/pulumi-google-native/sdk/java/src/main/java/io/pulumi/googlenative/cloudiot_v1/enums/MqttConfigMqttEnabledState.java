// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT connections to this registry will fail.
     * 
     */
    @EnumType
    public enum MqttConfigMqttEnabledState {
        /**
         * No MQTT state specified. If not specified, MQTT will be enabled by default.
         * 
         */
        MqttStateUnspecified("MQTT_STATE_UNSPECIFIED"),
        /**
         * Enables a MQTT connection.
         * 
         */
        MqttEnabled("MQTT_ENABLED"),
        /**
         * Disables a MQTT connection.
         * 
         */
        MqttDisabled("MQTT_DISABLED");

        private final String value;

        MqttConfigMqttEnabledState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MqttConfigMqttEnabledState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }