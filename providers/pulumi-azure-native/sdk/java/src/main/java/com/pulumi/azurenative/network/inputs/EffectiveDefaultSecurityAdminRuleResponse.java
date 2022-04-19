// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.AddressPrefixItemResponse;
import com.pulumi.azurenative.network.inputs.ConfigurationGroupResponse;
import com.pulumi.azurenative.network.inputs.NetworkManagerSecurityGroupItemResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network default admin rule.
 * 
 */
public final class EffectiveDefaultSecurityAdminRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final EffectiveDefaultSecurityAdminRuleResponse Empty = new EffectiveDefaultSecurityAdminRuleResponse();

    /**
     * Indicates the access allowed for this particular rule
     * 
     */
    @Import(name="access", required=true)
      private final String access;

    public String access() {
        return this.access;
    }

    /**
     * A description of the security admin configuration.
     * 
     */
    @Import(name="configurationDescription")
      private final @Nullable String configurationDescription;

    public Optional<String> configurationDescription() {
        return this.configurationDescription == null ? Optional.empty() : Optional.ofNullable(this.configurationDescription);
    }

    /**
     * A display name of the security admin configuration.
     * 
     */
    @Import(name="configurationDisplayName")
      private final @Nullable String configurationDisplayName;

    public Optional<String> configurationDisplayName() {
        return this.configurationDisplayName == null ? Optional.empty() : Optional.ofNullable(this.configurationDisplayName);
    }

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * The destination port ranges.
     * 
     */
    @Import(name="destinationPortRanges", required=true)
      private final List<String> destinationPortRanges;

    public List<String> destinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    @Import(name="destinations", required=true)
      private final List<AddressPrefixItemResponse> destinations;

    public List<AddressPrefixItemResponse> destinations() {
        return this.destinations;
    }

    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    @Import(name="direction", required=true)
      private final String direction;

    public String direction() {
        return this.direction;
    }

    /**
     * A friendly name for the rule.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * Default rule flag.
     * 
     */
    @Import(name="flag")
      private final @Nullable String flag;

    public Optional<String> flag() {
        return this.flag == null ? Optional.empty() : Optional.ofNullable(this.flag);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Whether the rule is custom or default.
     * Expected value is 'Default'.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    @Import(name="priority", required=true)
      private final Integer priority;

    public Integer priority() {
        return this.priority;
    }

    /**
     * Network protocol this rule applies to.
     * 
     */
    @Import(name="protocol", required=true)
      private final String protocol;

    public String protocol() {
        return this.protocol;
    }

    /**
     * The provisioning state of the resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Groups for rule collection
     * 
     */
    @Import(name="ruleCollectionAppliesToGroups")
      private final @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups;

    public List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups() {
        return this.ruleCollectionAppliesToGroups == null ? List.of() : this.ruleCollectionAppliesToGroups;
    }

    /**
     * A description of the rule collection.
     * 
     */
    @Import(name="ruleCollectionDescription")
      private final @Nullable String ruleCollectionDescription;

    public Optional<String> ruleCollectionDescription() {
        return this.ruleCollectionDescription == null ? Optional.empty() : Optional.ofNullable(this.ruleCollectionDescription);
    }

    /**
     * A display name of the rule collection.
     * 
     */
    @Import(name="ruleCollectionDisplayName")
      private final @Nullable String ruleCollectionDisplayName;

    public Optional<String> ruleCollectionDisplayName() {
        return this.ruleCollectionDisplayName == null ? Optional.empty() : Optional.ofNullable(this.ruleCollectionDisplayName);
    }

    /**
     * Effective configuration groups.
     * 
     */
    @Import(name="ruleGroups")
      private final @Nullable List<ConfigurationGroupResponse> ruleGroups;

    public List<ConfigurationGroupResponse> ruleGroups() {
        return this.ruleGroups == null ? List.of() : this.ruleGroups;
    }

    /**
     * The source port ranges.
     * 
     */
    @Import(name="sourcePortRanges", required=true)
      private final List<String> sourcePortRanges;

    public List<String> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * The CIDR or source IP ranges.
     * 
     */
    @Import(name="sources", required=true)
      private final List<AddressPrefixItemResponse> sources;

    public List<AddressPrefixItemResponse> sources() {
        return this.sources;
    }

    public EffectiveDefaultSecurityAdminRuleResponse(
        String access,
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
        @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups,
        @Nullable String ruleCollectionDescription,
        @Nullable String ruleCollectionDisplayName,
        @Nullable List<ConfigurationGroupResponse> ruleGroups,
        List<String> sourcePortRanges,
        List<AddressPrefixItemResponse> sources) {
        this.access = Objects.requireNonNull(access, "expected parameter 'access' to be non-null");
        this.configurationDescription = configurationDescription;
        this.configurationDisplayName = configurationDisplayName;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges, "expected parameter 'destinationPortRanges' to be non-null");
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.flag = flag;
        this.id = id;
        this.kind = Codegen.stringProp("kind").arg(kind).require();
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.ruleCollectionAppliesToGroups = ruleCollectionAppliesToGroups;
        this.ruleCollectionDescription = ruleCollectionDescription;
        this.ruleCollectionDisplayName = ruleCollectionDisplayName;
        this.ruleGroups = ruleGroups;
        this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges, "expected parameter 'sourcePortRanges' to be non-null");
        this.sources = Objects.requireNonNull(sources, "expected parameter 'sources' to be non-null");
    }

    private EffectiveDefaultSecurityAdminRuleResponse() {
        this.access = null;
        this.configurationDescription = null;
        this.configurationDisplayName = null;
        this.description = null;
        this.destinationPortRanges = List.of();
        this.destinations = List.of();
        this.direction = null;
        this.displayName = null;
        this.flag = null;
        this.id = null;
        this.kind = null;
        this.priority = null;
        this.protocol = null;
        this.provisioningState = null;
        this.ruleCollectionAppliesToGroups = List.of();
        this.ruleCollectionDescription = null;
        this.ruleCollectionDisplayName = null;
        this.ruleGroups = List.of();
        this.sourcePortRanges = List.of();
        this.sources = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EffectiveDefaultSecurityAdminRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
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
        private @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups;
        private @Nullable String ruleCollectionDescription;
        private @Nullable String ruleCollectionDisplayName;
        private @Nullable List<ConfigurationGroupResponse> ruleGroups;
        private List<String> sourcePortRanges;
        private List<AddressPrefixItemResponse> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(EffectiveDefaultSecurityAdminRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
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
    	      this.ruleCollectionAppliesToGroups = defaults.ruleCollectionAppliesToGroups;
    	      this.ruleCollectionDescription = defaults.ruleCollectionDescription;
    	      this.ruleCollectionDisplayName = defaults.ruleCollectionDisplayName;
    	      this.ruleGroups = defaults.ruleGroups;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.sources = defaults.sources;
        }

        public Builder access(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }
        public Builder configurationDescription(@Nullable String configurationDescription) {
            this.configurationDescription = configurationDescription;
            return this;
        }
        public Builder configurationDisplayName(@Nullable String configurationDisplayName) {
            this.configurationDisplayName = configurationDisplayName;
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder destinationPortRanges(List<String> destinationPortRanges) {
            this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges);
            return this;
        }
        public Builder destinationPortRanges(String... destinationPortRanges) {
            return destinationPortRanges(List.of(destinationPortRanges));
        }
        public Builder destinations(List<AddressPrefixItemResponse> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }
        public Builder destinations(AddressPrefixItemResponse... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder flag(@Nullable String flag) {
            this.flag = flag;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder ruleCollectionAppliesToGroups(@Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups) {
            this.ruleCollectionAppliesToGroups = ruleCollectionAppliesToGroups;
            return this;
        }
        public Builder ruleCollectionAppliesToGroups(NetworkManagerSecurityGroupItemResponse... ruleCollectionAppliesToGroups) {
            return ruleCollectionAppliesToGroups(List.of(ruleCollectionAppliesToGroups));
        }
        public Builder ruleCollectionDescription(@Nullable String ruleCollectionDescription) {
            this.ruleCollectionDescription = ruleCollectionDescription;
            return this;
        }
        public Builder ruleCollectionDisplayName(@Nullable String ruleCollectionDisplayName) {
            this.ruleCollectionDisplayName = ruleCollectionDisplayName;
            return this;
        }
        public Builder ruleGroups(@Nullable List<ConfigurationGroupResponse> ruleGroups) {
            this.ruleGroups = ruleGroups;
            return this;
        }
        public Builder ruleGroups(ConfigurationGroupResponse... ruleGroups) {
            return ruleGroups(List.of(ruleGroups));
        }
        public Builder sourcePortRanges(List<String> sourcePortRanges) {
            this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges);
            return this;
        }
        public Builder sourcePortRanges(String... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
        }
        public Builder sources(List<AddressPrefixItemResponse> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }
        public Builder sources(AddressPrefixItemResponse... sources) {
            return sources(List.of(sources));
        }        public EffectiveDefaultSecurityAdminRuleResponse build() {
            return new EffectiveDefaultSecurityAdminRuleResponse(access, configurationDescription, configurationDisplayName, description, destinationPortRanges, destinations, direction, displayName, flag, id, kind, priority, protocol, provisioningState, ruleCollectionAppliesToGroups, ruleCollectionDescription, ruleCollectionDisplayName, ruleGroups, sourcePortRanges, sources);
        }
    }
}
