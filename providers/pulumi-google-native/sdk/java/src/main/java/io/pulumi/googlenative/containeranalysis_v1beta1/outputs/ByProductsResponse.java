// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ByProductsResponse {
    private final Map<String,String> customValues;

    @CustomType.Constructor
    private ByProductsResponse(@CustomType.Parameter("customValues") Map<String,String> customValues) {
        this.customValues = customValues;
    }

    public Map<String,String> getCustomValues() {
        return this.customValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByProductsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> customValues;

        public Builder() {
    	      // Empty
        }

        public Builder(ByProductsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customValues = defaults.customValues;
        }

        public Builder customValues(Map<String,String> customValues) {
            this.customValues = Objects.requireNonNull(customValues);
            return this;
        }        public ByProductsResponse build() {
            return new ByProductsResponse(customValues);
        }
    }
}
