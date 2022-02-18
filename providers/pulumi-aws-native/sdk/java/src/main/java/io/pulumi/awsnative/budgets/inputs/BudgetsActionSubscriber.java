// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.budgets.inputs;

import io.pulumi.awsnative.budgets.enums.BudgetsActionSubscriberType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BudgetsActionSubscriber extends io.pulumi.resources.InvokeArgs {

    public static final BudgetsActionSubscriber Empty = new BudgetsActionSubscriber();

    @InputImport(name="address", required=true)
    private final String address;

    public String getAddress() {
        return this.address;
    }

    @InputImport(name="type", required=true)
    private final BudgetsActionSubscriberType type;

    public BudgetsActionSubscriberType getType() {
        return this.type;
    }

    public BudgetsActionSubscriber(
        String address,
        BudgetsActionSubscriberType type) {
        this.address = Objects.requireNonNull(address, "expected parameter 'address' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private BudgetsActionSubscriber() {
        this.address = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetsActionSubscriber defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private BudgetsActionSubscriberType type;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetsActionSubscriber defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.type = defaults.type;
        }

        public Builder setAddress(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setType(BudgetsActionSubscriberType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public BudgetsActionSubscriber build() {
            return new BudgetsActionSubscriber(address, type);
        }
    }
}
