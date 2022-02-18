// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Network plugin used for building Kubernetes network.
     * 
     */
    @EnumType
    public enum NetworkPlugin {
        Azure("azure"),
        Kubenet("kubenet");

        private final String value;

        NetworkPlugin(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NetworkPlugin[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
