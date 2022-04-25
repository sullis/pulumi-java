// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataflow_v1b3.inputs.AutoscalingSettingsResponse;
import com.pulumi.googlenative.dataflow_v1b3.inputs.DiskResponse;
import com.pulumi.googlenative.dataflow_v1b3.inputs.PackageResponse;
import com.pulumi.googlenative.dataflow_v1b3.inputs.SdkHarnessContainerImageResponse;
import com.pulumi.googlenative.dataflow_v1b3.inputs.TaskRunnerSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Describes one particular pool of Cloud Dataflow workers to be instantiated by the Cloud Dataflow service in order to perform the computations required by a job. Note that a workflow job may use multiple pools, in order to match the various computational requirements of the various stages of the job.
 * 
 */
public final class WorkerPoolResponse extends com.pulumi.resources.InvokeArgs {

    public static final WorkerPoolResponse Empty = new WorkerPoolResponse();

    /**
     * Settings for autoscaling of this WorkerPool.
     * 
     */
    @Import(name="autoscalingSettings", required=true)
    private AutoscalingSettingsResponse autoscalingSettings;

    /**
     * @return Settings for autoscaling of this WorkerPool.
     * 
     */
    public AutoscalingSettingsResponse autoscalingSettings() {
        return this.autoscalingSettings;
    }

    /**
     * Data disks that are used by a VM in this workflow.
     * 
     */
    @Import(name="dataDisks", required=true)
    private List<DiskResponse> dataDisks;

    /**
     * @return Data disks that are used by a VM in this workflow.
     * 
     */
    public List<DiskResponse> dataDisks() {
        return this.dataDisks;
    }

    /**
     * The default package set to install. This allows the service to select a default set of packages which are useful to worker harnesses written in a particular language.
     * 
     */
    @Import(name="defaultPackageSet", required=true)
    private String defaultPackageSet;

    /**
     * @return The default package set to install. This allows the service to select a default set of packages which are useful to worker harnesses written in a particular language.
     * 
     */
    public String defaultPackageSet() {
        return this.defaultPackageSet;
    }

    /**
     * Size of root disk for VMs, in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="diskSizeGb", required=true)
    private Integer diskSizeGb;

    /**
     * @return Size of root disk for VMs, in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public Integer diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Fully qualified source image for disks.
     * 
     */
    @Import(name="diskSourceImage", required=true)
    private String diskSourceImage;

    /**
     * @return Fully qualified source image for disks.
     * 
     */
    public String diskSourceImage() {
        return this.diskSourceImage;
    }

    /**
     * Type of root disk for VMs. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="diskType", required=true)
    private String diskType;

    /**
     * @return Type of root disk for VMs. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public String diskType() {
        return this.diskType;
    }

    /**
     * Configuration for VM IPs.
     * 
     */
    @Import(name="ipConfiguration", required=true)
    private String ipConfiguration;

    /**
     * @return Configuration for VM IPs.
     * 
     */
    public String ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * The kind of the worker pool; currently only `harness` and `shuffle` are supported.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return The kind of the worker pool; currently only `harness` and `shuffle` are supported.
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Machine type (e.g. &#34;n1-standard-1&#34;). If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="machineType", required=true)
    private String machineType;

    /**
     * @return Machine type (e.g. &#34;n1-standard-1&#34;). If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public String machineType() {
        return this.machineType;
    }

    /**
     * Metadata to set on the Google Compute Engine VMs.
     * 
     */
    @Import(name="metadata", required=true)
    private Map<String,String> metadata;

    /**
     * @return Metadata to set on the Google Compute Engine VMs.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }

    /**
     * Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
     * 
     */
    @Import(name="network", required=true)
    private String network;

    /**
     * @return Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
     * 
     */
    public String network() {
        return this.network;
    }

    /**
     * The number of threads per worker harness. If empty or unspecified, the service will choose a number of threads (according to the number of cores on the selected machine type for batch, or 1 by convention for streaming).
     * 
     */
    @Import(name="numThreadsPerWorker", required=true)
    private Integer numThreadsPerWorker;

    /**
     * @return The number of threads per worker harness. If empty or unspecified, the service will choose a number of threads (according to the number of cores on the selected machine type for batch, or 1 by convention for streaming).
     * 
     */
    public Integer numThreadsPerWorker() {
        return this.numThreadsPerWorker;
    }

    /**
     * Number of Google Compute Engine workers in this pool needed to execute the job. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="numWorkers", required=true)
    private Integer numWorkers;

    /**
     * @return Number of Google Compute Engine workers in this pool needed to execute the job. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public Integer numWorkers() {
        return this.numWorkers;
    }

    /**
     * The action to take on host maintenance, as defined by the Google Compute Engine API.
     * 
     */
    @Import(name="onHostMaintenance", required=true)
    private String onHostMaintenance;

    /**
     * @return The action to take on host maintenance, as defined by the Google Compute Engine API.
     * 
     */
    public String onHostMaintenance() {
        return this.onHostMaintenance;
    }

    /**
     * Packages to be installed on workers.
     * 
     */
    @Import(name="packages", required=true)
    private List<PackageResponse> packages;

    /**
     * @return Packages to be installed on workers.
     * 
     */
    public List<PackageResponse> packages() {
        return this.packages;
    }

    /**
     * Extra arguments for this worker pool.
     * 
     */
    @Import(name="poolArgs", required=true)
    private Map<String,String> poolArgs;

    /**
     * @return Extra arguments for this worker pool.
     * 
     */
    public Map<String,String> poolArgs() {
        return this.poolArgs;
    }

    /**
     * Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry. Cross-language pipelines will have two or more entries.
     * 
     */
    @Import(name="sdkHarnessContainerImages", required=true)
    private List<SdkHarnessContainerImageResponse> sdkHarnessContainerImages;

    /**
     * @return Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry. Cross-language pipelines will have two or more entries.
     * 
     */
    public List<SdkHarnessContainerImageResponse> sdkHarnessContainerImages() {
        return this.sdkHarnessContainerImages;
    }

    /**
     * Subnetwork to which VMs will be assigned, if desired. Expected to be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;.
     * 
     */
    @Import(name="subnetwork", required=true)
    private String subnetwork;

    /**
     * @return Subnetwork to which VMs will be assigned, if desired. Expected to be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;.
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }

    /**
     * Settings passed through to Google Compute Engine workers when using the standard Dataflow task runner. Users should ignore this field.
     * 
     */
    @Import(name="taskrunnerSettings", required=true)
    private TaskRunnerSettingsResponse taskrunnerSettings;

    /**
     * @return Settings passed through to Google Compute Engine workers when using the standard Dataflow task runner. Users should ignore this field.
     * 
     */
    public TaskRunnerSettingsResponse taskrunnerSettings() {
        return this.taskrunnerSettings;
    }

    /**
     * Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user&#39;s project until they are explicitly terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="teardownPolicy", required=true)
    private String teardownPolicy;

    /**
     * @return Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user&#39;s project until they are explicitly terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public String teardownPolicy() {
        return this.teardownPolicy;
    }

    /**
     * Zone to run the worker pools in. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @Import(name="zone", required=true)
    private String zone;

    /**
     * @return Zone to run the worker pools in. If empty or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    public String zone() {
        return this.zone;
    }

    private WorkerPoolResponse() {}

    private WorkerPoolResponse(WorkerPoolResponse $) {
        this.autoscalingSettings = $.autoscalingSettings;
        this.dataDisks = $.dataDisks;
        this.defaultPackageSet = $.defaultPackageSet;
        this.diskSizeGb = $.diskSizeGb;
        this.diskSourceImage = $.diskSourceImage;
        this.diskType = $.diskType;
        this.ipConfiguration = $.ipConfiguration;
        this.kind = $.kind;
        this.machineType = $.machineType;
        this.metadata = $.metadata;
        this.network = $.network;
        this.numThreadsPerWorker = $.numThreadsPerWorker;
        this.numWorkers = $.numWorkers;
        this.onHostMaintenance = $.onHostMaintenance;
        this.packages = $.packages;
        this.poolArgs = $.poolArgs;
        this.sdkHarnessContainerImages = $.sdkHarnessContainerImages;
        this.subnetwork = $.subnetwork;
        this.taskrunnerSettings = $.taskrunnerSettings;
        this.teardownPolicy = $.teardownPolicy;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerPoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerPoolResponse $;

        public Builder() {
            $ = new WorkerPoolResponse();
        }

        public Builder(WorkerPoolResponse defaults) {
            $ = new WorkerPoolResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscalingSettings Settings for autoscaling of this WorkerPool.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingSettings(AutoscalingSettingsResponse autoscalingSettings) {
            $.autoscalingSettings = autoscalingSettings;
            return this;
        }

        /**
         * @param dataDisks Data disks that are used by a VM in this workflow.
         * 
         * @return builder
         * 
         */
        public Builder dataDisks(List<DiskResponse> dataDisks) {
            $.dataDisks = dataDisks;
            return this;
        }

        /**
         * @param dataDisks Data disks that are used by a VM in this workflow.
         * 
         * @return builder
         * 
         */
        public Builder dataDisks(DiskResponse... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }

        /**
         * @param defaultPackageSet The default package set to install. This allows the service to select a default set of packages which are useful to worker harnesses written in a particular language.
         * 
         * @return builder
         * 
         */
        public Builder defaultPackageSet(String defaultPackageSet) {
            $.defaultPackageSet = defaultPackageSet;
            return this;
        }

        /**
         * @param diskSizeGb Size of root disk for VMs, in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSourceImage Fully qualified source image for disks.
         * 
         * @return builder
         * 
         */
        public Builder diskSourceImage(String diskSourceImage) {
            $.diskSourceImage = diskSourceImage;
            return this;
        }

        /**
         * @param diskType Type of root disk for VMs. If empty or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param ipConfiguration Configuration for VM IPs.
         * 
         * @return builder
         * 
         */
        public Builder ipConfiguration(String ipConfiguration) {
            $.ipConfiguration = ipConfiguration;
            return this;
        }

        /**
         * @param kind The kind of the worker pool; currently only `harness` and `shuffle` are supported.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param machineType Machine type (e.g. &#34;n1-standard-1&#34;). If empty or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param metadata Metadata to set on the Google Compute Engine VMs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param network Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            $.network = network;
            return this;
        }

        /**
         * @param numThreadsPerWorker The number of threads per worker harness. If empty or unspecified, the service will choose a number of threads (according to the number of cores on the selected machine type for batch, or 1 by convention for streaming).
         * 
         * @return builder
         * 
         */
        public Builder numThreadsPerWorker(Integer numThreadsPerWorker) {
            $.numThreadsPerWorker = numThreadsPerWorker;
            return this;
        }

        /**
         * @param numWorkers Number of Google Compute Engine workers in this pool needed to execute the job. If zero or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder numWorkers(Integer numWorkers) {
            $.numWorkers = numWorkers;
            return this;
        }

        /**
         * @param onHostMaintenance The action to take on host maintenance, as defined by the Google Compute Engine API.
         * 
         * @return builder
         * 
         */
        public Builder onHostMaintenance(String onHostMaintenance) {
            $.onHostMaintenance = onHostMaintenance;
            return this;
        }

        /**
         * @param packages Packages to be installed on workers.
         * 
         * @return builder
         * 
         */
        public Builder packages(List<PackageResponse> packages) {
            $.packages = packages;
            return this;
        }

        /**
         * @param packages Packages to be installed on workers.
         * 
         * @return builder
         * 
         */
        public Builder packages(PackageResponse... packages) {
            return packages(List.of(packages));
        }

        /**
         * @param poolArgs Extra arguments for this worker pool.
         * 
         * @return builder
         * 
         */
        public Builder poolArgs(Map<String,String> poolArgs) {
            $.poolArgs = poolArgs;
            return this;
        }

        /**
         * @param sdkHarnessContainerImages Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry. Cross-language pipelines will have two or more entries.
         * 
         * @return builder
         * 
         */
        public Builder sdkHarnessContainerImages(List<SdkHarnessContainerImageResponse> sdkHarnessContainerImages) {
            $.sdkHarnessContainerImages = sdkHarnessContainerImages;
            return this;
        }

        /**
         * @param sdkHarnessContainerImages Set of SDK harness containers needed to execute this pipeline. This will only be set in the Fn API path. For non-cross-language pipelines this should have only one entry. Cross-language pipelines will have two or more entries.
         * 
         * @return builder
         * 
         */
        public Builder sdkHarnessContainerImages(SdkHarnessContainerImageResponse... sdkHarnessContainerImages) {
            return sdkHarnessContainerImages(List.of(sdkHarnessContainerImages));
        }

        /**
         * @param subnetwork Subnetwork to which VMs will be assigned, if desired. Expected to be of the form &#34;regions/REGION/subnetworks/SUBNETWORK&#34;.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param taskrunnerSettings Settings passed through to Google Compute Engine workers when using the standard Dataflow task runner. Users should ignore this field.
         * 
         * @return builder
         * 
         */
        public Builder taskrunnerSettings(TaskRunnerSettingsResponse taskrunnerSettings) {
            $.taskrunnerSettings = taskrunnerSettings;
            return this;
        }

        /**
         * @param teardownPolicy Sets the policy for determining when to turndown worker pool. Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn down. If the workers are not torn down by the service, they will continue to run and use Google Compute Engine VM resources in the user&#39;s project until they are explicitly terminated by the user. Because of this, Google recommends using the `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs. If unknown or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder teardownPolicy(String teardownPolicy) {
            $.teardownPolicy = teardownPolicy;
            return this;
        }

        /**
         * @param zone Zone to run the worker pools in. If empty or unspecified, the service will attempt to choose a reasonable default.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public WorkerPoolResponse build() {
            $.autoscalingSettings = Objects.requireNonNull($.autoscalingSettings, "expected parameter 'autoscalingSettings' to be non-null");
            $.dataDisks = Objects.requireNonNull($.dataDisks, "expected parameter 'dataDisks' to be non-null");
            $.defaultPackageSet = Objects.requireNonNull($.defaultPackageSet, "expected parameter 'defaultPackageSet' to be non-null");
            $.diskSizeGb = Objects.requireNonNull($.diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
            $.diskSourceImage = Objects.requireNonNull($.diskSourceImage, "expected parameter 'diskSourceImage' to be non-null");
            $.diskType = Objects.requireNonNull($.diskType, "expected parameter 'diskType' to be non-null");
            $.ipConfiguration = Objects.requireNonNull($.ipConfiguration, "expected parameter 'ipConfiguration' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            $.numThreadsPerWorker = Objects.requireNonNull($.numThreadsPerWorker, "expected parameter 'numThreadsPerWorker' to be non-null");
            $.numWorkers = Objects.requireNonNull($.numWorkers, "expected parameter 'numWorkers' to be non-null");
            $.onHostMaintenance = Objects.requireNonNull($.onHostMaintenance, "expected parameter 'onHostMaintenance' to be non-null");
            $.packages = Objects.requireNonNull($.packages, "expected parameter 'packages' to be non-null");
            $.poolArgs = Objects.requireNonNull($.poolArgs, "expected parameter 'poolArgs' to be non-null");
            $.sdkHarnessContainerImages = Objects.requireNonNull($.sdkHarnessContainerImages, "expected parameter 'sdkHarnessContainerImages' to be non-null");
            $.subnetwork = Objects.requireNonNull($.subnetwork, "expected parameter 'subnetwork' to be non-null");
            $.taskrunnerSettings = Objects.requireNonNull($.taskrunnerSettings, "expected parameter 'taskrunnerSettings' to be non-null");
            $.teardownPolicy = Objects.requireNonNull($.teardownPolicy, "expected parameter 'teardownPolicy' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
