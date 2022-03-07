// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GpuResourceResponse {
    /**
     * The count of the GPU resource.
     * 
     */
    private final Integer count;
    /**
     * The SKU of the GPU resource.
     * 
     */
    private final String sku;

    @OutputCustomType.Constructor({"count","sku"})
    private GpuResourceResponse(
        Integer count,
        String sku) {
        this.count = Objects.requireNonNull(count);
        this.sku = Objects.requireNonNull(sku);
    }

    /**
     * The count of the GPU resource.
     * 
    */
    public Integer getCount() {
        return this.count;
    }
    /**
     * The SKU of the GPU resource.
     * 
    */
    public String getSku() {
        return this.sku;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GpuResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GpuResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.sku = defaults.sku;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setSku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public GpuResourceResponse build() {
            return new GpuResourceResponse(count, sku);
        }
    }
}