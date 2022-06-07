// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ObjectStorage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPreauthrequestArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPreauthrequestArgs Empty = new GetPreauthrequestArgs();

    /**
     * The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * The Object Storage namespace used for the request.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return The Object Storage namespace used for the request.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * The unique identifier for the pre-authenticated request. This can be used to manage operations against the pre-authenticated request, such as GET or DELETE.
     * 
     */
    @Import(name="parId", required=true)
    private Output<String> parId;

    /**
     * @return The unique identifier for the pre-authenticated request. This can be used to manage operations against the pre-authenticated request, such as GET or DELETE.
     * 
     */
    public Output<String> parId() {
        return this.parId;
    }

    private GetPreauthrequestArgs() {}

    private GetPreauthrequestArgs(GetPreauthrequestArgs $) {
        this.bucket = $.bucket;
        this.namespace = $.namespace;
        this.parId = $.parId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPreauthrequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPreauthrequestArgs $;

        public Builder() {
            $ = new GetPreauthrequestArgs();
        }

        public Builder(GetPreauthrequestArgs defaults) {
            $ = new GetPreauthrequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param namespace The Object Storage namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The Object Storage namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param parId The unique identifier for the pre-authenticated request. This can be used to manage operations against the pre-authenticated request, such as GET or DELETE.
         * 
         * @return builder
         * 
         */
        public Builder parId(Output<String> parId) {
            $.parId = parId;
            return this;
        }

        /**
         * @param parId The unique identifier for the pre-authenticated request. This can be used to manage operations against the pre-authenticated request, such as GET or DELETE.
         * 
         * @return builder
         * 
         */
        public Builder parId(String parId) {
            return parId(Output.of(parId));
        }

        public GetPreauthrequestArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            $.parId = Objects.requireNonNull($.parId, "expected parameter 'parId' to be non-null");
            return $;
        }
    }

}
