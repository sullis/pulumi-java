// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.enums.Kind;
import io.pulumi.azurenative.insights.inputs.WorkbookManagedIdentityArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkbookArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkbookArgs Empty = new WorkbookArgs();

    /**
     * Workbook category, as defined by the user at creation time.
     * 
     */
    @InputImport(name="category", required=true)
    private final Input<String> category;

    public Input<String> getCategory() {
        return this.category;
    }

    /**
     * The user-defined name (display name) of the workbook.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Azure resource Id
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Identity used for BYOS
     * 
     */
    @InputImport(name="identity")
    private final @Nullable Input<WorkbookManagedIdentityArgs> identity;

    public Input<WorkbookManagedIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The kind of workbook. Choices are user and shared.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<Either<String,Kind>> kind;

    public Input<Either<String,Kind>> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Azure resource name
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @InputImport(name="resourceName")
    private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * Configuration of this particular workbook. Configuration data is a string containing valid JSON
     * 
     */
    @InputImport(name="serializedData", required=true)
    private final Input<String> serializedData;

    public Input<String> getSerializedData() {
        return this.serializedData;
    }

    /**
     * ResourceId for a source resource.
     * 
     */
    @InputImport(name="sourceId")
    private final @Nullable Input<String> sourceId;

    public Input<String> getSourceId() {
        return this.sourceId == null ? Input.empty() : this.sourceId;
    }

    /**
     * BYOS Storage Account URI
     * 
     */
    @InputImport(name="storageUri")
    private final @Nullable Input<String> storageUri;

    public Input<String> getStorageUri() {
        return this.storageUri == null ? Input.empty() : this.storageUri;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Azure resource type
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * Workbook version
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public WorkbookArgs(
        Input<String> category,
        Input<String> displayName,
        @Nullable Input<String> id,
        @Nullable Input<WorkbookManagedIdentityArgs> identity,
        @Nullable Input<Either<String,Kind>> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        Input<String> serializedData,
        @Nullable Input<String> sourceId,
        @Nullable Input<String> storageUri,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> type,
        @Nullable Input<String> version) {
        this.category = Objects.requireNonNull(category, "expected parameter 'category' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.id = id;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.serializedData = Objects.requireNonNull(serializedData, "expected parameter 'serializedData' to be non-null");
        this.sourceId = sourceId;
        this.storageUri = storageUri;
        this.tags = tags;
        this.type = type;
        this.version = version;
    }

    private WorkbookArgs() {
        this.category = Input.empty();
        this.displayName = Input.empty();
        this.id = Input.empty();
        this.identity = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.serializedData = Input.empty();
        this.sourceId = Input.empty();
        this.storageUri = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkbookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> category;
        private Input<String> displayName;
        private @Nullable Input<String> id;
        private @Nullable Input<WorkbookManagedIdentityArgs> identity;
        private @Nullable Input<Either<String,Kind>> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private Input<String> serializedData;
        private @Nullable Input<String> sourceId;
        private @Nullable Input<String> storageUri;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> type;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkbookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.serializedData = defaults.serializedData;
    	      this.sourceId = defaults.sourceId;
    	      this.storageUri = defaults.storageUri;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setCategory(Input<String> category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder setCategory(String category) {
            this.category = Input.of(Objects.requireNonNull(category));
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
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

        public Builder setIdentity(@Nullable Input<WorkbookManagedIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable WorkbookManagedIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setKind(@Nullable Input<Either<String,Kind>> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable Either<String,Kind> kind) {
            this.kind = Input.ofNullable(kind);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setSerializedData(Input<String> serializedData) {
            this.serializedData = Objects.requireNonNull(serializedData);
            return this;
        }

        public Builder setSerializedData(String serializedData) {
            this.serializedData = Input.of(Objects.requireNonNull(serializedData));
            return this;
        }

        public Builder setSourceId(@Nullable Input<String> sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder setSourceId(@Nullable String sourceId) {
            this.sourceId = Input.ofNullable(sourceId);
            return this;
        }

        public Builder setStorageUri(@Nullable Input<String> storageUri) {
            this.storageUri = storageUri;
            return this;
        }

        public Builder setStorageUri(@Nullable String storageUri) {
            this.storageUri = Input.ofNullable(storageUri);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public WorkbookArgs build() {
            return new WorkbookArgs(category, displayName, id, identity, kind, location, name, resourceGroupName, resourceName, serializedData, sourceId, storageUri, tags, type, version);
        }
    }
}
