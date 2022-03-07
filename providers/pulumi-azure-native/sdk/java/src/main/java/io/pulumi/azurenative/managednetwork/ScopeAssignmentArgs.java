// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScopeAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScopeAssignmentArgs Empty = new ScopeAssignmentArgs();

    /**
     * The managed network ID with scope will be assigned to.
     * 
     */
    @InputImport(name="assignedManagedNetwork")
      private final @Nullable Input<String> assignedManagedNetwork;

    public Input<String> getAssignedManagedNetwork() {
        return this.assignedManagedNetwork == null ? Input.empty() : this.assignedManagedNetwork;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The base resource of the scope assignment to create. The scope can be any REST resource instance. For example, use 'subscriptions/{subscription-id}' for a subscription, 'subscriptions/{subscription-id}/resourceGroups/{resource-group-name}' for a resource group, and 'subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/providers/{resource-provider}/{resource-type}/{resource-name}' for a resource.
     * 
     */
    @InputImport(name="scope", required=true)
      private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    /**
     * The name of the scope assignment to create.
     * 
     */
    @InputImport(name="scopeAssignmentName")
      private final @Nullable Input<String> scopeAssignmentName;

    public Input<String> getScopeAssignmentName() {
        return this.scopeAssignmentName == null ? Input.empty() : this.scopeAssignmentName;
    }

    public ScopeAssignmentArgs(
        @Nullable Input<String> assignedManagedNetwork,
        @Nullable Input<String> location,
        Input<String> scope,
        @Nullable Input<String> scopeAssignmentName) {
        this.assignedManagedNetwork = assignedManagedNetwork;
        this.location = location;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.scopeAssignmentName = scopeAssignmentName;
    }

    private ScopeAssignmentArgs() {
        this.assignedManagedNetwork = Input.empty();
        this.location = Input.empty();
        this.scope = Input.empty();
        this.scopeAssignmentName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> assignedManagedNetwork;
        private @Nullable Input<String> location;
        private Input<String> scope;
        private @Nullable Input<String> scopeAssignmentName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignedManagedNetwork = defaults.assignedManagedNetwork;
    	      this.location = defaults.location;
    	      this.scope = defaults.scope;
    	      this.scopeAssignmentName = defaults.scopeAssignmentName;
        }

        public Builder setAssignedManagedNetwork(@Nullable Input<String> assignedManagedNetwork) {
            this.assignedManagedNetwork = assignedManagedNetwork;
            return this;
        }

        public Builder setAssignedManagedNetwork(@Nullable String assignedManagedNetwork) {
            this.assignedManagedNetwork = Input.ofNullable(assignedManagedNetwork);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder setScopeAssignmentName(@Nullable Input<String> scopeAssignmentName) {
            this.scopeAssignmentName = scopeAssignmentName;
            return this;
        }

        public Builder setScopeAssignmentName(@Nullable String scopeAssignmentName) {
            this.scopeAssignmentName = Input.ofNullable(scopeAssignmentName);
            return this;
        }
        public ScopeAssignmentArgs build() {
            return new ScopeAssignmentArgs(assignedManagedNetwork, location, scope, scopeAssignmentName);
        }
    }
}