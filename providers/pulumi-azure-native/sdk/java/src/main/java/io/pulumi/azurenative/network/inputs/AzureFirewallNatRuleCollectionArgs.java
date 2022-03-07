// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AzureFirewallNatRCActionArgs;
import io.pulumi.azurenative.network.inputs.AzureFirewallNatRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NAT rule collection resource.
 * 
 */
public final class AzureFirewallNatRuleCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFirewallNatRuleCollectionArgs Empty = new AzureFirewallNatRuleCollectionArgs();

    /**
     * The action type of a NAT rule collection.
     * 
     */
    @InputImport(name="action")
      private final @Nullable Input<AzureFirewallNatRCActionArgs> action;

    public Input<AzureFirewallNatRCActionArgs> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Priority of the NAT rule collection resource.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * Collection of rules used by a NAT rule collection.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Input<List<AzureFirewallNatRuleArgs>> rules;

    public Input<List<AzureFirewallNatRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    public AzureFirewallNatRuleCollectionArgs(
        @Nullable Input<AzureFirewallNatRCActionArgs> action,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<Integer> priority,
        @Nullable Input<List<AzureFirewallNatRuleArgs>> rules) {
        this.action = action;
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.rules = rules;
    }

    private AzureFirewallNatRuleCollectionArgs() {
        this.action = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallNatRuleCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AzureFirewallNatRCActionArgs> action;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<List<AzureFirewallNatRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallNatRuleCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.rules = defaults.rules;
        }

        public Builder setAction(@Nullable Input<AzureFirewallNatRCActionArgs> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable AzureFirewallNatRCActionArgs action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setRules(@Nullable Input<List<AzureFirewallNatRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<AzureFirewallNatRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }
        public AzureFirewallNatRuleCollectionArgs build() {
            return new AzureFirewallNatRuleCollectionArgs(action, id, name, priority, rules);
        }
    }
}