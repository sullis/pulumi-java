// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ObjectTypeKeyStandardIdentifiersItem {
        Profile("PROFILE"),
        Unique("UNIQUE"),
        Secondary("SECONDARY"),
        LookupOnly("LOOKUP_ONLY"),
        NewOnly("NEW_ONLY");

        private final String value;

        ObjectTypeKeyStandardIdentifiersItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ObjectTypeKeyStandardIdentifiersItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
