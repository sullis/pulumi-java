// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.budgets.outputs;

import io.pulumi.awsnative.budgets.enums.BudgetsActionSubscriberType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BudgetsActionSubscriber {
    private final String address;
    private final BudgetsActionSubscriberType type;

    @OutputCustomType.Constructor({"address","type"})
    private BudgetsActionSubscriber(
        String address,
        BudgetsActionSubscriberType type) {
        this.address = Objects.requireNonNull(address);
        this.type = Objects.requireNonNull(type);
    }

    public String getAddress() {
        return this.address;
    }
    public BudgetsActionSubscriberType getType() {
        return this.type;
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