// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterNatRuleActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterNatRuleActionArgs Empty = new RouterNatRuleActionArgs();

    /**
     * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
     * 
     */
    @InputImport(name="sourceNatActiveIps")
      private final @Nullable Input<List<String>> sourceNatActiveIps;

    public Input<List<String>> getSourceNatActiveIps() {
        return this.sourceNatActiveIps == null ? Input.empty() : this.sourceNatActiveIps;
    }

    /**
     * A list of URLs of the subnetworks used as source ranges for this NAT Rule. These subnetworks must have purpose set to PRIVATE_NAT. This field is used for private NAT.
     * 
     */
    @InputImport(name="sourceNatActiveRanges")
      private final @Nullable Input<List<String>> sourceNatActiveRanges;

    public Input<List<String>> getSourceNatActiveRanges() {
        return this.sourceNatActiveRanges == null ? Input.empty() : this.sourceNatActiveRanges;
    }

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
     * 
     */
    @InputImport(name="sourceNatDrainIps")
      private final @Nullable Input<List<String>> sourceNatDrainIps;

    public Input<List<String>> getSourceNatDrainIps() {
        return this.sourceNatDrainIps == null ? Input.empty() : this.sourceNatDrainIps;
    }

    /**
     * A list of URLs of subnetworks representing source ranges to be drained. This is only supported on patch/update, and these subnetworks must have previously been used as active ranges in this NAT Rule. This field is used for private NAT.
     * 
     */
    @InputImport(name="sourceNatDrainRanges")
      private final @Nullable Input<List<String>> sourceNatDrainRanges;

    public Input<List<String>> getSourceNatDrainRanges() {
        return this.sourceNatDrainRanges == null ? Input.empty() : this.sourceNatDrainRanges;
    }

    public RouterNatRuleActionArgs(
        @Nullable Input<List<String>> sourceNatActiveIps,
        @Nullable Input<List<String>> sourceNatActiveRanges,
        @Nullable Input<List<String>> sourceNatDrainIps,
        @Nullable Input<List<String>> sourceNatDrainRanges) {
        this.sourceNatActiveIps = sourceNatActiveIps;
        this.sourceNatActiveRanges = sourceNatActiveRanges;
        this.sourceNatDrainIps = sourceNatDrainIps;
        this.sourceNatDrainRanges = sourceNatDrainRanges;
    }

    private RouterNatRuleActionArgs() {
        this.sourceNatActiveIps = Input.empty();
        this.sourceNatActiveRanges = Input.empty();
        this.sourceNatDrainIps = Input.empty();
        this.sourceNatDrainRanges = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> sourceNatActiveIps;
        private @Nullable Input<List<String>> sourceNatActiveRanges;
        private @Nullable Input<List<String>> sourceNatDrainIps;
        private @Nullable Input<List<String>> sourceNatDrainRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceNatActiveIps = defaults.sourceNatActiveIps;
    	      this.sourceNatActiveRanges = defaults.sourceNatActiveRanges;
    	      this.sourceNatDrainIps = defaults.sourceNatDrainIps;
    	      this.sourceNatDrainRanges = defaults.sourceNatDrainRanges;
        }

        public Builder setSourceNatActiveIps(@Nullable Input<List<String>> sourceNatActiveIps) {
            this.sourceNatActiveIps = sourceNatActiveIps;
            return this;
        }

        public Builder setSourceNatActiveIps(@Nullable List<String> sourceNatActiveIps) {
            this.sourceNatActiveIps = Input.ofNullable(sourceNatActiveIps);
            return this;
        }

        public Builder setSourceNatActiveRanges(@Nullable Input<List<String>> sourceNatActiveRanges) {
            this.sourceNatActiveRanges = sourceNatActiveRanges;
            return this;
        }

        public Builder setSourceNatActiveRanges(@Nullable List<String> sourceNatActiveRanges) {
            this.sourceNatActiveRanges = Input.ofNullable(sourceNatActiveRanges);
            return this;
        }

        public Builder setSourceNatDrainIps(@Nullable Input<List<String>> sourceNatDrainIps) {
            this.sourceNatDrainIps = sourceNatDrainIps;
            return this;
        }

        public Builder setSourceNatDrainIps(@Nullable List<String> sourceNatDrainIps) {
            this.sourceNatDrainIps = Input.ofNullable(sourceNatDrainIps);
            return this;
        }

        public Builder setSourceNatDrainRanges(@Nullable Input<List<String>> sourceNatDrainRanges) {
            this.sourceNatDrainRanges = sourceNatDrainRanges;
            return this;
        }

        public Builder setSourceNatDrainRanges(@Nullable List<String> sourceNatDrainRanges) {
            this.sourceNatDrainRanges = Input.ofNullable(sourceNatDrainRanges);
            return this;
        }
        public RouterNatRuleActionArgs build() {
            return new RouterNatRuleActionArgs(sourceNatActiveIps, sourceNatActiveRanges, sourceNatDrainIps, sourceNatDrainRanges);
        }
    }
}