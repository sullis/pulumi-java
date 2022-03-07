// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AzureFirewallNatRCActionResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallNatRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFirewallNatRuleCollectionResponse {
    /**
     * The action type of a NAT rule collection.
     * 
     */
    private final @Nullable AzureFirewallNatRCActionResponse action;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * Priority of the NAT rule collection resource.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The provisioning state of the NAT rule collection resource.
     * 
     */
    private final String provisioningState;
    /**
     * Collection of rules used by a NAT rule collection.
     * 
     */
    private final @Nullable List<AzureFirewallNatRuleResponse> rules;

    @OutputCustomType.Constructor({"action","etag","id","name","priority","provisioningState","rules"})
    private AzureFirewallNatRuleCollectionResponse(
        @Nullable AzureFirewallNatRCActionResponse action,
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable Integer priority,
        String provisioningState,
        @Nullable List<AzureFirewallNatRuleResponse> rules) {
        this.action = action;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.rules = rules;
    }

    /**
     * The action type of a NAT rule collection.
     * 
    */
    public Optional<AzureFirewallNatRCActionResponse> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Priority of the NAT rule collection resource.
     * 
    */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The provisioning state of the NAT rule collection resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Collection of rules used by a NAT rule collection.
     * 
    */
    public List<AzureFirewallNatRuleResponse> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallNatRuleCollectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureFirewallNatRCActionResponse action;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String provisioningState;
        private @Nullable List<AzureFirewallNatRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallNatRuleCollectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.rules = defaults.rules;
        }

        public Builder setAction(@Nullable AzureFirewallNatRCActionResponse action) {
            this.action = action;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRules(@Nullable List<AzureFirewallNatRuleResponse> rules) {
            this.rules = rules;
            return this;
        }
        public AzureFirewallNatRuleCollectionResponse build() {
            return new AzureFirewallNatRuleCollectionResponse(action, etag, id, name, priority, provisioningState, rules);
        }
    }
}