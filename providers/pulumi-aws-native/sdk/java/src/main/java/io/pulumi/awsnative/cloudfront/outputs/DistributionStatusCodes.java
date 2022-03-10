// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DistributionStatusCodes {
    private final List<Integer> items;
    private final Integer quantity;

    @OutputCustomType.Constructor
    private DistributionStatusCodes(
        @OutputCustomType.Parameter("items") List<Integer> items,
        @OutputCustomType.Parameter("quantity") Integer quantity) {
        this.items = items;
        this.quantity = quantity;
    }

    public List<Integer> getItems() {
        return this.items;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionStatusCodes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> items;
        private Integer quantity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionStatusCodes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.quantity = defaults.quantity;
        }

        public Builder setItems(List<Integer> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setQuantity(Integer quantity) {
            this.quantity = Objects.requireNonNull(quantity);
            return this;
        }
        public DistributionStatusCodes build() {
            return new DistributionStatusCodes(items, quantity);
        }
    }
}
