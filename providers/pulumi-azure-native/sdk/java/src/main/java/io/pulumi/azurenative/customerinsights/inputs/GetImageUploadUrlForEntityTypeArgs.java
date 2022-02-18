// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImageUploadUrlForEntityTypeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetImageUploadUrlForEntityTypeArgs Empty = new GetImageUploadUrlForEntityTypeArgs();

    /**
     * Type of entity. Can be Profile or Interaction.
     * 
     */
    @InputImport(name="entityType")
    private final @Nullable String entityType;

    public Optional<String> getEntityType() {
        return this.entityType == null ? Optional.empty() : Optional.ofNullable(this.entityType);
    }

    /**
     * Name of the entity type.
     * 
     */
    @InputImport(name="entityTypeName")
    private final @Nullable String entityTypeName;

    public Optional<String> getEntityTypeName() {
        return this.entityTypeName == null ? Optional.empty() : Optional.ofNullable(this.entityTypeName);
    }

    /**
     * The name of the hub.
     * 
     */
    @InputImport(name="hubName", required=true)
    private final String hubName;

    public String getHubName() {
        return this.hubName;
    }

    /**
     * Relative path of the image.
     * 
     */
    @InputImport(name="relativePath")
    private final @Nullable String relativePath;

    public Optional<String> getRelativePath() {
        return this.relativePath == null ? Optional.empty() : Optional.ofNullable(this.relativePath);
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetImageUploadUrlForEntityTypeArgs(
        @Nullable String entityType,
        @Nullable String entityTypeName,
        String hubName,
        @Nullable String relativePath,
        String resourceGroupName) {
        this.entityType = entityType;
        this.entityTypeName = entityTypeName;
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.relativePath = relativePath;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetImageUploadUrlForEntityTypeArgs() {
        this.entityType = null;
        this.entityTypeName = null;
        this.hubName = null;
        this.relativePath = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageUploadUrlForEntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String entityType;
        private @Nullable String entityTypeName;
        private String hubName;
        private @Nullable String relativePath;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageUploadUrlForEntityTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.entityTypeName = defaults.entityTypeName;
    	      this.hubName = defaults.hubName;
    	      this.relativePath = defaults.relativePath;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setEntityType(@Nullable String entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setEntityTypeName(@Nullable String entityTypeName) {
            this.entityTypeName = entityTypeName;
            return this;
        }

        public Builder setHubName(String hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder setRelativePath(@Nullable String relativePath) {
            this.relativePath = relativePath;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetImageUploadUrlForEntityTypeArgs build() {
            return new GetImageUploadUrlForEntityTypeArgs(entityType, entityTypeName, hubName, relativePath, resourceGroupName);
        }
    }
}
