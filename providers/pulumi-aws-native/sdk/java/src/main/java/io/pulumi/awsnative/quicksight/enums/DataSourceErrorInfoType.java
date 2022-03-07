// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DataSourceErrorInfoType {
        AccessDenied("ACCESS_DENIED"),
        CopySourceNotFound("COPY_SOURCE_NOT_FOUND"),
        Timeout("TIMEOUT"),
        EngineVersionNotSupported("ENGINE_VERSION_NOT_SUPPORTED"),
        UnknownHost("UNKNOWN_HOST"),
        GenericSqlFailure("GENERIC_SQL_FAILURE"),
        Conflict("CONFLICT"),
        Unknown("UNKNOWN");

        private final String value;

        DataSourceErrorInfoType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataSourceErrorInfoType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }