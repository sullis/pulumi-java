// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * In a GcsData resource, an object&#39;s name is the Cloud Storage object&#39;s name and its &#34;last modification time&#34; refers to the object&#39;s `updated` property of Cloud Storage objects, which changes when the content or the metadata of the object is updated.
 * 
 */
public final class GcsDataResponse extends com.pulumi.resources.InvokeArgs {

    public static final GcsDataResponse Empty = new GcsDataResponse();

    /**
     * Cloud Storage bucket name. Must meet [Bucket Name Requirements](/storage/docs/naming#requirements).
     * 
     */
    @Import(name="bucketName", required=true)
    private String bucketName;

    /**
     * @return Cloud Storage bucket name. Must meet [Bucket Name Requirements](/storage/docs/naming#requirements).
     * 
     */
    public String bucketName() {
        return this.bucketName;
    }

    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;. The root path value must meet [Object Name Requirements](/storage/docs/naming#objectnames).
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;. The root path value must meet [Object Name Requirements](/storage/docs/naming#objectnames).
     * 
     */
    public String path() {
        return this.path;
    }

    private GcsDataResponse() {}

    private GcsDataResponse(GcsDataResponse $) {
        this.bucketName = $.bucketName;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcsDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcsDataResponse $;

        public Builder() {
            $ = new GcsDataResponse();
        }

        public Builder(GcsDataResponse defaults) {
            $ = new GcsDataResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName Cloud Storage bucket name. Must meet [Bucket Name Requirements](/storage/docs/naming#requirements).
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param path Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;. The root path value must meet [Object Name Requirements](/storage/docs/naming#objectnames).
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        public GcsDataResponse build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
