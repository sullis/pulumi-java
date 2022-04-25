// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DisplayInfoResponse {
    /**
     * @return Configuration display name
     * 
     */
    private final String configurationDisplayName;
    /**
     * @return Product family display name
     * 
     */
    private final String productFamilyDisplayName;

    @CustomType.Constructor
    private DisplayInfoResponse(
        @CustomType.Parameter("configurationDisplayName") String configurationDisplayName,
        @CustomType.Parameter("productFamilyDisplayName") String productFamilyDisplayName) {
        this.configurationDisplayName = configurationDisplayName;
        this.productFamilyDisplayName = productFamilyDisplayName;
    }

    /**
     * @return Configuration display name
     * 
     */
    public String configurationDisplayName() {
        return this.configurationDisplayName;
    }
    /**
     * @return Product family display name
     * 
     */
    public String productFamilyDisplayName() {
        return this.productFamilyDisplayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DisplayInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configurationDisplayName;
        private String productFamilyDisplayName;

        public Builder() {
    	      // Empty
        }

        public Builder(DisplayInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationDisplayName = defaults.configurationDisplayName;
    	      this.productFamilyDisplayName = defaults.productFamilyDisplayName;
        }

        public Builder configurationDisplayName(String configurationDisplayName) {
            this.configurationDisplayName = Objects.requireNonNull(configurationDisplayName);
            return this;
        }
        public Builder productFamilyDisplayName(String productFamilyDisplayName) {
            this.productFamilyDisplayName = Objects.requireNonNull(productFamilyDisplayName);
            return this;
        }        public DisplayInfoResponse build() {
            return new DisplayInfoResponse(configurationDisplayName, productFamilyDisplayName);
        }
    }
}
