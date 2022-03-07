// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Collation of the metadata catalog.
     * 
     */
    @EnumType
    public enum CatalogCollationType {
        DATABASE_DEFAULT("DATABASE_DEFAULT"),
        SQL_Latin1_General_CP1_CI_AS("SQL_Latin1_General_CP1_CI_AS");

        private final String value;

        CatalogCollationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CatalogCollationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }