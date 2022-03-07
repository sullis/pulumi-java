// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.IpFilterActionType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The IP filter rules for the IoT hub.
 * 
 */
public final class IpFilterRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpFilterRuleArgs Empty = new IpFilterRuleArgs();

    /**
     * The desired action for requests captured by this rule.
     * 
     */
    @InputImport(name="action", required=true)
      private final Input<IpFilterActionType> action;

    public Input<IpFilterActionType> getAction() {
        return this.action;
    }

    /**
     * The name of the IP filter rule.
     * 
     */
    @InputImport(name="filterName", required=true)
      private final Input<String> filterName;

    public Input<String> getFilterName() {
        return this.filterName;
    }

    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    @InputImport(name="ipMask", required=true)
      private final Input<String> ipMask;

    public Input<String> getIpMask() {
        return this.ipMask;
    }

    public IpFilterRuleArgs(
        Input<IpFilterActionType> action,
        Input<String> filterName,
        Input<String> ipMask) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.filterName = Objects.requireNonNull(filterName, "expected parameter 'filterName' to be non-null");
        this.ipMask = Objects.requireNonNull(ipMask, "expected parameter 'ipMask' to be non-null");
    }

    private IpFilterRuleArgs() {
        this.action = Input.empty();
        this.filterName = Input.empty();
        this.ipMask = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<IpFilterActionType> action;
        private Input<String> filterName;
        private Input<String> ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(IpFilterRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.filterName = defaults.filterName;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder setAction(Input<IpFilterActionType> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(IpFilterActionType action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setFilterName(Input<String> filterName) {
            this.filterName = Objects.requireNonNull(filterName);
            return this;
        }

        public Builder setFilterName(String filterName) {
            this.filterName = Input.of(Objects.requireNonNull(filterName));
            return this;
        }

        public Builder setIpMask(Input<String> ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }

        public Builder setIpMask(String ipMask) {
            this.ipMask = Input.of(Objects.requireNonNull(ipMask));
            return this;
        }
        public IpFilterRuleArgs build() {
            return new IpFilterRuleArgs(action, filterName, ipMask);
        }
    }
}