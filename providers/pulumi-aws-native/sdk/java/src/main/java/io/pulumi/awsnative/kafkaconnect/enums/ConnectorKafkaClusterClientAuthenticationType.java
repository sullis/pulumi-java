// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of client authentication used to connect to the Kafka cluster. Value NONE means that no client authentication is used.
     * 
     */
    @EnumType
    public enum ConnectorKafkaClusterClientAuthenticationType {
        None("NONE"),
        Iam("IAM");

        private final String value;

        ConnectorKafkaClusterClientAuthenticationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConnectorKafkaClusterClientAuthenticationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
