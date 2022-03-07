// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the routine.
     * 
     */
    @EnumType
    public enum GoogleCloudDatacatalogV1RoutineSpecRoutineType {
        /**
         * Unspecified type.
         * 
         */
        RoutineTypeUnspecified("ROUTINE_TYPE_UNSPECIFIED"),
        /**
         * Non-builtin permanent scalar function.
         * 
         */
        ScalarFunction("SCALAR_FUNCTION"),
        /**
         * Stored procedure.
         * 
         */
        Procedure("PROCEDURE");

        private final String value;

        GoogleCloudDatacatalogV1RoutineSpecRoutineType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDatacatalogV1RoutineSpecRoutineType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }