// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionOriginGroupMember;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class DistributionOriginGroupMembers extends io.pulumi.resources.InvokeArgs {

    public static final DistributionOriginGroupMembers Empty = new DistributionOriginGroupMembers();

    @InputImport(name="items", required=true)
    private final List<DistributionOriginGroupMember> items;

    public List<DistributionOriginGroupMember> getItems() {
        return this.items;
    }

    @InputImport(name="quantity", required=true)
    private final Integer quantity;

    public Integer getQuantity() {
        return this.quantity;
    }

    public DistributionOriginGroupMembers(
        List<DistributionOriginGroupMember> items,
        Integer quantity) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.quantity = Objects.requireNonNull(quantity, "expected parameter 'quantity' to be non-null");
    }

    private DistributionOriginGroupMembers() {
        this.items = List.of();
        this.quantity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupMembers defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DistributionOriginGroupMember> items;
        private Integer quantity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupMembers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.quantity = defaults.quantity;
        }

        public Builder setItems(List<DistributionOriginGroupMember> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setQuantity(Integer quantity) {
            this.quantity = Objects.requireNonNull(quantity);
            return this;
        }

        public DistributionOriginGroupMembers build() {
            return new DistributionOriginGroupMembers(items, quantity);
        }
    }
}
