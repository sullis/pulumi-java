// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FrontDoorManagedRuleSetResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the list of managed rule sets for the policy.
 * 
 */
public final class ManagedRuleSetListResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedRuleSetListResponse Empty = new ManagedRuleSetListResponse();

    /**
     * List of rule sets.
     * 
     */
    @InputImport(name="managedRuleSets")
      private final @Nullable List<FrontDoorManagedRuleSetResponse> managedRuleSets;

    public List<FrontDoorManagedRuleSetResponse> getManagedRuleSets() {
        return this.managedRuleSets == null ? List.of() : this.managedRuleSets;
    }

    public ManagedRuleSetListResponse(@Nullable List<FrontDoorManagedRuleSetResponse> managedRuleSets) {
        this.managedRuleSets = managedRuleSets;
    }

    private ManagedRuleSetListResponse() {
        this.managedRuleSets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleSetListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FrontDoorManagedRuleSetResponse> managedRuleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleSetListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedRuleSets = defaults.managedRuleSets;
        }

        public Builder setManagedRuleSets(@Nullable List<FrontDoorManagedRuleSetResponse> managedRuleSets) {
            this.managedRuleSets = managedRuleSets;
            return this;
        }
        public ManagedRuleSetListResponse build() {
            return new ManagedRuleSetListResponse(managedRuleSets);
        }
    }
}