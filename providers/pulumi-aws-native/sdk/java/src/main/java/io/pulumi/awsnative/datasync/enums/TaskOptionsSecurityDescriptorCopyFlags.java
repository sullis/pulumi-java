// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A value that determines which components of the SMB security descriptor are copied during transfer.
     * 
     */
    @EnumType
    public enum TaskOptionsSecurityDescriptorCopyFlags {
        None("NONE"),
        OwnerDacl("OWNER_DACL"),
        OwnerDaclSacl("OWNER_DACL_SACL");

        private final String value;

        TaskOptionsSecurityDescriptorCopyFlags(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TaskOptionsSecurityDescriptorCopyFlags[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
