// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse {
    /**
     * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it's unset.
     * 
     */
    private final String mode;

    @OutputCustomType.Constructor({"mode"})
    private GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse(String mode) {
        this.mode = Objects.requireNonNull(mode);
    }

    /**
     * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it's unset.
     * 
    */
    public String getMode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse build() {
            return new GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse(mode);
        }
    }
}