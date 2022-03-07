// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The replication mode of a distributed availability group. Parameter will be ignored during link creation.
     * 
     */
    @EnumType
    public enum ReplicationMode {
        Async("Async"),
        Sync("Sync");

        private final String value;

        ReplicationMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ReplicationMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }