// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FirewallSubnetMapping extends io.pulumi.resources.InvokeArgs {

    public static final FirewallSubnetMapping Empty = new FirewallSubnetMapping();

    @InputImport(name="subnetId", required=true)
    private final String subnetId;

    public String getSubnetId() {
        return this.subnetId;
    }

    public FirewallSubnetMapping(String subnetId) {
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private FirewallSubnetMapping() {
        this.subnetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallSubnetMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallSubnetMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public FirewallSubnetMapping build() {
            return new FirewallSubnetMapping(subnetId);
        }
    }
}
