// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMetastoreArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetastoreArgs Empty = new GetMetastoreArgs();

    /**
     * The metastore&#39;s OCID.
     * 
     */
    @Import(name="metastoreId", required=true)
    private Output<String> metastoreId;

    /**
     * @return The metastore&#39;s OCID.
     * 
     */
    public Output<String> metastoreId() {
        return this.metastoreId;
    }

    private GetMetastoreArgs() {}

    private GetMetastoreArgs(GetMetastoreArgs $) {
        this.metastoreId = $.metastoreId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetastoreArgs $;

        public Builder() {
            $ = new GetMetastoreArgs();
        }

        public Builder(GetMetastoreArgs defaults) {
            $ = new GetMetastoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metastoreId The metastore&#39;s OCID.
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param metastoreId The metastore&#39;s OCID.
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        public GetMetastoreArgs build() {
            $.metastoreId = Objects.requireNonNull($.metastoreId, "expected parameter 'metastoreId' to be non-null");
            return $;
        }
    }

}
