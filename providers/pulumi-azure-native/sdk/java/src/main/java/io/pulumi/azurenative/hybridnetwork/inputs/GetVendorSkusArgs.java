// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVendorSkusArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVendorSkusArgs Empty = new GetVendorSkusArgs();

    /**
     * The name of the sku.
     * 
     */
    @InputImport(name="skuName", required=true)
      private final String skuName;

    public String getSkuName() {
        return this.skuName;
    }

    /**
     * The name of the vendor.
     * 
     */
    @InputImport(name="vendorName", required=true)
      private final String vendorName;

    public String getVendorName() {
        return this.vendorName;
    }

    public GetVendorSkusArgs(
        String skuName,
        String vendorName) {
        this.skuName = Objects.requireNonNull(skuName, "expected parameter 'skuName' to be non-null");
        this.vendorName = Objects.requireNonNull(vendorName, "expected parameter 'vendorName' to be non-null");
    }

    private GetVendorSkusArgs() {
        this.skuName = null;
        this.vendorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVendorSkusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String skuName;
        private String vendorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVendorSkusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skuName = defaults.skuName;
    	      this.vendorName = defaults.vendorName;
        }

        public Builder setSkuName(String skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }

        public Builder setVendorName(String vendorName) {
            this.vendorName = Objects.requireNonNull(vendorName);
            return this;
        }
        public GetVendorSkusArgs build() {
            return new GetVendorSkusArgs(skuName, vendorName);
        }
    }
}