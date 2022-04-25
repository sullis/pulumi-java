// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload.
 * 
 */
public final class BucketAbortIncompleteMultipartUpload extends com.pulumi.resources.InvokeArgs {

    public static final BucketAbortIncompleteMultipartUpload Empty = new BucketAbortIncompleteMultipartUpload();

    /**
     * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
     * 
     */
    @Import(name="daysAfterInitiation", required=true)
    private Integer daysAfterInitiation;

    /**
     * @return Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
     * 
     */
    public Integer daysAfterInitiation() {
        return this.daysAfterInitiation;
    }

    private BucketAbortIncompleteMultipartUpload() {}

    private BucketAbortIncompleteMultipartUpload(BucketAbortIncompleteMultipartUpload $) {
        this.daysAfterInitiation = $.daysAfterInitiation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAbortIncompleteMultipartUpload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAbortIncompleteMultipartUpload $;

        public Builder() {
            $ = new BucketAbortIncompleteMultipartUpload();
        }

        public Builder(BucketAbortIncompleteMultipartUpload defaults) {
            $ = new BucketAbortIncompleteMultipartUpload(Objects.requireNonNull(defaults));
        }

        /**
         * @param daysAfterInitiation Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
         * 
         * @return builder
         * 
         */
        public Builder daysAfterInitiation(Integer daysAfterInitiation) {
            $.daysAfterInitiation = daysAfterInitiation;
            return this;
        }

        public BucketAbortIncompleteMultipartUpload build() {
            $.daysAfterInitiation = Objects.requireNonNull($.daysAfterInitiation, "expected parameter 'daysAfterInitiation' to be non-null");
            return $;
        }
    }

}
