// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates the type of database account. This can only be set at database account creation.
     * 
     */
    @EnumType
    public enum DatabaseAccountKind {
        GlobalDocumentDB("GlobalDocumentDB"),
        MongoDB("MongoDB"),
        Parse("Parse");

        private final String value;

        DatabaseAccountKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatabaseAccountKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
