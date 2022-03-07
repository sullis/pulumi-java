// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The visibility list of the private link service.
 * 
 */
public final class PrivateLinkServicePropertiesVisibilityArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServicePropertiesVisibilityArgs Empty = new PrivateLinkServicePropertiesVisibilityArgs();

    /**
     * The list of subscriptions.
     * 
     */
    @InputImport(name="subscriptions")
      private final @Nullable Input<List<String>> subscriptions;

    public Input<List<String>> getSubscriptions() {
        return this.subscriptions == null ? Input.empty() : this.subscriptions;
    }

    public PrivateLinkServicePropertiesVisibilityArgs(@Nullable Input<List<String>> subscriptions) {
        this.subscriptions = subscriptions;
    }

    private PrivateLinkServicePropertiesVisibilityArgs() {
        this.subscriptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServicePropertiesVisibilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> subscriptions;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServicePropertiesVisibilityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscriptions = defaults.subscriptions;
        }

        public Builder setSubscriptions(@Nullable Input<List<String>> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        public Builder setSubscriptions(@Nullable List<String> subscriptions) {
            this.subscriptions = Input.ofNullable(subscriptions);
            return this;
        }
        public PrivateLinkServicePropertiesVisibilityArgs build() {
            return new PrivateLinkServicePropertiesVisibilityArgs(subscriptions);
        }
    }
}