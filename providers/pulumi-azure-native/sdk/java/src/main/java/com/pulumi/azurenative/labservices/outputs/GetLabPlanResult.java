// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.outputs;

import com.pulumi.azurenative.labservices.outputs.AutoShutdownProfileResponse;
import com.pulumi.azurenative.labservices.outputs.ConnectionProfileResponse;
import com.pulumi.azurenative.labservices.outputs.LabPlanNetworkProfileResponse;
import com.pulumi.azurenative.labservices.outputs.SupportInfoResponse;
import com.pulumi.azurenative.labservices.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLabPlanResult {
    /**
     * @return The allowed regions for the lab creator to use when creating labs using this lab plan.
     * 
     */
    private final @Nullable List<String> allowedRegions;
    /**
     * @return The default lab shutdown profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    private final @Nullable AutoShutdownProfileResponse defaultAutoShutdownProfile;
    /**
     * @return The default lab connection profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    private final @Nullable ConnectionProfileResponse defaultConnectionProfile;
    /**
     * @return The lab plan network profile. To enforce lab network policies they must be defined here and cannot be changed when there are existing labs associated with this lab plan.
     * 
     */
    private final @Nullable LabPlanNetworkProfileResponse defaultNetworkProfile;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return Base Url of the lms instance this lab plan can link lab rosters against.
     * 
     */
    private final @Nullable String linkedLmsInstance;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Current provisioning state of the lab plan.
     * 
     */
    private final String provisioningState;
    /**
     * @return Resource ID of the Shared Image Gallery attached to this lab plan. When saving a lab template virtual machine image it will be persisted in this gallery. Shared images from the gallery can be made available to use when creating new labs.
     * 
     */
    private final @Nullable String sharedGalleryId;
    /**
     * @return Support contact information and instructions for users of the lab plan. This information is displayed to lab owners and virtual machine users for all labs in the lab plan.
     * 
     */
    private final @Nullable SupportInfoResponse supportInfo;
    /**
     * @return Metadata pertaining to creation and last modification of the lab plan.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetLabPlanResult(
        @CustomType.Parameter("allowedRegions") @Nullable List<String> allowedRegions,
        @CustomType.Parameter("defaultAutoShutdownProfile") @Nullable AutoShutdownProfileResponse defaultAutoShutdownProfile,
        @CustomType.Parameter("defaultConnectionProfile") @Nullable ConnectionProfileResponse defaultConnectionProfile,
        @CustomType.Parameter("defaultNetworkProfile") @Nullable LabPlanNetworkProfileResponse defaultNetworkProfile,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("linkedLmsInstance") @Nullable String linkedLmsInstance,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sharedGalleryId") @Nullable String sharedGalleryId,
        @CustomType.Parameter("supportInfo") @Nullable SupportInfoResponse supportInfo,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.allowedRegions = allowedRegions;
        this.defaultAutoShutdownProfile = defaultAutoShutdownProfile;
        this.defaultConnectionProfile = defaultConnectionProfile;
        this.defaultNetworkProfile = defaultNetworkProfile;
        this.id = id;
        this.linkedLmsInstance = linkedLmsInstance;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sharedGalleryId = sharedGalleryId;
        this.supportInfo = supportInfo;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The allowed regions for the lab creator to use when creating labs using this lab plan.
     * 
     */
    public List<String> allowedRegions() {
        return this.allowedRegions == null ? List.of() : this.allowedRegions;
    }
    /**
     * @return The default lab shutdown profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    public Optional<AutoShutdownProfileResponse> defaultAutoShutdownProfile() {
        return Optional.ofNullable(this.defaultAutoShutdownProfile);
    }
    /**
     * @return The default lab connection profile. This can be changed on a lab resource and only provides a default profile.
     * 
     */
    public Optional<ConnectionProfileResponse> defaultConnectionProfile() {
        return Optional.ofNullable(this.defaultConnectionProfile);
    }
    /**
     * @return The lab plan network profile. To enforce lab network policies they must be defined here and cannot be changed when there are existing labs associated with this lab plan.
     * 
     */
    public Optional<LabPlanNetworkProfileResponse> defaultNetworkProfile() {
        return Optional.ofNullable(this.defaultNetworkProfile);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Base Url of the lms instance this lab plan can link lab rosters against.
     * 
     */
    public Optional<String> linkedLmsInstance() {
        return Optional.ofNullable(this.linkedLmsInstance);
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Current provisioning state of the lab plan.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource ID of the Shared Image Gallery attached to this lab plan. When saving a lab template virtual machine image it will be persisted in this gallery. Shared images from the gallery can be made available to use when creating new labs.
     * 
     */
    public Optional<String> sharedGalleryId() {
        return Optional.ofNullable(this.sharedGalleryId);
    }
    /**
     * @return Support contact information and instructions for users of the lab plan. This information is displayed to lab owners and virtual machine users for all labs in the lab plan.
     * 
     */
    public Optional<SupportInfoResponse> supportInfo() {
        return Optional.ofNullable(this.supportInfo);
    }
    /**
     * @return Metadata pertaining to creation and last modification of the lab plan.
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
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLabPlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedRegions;
        private @Nullable AutoShutdownProfileResponse defaultAutoShutdownProfile;
        private @Nullable ConnectionProfileResponse defaultConnectionProfile;
        private @Nullable LabPlanNetworkProfileResponse defaultNetworkProfile;
        private String id;
        private @Nullable String linkedLmsInstance;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable String sharedGalleryId;
        private @Nullable SupportInfoResponse supportInfo;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLabPlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRegions = defaults.allowedRegions;
    	      this.defaultAutoShutdownProfile = defaults.defaultAutoShutdownProfile;
    	      this.defaultConnectionProfile = defaults.defaultConnectionProfile;
    	      this.defaultNetworkProfile = defaults.defaultNetworkProfile;
    	      this.id = defaults.id;
    	      this.linkedLmsInstance = defaults.linkedLmsInstance;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sharedGalleryId = defaults.sharedGalleryId;
    	      this.supportInfo = defaults.supportInfo;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder allowedRegions(@Nullable List<String> allowedRegions) {
            this.allowedRegions = allowedRegions;
            return this;
        }
        public Builder allowedRegions(String... allowedRegions) {
            return allowedRegions(List.of(allowedRegions));
        }
        public Builder defaultAutoShutdownProfile(@Nullable AutoShutdownProfileResponse defaultAutoShutdownProfile) {
            this.defaultAutoShutdownProfile = defaultAutoShutdownProfile;
            return this;
        }
        public Builder defaultConnectionProfile(@Nullable ConnectionProfileResponse defaultConnectionProfile) {
            this.defaultConnectionProfile = defaultConnectionProfile;
            return this;
        }
        public Builder defaultNetworkProfile(@Nullable LabPlanNetworkProfileResponse defaultNetworkProfile) {
            this.defaultNetworkProfile = defaultNetworkProfile;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder linkedLmsInstance(@Nullable String linkedLmsInstance) {
            this.linkedLmsInstance = linkedLmsInstance;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder sharedGalleryId(@Nullable String sharedGalleryId) {
            this.sharedGalleryId = sharedGalleryId;
            return this;
        }
        public Builder supportInfo(@Nullable SupportInfoResponse supportInfo) {
            this.supportInfo = supportInfo;
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
        }        public GetLabPlanResult build() {
            return new GetLabPlanResult(allowedRegions, defaultAutoShutdownProfile, defaultConnectionProfile, defaultNetworkProfile, id, linkedLmsInstance, location, name, provisioningState, sharedGalleryId, supportInfo, systemData, tags, type);
        }
    }
}
