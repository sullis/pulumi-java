// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyArgs Empty = new GetFirewallPolicyArgs();

    @Import(name="firewallPolicyArn", required=true)
      private final String firewallPolicyArn;

    public String firewallPolicyArn() {
        return this.firewallPolicyArn;
    }

    public GetFirewallPolicyArgs(String firewallPolicyArn) {
        this.firewallPolicyArn = Objects.requireNonNull(firewallPolicyArn, "expected parameter 'firewallPolicyArn' to be non-null");
    }

    private GetFirewallPolicyArgs() {
        this.firewallPolicyArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String firewallPolicyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallPolicyArn = defaults.firewallPolicyArn;
        }

        public Builder firewallPolicyArn(String firewallPolicyArn) {
            this.firewallPolicyArn = Objects.requireNonNull(firewallPolicyArn);
            return this;
        }        public GetFirewallPolicyArgs build() {
            return new GetFirewallPolicyArgs(firewallPolicyArn);
        }
    }
}
