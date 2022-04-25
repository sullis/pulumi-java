// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.AzureFirewallApplicationRuleResponse;
import com.pulumi.azurenative.network.outputs.AzureFirewallRCActionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureFirewallApplicationRuleCollectionResponse {
    /**
     * @return The action type of a rule collection.
     * 
     */
    private final @Nullable AzureFirewallRCActionResponse action;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Priority of the application rule collection resource.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * @return The provisioning state of the application rule collection resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Collection of rules used by a application rule collection.
     * 
     */
    private final @Nullable List<AzureFirewallApplicationRuleResponse> rules;

    @CustomType.Constructor
    private AzureFirewallApplicationRuleCollectionResponse(
        @CustomType.Parameter("action") @Nullable AzureFirewallRCActionResponse action,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("rules") @Nullable List<AzureFirewallApplicationRuleResponse> rules) {
        this.action = action;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.provisioningState = provisioningState;
        this.rules = rules;
    }

    /**
     * @return The action type of a rule collection.
     * 
     */
    public Optional<AzureFirewallRCActionResponse> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Priority of the application rule collection resource.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The provisioning state of the application rule collection resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Collection of rules used by a application rule collection.
     * 
     */
    public List<AzureFirewallApplicationRuleResponse> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallApplicationRuleCollectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureFirewallRCActionResponse action;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String provisioningState;
        private @Nullable List<AzureFirewallApplicationRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallApplicationRuleCollectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.provisioningState = defaults.provisioningState;
    	      this.rules = defaults.rules;
        }

        public Builder action(@Nullable AzureFirewallRCActionResponse action) {
            this.action = action;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder rules(@Nullable List<AzureFirewallApplicationRuleResponse> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(AzureFirewallApplicationRuleResponse... rules) {
            return rules(List.of(rules));
        }        public AzureFirewallApplicationRuleCollectionResponse build() {
            return new AzureFirewallApplicationRuleCollectionResponse(action, etag, id, name, priority, provisioningState, rules);
        }
    }
}
