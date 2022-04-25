// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a file available as a Cloud Storage Object.
 * 
 */
public final class OSPolicyResourceFileGcsResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceFileGcsResponse Empty = new OSPolicyResourceFileGcsResponse();

    /**
     * Bucket of the Cloud Storage object.
     * 
     */
    @Import(name="bucket", required=true)
    private String bucket;

    /**
     * @return Bucket of the Cloud Storage object.
     * 
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    @Import(name="generation", required=true)
    private String generation;

    /**
     * @return Generation number of the Cloud Storage object.
     * 
     */
    public String generation() {
        return this.generation;
    }

    /**
     * Name of the Cloud Storage object.
     * 
     */
    @Import(name="object", required=true)
    private String object;

    /**
     * @return Name of the Cloud Storage object.
     * 
     */
    public String object() {
        return this.object;
    }

    private OSPolicyResourceFileGcsResponse() {}

    private OSPolicyResourceFileGcsResponse(OSPolicyResourceFileGcsResponse $) {
        this.bucket = $.bucket;
        this.generation = $.generation;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceFileGcsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceFileGcsResponse $;

        public Builder() {
            $ = new OSPolicyResourceFileGcsResponse();
        }

        public Builder(OSPolicyResourceFileGcsResponse defaults) {
            $ = new OSPolicyResourceFileGcsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Bucket of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param generation Generation number of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder generation(String generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param object Name of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            $.object = object;
            return this;
        }

        public OSPolicyResourceFileGcsResponse build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.generation = Objects.requireNonNull($.generation, "expected parameter 'generation' to be non-null");
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
