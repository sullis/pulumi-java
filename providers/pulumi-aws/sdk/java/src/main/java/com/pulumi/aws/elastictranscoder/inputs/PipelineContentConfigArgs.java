// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elastictranscoder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineContentConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineContentConfigArgs Empty = new PipelineContentConfigArgs();

    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * The Amazon S3 storage class, `Standard` or `ReducedRedundancy`, that you want Elastic Transcoder to assign to the files and playlists that it stores in your Amazon S3 bucket.
     * 
     */
    @Import(name="storageClass")
    private @Nullable Output<String> storageClass;

    /**
     * @return The Amazon S3 storage class, `Standard` or `ReducedRedundancy`, that you want Elastic Transcoder to assign to the files and playlists that it stores in your Amazon S3 bucket.
     * 
     */
    public Optional<Output<String>> storageClass() {
        return Optional.ofNullable(this.storageClass);
    }

    private PipelineContentConfigArgs() {}

    private PipelineContentConfigArgs(PipelineContentConfigArgs $) {
        this.bucket = $.bucket;
        this.storageClass = $.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineContentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineContentConfigArgs $;

        public Builder() {
            $ = new PipelineContentConfigArgs();
        }

        public Builder(PipelineContentConfigArgs defaults) {
            $ = new PipelineContentConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param storageClass The Amazon S3 storage class, `Standard` or `ReducedRedundancy`, that you want Elastic Transcoder to assign to the files and playlists that it stores in your Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(@Nullable Output<String> storageClass) {
            $.storageClass = storageClass;
            return this;
        }

        /**
         * @param storageClass The Amazon S3 storage class, `Standard` or `ReducedRedundancy`, that you want Elastic Transcoder to assign to the files and playlists that it stores in your Amazon S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(String storageClass) {
            return storageClass(Output.of(storageClass));
        }

        public PipelineContentConfigArgs build() {
            return $;
        }
    }

}
