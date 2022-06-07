// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetADCCatalogArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetADCCatalogArgs Empty = new GetADCCatalogArgs();

    /**
     * The name of the data catalog in the specified subscription and resource group.
     * 
     */
    @Import(name="catalogName", required=true)
    private Output<String> catalogName;

    /**
     * @return The name of the data catalog in the specified subscription and resource group.
     * 
     */
    public Output<String> catalogName() {
        return this.catalogName;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetADCCatalogArgs() {}

    private GetADCCatalogArgs(GetADCCatalogArgs $) {
        this.catalogName = $.catalogName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetADCCatalogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetADCCatalogArgs $;

        public Builder() {
            $ = new GetADCCatalogArgs();
        }

        public Builder(GetADCCatalogArgs defaults) {
            $ = new GetADCCatalogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogName The name of the data catalog in the specified subscription and resource group.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(Output<String> catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param catalogName The name of the data catalog in the specified subscription and resource group.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(String catalogName) {
            return catalogName(Output.of(catalogName));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetADCCatalogArgs build() {
            $.catalogName = Objects.requireNonNull($.catalogName, "expected parameter 'catalogName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
