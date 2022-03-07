// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.azurenative.storagecache.outputs.BlobNfsTargetResponse;
import io.pulumi.azurenative.storagecache.outputs.ClfsTargetResponse;
import io.pulumi.azurenative.storagecache.outputs.NamespaceJunctionResponse;
import io.pulumi.azurenative.storagecache.outputs.Nfs3TargetResponse;
import io.pulumi.azurenative.storagecache.outputs.SystemDataResponse;
import io.pulumi.azurenative.storagecache.outputs.UnknownTargetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStorageTargetResult {
    /**
     * Properties when targetType is blobNfs.
     * 
     */
    private final @Nullable BlobNfsTargetResponse blobNfs;
    /**
     * Properties when targetType is clfs.
     * 
     */
    private final @Nullable ClfsTargetResponse clfs;
    /**
     * Resource ID of the Storage Target.
     * 
     */
    private final String id;
    /**
     * List of Cache namespace junctions to target for namespace associations.
     * 
     */
    private final @Nullable List<NamespaceJunctionResponse> junctions;
    /**
     * Region name string.
     * 
     */
    private final String location;
    /**
     * Name of the Storage Target.
     * 
     */
    private final String name;
    /**
     * Properties when targetType is nfs3.
     * 
     */
    private final @Nullable Nfs3TargetResponse nfs3;
    /**
     * ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The system meta data relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the Storage Target.
     * 
     */
    private final String targetType;
    /**
     * Type of the Storage Target; Microsoft.StorageCache/Cache/StorageTarget
     * 
     */
    private final String type;
    /**
     * Properties when targetType is unknown.
     * 
     */
    private final @Nullable UnknownTargetResponse unknown;

    @OutputCustomType.Constructor({"blobNfs","clfs","id","junctions","location","name","nfs3","provisioningState","systemData","targetType","type","unknown"})
    private GetStorageTargetResult(
        @Nullable BlobNfsTargetResponse blobNfs,
        @Nullable ClfsTargetResponse clfs,
        String id,
        @Nullable List<NamespaceJunctionResponse> junctions,
        String location,
        String name,
        @Nullable Nfs3TargetResponse nfs3,
        @Nullable String provisioningState,
        SystemDataResponse systemData,
        String targetType,
        String type,
        @Nullable UnknownTargetResponse unknown) {
        this.blobNfs = blobNfs;
        this.clfs = clfs;
        this.id = Objects.requireNonNull(id);
        this.junctions = junctions;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.nfs3 = nfs3;
        this.provisioningState = provisioningState;
        this.systemData = Objects.requireNonNull(systemData);
        this.targetType = Objects.requireNonNull(targetType);
        this.type = Objects.requireNonNull(type);
        this.unknown = unknown;
    }

    /**
     * Properties when targetType is blobNfs.
     * 
    */
    public Optional<BlobNfsTargetResponse> getBlobNfs() {
        return Optional.ofNullable(this.blobNfs);
    }
    /**
     * Properties when targetType is clfs.
     * 
    */
    public Optional<ClfsTargetResponse> getClfs() {
        return Optional.ofNullable(this.clfs);
    }
    /**
     * Resource ID of the Storage Target.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * List of Cache namespace junctions to target for namespace associations.
     * 
    */
    public List<NamespaceJunctionResponse> getJunctions() {
        return this.junctions == null ? List.of() : this.junctions;
    }
    /**
     * Region name string.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Name of the Storage Target.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Properties when targetType is nfs3.
     * 
    */
    public Optional<Nfs3TargetResponse> getNfs3() {
        return Optional.ofNullable(this.nfs3);
    }
    /**
     * ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The system meta data relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the Storage Target.
     * 
    */
    public String getTargetType() {
        return this.targetType;
    }
    /**
     * Type of the Storage Target; Microsoft.StorageCache/Cache/StorageTarget
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Properties when targetType is unknown.
     * 
    */
    public Optional<UnknownTargetResponse> getUnknown() {
        return Optional.ofNullable(this.unknown);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageTargetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BlobNfsTargetResponse blobNfs;
        private @Nullable ClfsTargetResponse clfs;
        private String id;
        private @Nullable List<NamespaceJunctionResponse> junctions;
        private String location;
        private String name;
        private @Nullable Nfs3TargetResponse nfs3;
        private @Nullable String provisioningState;
        private SystemDataResponse systemData;
        private String targetType;
        private String type;
        private @Nullable UnknownTargetResponse unknown;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageTargetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobNfs = defaults.blobNfs;
    	      this.clfs = defaults.clfs;
    	      this.id = defaults.id;
    	      this.junctions = defaults.junctions;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nfs3 = defaults.nfs3;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.targetType = defaults.targetType;
    	      this.type = defaults.type;
    	      this.unknown = defaults.unknown;
        }

        public Builder setBlobNfs(@Nullable BlobNfsTargetResponse blobNfs) {
            this.blobNfs = blobNfs;
            return this;
        }

        public Builder setClfs(@Nullable ClfsTargetResponse clfs) {
            this.clfs = clfs;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setJunctions(@Nullable List<NamespaceJunctionResponse> junctions) {
            this.junctions = junctions;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNfs3(@Nullable Nfs3TargetResponse nfs3) {
            this.nfs3 = nfs3;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTargetType(String targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUnknown(@Nullable UnknownTargetResponse unknown) {
            this.unknown = unknown;
            return this;
        }
        public GetStorageTargetResult build() {
            return new GetStorageTargetResult(blobNfs, clfs, id, junctions, location, name, nfs3, provisioningState, systemData, targetType, type, unknown);
        }
    }
}