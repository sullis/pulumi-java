// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.outputs;

import com.pulumi.azurenative.blueprint.outputs.BlueprintStatusResponse;
import com.pulumi.azurenative.blueprint.outputs.ParameterDefinitionResponse;
import com.pulumi.azurenative.blueprint.outputs.ResourceGroupDefinitionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPublishedBlueprintResult {
    /**
     * @return Name of the published blueprint definition.
     * 
     */
    private final @Nullable String blueprintName;
    /**
     * @return Version-specific change notes.
     * 
     */
    private final @Nullable String changeNotes;
    /**
     * @return Multi-line explain this resource.
     * 
     */
    private final @Nullable String description;
    /**
     * @return One-liner string explain this resource.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return String Id used to locate any resource on Azure.
     * 
     */
    private final String id;
    /**
     * @return Name of this resource.
     * 
     */
    private final String name;
    /**
     * @return Parameters required by this blueprint definition.
     * 
     */
    private final @Nullable Map<String,ParameterDefinitionResponse> parameters;
    /**
     * @return Resource group placeholders defined by this blueprint definition.
     * 
     */
    private final @Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups;
    /**
     * @return Status of the blueprint. This field is readonly.
     * 
     */
    private final BlueprintStatusResponse status;
    /**
     * @return The scope where this blueprint definition can be assigned.
     * 
     */
    private final @Nullable String targetScope;
    /**
     * @return Type of this resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPublishedBlueprintResult(
        @CustomType.Parameter("blueprintName") @Nullable String blueprintName,
        @CustomType.Parameter("changeNotes") @Nullable String changeNotes,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterDefinitionResponse> parameters,
        @CustomType.Parameter("resourceGroups") @Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups,
        @CustomType.Parameter("status") BlueprintStatusResponse status,
        @CustomType.Parameter("targetScope") @Nullable String targetScope,
        @CustomType.Parameter("type") String type) {
        this.blueprintName = blueprintName;
        this.changeNotes = changeNotes;
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.resourceGroups = resourceGroups;
        this.status = status;
        this.targetScope = targetScope;
        this.type = type;
    }

    /**
     * @return Name of the published blueprint definition.
     * 
     */
    public Optional<String> blueprintName() {
        return Optional.ofNullable(this.blueprintName);
    }
    /**
     * @return Version-specific change notes.
     * 
     */
    public Optional<String> changeNotes() {
        return Optional.ofNullable(this.changeNotes);
    }
    /**
     * @return Multi-line explain this resource.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return One-liner string explain this resource.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return String Id used to locate any resource on Azure.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of this resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Parameters required by this blueprint definition.
     * 
     */
    public Map<String,ParameterDefinitionResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return Resource group placeholders defined by this blueprint definition.
     * 
     */
    public Map<String,ResourceGroupDefinitionResponse> resourceGroups() {
        return this.resourceGroups == null ? Map.of() : this.resourceGroups;
    }
    /**
     * @return Status of the blueprint. This field is readonly.
     * 
     */
    public BlueprintStatusResponse status() {
        return this.status;
    }
    /**
     * @return The scope where this blueprint definition can be assigned.
     * 
     */
    public Optional<String> targetScope() {
        return Optional.ofNullable(this.targetScope);
    }
    /**
     * @return Type of this resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublishedBlueprintResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blueprintName;
        private @Nullable String changeNotes;
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private String name;
        private @Nullable Map<String,ParameterDefinitionResponse> parameters;
        private @Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups;
        private BlueprintStatusResponse status;
        private @Nullable String targetScope;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublishedBlueprintResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprintName = defaults.blueprintName;
    	      this.changeNotes = defaults.changeNotes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroups = defaults.resourceGroups;
    	      this.status = defaults.status;
    	      this.targetScope = defaults.targetScope;
    	      this.type = defaults.type;
        }

        public Builder blueprintName(@Nullable String blueprintName) {
            this.blueprintName = blueprintName;
            return this;
        }
        public Builder changeNotes(@Nullable String changeNotes) {
            this.changeNotes = changeNotes;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterDefinitionResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder resourceGroups(@Nullable Map<String,ResourceGroupDefinitionResponse> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }
        public Builder status(BlueprintStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder targetScope(@Nullable String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetPublishedBlueprintResult build() {
            return new GetPublishedBlueprintResult(blueprintName, changeNotes, description, displayName, id, name, parameters, resourceGroups, status, targetScope, type);
        }
    }
}
