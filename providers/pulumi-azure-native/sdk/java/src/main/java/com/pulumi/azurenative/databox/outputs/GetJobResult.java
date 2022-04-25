// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.azurenative.databox.outputs.CloudErrorResponse;
import com.pulumi.azurenative.databox.outputs.DataBoxDiskJobDetailsResponse;
import com.pulumi.azurenative.databox.outputs.DataBoxHeavyJobDetailsResponse;
import com.pulumi.azurenative.databox.outputs.DataBoxJobDetailsResponse;
import com.pulumi.azurenative.databox.outputs.JobDeliveryInfoResponse;
import com.pulumi.azurenative.databox.outputs.ResourceIdentityResponse;
import com.pulumi.azurenative.databox.outputs.SkuResponse;
import com.pulumi.azurenative.databox.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobResult {
    /**
     * @return Reason for cancellation.
     * 
     */
    private final String cancellationReason;
    /**
     * @return Delivery Info of Job.
     * 
     */
    private final @Nullable JobDeliveryInfoResponse deliveryInfo;
    /**
     * @return Delivery type of Job.
     * 
     */
    private final @Nullable String deliveryType;
    /**
     * @return Details of a job run. This field will only be sent for expand details filter.
     * 
     */
    private final @Nullable Object details;
    /**
     * @return Top level error for the job.
     * 
     */
    private final CloudErrorResponse error;
    /**
     * @return Id of the object.
     * 
     */
    private final String id;
    /**
     * @return Msi identity of the resource
     * 
     */
    private final @Nullable ResourceIdentityResponse identity;
    /**
     * @return Describes whether the job is cancellable or not.
     * 
     */
    private final Boolean isCancellable;
    /**
     * @return Flag to indicate cancellation of scheduled job.
     * 
     */
    private final Boolean isCancellableWithoutFee;
    /**
     * @return Describes whether the job is deletable or not.
     * 
     */
    private final Boolean isDeletable;
    /**
     * @return Is Prepare To Ship Enabled on this job
     * 
     */
    private final Boolean isPrepareToShipEnabled;
    /**
     * @return Describes whether the shipping address is editable or not.
     * 
     */
    private final Boolean isShippingAddressEditable;
    /**
     * @return The location of the resource. This will be one of the supported and registered Azure Regions (e.g. West US, East US, Southeast Asia, etc.). The region of a resource cannot be changed once it is created, but if an identical region is specified on update the request will succeed.
     * 
     */
    private final String location;
    /**
     * @return Name of the object.
     * 
     */
    private final String name;
    /**
     * @return The sku type.
     * 
     */
    private final SkuResponse sku;
    /**
     * @return Time at which the job was started in UTC ISO 8601 format.
     * 
     */
    private final String startTime;
    /**
     * @return Name of the stage which is in progress.
     * 
     */
    private final String status;
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups).
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Type of the data transfer.
     * 
     */
    private final String transferType;
    /**
     * @return Type of the object.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetJobResult(
        @CustomType.Parameter("cancellationReason") String cancellationReason,
        @CustomType.Parameter("deliveryInfo") @Nullable JobDeliveryInfoResponse deliveryInfo,
        @CustomType.Parameter("deliveryType") @Nullable String deliveryType,
        @CustomType.Parameter("details") @Nullable Object details,
        @CustomType.Parameter("error") CloudErrorResponse error,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ResourceIdentityResponse identity,
        @CustomType.Parameter("isCancellable") Boolean isCancellable,
        @CustomType.Parameter("isCancellableWithoutFee") Boolean isCancellableWithoutFee,
        @CustomType.Parameter("isDeletable") Boolean isDeletable,
        @CustomType.Parameter("isPrepareToShipEnabled") Boolean isPrepareToShipEnabled,
        @CustomType.Parameter("isShippingAddressEditable") Boolean isShippingAddressEditable,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sku") SkuResponse sku,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("transferType") String transferType,
        @CustomType.Parameter("type") String type) {
        this.cancellationReason = cancellationReason;
        this.deliveryInfo = deliveryInfo;
        this.deliveryType = deliveryType;
        this.details = details;
        this.error = error;
        this.id = id;
        this.identity = identity;
        this.isCancellable = isCancellable;
        this.isCancellableWithoutFee = isCancellableWithoutFee;
        this.isDeletable = isDeletable;
        this.isPrepareToShipEnabled = isPrepareToShipEnabled;
        this.isShippingAddressEditable = isShippingAddressEditable;
        this.location = location;
        this.name = name;
        this.sku = sku;
        this.startTime = startTime;
        this.status = status;
        this.systemData = systemData;
        this.tags = tags;
        this.transferType = transferType;
        this.type = type;
    }

    /**
     * @return Reason for cancellation.
     * 
     */
    public String cancellationReason() {
        return this.cancellationReason;
    }
    /**
     * @return Delivery Info of Job.
     * 
     */
    public Optional<JobDeliveryInfoResponse> deliveryInfo() {
        return Optional.ofNullable(this.deliveryInfo);
    }
    /**
     * @return Delivery type of Job.
     * 
     */
    public Optional<String> deliveryType() {
        return Optional.ofNullable(this.deliveryType);
    }
    /**
     * @return Details of a job run. This field will only be sent for expand details filter.
     * 
     */
    public Optional<Object> details() {
        return Optional.ofNullable(this.details);
    }
    /**
     * @return Top level error for the job.
     * 
     */
    public CloudErrorResponse error() {
        return this.error;
    }
    /**
     * @return Id of the object.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Msi identity of the resource
     * 
     */
    public Optional<ResourceIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Describes whether the job is cancellable or not.
     * 
     */
    public Boolean isCancellable() {
        return this.isCancellable;
    }
    /**
     * @return Flag to indicate cancellation of scheduled job.
     * 
     */
    public Boolean isCancellableWithoutFee() {
        return this.isCancellableWithoutFee;
    }
    /**
     * @return Describes whether the job is deletable or not.
     * 
     */
    public Boolean isDeletable() {
        return this.isDeletable;
    }
    /**
     * @return Is Prepare To Ship Enabled on this job
     * 
     */
    public Boolean isPrepareToShipEnabled() {
        return this.isPrepareToShipEnabled;
    }
    /**
     * @return Describes whether the shipping address is editable or not.
     * 
     */
    public Boolean isShippingAddressEditable() {
        return this.isShippingAddressEditable;
    }
    /**
     * @return The location of the resource. This will be one of the supported and registered Azure Regions (e.g. West US, East US, Southeast Asia, etc.). The region of a resource cannot be changed once it is created, but if an identical region is specified on update the request will succeed.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Name of the object.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The sku type.
     * 
     */
    public SkuResponse sku() {
        return this.sku;
    }
    /**
     * @return Time at which the job was started in UTC ISO 8601 format.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return Name of the stage which is in progress.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups).
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Type of the data transfer.
     * 
     */
    public String transferType() {
        return this.transferType;
    }
    /**
     * @return Type of the object.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cancellationReason;
        private @Nullable JobDeliveryInfoResponse deliveryInfo;
        private @Nullable String deliveryType;
        private @Nullable Object details;
        private CloudErrorResponse error;
        private String id;
        private @Nullable ResourceIdentityResponse identity;
        private Boolean isCancellable;
        private Boolean isCancellableWithoutFee;
        private Boolean isDeletable;
        private Boolean isPrepareToShipEnabled;
        private Boolean isShippingAddressEditable;
        private String location;
        private String name;
        private SkuResponse sku;
        private String startTime;
        private String status;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String transferType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cancellationReason = defaults.cancellationReason;
    	      this.deliveryInfo = defaults.deliveryInfo;
    	      this.deliveryType = defaults.deliveryType;
    	      this.details = defaults.details;
    	      this.error = defaults.error;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.isCancellable = defaults.isCancellable;
    	      this.isCancellableWithoutFee = defaults.isCancellableWithoutFee;
    	      this.isDeletable = defaults.isDeletable;
    	      this.isPrepareToShipEnabled = defaults.isPrepareToShipEnabled;
    	      this.isShippingAddressEditable = defaults.isShippingAddressEditable;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.sku = defaults.sku;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.transferType = defaults.transferType;
    	      this.type = defaults.type;
        }

        public Builder cancellationReason(String cancellationReason) {
            this.cancellationReason = Objects.requireNonNull(cancellationReason);
            return this;
        }
        public Builder deliveryInfo(@Nullable JobDeliveryInfoResponse deliveryInfo) {
            this.deliveryInfo = deliveryInfo;
            return this;
        }
        public Builder deliveryType(@Nullable String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public Builder details(@Nullable Object details) {
            this.details = details;
            return this;
        }
        public Builder error(CloudErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable ResourceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder isCancellable(Boolean isCancellable) {
            this.isCancellable = Objects.requireNonNull(isCancellable);
            return this;
        }
        public Builder isCancellableWithoutFee(Boolean isCancellableWithoutFee) {
            this.isCancellableWithoutFee = Objects.requireNonNull(isCancellableWithoutFee);
            return this;
        }
        public Builder isDeletable(Boolean isDeletable) {
            this.isDeletable = Objects.requireNonNull(isDeletable);
            return this;
        }
        public Builder isPrepareToShipEnabled(Boolean isPrepareToShipEnabled) {
            this.isPrepareToShipEnabled = Objects.requireNonNull(isPrepareToShipEnabled);
            return this;
        }
        public Builder isShippingAddressEditable(Boolean isShippingAddressEditable) {
            this.isShippingAddressEditable = Objects.requireNonNull(isShippingAddressEditable);
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
        public Builder sku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
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
        public Builder transferType(String transferType) {
            this.transferType = Objects.requireNonNull(transferType);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetJobResult build() {
            return new GetJobResult(cancellationReason, deliveryInfo, deliveryType, details, error, id, identity, isCancellable, isCancellableWithoutFee, isDeletable, isPrepareToShipEnabled, isShippingAddressEditable, location, name, sku, startTime, status, systemData, tags, transferType, type);
        }
    }
}
