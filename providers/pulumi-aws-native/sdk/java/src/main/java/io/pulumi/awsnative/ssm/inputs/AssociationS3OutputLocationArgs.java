// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssociationS3OutputLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssociationS3OutputLocationArgs Empty = new AssociationS3OutputLocationArgs();

    @InputImport(name="outputS3BucketName")
    private final @Nullable Input<String> outputS3BucketName;

    public Input<String> getOutputS3BucketName() {
        return this.outputS3BucketName == null ? Input.empty() : this.outputS3BucketName;
    }

    @InputImport(name="outputS3KeyPrefix")
    private final @Nullable Input<String> outputS3KeyPrefix;

    public Input<String> getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix == null ? Input.empty() : this.outputS3KeyPrefix;
    }

    @InputImport(name="outputS3Region")
    private final @Nullable Input<String> outputS3Region;

    public Input<String> getOutputS3Region() {
        return this.outputS3Region == null ? Input.empty() : this.outputS3Region;
    }

    public AssociationS3OutputLocationArgs(
        @Nullable Input<String> outputS3BucketName,
        @Nullable Input<String> outputS3KeyPrefix,
        @Nullable Input<String> outputS3Region) {
        this.outputS3BucketName = outputS3BucketName;
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        this.outputS3Region = outputS3Region;
    }

    private AssociationS3OutputLocationArgs() {
        this.outputS3BucketName = Input.empty();
        this.outputS3KeyPrefix = Input.empty();
        this.outputS3Region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociationS3OutputLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> outputS3BucketName;
        private @Nullable Input<String> outputS3KeyPrefix;
        private @Nullable Input<String> outputS3Region;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociationS3OutputLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputS3BucketName = defaults.outputS3BucketName;
    	      this.outputS3KeyPrefix = defaults.outputS3KeyPrefix;
    	      this.outputS3Region = defaults.outputS3Region;
        }

        public Builder setOutputS3BucketName(@Nullable Input<String> outputS3BucketName) {
            this.outputS3BucketName = outputS3BucketName;
            return this;
        }

        public Builder setOutputS3BucketName(@Nullable String outputS3BucketName) {
            this.outputS3BucketName = Input.ofNullable(outputS3BucketName);
            return this;
        }

        public Builder setOutputS3KeyPrefix(@Nullable Input<String> outputS3KeyPrefix) {
            this.outputS3KeyPrefix = outputS3KeyPrefix;
            return this;
        }

        public Builder setOutputS3KeyPrefix(@Nullable String outputS3KeyPrefix) {
            this.outputS3KeyPrefix = Input.ofNullable(outputS3KeyPrefix);
            return this;
        }

        public Builder setOutputS3Region(@Nullable Input<String> outputS3Region) {
            this.outputS3Region = outputS3Region;
            return this;
        }

        public Builder setOutputS3Region(@Nullable String outputS3Region) {
            this.outputS3Region = Input.ofNullable(outputS3Region);
            return this;
        }

        public AssociationS3OutputLocationArgs build() {
            return new AssociationS3OutputLocationArgs(outputS3BucketName, outputS3KeyPrefix, outputS3Region);
        }
    }
}
