// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupS3StorageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupS3StorageConfigArgs Empty = new FeatureGroupS3StorageConfigArgs();

    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    @Import(name="s3Uri", required=true)
      private final Output<String> s3Uri;

    public Output<String> s3Uri() {
        return this.s3Uri;
    }

    public FeatureGroupS3StorageConfigArgs(
        @Nullable Output<String> kmsKeyId,
        Output<String> s3Uri) {
        this.kmsKeyId = kmsKeyId;
        this.s3Uri = Objects.requireNonNull(s3Uri, "expected parameter 's3Uri' to be non-null");
    }

    private FeatureGroupS3StorageConfigArgs() {
        this.kmsKeyId = Codegen.empty();
        this.s3Uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupS3StorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeyId;
        private Output<String> s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupS3StorageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }
        public Builder s3Uri(Output<String> s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }
        public Builder s3Uri(String s3Uri) {
            this.s3Uri = Output.of(Objects.requireNonNull(s3Uri));
            return this;
        }        public FeatureGroupS3StorageConfigArgs build() {
            return new FeatureGroupS3StorageConfigArgs(kmsKeyId, s3Uri);
        }
    }
}
