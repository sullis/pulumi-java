// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RecordingConfigurationS3DestinationConfiguration {
    private final String bucketName;

    @OutputCustomType.Constructor({"bucketName"})
    private RecordingConfigurationS3DestinationConfiguration(String bucketName) {
        this.bucketName = Objects.requireNonNull(bucketName);
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordingConfigurationS3DestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordingConfigurationS3DestinationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public RecordingConfigurationS3DestinationConfiguration build() {
            return new RecordingConfigurationS3DestinationConfiguration(bucketName);
        }
    }
}
