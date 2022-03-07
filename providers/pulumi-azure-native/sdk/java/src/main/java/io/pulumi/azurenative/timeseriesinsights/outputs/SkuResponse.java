// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SkuResponse {
    /**
     * The capacity of the sku. For Gen1 environments, this value can be changed to support scale out of environments after they have been created.
     * 
     */
    private final Integer capacity;
    /**
     * The name of this SKU.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"capacity","name"})
    private SkuResponse(
        Integer capacity,
        String name) {
        this.capacity = Objects.requireNonNull(capacity);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The capacity of the sku. For Gen1 environments, this value can be changed to support scale out of environments after they have been created.
     * 
    */
    public Integer getCapacity() {
        return this.capacity;
    }
    /**
     * The name of this SKU.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer capacity;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder setCapacity(Integer capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public SkuResponse build() {
            return new SkuResponse(capacity, name);
        }
    }
}