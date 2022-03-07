// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates the type of NLU model.
     * 
     */
    @EnumType
    public enum GoogleCloudDialogflowCxV3NluSettingsModelType {
        /**
         * Not specified. `MODEL_TYPE_STANDARD` will be used.
         * 
         */
        ModelTypeUnspecified("MODEL_TYPE_UNSPECIFIED"),
        /**
         * Use standard NLU model.
         * 
         */
        ModelTypeStandard("MODEL_TYPE_STANDARD"),
        /**
         * Use advanced NLU model.
         * 
         */
        ModelTypeAdvanced("MODEL_TYPE_ADVANCED");

        private final String value;

        GoogleCloudDialogflowCxV3NluSettingsModelType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDialogflowCxV3NluSettingsModelType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }