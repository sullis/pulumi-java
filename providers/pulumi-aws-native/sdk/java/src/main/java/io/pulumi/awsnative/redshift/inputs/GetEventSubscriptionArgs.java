// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEventSubscriptionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEventSubscriptionArgs Empty = new GetEventSubscriptionArgs();

    @InputImport(name="subscriptionName", required=true)
    private final String subscriptionName;

    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public GetEventSubscriptionArgs(String subscriptionName) {
        this.subscriptionName = Objects.requireNonNull(subscriptionName, "expected parameter 'subscriptionName' to be non-null");
    }

    private GetEventSubscriptionArgs() {
        this.subscriptionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subscriptionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscriptionName = defaults.subscriptionName;
        }

        public Builder setSubscriptionName(String subscriptionName) {
            this.subscriptionName = Objects.requireNonNull(subscriptionName);
            return this;
        }

        public GetEventSubscriptionArgs build() {
            return new GetEventSubscriptionArgs(subscriptionName);
        }
    }
}
