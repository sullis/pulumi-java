// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFirewallRuleResult {
    /**
     * The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress. Use value '0.0.0.0' for all Azure-internal IP addresses.
     * 
     */
    private final @Nullable String endIpAddress;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final @Nullable String name;
    /**
     * The start IP address of the firewall rule. Must be IPv4 format. Use value '0.0.0.0' for all Azure-internal IP addresses.
     * 
     */
    private final @Nullable String startIpAddress;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"endIpAddress","id","name","startIpAddress","type"})
    private GetFirewallRuleResult(
        @Nullable String endIpAddress,
        String id,
        @Nullable String name,
        @Nullable String startIpAddress,
        String type) {
        this.endIpAddress = endIpAddress;
        this.id = Objects.requireNonNull(id);
        this.name = name;
        this.startIpAddress = startIpAddress;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress. Use value '0.0.0.0' for all Azure-internal IP addresses.
     * 
     */
    public Optional<String> getEndIpAddress() {
        return Optional.ofNullable(this.endIpAddress);
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The start IP address of the firewall rule. Must be IPv4 format. Use value '0.0.0.0' for all Azure-internal IP addresses.
     * 
     */
    public Optional<String> getStartIpAddress() {
        return Optional.ofNullable(this.startIpAddress);
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endIpAddress;
        private String id;
        private @Nullable String name;
        private @Nullable String startIpAddress;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.startIpAddress = defaults.startIpAddress;
    	      this.type = defaults.type;
        }

        public Builder setEndIpAddress(@Nullable String endIpAddress) {
            this.endIpAddress = endIpAddress;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStartIpAddress(@Nullable String startIpAddress) {
            this.startIpAddress = startIpAddress;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetFirewallRuleResult build() {
            return new GetFirewallRuleResult(endIpAddress, id, name, startIpAddress, type);
        }
    }
}
