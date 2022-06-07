// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBucketPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBucketPlainArgs Empty = new GetBucketPlainArgs();

    /**
     * The name for the bucket.
     * 
     */
    @Import(name="bucketName", required=true)
    private String bucketName;

    /**
     * @return The name for the bucket.
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }

    private GetBucketPlainArgs() {}

    private GetBucketPlainArgs(GetBucketPlainArgs $) {
        this.bucketName = $.bucketName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBucketPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBucketPlainArgs $;

        public Builder() {
            $ = new GetBucketPlainArgs();
        }

        public Builder(GetBucketPlainArgs defaults) {
            $ = new GetBucketPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The name for the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public GetBucketPlainArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}
