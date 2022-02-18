// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Database principal role.
     * 
     */
    @EnumType
    public enum DatabasePrincipalRole {
        Admin("Admin"),
        Ingestor("Ingestor"),
        Monitor("Monitor"),
        User("User"),
        UnrestrictedViewer("UnrestrictedViewer"),
        Viewer("Viewer");

        private final String value;

        DatabasePrincipalRole(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatabasePrincipalRole[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
