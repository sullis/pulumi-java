// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enable Geo-redundant or not for server backup.
     * 
     */
    @EnumType
    public enum GeoRedundantBackup {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        GeoRedundantBackup(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GeoRedundantBackup[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
