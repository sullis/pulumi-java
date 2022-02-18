// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.notebooks.InstanceArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceState;
import io.pulumi.gcp.notebooks.outputs.InstanceAcceleratorConfig;
import io.pulumi.gcp.notebooks.outputs.InstanceContainerImage;
import io.pulumi.gcp.notebooks.outputs.InstanceReservationAffinity;
import io.pulumi.gcp.notebooks.outputs.InstanceShieldedInstanceConfig;
import io.pulumi.gcp.notebooks.outputs.InstanceVmImage;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Cloud AI Platform Notebook instance.
 * 
 * > **Note:** Due to limitations of the Notebooks Instance API, many fields
 * in this resource do not properly detect drift. These fields will also not
 * appear in state once imported.
 * 
 * To get more information about Instance, see:
 * 
 * * [API documentation](https://cloud.google.com/ai-platform/notebooks/docs/reference/rest)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/ai-platform-notebooks)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Instance can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/instance:Instance default projects/{{project}}/locations/{{location}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/instance:Instance default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:notebooks/instance:Instance default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:notebooks/instance:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * The hardware accelerator used on this instance. If you use accelerators,
     * make sure that your configuration has enough vCPUs and memory to support the
     * machineType you have selected.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="acceleratorConfig", type=InstanceAcceleratorConfig.class, parameters={})
    private Output</* @Nullable */ InstanceAcceleratorConfig> acceleratorConfig;

    /**
     * @return The hardware accelerator used on this instance. If you use accelerators,
     * make sure that your configuration has enough vCPUs and memory to support the
     * machineType you have selected.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ InstanceAcceleratorConfig> getAcceleratorConfig() {
        return this.acceleratorConfig;
    }
    /**
     * The size of the boot disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB.
     * If not specified, this defaults to 100.
     * 
     */
    @OutputExport(name="bootDiskSizeGb", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> bootDiskSizeGb;

    /**
     * @return The size of the boot disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB.
     * If not specified, this defaults to 100.
     * 
     */
    public Output</* @Nullable */ Integer> getBootDiskSizeGb() {
        return this.bootDiskSizeGb;
    }
    /**
     * Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    @OutputExport(name="bootDiskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> bootDiskType;

    /**
     * @return Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    public Output</* @Nullable */ String> getBootDiskType() {
        return this.bootDiskType;
    }
    /**
     * Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="containerImage", type=InstanceContainerImage.class, parameters={})
    private Output</* @Nullable */ InstanceContainerImage> containerImage;

    /**
     * @return Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ InstanceContainerImage> getContainerImage() {
        return this.containerImage;
    }
    /**
     * Instance creation time
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Instance creation time
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    @OutputExport(name="customGpuDriverPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> customGpuDriverPath;

    /**
     * @return Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    public Output</* @Nullable */ String> getCustomGpuDriverPath() {
        return this.customGpuDriverPath;
    }
    /**
     * The size of the data disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB).
     * You can choose the size of the data disk based on how big your notebooks and data are.
     * If not specified, this defaults to 100.
     * 
     */
    @OutputExport(name="dataDiskSizeGb", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dataDiskSizeGb;

    /**
     * @return The size of the data disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB).
     * You can choose the size of the data disk based on how big your notebooks and data are.
     * If not specified, this defaults to 100.
     * 
     */
    public Output</* @Nullable */ Integer> getDataDiskSizeGb() {
        return this.dataDiskSizeGb;
    }
    /**
     * Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    @OutputExport(name="dataDiskType", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataDiskType;

    /**
     * @return Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    public Output</* @Nullable */ String> getDataDiskType() {
        return this.dataDiskType;
    }
    /**
     * Disk encryption method used on the boot and data disks, defaults to GMEK.
     * Possible values are `DISK_ENCRYPTION_UNSPECIFIED`, `GMEK`, and `CMEK`.
     * 
     */
    @OutputExport(name="diskEncryption", type=String.class, parameters={})
    private Output</* @Nullable */ String> diskEncryption;

    /**
     * @return Disk encryption method used on the boot and data disks, defaults to GMEK.
     * Possible values are `DISK_ENCRYPTION_UNSPECIFIED`, `GMEK`, and `CMEK`.
     * 
     */
    public Output</* @Nullable */ String> getDiskEncryption() {
        return this.diskEncryption;
    }
    /**
     * Whether the end user authorizes Google Cloud to install GPU driver
     * on this instance. If this field is empty or set to false, the GPU driver
     * won't be installed. Only applicable to instances with GPUs.
     * 
     */
    @OutputExport(name="installGpuDriver", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> installGpuDriver;

    /**
     * @return Whether the end user authorizes Google Cloud to install GPU driver
     * on this instance. If this field is empty or set to false, the GPU driver
     * won't be installed. Only applicable to instances with GPUs.
     * 
     */
    public Output</* @Nullable */ Boolean> getInstallGpuDriver() {
        return this.installGpuDriver;
    }
    /**
     * The list of owners of this instance after creation.
     * Format: alias@example.com.
     * Currently supports one owner only.
     * If not specified, all of the service account users of
     * your VM instance's service account can use the instance.
     * 
     */
    @OutputExport(name="instanceOwners", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> instanceOwners;

    /**
     * @return The list of owners of this instance after creation.
     * Format: alias@example.com.
     * Currently supports one owner only.
     * If not specified, all of the service account users of
     * your VM instance's service account can use the instance.
     * 
     */
    public Output</* @Nullable */ List<String>> getInstanceOwners() {
        return this.instanceOwners;
    }
    /**
     * The KMS key used to encrypt the disks, only applicable if diskEncryption is CMEK.
     * Format: projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}
     * 
     */
    @OutputExport(name="kmsKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKey;

    /**
     * @return The KMS key used to encrypt the disks, only applicable if diskEncryption is CMEK.
     * Format: projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}
     * 
     */
    public Output</* @Nullable */ String> getKmsKey() {
        return this.kmsKey;
    }
    /**
     * Labels to apply to this instance. These can be later modified by the setLabels method.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this instance. These can be later modified by the setLabels method.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return A reference to the zone where the machine resides.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * A reference to a machine type which defines VM kind.
     * 
     */
    @OutputExport(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    /**
     * @return A reference to a machine type which defines VM kind.
     * 
     */
    public Output<String> getMachineType() {
        return this.machineType;
    }
    /**
     * Custom metadata to apply to this instance.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return Custom metadata to apply to this instance.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * The name specified for the Notebook instance.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name specified for the Notebook instance.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of the VPC that this instance is in.
     * Format: projects/{project_id}/global/networks/{network_id}
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The name of the VPC that this instance is in.
     * Format: projects/{project_id}/global/networks/{network_id}
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * The type of vNIC driver.
     * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
     * 
     */
    @OutputExport(name="nicType", type=String.class, parameters={})
    private Output</* @Nullable */ String> nicType;

    /**
     * @return The type of vNIC driver.
     * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
     * 
     */
    public Output</* @Nullable */ String> getNicType() {
        return this.nicType;
    }
    /**
     * The notebook instance will not register with the proxy..
     * 
     */
    @OutputExport(name="noProxyAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noProxyAccess;

    /**
     * @return The notebook instance will not register with the proxy..
     * 
     */
    public Output</* @Nullable */ Boolean> getNoProxyAccess() {
        return this.noProxyAccess;
    }
    /**
     * No public IP will be assigned to this instance.
     * 
     */
    @OutputExport(name="noPublicIp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noPublicIp;

    /**
     * @return No public IP will be assigned to this instance.
     * 
     */
    public Output</* @Nullable */ Boolean> getNoPublicIp() {
        return this.noPublicIp;
    }
    /**
     * If true, the data disk will not be auto deleted when deleting the instance.
     * 
     */
    @OutputExport(name="noRemoveDataDisk", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noRemoveDataDisk;

    /**
     * @return If true, the data disk will not be auto deleted when deleting the instance.
     * 
     */
    public Output</* @Nullable */ Boolean> getNoRemoveDataDisk() {
        return this.noRemoveDataDisk;
    }
    /**
     * Path to a Bash script that automatically runs after a
     * notebook instance fully boots up. The path must be a URL
     * or Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    @OutputExport(name="postStartupScript", type=String.class, parameters={})
    private Output</* @Nullable */ String> postStartupScript;

    /**
     * @return Path to a Bash script that automatically runs after a
     * notebook instance fully boots up. The path must be a URL
     * or Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    public Output</* @Nullable */ String> getPostStartupScript() {
        return this.postStartupScript;
    }
    /**
     * The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The proxy endpoint that is used to access the Jupyter notebook.
     * 
     */
    @OutputExport(name="proxyUri", type=String.class, parameters={})
    private Output<String> proxyUri;

    /**
     * @return The proxy endpoint that is used to access the Jupyter notebook.
     * 
     */
    public Output<String> getProxyUri() {
        return this.proxyUri;
    }
    /**
     * Reservation Affinity for consuming Zonal reservation.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="reservationAffinity", type=InstanceReservationAffinity.class, parameters={})
    private Output</* @Nullable */ InstanceReservationAffinity> reservationAffinity;

    /**
     * @return Reservation Affinity for consuming Zonal reservation.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ InstanceReservationAffinity> getReservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * The service account on this instance, giving access to other
     * Google Cloud services. You can use any service account within
     * the same project, but you must have the service account user
     * permission to use the instance. If not specified,
     * the Compute Engine default service account is used.
     * 
     */
    @OutputExport(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The service account on this instance, giving access to other
     * Google Cloud services. You can use any service account within
     * the same project, but you must have the service account user
     * permission to use the instance. If not specified,
     * the Compute Engine default service account is used.
     * 
     */
    public Output<String> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances.
     * If not specified, the following scopes are defined:
     * - https://www.googleapis.com/auth/cloud-platform
     * - https://www.googleapis.com/auth/userinfo.email
     * 
     */
    @OutputExport(name="serviceAccountScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> serviceAccountScopes;

    /**
     * @return Optional. The URIs of service account scopes to be included in Compute Engine instances.
     * If not specified, the following scopes are defined:
     * - https://www.googleapis.com/auth/cloud-platform
     * - https://www.googleapis.com/auth/userinfo.email
     * 
     */
    public Output</* @Nullable */ List<String>> getServiceAccountScopes() {
        return this.serviceAccountScopes;
    }
    /**
     * A set of Shielded Instance options. Check [Images using supported Shielded VM features]
     * Not all combinations are valid
     * Structure is documented below.
     * 
     */
    @OutputExport(name="shieldedInstanceConfig", type=InstanceShieldedInstanceConfig.class, parameters={})
    private Output<InstanceShieldedInstanceConfig> shieldedInstanceConfig;

    /**
     * @return A set of Shielded Instance options. Check [Images using supported Shielded VM features]
     * Not all combinations are valid
     * Structure is documented below.
     * 
     */
    public Output<InstanceShieldedInstanceConfig> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * The state of this instance.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of this instance.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The name of the subnet that this instance is in.
     * Format: projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}
     * 
     */
    @OutputExport(name="subnet", type=String.class, parameters={})
    private Output<String> subnet;

    /**
     * @return The name of the subnet that this instance is in.
     * Format: projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}
     * 
     */
    public Output<String> getSubnet() {
        return this.subnet;
    }
    /**
     * The Compute Engine tags to add to instance.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The Compute Engine tags to add to instance.
     * 
     */
    public Output</* @Nullable */ List<String>> getTags() {
        return this.tags;
    }
    /**
     * Instance update time.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Instance update time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="vmImage", type=InstanceVmImage.class, parameters={})
    private Output</* @Nullable */ InstanceVmImage> vmImage;

    /**
     * @return Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ InstanceVmImage> getVmImage() {
        return this.vmImage;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:notebooks/instance:Instance", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Instance get(String name, Input<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
