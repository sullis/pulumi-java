// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IpFilterRuleResponse {
    /**
     * The desired action for requests captured by this rule.
     * 
     */
    private final String action;
    /**
     * The name of the IP filter rule.
     * 
     */
    private final String filterName;
    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    private final String ipMask;

    @CustomType.Constructor
    private IpFilterRuleResponse(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("filterName") String filterName,
        @CustomType.Parameter("ipMask") String ipMask) {
        this.action = action;
        this.filterName = filterName;
        this.ipMask = ipMask;
    }

    /**
     * The desired action for requests captured by this rule.
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * The name of the IP filter rule.
     * 
    */
    public String getFilterName() {
        return this.filterName;
    }
    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
    */
    public String getIpMask() {
        return this.ipMask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpFilterRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String filterName;
        private String ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(IpFilterRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.filterName = defaults.filterName;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder filterName(String filterName) {
            this.filterName = Objects.requireNonNull(filterName);
            return this;
        }
        public Builder ipMask(String ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }        public IpFilterRuleResponse build() {
            return new IpFilterRuleResponse(action, filterName, ipMask);
        }
    }
}
