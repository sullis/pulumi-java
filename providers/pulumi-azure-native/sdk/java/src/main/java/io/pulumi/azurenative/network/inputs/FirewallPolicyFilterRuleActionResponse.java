// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the FirewallPolicyFilterRuleAction.
 * 
 */
public final class FirewallPolicyFilterRuleActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyFilterRuleActionResponse Empty = new FirewallPolicyFilterRuleActionResponse();

    /**
     * The type of action.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public FirewallPolicyFilterRuleActionResponse(@Nullable String type) {
        this.type = type;
    }

    private FirewallPolicyFilterRuleActionResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFilterRuleActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFilterRuleActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public FirewallPolicyFilterRuleActionResponse build() {
            return new FirewallPolicyFilterRuleActionResponse(type);
        }
    }
}
