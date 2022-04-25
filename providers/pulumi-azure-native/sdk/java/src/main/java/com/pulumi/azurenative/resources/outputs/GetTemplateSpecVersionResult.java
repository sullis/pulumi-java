// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.azurenative.resources.outputs.LinkedTemplateArtifactResponse;
import com.pulumi.azurenative.resources.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTemplateSpecVersionResult {
    /**
     * @return Template Spec version description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return String Id used to locate any resource on Azure.
     * 
     */
    private final String id;
    /**
     * @return An array of linked template artifacts.
     * 
     */
    private final @Nullable List<LinkedTemplateArtifactResponse> linkedTemplates;
    /**
     * @return The location of the Template Spec Version. It must match the location of the parent Template Spec.
     * 
     */
    private final String location;
    /**
     * @return The main Azure Resource Manager template content.
     * 
     */
    private final @Nullable Object mainTemplate;
    /**
     * @return The version metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
     * 
     */
    private final @Nullable Object metadata;
    /**
     * @return Name of this resource.
     * 
     */
    private final String name;
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Type of this resource.
     * 
     */
    private final String type;
    /**
     * @return The Azure Resource Manager template UI definition content.
     * 
     */
    private final @Nullable Object uiFormDefinition;

    @CustomType.Constructor
    private GetTemplateSpecVersionResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("linkedTemplates") @Nullable List<LinkedTemplateArtifactResponse> linkedTemplates,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("mainTemplate") @Nullable Object mainTemplate,
        @CustomType.Parameter("metadata") @Nullable Object metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uiFormDefinition") @Nullable Object uiFormDefinition) {
        this.description = description;
        this.id = id;
        this.linkedTemplates = linkedTemplates;
        this.location = location;
        this.mainTemplate = mainTemplate;
        this.metadata = metadata;
        this.name = name;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
        this.uiFormDefinition = uiFormDefinition;
    }

    /**
     * @return Template Spec version description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return String Id used to locate any resource on Azure.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return An array of linked template artifacts.
     * 
     */
    public List<LinkedTemplateArtifactResponse> linkedTemplates() {
        return this.linkedTemplates == null ? List.of() : this.linkedTemplates;
    }
    /**
     * @return The location of the Template Spec Version. It must match the location of the parent Template Spec.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The main Azure Resource Manager template content.
     * 
     */
    public Optional<Object> mainTemplate() {
        return Optional.ofNullable(this.mainTemplate);
    }
    /**
     * @return The version metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
     * 
     */
    public Optional<Object> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return Name of this resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Type of this resource.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The Azure Resource Manager template UI definition content.
     * 
     */
    public Optional<Object> uiFormDefinition() {
        return Optional.ofNullable(this.uiFormDefinition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateSpecVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String id;
        private @Nullable List<LinkedTemplateArtifactResponse> linkedTemplates;
        private String location;
        private @Nullable Object mainTemplate;
        private @Nullable Object metadata;
        private String name;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable Object uiFormDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTemplateSpecVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.linkedTemplates = defaults.linkedTemplates;
    	      this.location = defaults.location;
    	      this.mainTemplate = defaults.mainTemplate;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uiFormDefinition = defaults.uiFormDefinition;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder linkedTemplates(@Nullable List<LinkedTemplateArtifactResponse> linkedTemplates) {
            this.linkedTemplates = linkedTemplates;
            return this;
        }
        public Builder linkedTemplates(LinkedTemplateArtifactResponse... linkedTemplates) {
            return linkedTemplates(List.of(linkedTemplates));
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder mainTemplate(@Nullable Object mainTemplate) {
            this.mainTemplate = mainTemplate;
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uiFormDefinition(@Nullable Object uiFormDefinition) {
            this.uiFormDefinition = uiFormDefinition;
            return this;
        }        public GetTemplateSpecVersionResult build() {
            return new GetTemplateSpecVersionResult(description, id, linkedTemplates, location, mainTemplate, metadata, name, systemData, tags, type, uiFormDefinition);
        }
    }
}
