// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.outputs;

import com.pulumi.azurenative.blueprint.outputs.ParameterValueResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTemplateArtifactResult {
    /**
     * @return Artifacts which need to be deployed before the specified artifact.
     * 
     */
    private final @Nullable List<String> dependsOn;
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
     * @return Specifies the kind of blueprint artifact.
     * Expected value is &#39;template&#39;.
     * 
     */
    private final String kind;
    /**
     * @return Name of this resource.
     * 
     */
    private final String name;
    /**
     * @return Resource Manager template blueprint artifact parameter values.
     * 
     */
    private final Map<String,ParameterValueResponse> parameters;
    /**
     * @return If applicable, the name of the resource group placeholder to which the Resource Manager template blueprint artifact will be deployed.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * @return The Resource Manager template blueprint artifact body.
     * 
     */
    private final Object template;
    /**
     * @return Type of this resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetTemplateArtifactResult(
        @CustomType.Parameter("dependsOn") @Nullable List<String> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") Map<String,ParameterValueResponse> parameters,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("template") Object template,
        @CustomType.Parameter("type") String type) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.parameters = parameters;
        this.resourceGroup = resourceGroup;
        this.template = template;
        this.type = type;
    }

    /**
     * @return Artifacts which need to be deployed before the specified artifact.
     * 
     */
    public List<String> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
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
     * @return Specifies the kind of blueprint artifact.
     * Expected value is &#39;template&#39;.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of this resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource Manager template blueprint artifact parameter values.
     * 
     */
    public Map<String,ParameterValueResponse> parameters() {
        return this.parameters;
    }
    /**
     * @return If applicable, the name of the resource group placeholder to which the Resource Manager template blueprint artifact will be deployed.
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * @return The Resource Manager template blueprint artifact body.
     * 
     */
    public Object template() {
        return this.template;
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

    public static Builder builder(GetTemplateArtifactResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dependsOn;
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private String kind;
        private String name;
        private Map<String,ParameterValueResponse> parameters;
        private @Nullable String resourceGroup;
        private Object template;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTemplateArtifactResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.template = defaults.template;
    	      this.type = defaults.type;
        }

        public Builder dependsOn(@Nullable List<String> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(String... dependsOn) {
            return dependsOn(List.of(dependsOn));
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
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(Map<String,ParameterValueResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder template(Object template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetTemplateArtifactResult build() {
            return new GetTemplateArtifactResult(dependsOn, description, displayName, id, kind, name, parameters, resourceGroup, template, type);
        }
    }
}
