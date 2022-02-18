// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databox.JobArgs;
import io.pulumi.azurenative.databox.outputs.CloudErrorResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxDiskJobDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxHeavyJobDetailsResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxJobDetailsResponse;
import io.pulumi.azurenative.databox.outputs.JobDeliveryInfoResponse;
import io.pulumi.azurenative.databox.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.databox.outputs.SkuResponse;
import io.pulumi.azurenative.databox.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Job Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databox:Job SdkJob5337 /subscriptions/fa68082f-8ff7-4a25-95c7-ce9da541242f/resourceGroups/SdkRg7552/providers/Microsoft.DataBox/jobs/SdkJob5337 
 * ```
 * 
 */
@ResourceType(type="azure-native:databox:Job")
public class Job extends io.pulumi.resources.CustomResource {
    /**
     * Reason for cancellation.
     * 
     */
    @OutputExport(name="cancellationReason", type=String.class, parameters={})
    private Output<String> cancellationReason;

    /**
     * @return Reason for cancellation.
     * 
     */
    public Output<String> getCancellationReason() {
        return this.cancellationReason;
    }
    /**
     * Delivery Info of Job.
     * 
     */
    @OutputExport(name="deliveryInfo", type=JobDeliveryInfoResponse.class, parameters={})
    private Output</* @Nullable */ JobDeliveryInfoResponse> deliveryInfo;

    /**
     * @return Delivery Info of Job.
     * 
     */
    public Output</* @Nullable */ JobDeliveryInfoResponse> getDeliveryInfo() {
        return this.deliveryInfo;
    }
    /**
     * Delivery type of Job.
     * 
     */
    @OutputExport(name="deliveryType", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliveryType;

    /**
     * @return Delivery type of Job.
     * 
     */
    public Output</* @Nullable */ String> getDeliveryType() {
        return this.deliveryType;
    }
    /**
     * Details of a job run. This field will only be sent for expand details filter.
     * 
     */
    @OutputExport(name="details", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> details;

    /**
     * @return Details of a job run. This field will only be sent for expand details filter.
     * 
     */
    public Output</* @Nullable */ Object> getDetails() {
        return this.details;
    }
    /**
     * Top level error for the job.
     * 
     */
    @OutputExport(name="error", type=CloudErrorResponse.class, parameters={})
    private Output<CloudErrorResponse> error;

    /**
     * @return Top level error for the job.
     * 
     */
    public Output<CloudErrorResponse> getError() {
        return this.error;
    }
    /**
     * Msi identity of the resource
     * 
     */
    @OutputExport(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return Msi identity of the resource
     * 
     */
    public Output</* @Nullable */ ResourceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Describes whether the job is cancellable or not.
     * 
     */
    @OutputExport(name="isCancellable", type=Boolean.class, parameters={})
    private Output<Boolean> isCancellable;

    /**
     * @return Describes whether the job is cancellable or not.
     * 
     */
    public Output<Boolean> getIsCancellable() {
        return this.isCancellable;
    }
    /**
     * Flag to indicate cancellation of scheduled job.
     * 
     */
    @OutputExport(name="isCancellableWithoutFee", type=Boolean.class, parameters={})
    private Output<Boolean> isCancellableWithoutFee;

    /**
     * @return Flag to indicate cancellation of scheduled job.
     * 
     */
    public Output<Boolean> getIsCancellableWithoutFee() {
        return this.isCancellableWithoutFee;
    }
    /**
     * Describes whether the job is deletable or not.
     * 
     */
    @OutputExport(name="isDeletable", type=Boolean.class, parameters={})
    private Output<Boolean> isDeletable;

    /**
     * @return Describes whether the job is deletable or not.
     * 
     */
    public Output<Boolean> getIsDeletable() {
        return this.isDeletable;
    }
    /**
     * Is Prepare To Ship Enabled on this job
     * 
     */
    @OutputExport(name="isPrepareToShipEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isPrepareToShipEnabled;

    /**
     * @return Is Prepare To Ship Enabled on this job
     * 
     */
    public Output<Boolean> getIsPrepareToShipEnabled() {
        return this.isPrepareToShipEnabled;
    }
    /**
     * Describes whether the shipping address is editable or not.
     * 
     */
    @OutputExport(name="isShippingAddressEditable", type=Boolean.class, parameters={})
    private Output<Boolean> isShippingAddressEditable;

    /**
     * @return Describes whether the shipping address is editable or not.
     * 
     */
    public Output<Boolean> getIsShippingAddressEditable() {
        return this.isShippingAddressEditable;
    }
    /**
     * The location of the resource. This will be one of the supported and registered Azure Regions (e.g. West US, East US, Southeast Asia, etc.). The region of a resource cannot be changed once it is created, but if an identical region is specified on update the request will succeed.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource. This will be one of the supported and registered Azure Regions (e.g. West US, East US, Southeast Asia, etc.). The region of a resource cannot be changed once it is created, but if an identical region is specified on update the request will succeed.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Name of the object.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the object.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The sku type.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The sku type.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Time at which the job was started in UTC ISO 8601 format.
     * 
     */
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return Time at which the job was started in UTC ISO 8601 format.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * Name of the stage which is in progress.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Name of the stage which is in progress.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups).
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups).
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Type of the data transfer.
     * 
     */
    @OutputExport(name="transferType", type=String.class, parameters={})
    private Output<String> transferType;

    /**
     * @return Type of the data transfer.
     * 
     */
    public Output<String> getTransferType() {
        return this.transferType;
    }
    /**
     * Type of the object.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databox:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Job(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databox:Job", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databox/v20180101:Job").build()),
                Input.of(Alias.builder().setType("azure-native:databox/v20190901:Job").build()),
                Input.of(Alias.builder().setType("azure-native:databox/v20200401:Job").build()),
                Input.of(Alias.builder().setType("azure-native:databox/v20201101:Job").build()),
                Input.of(Alias.builder().setType("azure-native:databox/v20210301:Job").build()),
                Input.of(Alias.builder().setType("azure-native:databox/v20210501:Job").build()),
                Input.of(Alias.builder().setType("azure-native:databox/v20210801preview:Job").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}
