// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssociationS3OutputLocation extends io.pulumi.resources.InvokeArgs {

    public static final AssociationS3OutputLocation Empty = new AssociationS3OutputLocation();

    @Import(name="outputS3BucketName")
      private final @Nullable String outputS3BucketName;

    public Optional<String> outputS3BucketName() {
        return this.outputS3BucketName == null ? Optional.empty() : Optional.ofNullable(this.outputS3BucketName);
    }

    @Import(name="outputS3KeyPrefix")
      private final @Nullable String outputS3KeyPrefix;

    public Optional<String> outputS3KeyPrefix() {
        return this.outputS3KeyPrefix == null ? Optional.empty() : Optional.ofNullable(this.outputS3KeyPrefix);
    }

    @Import(name="outputS3Region")
      private final @Nullable String outputS3Region;

    public Optional<String> outputS3Region() {
        return this.outputS3Region == null ? Optional.empty() : Optional.ofNullable(this.outputS3Region);
    }

    public AssociationS3OutputLocation(
        @Nullable String outputS3BucketName,
        @Nullable String outputS3KeyPrefix,
        @Nullable String outputS3Region) {
        this.outputS3BucketName = outputS3BucketName;
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        this.outputS3Region = outputS3Region;
    }

    private AssociationS3OutputLocation() {
        this.outputS3BucketName = null;
        this.outputS3KeyPrefix = null;
        this.outputS3Region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociationS3OutputLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String outputS3BucketName;
        private @Nullable String outputS3KeyPrefix;
        private @Nullable String outputS3Region;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociationS3OutputLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputS3BucketName = defaults.outputS3BucketName;
    	      this.outputS3KeyPrefix = defaults.outputS3KeyPrefix;
    	      this.outputS3Region = defaults.outputS3Region;
        }

        public Builder outputS3BucketName(@Nullable String outputS3BucketName) {
            this.outputS3BucketName = outputS3BucketName;
            return this;
        }
        public Builder outputS3KeyPrefix(@Nullable String outputS3KeyPrefix) {
            this.outputS3KeyPrefix = outputS3KeyPrefix;
            return this;
        }
        public Builder outputS3Region(@Nullable String outputS3Region) {
            this.outputS3Region = outputS3Region;
            return this;
        }        public AssociationS3OutputLocation build() {
            return new AssociationS3OutputLocation(outputS3BucketName, outputS3KeyPrefix, outputS3Region);
        }
    }
}
