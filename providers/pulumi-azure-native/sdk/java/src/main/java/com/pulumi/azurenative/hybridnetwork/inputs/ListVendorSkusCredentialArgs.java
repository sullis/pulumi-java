// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListVendorSkusCredentialArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListVendorSkusCredentialArgs Empty = new ListVendorSkusCredentialArgs();

    /**
     * The name of the sku.
     * 
     */
    @Import(name="skuName", required=true)
    private Output<String> skuName;

    /**
     * @return The name of the sku.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }

    /**
     * The name of the vendor.
     * 
     */
    @Import(name="vendorName", required=true)
    private Output<String> vendorName;

    /**
     * @return The name of the vendor.
     * 
     */
    public Output<String> vendorName() {
        return this.vendorName;
    }

    private ListVendorSkusCredentialArgs() {}

    private ListVendorSkusCredentialArgs(ListVendorSkusCredentialArgs $) {
        this.skuName = $.skuName;
        this.vendorName = $.vendorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListVendorSkusCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListVendorSkusCredentialArgs $;

        public Builder() {
            $ = new ListVendorSkusCredentialArgs();
        }

        public Builder(ListVendorSkusCredentialArgs defaults) {
            $ = new ListVendorSkusCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param skuName The name of the sku.
         * 
         * @return builder
         * 
         */
        public Builder skuName(Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The name of the sku.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param vendorName The name of the vendor.
         * 
         * @return builder
         * 
         */
        public Builder vendorName(Output<String> vendorName) {
            $.vendorName = vendorName;
            return this;
        }

        /**
         * @param vendorName The name of the vendor.
         * 
         * @return builder
         * 
         */
        public Builder vendorName(String vendorName) {
            return vendorName(Output.of(vendorName));
        }

        public ListVendorSkusCredentialArgs build() {
            $.skuName = Objects.requireNonNull($.skuName, "expected parameter 'skuName' to be non-null");
            $.vendorName = Objects.requireNonNull($.vendorName, "expected parameter 'vendorName' to be non-null");
            return $;
        }
    }

}
