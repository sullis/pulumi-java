// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineThumbnailConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineThumbnailConfigGetArgs Empty = new PipelineThumbnailConfigGetArgs();

    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket == null ? Codegen.empty() : this.bucket;
    }

    /**
     * The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.
     * 
     */
    @Import(name="storageClass")
      private final @Nullable Output<String> storageClass;

    public Output<String> storageClass() {
        return this.storageClass == null ? Codegen.empty() : this.storageClass;
    }

    public PipelineThumbnailConfigGetArgs(
        @Nullable Output<String> bucket,
        @Nullable Output<String> storageClass) {
        this.bucket = bucket;
        this.storageClass = storageClass;
    }

    private PipelineThumbnailConfigGetArgs() {
        this.bucket = Codegen.empty();
        this.storageClass = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineThumbnailConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<String> storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineThumbnailConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Codegen.ofNullable(bucket);
            return this;
        }
        public Builder storageClass(@Nullable Output<String> storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public Builder storageClass(@Nullable String storageClass) {
            this.storageClass = Codegen.ofNullable(storageClass);
            return this;
        }        public PipelineThumbnailConfigGetArgs build() {
            return new PipelineThumbnailConfigGetArgs(bucket, storageClass);
        }
    }
}
