// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkSecurityGroupRuleResponse {
    private final String access;
    /**
     * Priorities within a pool must be unique and are evaluated in order of priority. The lower the number the higher the priority. For example, rules could be specified with order numbers of 150, 250, and 350. The rule with the order number of 150 takes precedence over the rule that has an order of 250. Allowed priorities are 150 to 4096. If any reserved or duplicate values are provided the request fails with HTTP status code 400.
     * 
     */
    private final Integer priority;
    /**
     * Valid values are a single IP address (i.e. 10.10.10.10), IP subnet (i.e. 192.168.1.0/24), default tag, or * (for all addresses).  If any other values are provided the request fails with HTTP status code 400.
     * 
     */
    private final String sourceAddressPrefix;
    /**
     * Valid values are '*' (for all ports 0 - 65535) or arrays of ports or port ranges (i.e. 100-200). The ports should in the range of 0 to 65535 and the port ranges or ports can't overlap. If any other values are provided the request fails with HTTP status code 400. Default value will be *.
     * 
     */
    private final @Nullable List<String> sourcePortRanges;

    @OutputCustomType.Constructor({"access","priority","sourceAddressPrefix","sourcePortRanges"})
    private NetworkSecurityGroupRuleResponse(
        String access,
        Integer priority,
        String sourceAddressPrefix,
        @Nullable List<String> sourcePortRanges) {
        this.access = Objects.requireNonNull(access);
        this.priority = Objects.requireNonNull(priority);
        this.sourceAddressPrefix = Objects.requireNonNull(sourceAddressPrefix);
        this.sourcePortRanges = sourcePortRanges;
    }

    public String getAccess() {
        return this.access;
    }
    /**
     * Priorities within a pool must be unique and are evaluated in order of priority. The lower the number the higher the priority. For example, rules could be specified with order numbers of 150, 250, and 350. The rule with the order number of 150 takes precedence over the rule that has an order of 250. Allowed priorities are 150 to 4096. If any reserved or duplicate values are provided the request fails with HTTP status code 400.
     * 
     */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Valid values are a single IP address (i.e. 10.10.10.10), IP subnet (i.e. 192.168.1.0/24), default tag, or * (for all addresses).  If any other values are provided the request fails with HTTP status code 400.
     * 
     */
    public String getSourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }
    /**
     * Valid values are '*' (for all ports 0 - 65535) or arrays of ports or port ranges (i.e. 100-200). The ports should in the range of 0 to 65535 and the port ranges or ports can't overlap. If any other values are provided the request fails with HTTP status code 400. Default value will be *.
     * 
     */
    public List<String> getSourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityGroupRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private Integer priority;
        private String sourceAddressPrefix;
        private @Nullable List<String> sourcePortRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityGroupRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.priority = defaults.priority;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
        }

        public Builder setAccess(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setSourceAddressPrefix(String sourceAddressPrefix) {
            this.sourceAddressPrefix = Objects.requireNonNull(sourceAddressPrefix);
            return this;
        }

        public Builder setSourcePortRanges(@Nullable List<String> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }

        public NetworkSecurityGroupRuleResponse build() {
            return new NetworkSecurityGroupRuleResponse(access, priority, sourceAddressPrefix, sourcePortRanges);
        }
    }
}
