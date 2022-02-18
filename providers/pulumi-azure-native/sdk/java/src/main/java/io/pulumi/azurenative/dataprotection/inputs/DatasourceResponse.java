// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Datasource to be backed up
 * 
 */
public final class DatasourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatasourceResponse Empty = new DatasourceResponse();

    /**
     * DatasourceType of the resource.
     * 
     */
    @InputImport(name="datasourceType")
    private final @Nullable String datasourceType;

    public Optional<String> getDatasourceType() {
        return this.datasourceType == null ? Optional.empty() : Optional.ofNullable(this.datasourceType);
    }

    /**
     * Type of Datasource object, used to initialize the right inherited type
     * 
     */
    @InputImport(name="objectType")
    private final @Nullable String objectType;

    public Optional<String> getObjectType() {
        return this.objectType == null ? Optional.empty() : Optional.ofNullable(this.objectType);
    }

    /**
     * Full ARM ID of the resource. For azure resources, this is ARM ID. For non azure resources, this will be the ID created by backup service via Fabric/Vault.
     * 
     */
    @InputImport(name="resourceID", required=true)
    private final String resourceID;

    public String getResourceID() {
        return this.resourceID;
    }

    /**
     * Location of datasource.
     * 
     */
    @InputImport(name="resourceLocation")
    private final @Nullable String resourceLocation;

    public Optional<String> getResourceLocation() {
        return this.resourceLocation == null ? Optional.empty() : Optional.ofNullable(this.resourceLocation);
    }

    /**
     * Unique identifier of the resource in the context of parent.
     * 
     */
    @InputImport(name="resourceName")
    private final @Nullable String resourceName;

    public Optional<String> getPropResourceName() {
        return this.resourceName == null ? Optional.empty() : Optional.ofNullable(this.resourceName);
    }

    /**
     * Resource Type of Datasource.
     * 
     */
    @InputImport(name="resourceType")
    private final @Nullable String resourceType;

    public Optional<String> getPropResourceType() {
        return this.resourceType == null ? Optional.empty() : Optional.ofNullable(this.resourceType);
    }

    /**
     * Uri of the resource.
     * 
     */
    @InputImport(name="resourceUri")
    private final @Nullable String resourceUri;

    public Optional<String> getResourceUri() {
        return this.resourceUri == null ? Optional.empty() : Optional.ofNullable(this.resourceUri);
    }

    public DatasourceResponse(
        @Nullable String datasourceType,
        @Nullable String objectType,
        String resourceID,
        @Nullable String resourceLocation,
        @Nullable String resourceName,
        @Nullable String resourceType,
        @Nullable String resourceUri) {
        this.datasourceType = datasourceType;
        this.objectType = objectType;
        this.resourceID = Objects.requireNonNull(resourceID, "expected parameter 'resourceID' to be non-null");
        this.resourceLocation = resourceLocation;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.resourceUri = resourceUri;
    }

    private DatasourceResponse() {
        this.datasourceType = null;
        this.objectType = null;
        this.resourceID = null;
        this.resourceLocation = null;
        this.resourceName = null;
        this.resourceType = null;
        this.resourceUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datasourceType;
        private @Nullable String objectType;
        private String resourceID;
        private @Nullable String resourceLocation;
        private @Nullable String resourceName;
        private @Nullable String resourceType;
        private @Nullable String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasourceType = defaults.datasourceType;
    	      this.objectType = defaults.objectType;
    	      this.resourceID = defaults.resourceID;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceType = defaults.resourceType;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setDatasourceType(@Nullable String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }

        public Builder setObjectType(@Nullable String objectType) {
            this.objectType = objectType;
            return this;
        }

        public Builder setResourceID(String resourceID) {
            this.resourceID = Objects.requireNonNull(resourceID);
            return this;
        }

        public Builder setResourceLocation(@Nullable String resourceLocation) {
            this.resourceLocation = resourceLocation;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public DatasourceResponse build() {
            return new DatasourceResponse(datasourceType, objectType, resourceID, resourceLocation, resourceName, resourceType, resourceUri);
        }
    }
}
