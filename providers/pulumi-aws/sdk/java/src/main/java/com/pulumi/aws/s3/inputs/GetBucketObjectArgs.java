// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBucketObjectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBucketObjectArgs Empty = new GetBucketObjectArgs();

    /**
     * The name of the bucket to read the object from. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
     * 
     * @deprecated
     * Use the aws_s3_object data source instead
     * 
     */
    @Deprecated /* Use the aws_s3_object data source instead */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket to read the object from. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
     * 
     * @deprecated
     * Use the aws_s3_object data source instead
     * 
     */
    @Deprecated /* Use the aws_s3_object data source instead */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * The full path to the object inside the bucket
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The full path to the object inside the bucket
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    @Import(name="range")
    private @Nullable Output<String> range;

    public Optional<Output<String>> range() {
        return Optional.ofNullable(this.range);
    }

    /**
     * A map of tags assigned to the object.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags assigned to the object.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specific version ID of the object returned (defaults to latest version)
     * 
     */
    @Import(name="versionId")
    private @Nullable Output<String> versionId;

    /**
     * @return Specific version ID of the object returned (defaults to latest version)
     * 
     */
    public Optional<Output<String>> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    private GetBucketObjectArgs() {}

    private GetBucketObjectArgs(GetBucketObjectArgs $) {
        this.bucket = $.bucket;
        this.key = $.key;
        this.range = $.range;
        this.tags = $.tags;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBucketObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBucketObjectArgs $;

        public Builder() {
            $ = new GetBucketObjectArgs();
        }

        public Builder(GetBucketObjectArgs defaults) {
            $ = new GetBucketObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket to read the object from. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
         * 
         * @return builder
         * 
         * @deprecated
         * Use the aws_s3_object data source instead
         * 
         */
        @Deprecated /* Use the aws_s3_object data source instead */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket to read the object from. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
         * 
         * @return builder
         * 
         * @deprecated
         * Use the aws_s3_object data source instead
         * 
         */
        @Deprecated /* Use the aws_s3_object data source instead */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param key The full path to the object inside the bucket
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The full path to the object inside the bucket
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder range(@Nullable Output<String> range) {
            $.range = range;
            return this;
        }

        public Builder range(String range) {
            return range(Output.of(range));
        }

        /**
         * @param tags A map of tags assigned to the object.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the object.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param versionId Specific version ID of the object returned (defaults to latest version)
         * 
         * @return builder
         * 
         */
        public Builder versionId(@Nullable Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId Specific version ID of the object returned (defaults to latest version)
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public GetBucketObjectArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
