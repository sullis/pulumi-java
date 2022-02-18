// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetInstanceTemplateAdvancedMachineFeature;
import io.pulumi.gcp.compute.outputs.GetInstanceTemplateConfidentialInstanceConfig;
import io.pulumi.gcp.compute.outputs.GetInstanceTemplateDisk;
import io.pulumi.gcp.compute.outputs.GetInstanceTemplateGuestAccelerator;
import io.pulumi.gcp.compute.outputs.GetInstanceTemplateNetworkInterface;
import io.pulumi.gcp.compute.outputs.GetInstanceTemplateNetworkPerformanceConfig;
import io.pulumi.gcp.compute.outputs.GetInstanceTemplateReservationAffinity;
import io.pulumi.gcp.compute.outputs.GetInstanceTemplateScheduling;
import io.pulumi.gcp.compute.outputs.GetInstanceTemplateServiceAccount;
import io.pulumi.gcp.compute.outputs.GetInstanceTemplateShieldedInstanceConfig;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInstanceTemplateResult {
    private final List<GetInstanceTemplateAdvancedMachineFeature> advancedMachineFeatures;
    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs. This defaults to false.
     * 
     */
    private final Boolean canIpForward;
    /**
     * Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * 
     */
    private final List<GetInstanceTemplateConfidentialInstanceConfig> confidentialInstanceConfigs;
    /**
     * A brief description of this resource.
     * 
     */
    private final String description;
    /**
     * Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     * 
     */
    private final List<GetInstanceTemplateDisk> disks;
    /**
     * Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     * 
     */
    private final Boolean enableDisplay;
    private final @Nullable String filter;
    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * 
     */
    private final List<GetInstanceTemplateGuestAccelerator> guestAccelerators;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A brief description to use for instances
     * created from this template.
     * 
     */
    private final String instanceDescription;
    /**
     * (Optional) A set of ket/value label pairs to assign to disk created from
     * this template
     * 
     */
    private final Map<String,String> labels;
    /**
     * The machine type to create.
     * 
     */
    private final String machineType;
    /**
     * Metadata key/value pairs to make available from
     * within instances created from this template.
     * 
     */
    private final Map<String,Object> metadata;
    /**
     * The unique fingerprint of the metadata.
     * 
     */
    private final String metadataFingerprint;
    /**
     * An alternative to using the
     * startup-script metadata key, mostly to match the compute_instance resource.
     * This replaces the startup-script metadata key on the created instance and
     * thus the two mechanisms are not allowed to be used simultaneously.
     * 
     */
    private final String metadataStartupScript;
    /**
     * Specifies a minimum CPU platform. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     * 
     */
    private final String minCpuPlatform;
    private final @Nullable Boolean mostRecent;
    /**
     * The name of the instance template. If you leave
     * this blank, the provider will auto-generate a unique name.
     * 
     */
    private final @Nullable String name;
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    private final String namePrefix;
    /**
     * Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     * 
     */
    private final List<GetInstanceTemplateNetworkInterface> networkInterfaces;
    /**
     * The network performance configuration setting
     * for the instance, if set. Structure is documented below.
     * 
     */
    private final List<GetInstanceTemplateNetworkPerformanceConfig> networkPerformanceConfigs;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    private final String project;
    /**
     * An instance template is a global resource that is not
     * bound to a zone or a region. However, you can still specify some regional
     * resources in an instance template, which restricts the template to the
     * region where that resource resides. For example, a custom `subnetwork`
     * resource is tied to a specific region. Defaults to the region of the
     * Provider if no value is given.
     * 
     */
    private final String region;
    private final List<GetInstanceTemplateReservationAffinity> reservationAffinities;
    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * 
     */
    private final List<GetInstanceTemplateScheduling> schedulings;
    /**
     * The URI of the created resource.
     * 
     */
    private final String selfLink;
    /**
     * Service account to attach to the instance. Structure is documented below.
     * 
     */
    private final List<GetInstanceTemplateServiceAccount> serviceAccounts;
    /**
     * Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shielded_instance_config` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * 
     */
    private final List<GetInstanceTemplateShieldedInstanceConfig> shieldedInstanceConfigs;
    /**
     * Tags to attach to the instance.
     * 
     */
    private final List<String> tags;
    /**
     * The unique fingerprint of the tags.
     * 
     */
    private final String tagsFingerprint;

    @OutputCustomType.Constructor({"advancedMachineFeatures","canIpForward","confidentialInstanceConfigs","description","disks","enableDisplay","filter","guestAccelerators","id","instanceDescription","labels","machineType","metadata","metadataFingerprint","metadataStartupScript","minCpuPlatform","mostRecent","name","namePrefix","networkInterfaces","networkPerformanceConfigs","project","region","reservationAffinities","schedulings","selfLink","serviceAccounts","shieldedInstanceConfigs","tags","tagsFingerprint"})
    private GetInstanceTemplateResult(
        List<GetInstanceTemplateAdvancedMachineFeature> advancedMachineFeatures,
        Boolean canIpForward,
        List<GetInstanceTemplateConfidentialInstanceConfig> confidentialInstanceConfigs,
        String description,
        List<GetInstanceTemplateDisk> disks,
        Boolean enableDisplay,
        @Nullable String filter,
        List<GetInstanceTemplateGuestAccelerator> guestAccelerators,
        String id,
        String instanceDescription,
        Map<String,String> labels,
        String machineType,
        Map<String,Object> metadata,
        String metadataFingerprint,
        String metadataStartupScript,
        String minCpuPlatform,
        @Nullable Boolean mostRecent,
        @Nullable String name,
        String namePrefix,
        List<GetInstanceTemplateNetworkInterface> networkInterfaces,
        List<GetInstanceTemplateNetworkPerformanceConfig> networkPerformanceConfigs,
        String project,
        String region,
        List<GetInstanceTemplateReservationAffinity> reservationAffinities,
        List<GetInstanceTemplateScheduling> schedulings,
        String selfLink,
        List<GetInstanceTemplateServiceAccount> serviceAccounts,
        List<GetInstanceTemplateShieldedInstanceConfig> shieldedInstanceConfigs,
        List<String> tags,
        String tagsFingerprint) {
        this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures);
        this.canIpForward = Objects.requireNonNull(canIpForward);
        this.confidentialInstanceConfigs = Objects.requireNonNull(confidentialInstanceConfigs);
        this.description = Objects.requireNonNull(description);
        this.disks = Objects.requireNonNull(disks);
        this.enableDisplay = Objects.requireNonNull(enableDisplay);
        this.filter = filter;
        this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
        this.id = Objects.requireNonNull(id);
        this.instanceDescription = Objects.requireNonNull(instanceDescription);
        this.labels = Objects.requireNonNull(labels);
        this.machineType = Objects.requireNonNull(machineType);
        this.metadata = Objects.requireNonNull(metadata);
        this.metadataFingerprint = Objects.requireNonNull(metadataFingerprint);
        this.metadataStartupScript = Objects.requireNonNull(metadataStartupScript);
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
        this.mostRecent = mostRecent;
        this.name = name;
        this.namePrefix = Objects.requireNonNull(namePrefix);
        this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
        this.networkPerformanceConfigs = Objects.requireNonNull(networkPerformanceConfigs);
        this.project = Objects.requireNonNull(project);
        this.region = Objects.requireNonNull(region);
        this.reservationAffinities = Objects.requireNonNull(reservationAffinities);
        this.schedulings = Objects.requireNonNull(schedulings);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.serviceAccounts = Objects.requireNonNull(serviceAccounts);
        this.shieldedInstanceConfigs = Objects.requireNonNull(shieldedInstanceConfigs);
        this.tags = Objects.requireNonNull(tags);
        this.tagsFingerprint = Objects.requireNonNull(tagsFingerprint);
    }

    public List<GetInstanceTemplateAdvancedMachineFeature> getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }
    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs. This defaults to false.
     * 
     */
    public Boolean getCanIpForward() {
        return this.canIpForward;
    }
    /**
     * Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * 
     */
    public List<GetInstanceTemplateConfidentialInstanceConfig> getConfidentialInstanceConfigs() {
        return this.confidentialInstanceConfigs;
    }
    /**
     * A brief description of this resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     * 
     */
    public List<GetInstanceTemplateDisk> getDisks() {
        return this.disks;
    }
    /**
     * Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     * 
     */
    public Boolean getEnableDisplay() {
        return this.enableDisplay;
    }
    public Optional<String> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * 
     */
    public List<GetInstanceTemplateGuestAccelerator> getGuestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * A brief description to use for instances
     * created from this template.
     * 
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
    }
    /**
     * (Optional) A set of ket/value label pairs to assign to disk created from
     * this template
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The machine type to create.
     * 
     */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * Metadata key/value pairs to make available from
     * within instances created from this template.
     * 
     */
    public Map<String,Object> getMetadata() {
        return this.metadata;
    }
    /**
     * The unique fingerprint of the metadata.
     * 
     */
    public String getMetadataFingerprint() {
        return this.metadataFingerprint;
    }
    /**
     * An alternative to using the
     * startup-script metadata key, mostly to match the compute_instance resource.
     * This replaces the startup-script metadata key on the created instance and
     * thus the two mechanisms are not allowed to be used simultaneously.
     * 
     */
    public String getMetadataStartupScript() {
        return this.metadataStartupScript;
    }
    /**
     * Specifies a minimum CPU platform. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     * 
     */
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    public Optional<Boolean> getMostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * The name of the instance template. If you leave
     * this blank, the provider will auto-generate a unique name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    public String getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     * 
     */
    public List<GetInstanceTemplateNetworkInterface> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * The network performance configuration setting
     * for the instance, if set. Structure is documented below.
     * 
     */
    public List<GetInstanceTemplateNetworkPerformanceConfig> getNetworkPerformanceConfigs() {
        return this.networkPerformanceConfigs;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public String getProject() {
        return this.project;
    }
    /**
     * An instance template is a global resource that is not
     * bound to a zone or a region. However, you can still specify some regional
     * resources in an instance template, which restricts the template to the
     * region where that resource resides. For example, a custom `subnetwork`
     * resource is tied to a specific region. Defaults to the region of the
     * Provider if no value is given.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    public List<GetInstanceTemplateReservationAffinity> getReservationAffinities() {
        return this.reservationAffinities;
    }
    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * 
     */
    public List<GetInstanceTemplateScheduling> getSchedulings() {
        return this.schedulings;
    }
    /**
     * The URI of the created resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Service account to attach to the instance. Structure is documented below.
     * 
     */
    public List<GetInstanceTemplateServiceAccount> getServiceAccounts() {
        return this.serviceAccounts;
    }
    /**
     * Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shielded_instance_config` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * 
     */
    public List<GetInstanceTemplateShieldedInstanceConfig> getShieldedInstanceConfigs() {
        return this.shieldedInstanceConfigs;
    }
    /**
     * Tags to attach to the instance.
     * 
     */
    public List<String> getTags() {
        return this.tags;
    }
    /**
     * The unique fingerprint of the tags.
     * 
     */
    public String getTagsFingerprint() {
        return this.tagsFingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetInstanceTemplateAdvancedMachineFeature> advancedMachineFeatures;
        private Boolean canIpForward;
        private List<GetInstanceTemplateConfidentialInstanceConfig> confidentialInstanceConfigs;
        private String description;
        private List<GetInstanceTemplateDisk> disks;
        private Boolean enableDisplay;
        private @Nullable String filter;
        private List<GetInstanceTemplateGuestAccelerator> guestAccelerators;
        private String id;
        private String instanceDescription;
        private Map<String,String> labels;
        private String machineType;
        private Map<String,Object> metadata;
        private String metadataFingerprint;
        private String metadataStartupScript;
        private String minCpuPlatform;
        private @Nullable Boolean mostRecent;
        private @Nullable String name;
        private String namePrefix;
        private List<GetInstanceTemplateNetworkInterface> networkInterfaces;
        private List<GetInstanceTemplateNetworkPerformanceConfig> networkPerformanceConfigs;
        private String project;
        private String region;
        private List<GetInstanceTemplateReservationAffinity> reservationAffinities;
        private List<GetInstanceTemplateScheduling> schedulings;
        private String selfLink;
        private List<GetInstanceTemplateServiceAccount> serviceAccounts;
        private List<GetInstanceTemplateShieldedInstanceConfig> shieldedInstanceConfigs;
        private List<String> tags;
        private String tagsFingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.canIpForward = defaults.canIpForward;
    	      this.confidentialInstanceConfigs = defaults.confidentialInstanceConfigs;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.enableDisplay = defaults.enableDisplay;
    	      this.filter = defaults.filter;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.id = defaults.id;
    	      this.instanceDescription = defaults.instanceDescription;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.metadataFingerprint = defaults.metadataFingerprint;
    	      this.metadataStartupScript = defaults.metadataStartupScript;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.mostRecent = defaults.mostRecent;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkPerformanceConfigs = defaults.networkPerformanceConfigs;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.reservationAffinities = defaults.reservationAffinities;
    	      this.schedulings = defaults.schedulings;
    	      this.selfLink = defaults.selfLink;
    	      this.serviceAccounts = defaults.serviceAccounts;
    	      this.shieldedInstanceConfigs = defaults.shieldedInstanceConfigs;
    	      this.tags = defaults.tags;
    	      this.tagsFingerprint = defaults.tagsFingerprint;
        }

        public Builder setAdvancedMachineFeatures(List<GetInstanceTemplateAdvancedMachineFeature> advancedMachineFeatures) {
            this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures);
            return this;
        }

        public Builder setCanIpForward(Boolean canIpForward) {
            this.canIpForward = Objects.requireNonNull(canIpForward);
            return this;
        }

        public Builder setConfidentialInstanceConfigs(List<GetInstanceTemplateConfidentialInstanceConfig> confidentialInstanceConfigs) {
            this.confidentialInstanceConfigs = Objects.requireNonNull(confidentialInstanceConfigs);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisks(List<GetInstanceTemplateDisk> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder setEnableDisplay(Boolean enableDisplay) {
            this.enableDisplay = Objects.requireNonNull(enableDisplay);
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }

        public Builder setGuestAccelerators(List<GetInstanceTemplateGuestAccelerator> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceDescription(String instanceDescription) {
            this.instanceDescription = Objects.requireNonNull(instanceDescription);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMetadata(Map<String,Object> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setMetadataFingerprint(String metadataFingerprint) {
            this.metadataFingerprint = Objects.requireNonNull(metadataFingerprint);
            return this;
        }

        public Builder setMetadataStartupScript(String metadataStartupScript) {
            this.metadataStartupScript = Objects.requireNonNull(metadataStartupScript);
            return this;
        }

        public Builder setMinCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder setMostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNamePrefix(String namePrefix) {
            this.namePrefix = Objects.requireNonNull(namePrefix);
            return this;
        }

        public Builder setNetworkInterfaces(List<GetInstanceTemplateNetworkInterface> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }

        public Builder setNetworkPerformanceConfigs(List<GetInstanceTemplateNetworkPerformanceConfig> networkPerformanceConfigs) {
            this.networkPerformanceConfigs = Objects.requireNonNull(networkPerformanceConfigs);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setReservationAffinities(List<GetInstanceTemplateReservationAffinity> reservationAffinities) {
            this.reservationAffinities = Objects.requireNonNull(reservationAffinities);
            return this;
        }

        public Builder setSchedulings(List<GetInstanceTemplateScheduling> schedulings) {
            this.schedulings = Objects.requireNonNull(schedulings);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setServiceAccounts(List<GetInstanceTemplateServiceAccount> serviceAccounts) {
            this.serviceAccounts = Objects.requireNonNull(serviceAccounts);
            return this;
        }

        public Builder setShieldedInstanceConfigs(List<GetInstanceTemplateShieldedInstanceConfig> shieldedInstanceConfigs) {
            this.shieldedInstanceConfigs = Objects.requireNonNull(shieldedInstanceConfigs);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTagsFingerprint(String tagsFingerprint) {
            this.tagsFingerprint = Objects.requireNonNull(tagsFingerprint);
            return this;
        }

        public GetInstanceTemplateResult build() {
            return new GetInstanceTemplateResult(advancedMachineFeatures, canIpForward, confidentialInstanceConfigs, description, disks, enableDisplay, filter, guestAccelerators, id, instanceDescription, labels, machineType, metadata, metadataFingerprint, metadataStartupScript, minCpuPlatform, mostRecent, name, namePrefix, networkInterfaces, networkPerformanceConfigs, project, region, reservationAffinities, schedulings, selfLink, serviceAccounts, shieldedInstanceConfigs, tags, tagsFingerprint);
        }
    }
}
