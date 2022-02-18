// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationS3SourceProperties {
    private final String bucketName;
    private final @Nullable String bucketPrefix;

    @OutputCustomType.Constructor({"bucketName","bucketPrefix"})
    private IntegrationS3SourceProperties(
        String bucketName,
        @Nullable String bucketPrefix) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.bucketPrefix = bucketPrefix;
    }

    public String getBucketName() {
        return this.bucketName;
    }
    public Optional<String> getBucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationS3SourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String bucketPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationS3SourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public IntegrationS3SourceProperties build() {
            return new IntegrationS3SourceProperties(bucketName, bucketPrefix);
        }
    }
}
