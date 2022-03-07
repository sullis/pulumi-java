// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.EdgeProfileResponse;
import io.pulumi.azurenative.databoxedge.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.databoxedge.outputs.ResourceMoveDetailsResponse;
import io.pulumi.azurenative.databoxedge.outputs.SkuResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDeviceResult {
    /**
     * Type of compute roles configured.
     * 
     */
    private final List<String> configuredRoleTypes;
    /**
     * The Data Box Edge/Gateway device culture.
     * 
     */
    private final String culture;
    /**
     * The status of the Data Box Edge/Gateway device.
     * 
     */
    private final @Nullable String dataBoxEdgeDeviceStatus;
    /**
     * The Description of the Data Box Edge/Gateway device.
     * 
     */
    private final String description;
    /**
     * The device software version number of the device (eg: 1.2.18105.6).
     * 
     */
    private final String deviceHcsVersion;
    /**
     * The Data Box Edge/Gateway device local capacity in MB.
     * 
     */
    private final Double deviceLocalCapacity;
    /**
     * The Data Box Edge/Gateway device model.
     * 
     */
    private final String deviceModel;
    /**
     * The Data Box Edge/Gateway device software version.
     * 
     */
    private final String deviceSoftwareVersion;
    /**
     * The type of the Data Box Edge/Gateway device.
     * 
     */
    private final String deviceType;
    /**
     * The details of Edge Profile for this resource
     * 
     */
    private final EdgeProfileResponse edgeProfile;
    /**
     * The etag for the devices.
     * 
     */
    private final @Nullable String etag;
    /**
     * The Data Box Edge/Gateway device name.
     * 
     */
    private final String friendlyName;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * Msi identity of the resource
     * 
     */
    private final @Nullable ResourceIdentityResponse identity;
    /**
     * The etag for the devices.
     * 
     */
    private final String kind;
    /**
     * The location of the device. This is a supported and registered Azure geographical region (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be changed once it is created, but if an identical geographical region is specified on update, the request will succeed.
     * 
     */
    private final String location;
    /**
     * The description of the Data Box Edge/Gateway device model.
     * 
     */
    private final String modelDescription;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * The number of nodes in the cluster.
     * 
     */
    private final Integer nodeCount;
    /**
     * The details of the move operation on this resource.
     * 
     */
    private final ResourceMoveDetailsResponse resourceMoveDetails;
    /**
     * The Serial Number of Data Box Edge/Gateway device.
     * 
     */
    private final String serialNumber;
    /**
     * The SKU type.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * DataBoxEdge Resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The list of tags that describe the device. These tags can be used to view and group this device (across resource groups).
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The Data Box Edge/Gateway device timezone.
     * 
     */
    private final String timeZone;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"configuredRoleTypes","culture","dataBoxEdgeDeviceStatus","description","deviceHcsVersion","deviceLocalCapacity","deviceModel","deviceSoftwareVersion","deviceType","edgeProfile","etag","friendlyName","id","identity","kind","location","modelDescription","name","nodeCount","resourceMoveDetails","serialNumber","sku","systemData","tags","timeZone","type"})
    private GetDeviceResult(
        List<String> configuredRoleTypes,
        String culture,
        @Nullable String dataBoxEdgeDeviceStatus,
        String description,
        String deviceHcsVersion,
        Double deviceLocalCapacity,
        String deviceModel,
        String deviceSoftwareVersion,
        String deviceType,
        EdgeProfileResponse edgeProfile,
        @Nullable String etag,
        String friendlyName,
        String id,
        @Nullable ResourceIdentityResponse identity,
        String kind,
        String location,
        String modelDescription,
        String name,
        Integer nodeCount,
        ResourceMoveDetailsResponse resourceMoveDetails,
        String serialNumber,
        @Nullable SkuResponse sku,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String timeZone,
        String type) {
        this.configuredRoleTypes = Objects.requireNonNull(configuredRoleTypes);
        this.culture = Objects.requireNonNull(culture);
        this.dataBoxEdgeDeviceStatus = dataBoxEdgeDeviceStatus;
        this.description = Objects.requireNonNull(description);
        this.deviceHcsVersion = Objects.requireNonNull(deviceHcsVersion);
        this.deviceLocalCapacity = Objects.requireNonNull(deviceLocalCapacity);
        this.deviceModel = Objects.requireNonNull(deviceModel);
        this.deviceSoftwareVersion = Objects.requireNonNull(deviceSoftwareVersion);
        this.deviceType = Objects.requireNonNull(deviceType);
        this.edgeProfile = Objects.requireNonNull(edgeProfile);
        this.etag = etag;
        this.friendlyName = Objects.requireNonNull(friendlyName);
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind);
        this.location = Objects.requireNonNull(location);
        this.modelDescription = Objects.requireNonNull(modelDescription);
        this.name = Objects.requireNonNull(name);
        this.nodeCount = Objects.requireNonNull(nodeCount);
        this.resourceMoveDetails = Objects.requireNonNull(resourceMoveDetails);
        this.serialNumber = Objects.requireNonNull(serialNumber);
        this.sku = sku;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.timeZone = Objects.requireNonNull(timeZone);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Type of compute roles configured.
     * 
    */
    public List<String> getConfiguredRoleTypes() {
        return this.configuredRoleTypes;
    }
    /**
     * The Data Box Edge/Gateway device culture.
     * 
    */
    public String getCulture() {
        return this.culture;
    }
    /**
     * The status of the Data Box Edge/Gateway device.
     * 
    */
    public Optional<String> getDataBoxEdgeDeviceStatus() {
        return Optional.ofNullable(this.dataBoxEdgeDeviceStatus);
    }
    /**
     * The Description of the Data Box Edge/Gateway device.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The device software version number of the device (eg: 1.2.18105.6).
     * 
    */
    public String getDeviceHcsVersion() {
        return this.deviceHcsVersion;
    }
    /**
     * The Data Box Edge/Gateway device local capacity in MB.
     * 
    */
    public Double getDeviceLocalCapacity() {
        return this.deviceLocalCapacity;
    }
    /**
     * The Data Box Edge/Gateway device model.
     * 
    */
    public String getDeviceModel() {
        return this.deviceModel;
    }
    /**
     * The Data Box Edge/Gateway device software version.
     * 
    */
    public String getDeviceSoftwareVersion() {
        return this.deviceSoftwareVersion;
    }
    /**
     * The type of the Data Box Edge/Gateway device.
     * 
    */
    public String getDeviceType() {
        return this.deviceType;
    }
    /**
     * The details of Edge Profile for this resource
     * 
    */
    public EdgeProfileResponse getEdgeProfile() {
        return this.edgeProfile;
    }
    /**
     * The etag for the devices.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The Data Box Edge/Gateway device name.
     * 
    */
    public String getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Msi identity of the resource
     * 
    */
    public Optional<ResourceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The etag for the devices.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The location of the device. This is a supported and registered Azure geographical region (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be changed once it is created, but if an identical geographical region is specified on update, the request will succeed.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The description of the Data Box Edge/Gateway device model.
     * 
    */
    public String getModelDescription() {
        return this.modelDescription;
    }
    /**
     * The object name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The number of nodes in the cluster.
     * 
    */
    public Integer getNodeCount() {
        return this.nodeCount;
    }
    /**
     * The details of the move operation on this resource.
     * 
    */
    public ResourceMoveDetailsResponse getResourceMoveDetails() {
        return this.resourceMoveDetails;
    }
    /**
     * The Serial Number of Data Box Edge/Gateway device.
     * 
    */
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * The SKU type.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * DataBoxEdge Resource
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The list of tags that describe the device. These tags can be used to view and group this device (across resource groups).
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The Data Box Edge/Gateway device timezone.
     * 
    */
    public String getTimeZone() {
        return this.timeZone;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> configuredRoleTypes;
        private String culture;
        private @Nullable String dataBoxEdgeDeviceStatus;
        private String description;
        private String deviceHcsVersion;
        private Double deviceLocalCapacity;
        private String deviceModel;
        private String deviceSoftwareVersion;
        private String deviceType;
        private EdgeProfileResponse edgeProfile;
        private @Nullable String etag;
        private String friendlyName;
        private String id;
        private @Nullable ResourceIdentityResponse identity;
        private String kind;
        private String location;
        private String modelDescription;
        private String name;
        private Integer nodeCount;
        private ResourceMoveDetailsResponse resourceMoveDetails;
        private String serialNumber;
        private @Nullable SkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String timeZone;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuredRoleTypes = defaults.configuredRoleTypes;
    	      this.culture = defaults.culture;
    	      this.dataBoxEdgeDeviceStatus = defaults.dataBoxEdgeDeviceStatus;
    	      this.description = defaults.description;
    	      this.deviceHcsVersion = defaults.deviceHcsVersion;
    	      this.deviceLocalCapacity = defaults.deviceLocalCapacity;
    	      this.deviceModel = defaults.deviceModel;
    	      this.deviceSoftwareVersion = defaults.deviceSoftwareVersion;
    	      this.deviceType = defaults.deviceType;
    	      this.edgeProfile = defaults.edgeProfile;
    	      this.etag = defaults.etag;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.modelDescription = defaults.modelDescription;
    	      this.name = defaults.name;
    	      this.nodeCount = defaults.nodeCount;
    	      this.resourceMoveDetails = defaults.resourceMoveDetails;
    	      this.serialNumber = defaults.serialNumber;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.timeZone = defaults.timeZone;
    	      this.type = defaults.type;
        }

        public Builder setConfiguredRoleTypes(List<String> configuredRoleTypes) {
            this.configuredRoleTypes = Objects.requireNonNull(configuredRoleTypes);
            return this;
        }

        public Builder setCulture(String culture) {
            this.culture = Objects.requireNonNull(culture);
            return this;
        }

        public Builder setDataBoxEdgeDeviceStatus(@Nullable String dataBoxEdgeDeviceStatus) {
            this.dataBoxEdgeDeviceStatus = dataBoxEdgeDeviceStatus;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDeviceHcsVersion(String deviceHcsVersion) {
            this.deviceHcsVersion = Objects.requireNonNull(deviceHcsVersion);
            return this;
        }

        public Builder setDeviceLocalCapacity(Double deviceLocalCapacity) {
            this.deviceLocalCapacity = Objects.requireNonNull(deviceLocalCapacity);
            return this;
        }

        public Builder setDeviceModel(String deviceModel) {
            this.deviceModel = Objects.requireNonNull(deviceModel);
            return this;
        }

        public Builder setDeviceSoftwareVersion(String deviceSoftwareVersion) {
            this.deviceSoftwareVersion = Objects.requireNonNull(deviceSoftwareVersion);
            return this;
        }

        public Builder setDeviceType(String deviceType) {
            this.deviceType = Objects.requireNonNull(deviceType);
            return this;
        }

        public Builder setEdgeProfile(EdgeProfileResponse edgeProfile) {
            this.edgeProfile = Objects.requireNonNull(edgeProfile);
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setFriendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ResourceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setModelDescription(String modelDescription) {
            this.modelDescription = Objects.requireNonNull(modelDescription);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }

        public Builder setResourceMoveDetails(ResourceMoveDetailsResponse resourceMoveDetails) {
            this.resourceMoveDetails = Objects.requireNonNull(resourceMoveDetails);
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDeviceResult build() {
            return new GetDeviceResult(configuredRoleTypes, culture, dataBoxEdgeDeviceStatus, description, deviceHcsVersion, deviceLocalCapacity, deviceModel, deviceSoftwareVersion, deviceType, edgeProfile, etag, friendlyName, id, identity, kind, location, modelDescription, name, nodeCount, resourceMoveDetails, serialNumber, sku, systemData, tags, timeZone, type);
        }
    }
}