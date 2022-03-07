// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleSecureTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleSecureTagArgs Empty = new FirewallPolicyRuleSecureTagArgs();

    /**
     * Name of the secure tag, created with TagManager's TagValue API.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public FirewallPolicyRuleSecureTagArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private FirewallPolicyRuleSecureTagArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleSecureTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleSecureTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public FirewallPolicyRuleSecureTagArgs build() {
            return new FirewallPolicyRuleSecureTagArgs(name);
        }
    }
}