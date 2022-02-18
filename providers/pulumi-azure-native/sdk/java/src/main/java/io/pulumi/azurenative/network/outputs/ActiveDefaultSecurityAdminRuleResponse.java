// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AddressPrefixItemResponse;
import io.pulumi.azurenative.network.outputs.ConfigurationGroupResponse;
import io.pulumi.azurenative.network.outputs.NetworkManagerSecurityGroupItemResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ActiveDefaultSecurityAdminRuleResponse {
    /**
     * Indicates the access allowed for this particular rule
     * 
     */
    private final String access;
    /**
     * Deployment time string.
     * 
     */
    private final @Nullable String commitTime;
    /**
     * A description of the security admin configuration.
     * 
     */
    private final @Nullable String configurationDescription;
    /**
     * A display name of the security admin configuration.
     * 
     */
    private final @Nullable String configurationDisplayName;
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    private final String description;
    /**
     * The destination port ranges.
     * 
     */
    private final List<String> destinationPortRanges;
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    private final List<AddressPrefixItemResponse> destinations;
    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    private final String direction;
    /**
     * A friendly name for the rule.
     * 
     */
    private final String displayName;
    /**
     * Default rule flag.
     * 
     */
    private final @Nullable String flag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Whether the rule is custom or default.
     * Expected value is 'Default'.
     * 
     */
    private final String kind;
    /**
     * The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    private final Integer priority;
    /**
     * Network protocol this rule applies to.
     * 
     */
    private final String protocol;
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Deployment region.
     * 
     */
    private final @Nullable String region;
    /**
     * Groups for rule collection
     * 
     */
    private final @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups;
    /**
     * A description of the rule collection.
     * 
     */
    private final @Nullable String ruleCollectionDescription;
    /**
     * A display name of the rule collection.
     * 
     */
    private final @Nullable String ruleCollectionDisplayName;
    /**
     * Effective configuration groups.
     * 
     */
    private final @Nullable List<ConfigurationGroupResponse> ruleGroups;
    /**
     * The source port ranges.
     * 
     */
    private final List<String> sourcePortRanges;
    /**
     * The CIDR or source IP ranges.
     * 
     */
    private final List<AddressPrefixItemResponse> sources;

    @OutputCustomType.Constructor({"access","commitTime","configurationDescription","configurationDisplayName","description","destinationPortRanges","destinations","direction","displayName","flag","id","kind","priority","protocol","provisioningState","region","ruleCollectionAppliesToGroups","ruleCollectionDescription","ruleCollectionDisplayName","ruleGroups","sourcePortRanges","sources"})
    private ActiveDefaultSecurityAdminRuleResponse(
        String access,
        @Nullable String commitTime,
        @Nullable String configurationDescription,
        @Nullable String configurationDisplayName,
        String description,
        List<String> destinationPortRanges,
        List<AddressPrefixItemResponse> destinations,
        String direction,
        String displayName,
        @Nullable String flag,
        @Nullable String id,
        String kind,
        Integer priority,
        String protocol,
        String provisioningState,
        @Nullable String region,
        @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups,
        @Nullable String ruleCollectionDescription,
        @Nullable String ruleCollectionDisplayName,
        @Nullable List<ConfigurationGroupResponse> ruleGroups,
        List<String> sourcePortRanges,
        List<AddressPrefixItemResponse> sources) {
        this.access = Objects.requireNonNull(access);
        this.commitTime = commitTime;
        this.configurationDescription = configurationDescription;
        this.configurationDisplayName = configurationDisplayName;
        this.description = Objects.requireNonNull(description);
        this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges);
        this.destinations = Objects.requireNonNull(destinations);
        this.direction = Objects.requireNonNull(direction);
        this.displayName = Objects.requireNonNull(displayName);
        this.flag = flag;
        this.id = id;
        this.kind = Objects.requireNonNull(kind);
        this.priority = Objects.requireNonNull(priority);
        this.protocol = Objects.requireNonNull(protocol);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.region = region;
        this.ruleCollectionAppliesToGroups = ruleCollectionAppliesToGroups;
        this.ruleCollectionDescription = ruleCollectionDescription;
        this.ruleCollectionDisplayName = ruleCollectionDisplayName;
        this.ruleGroups = ruleGroups;
        this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges);
        this.sources = Objects.requireNonNull(sources);
    }

    /**
     * Indicates the access allowed for this particular rule
     * 
     */
    public String getAccess() {
        return this.access;
    }
    /**
     * Deployment time string.
     * 
     */
    public Optional<String> getCommitTime() {
        return Optional.ofNullable(this.commitTime);
    }
    /**
     * A description of the security admin configuration.
     * 
     */
    public Optional<String> getConfigurationDescription() {
        return Optional.ofNullable(this.configurationDescription);
    }
    /**
     * A display name of the security admin configuration.
     * 
     */
    public Optional<String> getConfigurationDisplayName() {
        return Optional.ofNullable(this.configurationDisplayName);
    }
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The destination port ranges.
     * 
     */
    public List<String> getDestinationPortRanges() {
        return this.destinationPortRanges;
    }
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    public List<AddressPrefixItemResponse> getDestinations() {
        return this.destinations;
    }
    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    public String getDirection() {
        return this.direction;
    }
    /**
     * A friendly name for the rule.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Default rule flag.
     * 
     */
    public Optional<String> getFlag() {
        return Optional.ofNullable(this.flag);
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Whether the rule is custom or default.
     * Expected value is 'Default'.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Network protocol this rule applies to.
     * 
     */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Deployment region.
     * 
     */
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    /**
     * Groups for rule collection
     * 
     */
    public List<NetworkManagerSecurityGroupItemResponse> getRuleCollectionAppliesToGroups() {
        return this.ruleCollectionAppliesToGroups == null ? List.of() : this.ruleCollectionAppliesToGroups;
    }
    /**
     * A description of the rule collection.
     * 
     */
    public Optional<String> getRuleCollectionDescription() {
        return Optional.ofNullable(this.ruleCollectionDescription);
    }
    /**
     * A display name of the rule collection.
     * 
     */
    public Optional<String> getRuleCollectionDisplayName() {
        return Optional.ofNullable(this.ruleCollectionDisplayName);
    }
    /**
     * Effective configuration groups.
     * 
     */
    public List<ConfigurationGroupResponse> getRuleGroups() {
        return this.ruleGroups == null ? List.of() : this.ruleGroups;
    }
    /**
     * The source port ranges.
     * 
     */
    public List<String> getSourcePortRanges() {
        return this.sourcePortRanges;
    }
    /**
     * The CIDR or source IP ranges.
     * 
     */
    public List<AddressPrefixItemResponse> getSources() {
        return this.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveDefaultSecurityAdminRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private @Nullable String commitTime;
        private @Nullable String configurationDescription;
        private @Nullable String configurationDisplayName;
        private String description;
        private List<String> destinationPortRanges;
        private List<AddressPrefixItemResponse> destinations;
        private String direction;
        private String displayName;
        private @Nullable String flag;
        private @Nullable String id;
        private String kind;
        private Integer priority;
        private String protocol;
        private String provisioningState;
        private @Nullable String region;
        private @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups;
        private @Nullable String ruleCollectionDescription;
        private @Nullable String ruleCollectionDisplayName;
        private @Nullable List<ConfigurationGroupResponse> ruleGroups;
        private List<String> sourcePortRanges;
        private List<AddressPrefixItemResponse> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveDefaultSecurityAdminRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.commitTime = defaults.commitTime;
    	      this.configurationDescription = defaults.configurationDescription;
    	      this.configurationDisplayName = defaults.configurationDisplayName;
    	      this.description = defaults.description;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.destinations = defaults.destinations;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.flag = defaults.flag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.region = defaults.region;
    	      this.ruleCollectionAppliesToGroups = defaults.ruleCollectionAppliesToGroups;
    	      this.ruleCollectionDescription = defaults.ruleCollectionDescription;
    	      this.ruleCollectionDisplayName = defaults.ruleCollectionDisplayName;
    	      this.ruleGroups = defaults.ruleGroups;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.sources = defaults.sources;
        }

        public Builder setAccess(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder setCommitTime(@Nullable String commitTime) {
            this.commitTime = commitTime;
            return this;
        }

        public Builder setConfigurationDescription(@Nullable String configurationDescription) {
            this.configurationDescription = configurationDescription;
            return this;
        }

        public Builder setConfigurationDisplayName(@Nullable String configurationDisplayName) {
            this.configurationDisplayName = configurationDisplayName;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDestinationPortRanges(List<String> destinationPortRanges) {
            this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges);
            return this;
        }

        public Builder setDestinations(List<AddressPrefixItemResponse> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFlag(@Nullable String flag) {
            this.flag = flag;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setRuleCollectionAppliesToGroups(@Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups) {
            this.ruleCollectionAppliesToGroups = ruleCollectionAppliesToGroups;
            return this;
        }

        public Builder setRuleCollectionDescription(@Nullable String ruleCollectionDescription) {
            this.ruleCollectionDescription = ruleCollectionDescription;
            return this;
        }

        public Builder setRuleCollectionDisplayName(@Nullable String ruleCollectionDisplayName) {
            this.ruleCollectionDisplayName = ruleCollectionDisplayName;
            return this;
        }

        public Builder setRuleGroups(@Nullable List<ConfigurationGroupResponse> ruleGroups) {
            this.ruleGroups = ruleGroups;
            return this;
        }

        public Builder setSourcePortRanges(List<String> sourcePortRanges) {
            this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges);
            return this;
        }

        public Builder setSources(List<AddressPrefixItemResponse> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public ActiveDefaultSecurityAdminRuleResponse build() {
            return new ActiveDefaultSecurityAdminRuleResponse(access, commitTime, configurationDescription, configurationDisplayName, description, destinationPortRanges, destinations, direction, displayName, flag, id, kind, priority, protocol, provisioningState, region, ruleCollectionAppliesToGroups, ruleCollectionDescription, ruleCollectionDisplayName, ruleGroups, sourcePortRanges, sources);
        }
    }
}
