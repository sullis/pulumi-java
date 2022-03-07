// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of sharing for this shared-reservation
     * 
     */
    @EnumType
    public enum ShareSettingsShareType {
        /**
         * Shared-reservation is open to direct child projects of specific folders.
         * 
         */
        DirectProjectsUnderSpecificFolders("DIRECT_PROJECTS_UNDER_SPECIFIC_FOLDERS"),
        /**
         * Default value.
         * 
         */
        Local("LOCAL"),
        /**
         * Shared-reservation is open to entire Organization
         * 
         */
        Organization("ORGANIZATION"),
        /**
         * Default value. This value is unused.
         * 
         */
        ShareTypeUnspecified("SHARE_TYPE_UNSPECIFIED"),
        /**
         * Shared-reservation is open to specific projects
         * 
         */
        SpecificProjects("SPECIFIC_PROJECTS");

        private final String value;

        ShareSettingsShareType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ShareSettingsShareType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }