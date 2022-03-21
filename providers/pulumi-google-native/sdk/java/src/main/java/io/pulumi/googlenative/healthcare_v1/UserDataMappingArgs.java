// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.healthcare_v1.inputs.AttributeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserDataMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserDataMappingArgs Empty = new UserDataMappingArgs();

    @Import(name="consentStoreId", required=true)
      private final Output<String> consentStoreId;

    public Output<String> getConsentStoreId() {
        return this.consentStoreId;
    }

    /**
     * A unique identifier for the mapped resource.
     * 
     */
    @Import(name="dataId", required=true)
      private final Output<String> dataId;

    public Output<String> getDataId() {
        return this.dataId;
    }

    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Resource name of the User data mapping, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/userDataMappings/{user_data_mapping_id}`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Attributes of the resource. Only explicitly set attributes are displayed here. Attribute definitions with defaults set implicitly apply to these User data mappings. Attributes listed here must be single valued, that is, exactly one value is specified for the field "values" in each Attribute.
     * 
     */
    @Import(name="resourceAttributes")
      private final @Nullable Output<List<AttributeArgs>> resourceAttributes;

    public Output<List<AttributeArgs>> getResourceAttributes() {
        return this.resourceAttributes == null ? Output.empty() : this.resourceAttributes;
    }

    /**
     * User's UUID provided by the client.
     * 
     */
    @Import(name="userId", required=true)
      private final Output<String> userId;

    public Output<String> getUserId() {
        return this.userId;
    }

    public UserDataMappingArgs(
        Output<String> consentStoreId,
        Output<String> dataId,
        Output<String> datasetId,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<AttributeArgs>> resourceAttributes,
        Output<String> userId) {
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.dataId = Objects.requireNonNull(dataId, "expected parameter 'dataId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.location = location;
        this.name = name;
        this.project = project;
        this.resourceAttributes = resourceAttributes;
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private UserDataMappingArgs() {
        this.consentStoreId = Output.empty();
        this.dataId = Output.empty();
        this.datasetId = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.resourceAttributes = Output.empty();
        this.userId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserDataMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> consentStoreId;
        private Output<String> dataId;
        private Output<String> datasetId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<AttributeArgs>> resourceAttributes;
        private Output<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserDataMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.dataId = defaults.dataId;
    	      this.datasetId = defaults.datasetId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.resourceAttributes = defaults.resourceAttributes;
    	      this.userId = defaults.userId;
        }

        public Builder consentStoreId(Output<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }
        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Output.of(Objects.requireNonNull(consentStoreId));
            return this;
        }
        public Builder dataId(Output<String> dataId) {
            this.dataId = Objects.requireNonNull(dataId);
            return this;
        }
        public Builder dataId(String dataId) {
            this.dataId = Output.of(Objects.requireNonNull(dataId));
            return this;
        }
        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder resourceAttributes(@Nullable Output<List<AttributeArgs>> resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }
        public Builder resourceAttributes(@Nullable List<AttributeArgs> resourceAttributes) {
            this.resourceAttributes = Output.ofNullable(resourceAttributes);
            return this;
        }
        public Builder resourceAttributes(AttributeArgs... resourceAttributes) {
            return resourceAttributes(List.of(resourceAttributes));
        }
        public Builder userId(Output<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Output.of(Objects.requireNonNull(userId));
            return this;
        }        public UserDataMappingArgs build() {
            return new UserDataMappingArgs(consentStoreId, dataId, datasetId, location, name, project, resourceAttributes, userId);
        }
    }
}
