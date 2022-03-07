// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The authentication mode which determines the source registry login scope. The credentials for the source registry
     * will be generated using the given scope. These credentials will be used to login to
     * the source registry during the run.
     * 
     */
    @EnumType
    public enum SourceRegistryLoginMode {
        None("None"),
        Default("Default");

        private final String value;

        SourceRegistryLoginMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SourceRegistryLoginMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }