// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.azurenative.blueprint.outputs.AssignmentLockSettingsResponse;
import io.pulumi.azurenative.blueprint.outputs.AssignmentStatusResponse;
import io.pulumi.azurenative.blueprint.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.blueprint.outputs.ParameterValueResponse;
import io.pulumi.azurenative.blueprint.outputs.ResourceGroupValueResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAssignmentResult {
    /**
     * ID of the published version of a blueprint definition.
     * 
     */
    private final @Nullable String blueprintId;
    /**
     * Multi-line explain this resource.
     * 
     */
    private final @Nullable String description;
    /**
     * One-liner string explain this resource.
     * 
     */
    private final @Nullable String displayName;
    /**
     * String Id used to locate any resource on Azure.
     * 
     */
    private final String id;
    /**
     * Managed identity for this blueprint assignment.
     * 
     */
    private final ManagedServiceIdentityResponse identity;
    /**
     * The location of this blueprint assignment.
     * 
     */
    private final String location;
    /**
     * Defines how resources deployed by a blueprint assignment are locked.
     * 
     */
    private final @Nullable AssignmentLockSettingsResponse locks;
    /**
     * Name of this resource.
     * 
     */
    private final String name;
    /**
     * Blueprint assignment parameter values.
     * 
     */
    private final Map<String,ParameterValueResponse> parameters;
    /**
     * State of the blueprint assignment.
     * 
     */
    private final String provisioningState;
    /**
     * Names and locations of resource group placeholders.
     * 
     */
    private final Map<String,ResourceGroupValueResponse> resourceGroups;
    /**
     * The target subscription scope of the blueprint assignment (format: '/subscriptions/{subscriptionId}'). For management group level assignments, the property is required.
     * 
     */
    private final @Nullable String scope;
    /**
     * Status of blueprint assignment. This field is readonly.
     * 
     */
    private final AssignmentStatusResponse status;
    /**
     * Type of this resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"blueprintId","description","displayName","id","identity","location","locks","name","parameters","provisioningState","resourceGroups","scope","status","type"})
    private GetAssignmentResult(
        @Nullable String blueprintId,
        @Nullable String description,
        @Nullable String displayName,
        String id,
        ManagedServiceIdentityResponse identity,
        String location,
        @Nullable AssignmentLockSettingsResponse locks,
        String name,
        Map<String,ParameterValueResponse> parameters,
        String provisioningState,
        Map<String,ResourceGroupValueResponse> resourceGroups,
        @Nullable String scope,
        AssignmentStatusResponse status,
        String type) {
        this.blueprintId = blueprintId;
        this.description = description;
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.identity = Objects.requireNonNull(identity);
        this.location = Objects.requireNonNull(location);
        this.locks = locks;
        this.name = Objects.requireNonNull(name);
        this.parameters = Objects.requireNonNull(parameters);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceGroups = Objects.requireNonNull(resourceGroups);
        this.scope = scope;
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * ID of the published version of a blueprint definition.
     * 
    */
    public Optional<String> getBlueprintId() {
        return Optional.ofNullable(this.blueprintId);
    }
    /**
     * Multi-line explain this resource.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * One-liner string explain this resource.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * String Id used to locate any resource on Azure.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Managed identity for this blueprint assignment.
     * 
    */
    public ManagedServiceIdentityResponse getIdentity() {
        return this.identity;
    }
    /**
     * The location of this blueprint assignment.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Defines how resources deployed by a blueprint assignment are locked.
     * 
    */
    public Optional<AssignmentLockSettingsResponse> getLocks() {
        return Optional.ofNullable(this.locks);
    }
    /**
     * Name of this resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Blueprint assignment parameter values.
     * 
    */
    public Map<String,ParameterValueResponse> getParameters() {
        return this.parameters;
    }
    /**
     * State of the blueprint assignment.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Names and locations of resource group placeholders.
     * 
    */
    public Map<String,ResourceGroupValueResponse> getResourceGroups() {
        return this.resourceGroups;
    }
    /**
     * The target subscription scope of the blueprint assignment (format: '/subscriptions/{subscriptionId}'). For management group level assignments, the property is required.
     * 
    */
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Status of blueprint assignment. This field is readonly.
     * 
    */
    public AssignmentStatusResponse getStatus() {
        return this.status;
    }
    /**
     * Type of this resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blueprintId;
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private ManagedServiceIdentityResponse identity;
        private String location;
        private @Nullable AssignmentLockSettingsResponse locks;
        private String name;
        private Map<String,ParameterValueResponse> parameters;
        private String provisioningState;
        private Map<String,ResourceGroupValueResponse> resourceGroups;
        private @Nullable String scope;
        private AssignmentStatusResponse status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprintId = defaults.blueprintId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.locks = defaults.locks;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroups = defaults.resourceGroups;
    	      this.scope = defaults.scope;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setBlueprintId(@Nullable String blueprintId) {
            this.blueprintId = blueprintId;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(ManagedServiceIdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocks(@Nullable AssignmentLockSettingsResponse locks) {
            this.locks = locks;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(Map<String,ParameterValueResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGroups(Map<String,ResourceGroupValueResponse> resourceGroups) {
            this.resourceGroups = Objects.requireNonNull(resourceGroups);
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }

        public Builder setStatus(AssignmentStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAssignmentResult build() {
            return new GetAssignmentResult(blueprintId, description, displayName, id, identity, location, locks, name, parameters, provisioningState, resourceGroups, scope, status, type);
        }
    }
}