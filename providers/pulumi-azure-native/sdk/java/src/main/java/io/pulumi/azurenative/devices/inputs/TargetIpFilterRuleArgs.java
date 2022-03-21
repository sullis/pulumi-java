// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.IpFilterActionType;
import io.pulumi.azurenative.devices.enums.IpFilterTargetType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The IP filter rules for a provisioning Service.
 * 
 */
public final class TargetIpFilterRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetIpFilterRuleArgs Empty = new TargetIpFilterRuleArgs();

    /**
     * The desired action for requests captured by this rule.
     * 
     */
    @Import(name="action", required=true)
      private final Output<IpFilterActionType> action;

    public Output<IpFilterActionType> getAction() {
        return this.action;
    }

    /**
     * The name of the IP filter rule.
     * 
     */
    @Import(name="filterName", required=true)
      private final Output<String> filterName;

    public Output<String> getFilterName() {
        return this.filterName;
    }

    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    @Import(name="ipMask", required=true)
      private final Output<String> ipMask;

    public Output<String> getIpMask() {
        return this.ipMask;
    }

    /**
     * Target for requests captured by this rule.
     * 
     */
    @Import(name="target")
      private final @Nullable Output<IpFilterTargetType> target;

    public Output<IpFilterTargetType> getTarget() {
        return this.target == null ? Output.empty() : this.target;
    }

    public TargetIpFilterRuleArgs(
        Output<IpFilterActionType> action,
        Output<String> filterName,
        Output<String> ipMask,
        @Nullable Output<IpFilterTargetType> target) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.filterName = Objects.requireNonNull(filterName, "expected parameter 'filterName' to be non-null");
        this.ipMask = Objects.requireNonNull(ipMask, "expected parameter 'ipMask' to be non-null");
        this.target = target;
    }

    private TargetIpFilterRuleArgs() {
        this.action = Output.empty();
        this.filterName = Output.empty();
        this.ipMask = Output.empty();
        this.target = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetIpFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<IpFilterActionType> action;
        private Output<String> filterName;
        private Output<String> ipMask;
        private @Nullable Output<IpFilterTargetType> target;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetIpFilterRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.filterName = defaults.filterName;
    	      this.ipMask = defaults.ipMask;
    	      this.target = defaults.target;
        }

        public Builder action(Output<IpFilterActionType> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(IpFilterActionType action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder filterName(Output<String> filterName) {
            this.filterName = Objects.requireNonNull(filterName);
            return this;
        }
        public Builder filterName(String filterName) {
            this.filterName = Output.of(Objects.requireNonNull(filterName));
            return this;
        }
        public Builder ipMask(Output<String> ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }
        public Builder ipMask(String ipMask) {
            this.ipMask = Output.of(Objects.requireNonNull(ipMask));
            return this;
        }
        public Builder target(@Nullable Output<IpFilterTargetType> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable IpFilterTargetType target) {
            this.target = Output.ofNullable(target);
            return this;
        }        public TargetIpFilterRuleArgs build() {
            return new TargetIpFilterRuleArgs(action, filterName, ipMask, target);
        }
    }
}
