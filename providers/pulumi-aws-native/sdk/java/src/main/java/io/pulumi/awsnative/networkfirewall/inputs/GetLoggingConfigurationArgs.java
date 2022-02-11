// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLoggingConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLoggingConfigurationArgs Empty = new GetLoggingConfigurationArgs();

    @InputImport(name="firewallArn", required=true)
    private final String firewallArn;

    public String getFirewallArn() {
        return this.firewallArn;
    }

    public GetLoggingConfigurationArgs(String firewallArn) {
        this.firewallArn = Objects.requireNonNull(firewallArn, "expected parameter 'firewallArn' to be non-null");
    }

    private GetLoggingConfigurationArgs() {
        this.firewallArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String firewallArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallArn = defaults.firewallArn;
        }

        public Builder setFirewallArn(String firewallArn) {
            this.firewallArn = Objects.requireNonNull(firewallArn);
            return this;
        }

        public GetLoggingConfigurationArgs build() {
            return new GetLoggingConfigurationArgs(firewallArn);
        }
    }
}
