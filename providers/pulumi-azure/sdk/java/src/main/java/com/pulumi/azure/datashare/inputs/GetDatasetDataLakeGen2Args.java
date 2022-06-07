// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datashare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatasetDataLakeGen2Args extends com.pulumi.resources.InvokeArgs {

    public static final GetDatasetDataLakeGen2Args Empty = new GetDatasetDataLakeGen2Args();

    /**
     * The name of this Data Share Data Lake Gen2 Dataset.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Data Share Data Lake Gen2 Dataset.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The resource ID of the Data Share where this Data Share Data Lake Gen2 Dataset should be created.
     * 
     */
    @Import(name="shareId", required=true)
    private Output<String> shareId;

    /**
     * @return The resource ID of the Data Share where this Data Share Data Lake Gen2 Dataset should be created.
     * 
     */
    public Output<String> shareId() {
        return this.shareId;
    }

    private GetDatasetDataLakeGen2Args() {}

    private GetDatasetDataLakeGen2Args(GetDatasetDataLakeGen2Args $) {
        this.name = $.name;
        this.shareId = $.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatasetDataLakeGen2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatasetDataLakeGen2Args $;

        public Builder() {
            $ = new GetDatasetDataLakeGen2Args();
        }

        public Builder(GetDatasetDataLakeGen2Args defaults) {
            $ = new GetDatasetDataLakeGen2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this Data Share Data Lake Gen2 Dataset.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Data Share Data Lake Gen2 Dataset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param shareId The resource ID of the Data Share where this Data Share Data Lake Gen2 Dataset should be created.
         * 
         * @return builder
         * 
         */
        public Builder shareId(Output<String> shareId) {
            $.shareId = shareId;
            return this;
        }

        /**
         * @param shareId The resource ID of the Data Share where this Data Share Data Lake Gen2 Dataset should be created.
         * 
         * @return builder
         * 
         */
        public Builder shareId(String shareId) {
            return shareId(Output.of(shareId));
        }

        public GetDatasetDataLakeGen2Args build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.shareId = Objects.requireNonNull($.shareId, "expected parameter 'shareId' to be non-null");
            return $;
        }
    }

}
