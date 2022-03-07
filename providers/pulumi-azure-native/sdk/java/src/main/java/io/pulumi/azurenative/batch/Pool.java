// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.batch.PoolArgs;
import io.pulumi.azurenative.batch.outputs.ApplicationPackageReferenceResponse;
import io.pulumi.azurenative.batch.outputs.AutoScaleRunResponse;
import io.pulumi.azurenative.batch.outputs.BatchPoolIdentityResponse;
import io.pulumi.azurenative.batch.outputs.CertificateReferenceResponse;
import io.pulumi.azurenative.batch.outputs.DeploymentConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.MetadataItemResponse;
import io.pulumi.azurenative.batch.outputs.MountConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.NetworkConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.ResizeOperationStatusResponse;
import io.pulumi.azurenative.batch.outputs.ScaleSettingsResponse;
import io.pulumi.azurenative.batch.outputs.StartTaskResponse;
import io.pulumi.azurenative.batch.outputs.TaskSchedulingPolicyResponse;
import io.pulumi.azurenative.batch.outputs.UserAccountResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Contains information about a pool.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:batch:Pool testpool /subscriptions/subid/resourceGroups/default-azurebatch-japaneast/providers/Microsoft.Batch/batchAccounts/sampleacct/pools/testpool 
 * ```
 * 
 */
@ResourceType(type="azure-native:batch:Pool")
public class Pool extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allocationState", type=String.class, parameters={})
    private Output<String> allocationState;

    public Output<String> getAllocationState() {
        return this.allocationState;
    }
    @OutputExport(name="allocationStateTransitionTime", type=String.class, parameters={})
    private Output<String> allocationStateTransitionTime;

    public Output<String> getAllocationStateTransitionTime() {
        return this.allocationStateTransitionTime;
    }
    /**
     * The list of application licenses must be a subset of available Batch service application licenses. If a license is requested which is not supported, pool creation will fail.
     * 
     */
    @OutputExport(name="applicationLicenses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> applicationLicenses;

    /**
     * @return The list of application licenses must be a subset of available Batch service application licenses. If a license is requested which is not supported, pool creation will fail.
     * 
     */
    public Output</* @Nullable */ List<String>> getApplicationLicenses() {
        return this.applicationLicenses;
    }
    /**
     * Changes to application package references affect all new compute nodes joining the pool, but do not affect compute nodes that are already in the pool until they are rebooted or reimaged. There is a maximum of 10 application package references on any given pool.
     * 
     */
    @OutputExport(name="applicationPackages", type=List.class, parameters={ApplicationPackageReferenceResponse.class})
    private Output</* @Nullable */ List<ApplicationPackageReferenceResponse>> applicationPackages;

    /**
     * @return Changes to application package references affect all new compute nodes joining the pool, but do not affect compute nodes that are already in the pool until they are rebooted or reimaged. There is a maximum of 10 application package references on any given pool.
     * 
     */
    public Output</* @Nullable */ List<ApplicationPackageReferenceResponse>> getApplicationPackages() {
        return this.applicationPackages;
    }
    /**
     * This property is set only if the pool automatically scales, i.e. autoScaleSettings are used.
     * 
     */
    @OutputExport(name="autoScaleRun", type=AutoScaleRunResponse.class, parameters={})
    private Output<AutoScaleRunResponse> autoScaleRun;

    /**
     * @return This property is set only if the pool automatically scales, i.e. autoScaleSettings are used.
     * 
     */
    public Output<AutoScaleRunResponse> getAutoScaleRun() {
        return this.autoScaleRun;
    }
    /**
     * For Windows compute nodes, the Batch service installs the certificates to the specified certificate store and location. For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     * 
     */
    @OutputExport(name="certificates", type=List.class, parameters={CertificateReferenceResponse.class})
    private Output</* @Nullable */ List<CertificateReferenceResponse>> certificates;

    /**
     * @return For Windows compute nodes, the Batch service installs the certificates to the specified certificate store and location. For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     * 
     */
    public Output</* @Nullable */ List<CertificateReferenceResponse>> getCertificates() {
        return this.certificates;
    }
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="currentDedicatedNodes", type=Integer.class, parameters={})
    private Output<Integer> currentDedicatedNodes;

    public Output<Integer> getCurrentDedicatedNodes() {
        return this.currentDedicatedNodes;
    }
    @OutputExport(name="currentLowPriorityNodes", type=Integer.class, parameters={})
    private Output<Integer> currentLowPriorityNodes;

    public Output<Integer> getCurrentLowPriorityNodes() {
        return this.currentLowPriorityNodes;
    }
    /**
     * Using CloudServiceConfiguration specifies that the nodes should be creating using Azure Cloud Services (PaaS), while VirtualMachineConfiguration uses Azure Virtual Machines (IaaS).
     * 
     */
    @OutputExport(name="deploymentConfiguration", type=DeploymentConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ DeploymentConfigurationResponse> deploymentConfiguration;

    /**
     * @return Using CloudServiceConfiguration specifies that the nodes should be creating using Azure Cloud Services (PaaS), while VirtualMachineConfiguration uses Azure Virtual Machines (IaaS).
     * 
     */
    public Output</* @Nullable */ DeploymentConfigurationResponse> getDeploymentConfiguration() {
        return this.deploymentConfiguration;
    }
    /**
     * The display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The ETag of the resource, used for concurrency statements.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The ETag of the resource, used for concurrency statements.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The type of identity used for the Batch Pool.
     * 
     */
    @OutputExport(name="identity", type=BatchPoolIdentityResponse.class, parameters={})
    private Output</* @Nullable */ BatchPoolIdentityResponse> identity;

    /**
     * @return The type of identity used for the Batch Pool.
     * 
     */
    public Output</* @Nullable */ BatchPoolIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to 'Disabled'.
     * 
     */
    @OutputExport(name="interNodeCommunication", type=String.class, parameters={})
    private Output</* @Nullable */ String> interNodeCommunication;

    /**
     * @return This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to 'Disabled'.
     * 
     */
    public Output</* @Nullable */ String> getInterNodeCommunication() {
        return this.interNodeCommunication;
    }
    /**
     * This is the last time at which the pool level data, such as the targetDedicatedNodes or autoScaleSettings, changed. It does not factor in node-level changes such as a compute node changing state.
     * 
     */
    @OutputExport(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return This is the last time at which the pool level data, such as the targetDedicatedNodes or autoScaleSettings, changed. It does not factor in node-level changes such as a compute node changing state.
     * 
     */
    public Output<String> getLastModified() {
        return this.lastModified;
    }
    /**
     * The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     * 
     */
    @OutputExport(name="metadata", type=List.class, parameters={MetadataItemResponse.class})
    private Output</* @Nullable */ List<MetadataItemResponse>> metadata;

    /**
     * @return The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     * 
     */
    public Output</* @Nullable */ List<MetadataItemResponse>> getMetadata() {
        return this.metadata;
    }
    /**
     * This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     * 
     */
    @OutputExport(name="mountConfiguration", type=List.class, parameters={MountConfigurationResponse.class})
    private Output</* @Nullable */ List<MountConfigurationResponse>> mountConfiguration;

    /**
     * @return This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     * 
     */
    public Output</* @Nullable */ List<MountConfigurationResponse>> getMountConfiguration() {
        return this.mountConfiguration;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The network configuration for a pool.
     * 
     */
    @OutputExport(name="networkConfiguration", type=NetworkConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ NetworkConfigurationResponse> networkConfiguration;

    /**
     * @return The network configuration for a pool.
     * 
     */
    public Output</* @Nullable */ NetworkConfigurationResponse> getNetworkConfiguration() {
        return this.networkConfiguration;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="provisioningStateTransitionTime", type=String.class, parameters={})
    private Output<String> provisioningStateTransitionTime;

    public Output<String> getProvisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }
    /**
     * Describes either the current operation (if the pool AllocationState is Resizing) or the previously completed operation (if the AllocationState is Steady).
     * 
     */
    @OutputExport(name="resizeOperationStatus", type=ResizeOperationStatusResponse.class, parameters={})
    private Output<ResizeOperationStatusResponse> resizeOperationStatus;

    /**
     * @return Describes either the current operation (if the pool AllocationState is Resizing) or the previously completed operation (if the AllocationState is Steady).
     * 
     */
    public Output<ResizeOperationStatusResponse> getResizeOperationStatus() {
        return this.resizeOperationStatus;
    }
    /**
     * Defines the desired size of the pool. This can either be 'fixedScale' where the requested targetDedicatedNodes is specified, or 'autoScale' which defines a formula which is periodically reevaluated. If this property is not specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
     * 
     */
    @OutputExport(name="scaleSettings", type=ScaleSettingsResponse.class, parameters={})
    private Output</* @Nullable */ ScaleSettingsResponse> scaleSettings;

    /**
     * @return Defines the desired size of the pool. This can either be 'fixedScale' where the requested targetDedicatedNodes is specified, or 'autoScale' which defines a formula which is periodically reevaluated. If this property is not specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
     * 
     */
    public Output</* @Nullable */ ScaleSettingsResponse> getScaleSettings() {
        return this.scaleSettings;
    }
    /**
     * In an PATCH (update) operation, this property can be set to an empty object to remove the start task from the pool.
     * 
     */
    @OutputExport(name="startTask", type=StartTaskResponse.class, parameters={})
    private Output</* @Nullable */ StartTaskResponse> startTask;

    /**
     * @return In an PATCH (update) operation, this property can be set to an empty object to remove the start task from the pool.
     * 
     */
    public Output</* @Nullable */ StartTaskResponse> getStartTask() {
        return this.startTask;
    }
    /**
     * If not specified, the default is spread.
     * 
     */
    @OutputExport(name="taskSchedulingPolicy", type=TaskSchedulingPolicyResponse.class, parameters={})
    private Output</* @Nullable */ TaskSchedulingPolicyResponse> taskSchedulingPolicy;

    /**
     * @return If not specified, the default is spread.
     * 
     */
    public Output</* @Nullable */ TaskSchedulingPolicyResponse> getTaskSchedulingPolicy() {
        return this.taskSchedulingPolicy;
    }
    /**
     * The default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or 256.
     * 
     */
    @OutputExport(name="taskSlotsPerNode", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> taskSlotsPerNode;

    /**
     * @return The default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or 256.
     * 
     */
    public Output</* @Nullable */ Integer> getTaskSlotsPerNode() {
        return this.taskSlotsPerNode;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="userAccounts", type=List.class, parameters={UserAccountResponse.class})
    private Output</* @Nullable */ List<UserAccountResponse>> userAccounts;

    public Output</* @Nullable */ List<UserAccountResponse>> getUserAccounts() {
        return this.userAccounts;
    }
    /**
     * For information about available sizes of virtual machines for Cloud Services pools (pools created with cloudServiceConfiguration), see Sizes for Cloud Services (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud Services VM sizes except ExtraSmall. For information about available VM sizes for pools using images from the Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for Virtual Machines (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or Sizes for Virtual Machines (Windows) (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     * 
     */
    @OutputExport(name="vmSize", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmSize;

    /**
     * @return For information about available sizes of virtual machines for Cloud Services pools (pools created with cloudServiceConfiguration), see Sizes for Cloud Services (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud Services VM sizes except ExtraSmall. For information about available VM sizes for pools using images from the Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for Virtual Machines (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or Sizes for Virtual Machines (Windows) (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     * 
     */
    public Output</* @Nullable */ String> getVmSize() {
        return this.vmSize;
    }

    public interface BuilderApplicator {
        public void apply(PoolArgs.Builder a);
    }
    private static io.pulumi.azurenative.batch.PoolArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.batch.PoolArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Pool(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pool(String name) {
        this(name, PoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pool(String name, PoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pool(String name, PoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:Pool", name, args == null ? PoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Pool(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:Pool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:batch/v20170901:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20181201:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20190401:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20190801:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20200301:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20200501:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20200901:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20210101:Pool").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20210601:Pool").build())
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
    public static Pool get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Pool(name, id, options);
    }
}