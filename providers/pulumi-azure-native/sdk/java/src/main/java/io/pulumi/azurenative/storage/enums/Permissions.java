// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The signed permissions for the service SAS. Possible values include: Read (r), Write (w), Delete (d), List (l), Add (a), Create (c), Update (u) and Process (p).
     * 
     */
    @EnumType
    public enum Permissions {
        R("r"),
        D("d"),
        W("w"),
        L("l"),
        A("a"),
        C("c"),
        U("u"),
        P("p");

        private final String value;

        Permissions(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Permissions[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
