// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     * 
     */
    @EnumType
    public enum DataQualityJobDefinitionS3OutputS3UploadMode {
        Continuous("Continuous"),
        EndOfJob("EndOfJob");

        private final String value;

        DataQualityJobDefinitionS3OutputS3UploadMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataQualityJobDefinitionS3OutputS3UploadMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
