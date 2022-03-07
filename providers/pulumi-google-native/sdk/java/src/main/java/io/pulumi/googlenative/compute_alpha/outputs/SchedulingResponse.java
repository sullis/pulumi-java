// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.DurationResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SchedulingNodeAffinityResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SchedulingResponse {
    /**
     * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
     * 
     */
    private final Boolean automaticRestart;
    /**
     * Specifies the availability domain (AD), which this instance should be scheduled on. The AD belongs to the spread GroupPlacementPolicy resource policy that has been assigned to the instance. Specify a value between 1-max count of availability domains in your GroupPlacementPolicy. See go/placement-policy-extension for more details.
     * 
     */
    private final Integer availabilityDomain;
    /**
     * Current number of vCPUs available for VM. 0 or unset means default vCPUs of the current machine type.
     * 
     */
    private final Integer currentCpus;
    /**
     * Current amount of memory (in MB) available for VM. 0 or unset means default amount of memory of the current machine type.
     * 
     */
    private final String currentMemoryMb;
    /**
     * Specify the time in seconds for host error detection, the value must be within the range of [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will be used.
     * 
     */
    private final Integer hostErrorTimeoutSeconds;
    /**
     * Specifies the termination action for the instance.
     * 
     */
    private final String instanceTerminationAction;
    /**
     * Defines whether the instance is tolerant of higher cpu latency. This can only be set during instance creation, or when the instance is not currently running. It must not be set if the preemptible option is also set.
     * 
     */
    private final Boolean latencyTolerant;
    /**
     * An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    private final String locationHint;
    /**
     * Specifies the number of hours after VM instance creation where the VM won't be scheduled for maintenance.
     * 
     */
    private final Integer maintenanceFreezeDurationHours;
    /**
     * For more information about maintenance intervals, see Setting maintenance intervals.
     * 
     */
    private final String maintenanceInterval;
    /**
     * Specifies the max run duration for the given instance. If specified, the instance termination action will be performed at the end of the run duration.
     * 
     */
    private final DurationResponse maxRunDuration;
    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    private final Integer minNodeCpus;
    /**
     * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
     * 
     */
    private final List<SchedulingNodeAffinityResponse> nodeAffinities;
    /**
     * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM availability policies.
     * 
     */
    private final String onHostMaintenance;
    /**
     * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
     * 
     */
    private final Boolean preemptible;
    /**
     * Specifies the provisioning model of the instance.
     * 
     */
    private final String provisioningModel;
    /**
     * Specifies the timestamp, when the instance will be terminated, in RFC3339 text format. If specified, the instance termination action will be performed at the termination time.
     * 
     */
    private final String terminationTime;

    @OutputCustomType.Constructor({"automaticRestart","availabilityDomain","currentCpus","currentMemoryMb","hostErrorTimeoutSeconds","instanceTerminationAction","latencyTolerant","locationHint","maintenanceFreezeDurationHours","maintenanceInterval","maxRunDuration","minNodeCpus","nodeAffinities","onHostMaintenance","preemptible","provisioningModel","terminationTime"})
    private SchedulingResponse(
        Boolean automaticRestart,
        Integer availabilityDomain,
        Integer currentCpus,
        String currentMemoryMb,
        Integer hostErrorTimeoutSeconds,
        String instanceTerminationAction,
        Boolean latencyTolerant,
        String locationHint,
        Integer maintenanceFreezeDurationHours,
        String maintenanceInterval,
        DurationResponse maxRunDuration,
        Integer minNodeCpus,
        List<SchedulingNodeAffinityResponse> nodeAffinities,
        String onHostMaintenance,
        Boolean preemptible,
        String provisioningModel,
        String terminationTime) {
        this.automaticRestart = Objects.requireNonNull(automaticRestart);
        this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
        this.currentCpus = Objects.requireNonNull(currentCpus);
        this.currentMemoryMb = Objects.requireNonNull(currentMemoryMb);
        this.hostErrorTimeoutSeconds = Objects.requireNonNull(hostErrorTimeoutSeconds);
        this.instanceTerminationAction = Objects.requireNonNull(instanceTerminationAction);
        this.latencyTolerant = Objects.requireNonNull(latencyTolerant);
        this.locationHint = Objects.requireNonNull(locationHint);
        this.maintenanceFreezeDurationHours = Objects.requireNonNull(maintenanceFreezeDurationHours);
        this.maintenanceInterval = Objects.requireNonNull(maintenanceInterval);
        this.maxRunDuration = Objects.requireNonNull(maxRunDuration);
        this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
        this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
        this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
        this.preemptible = Objects.requireNonNull(preemptible);
        this.provisioningModel = Objects.requireNonNull(provisioningModel);
        this.terminationTime = Objects.requireNonNull(terminationTime);
    }

    /**
     * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
     * 
    */
    public Boolean getAutomaticRestart() {
        return this.automaticRestart;
    }
    /**
     * Specifies the availability domain (AD), which this instance should be scheduled on. The AD belongs to the spread GroupPlacementPolicy resource policy that has been assigned to the instance. Specify a value between 1-max count of availability domains in your GroupPlacementPolicy. See go/placement-policy-extension for more details.
     * 
    */
    public Integer getAvailabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * Current number of vCPUs available for VM. 0 or unset means default vCPUs of the current machine type.
     * 
    */
    public Integer getCurrentCpus() {
        return this.currentCpus;
    }
    /**
     * Current amount of memory (in MB) available for VM. 0 or unset means default amount of memory of the current machine type.
     * 
    */
    public String getCurrentMemoryMb() {
        return this.currentMemoryMb;
    }
    /**
     * Specify the time in seconds for host error detection, the value must be within the range of [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will be used.
     * 
    */
    public Integer getHostErrorTimeoutSeconds() {
        return this.hostErrorTimeoutSeconds;
    }
    /**
     * Specifies the termination action for the instance.
     * 
    */
    public String getInstanceTerminationAction() {
        return this.instanceTerminationAction;
    }
    /**
     * Defines whether the instance is tolerant of higher cpu latency. This can only be set during instance creation, or when the instance is not currently running. It must not be set if the preemptible option is also set.
     * 
    */
    public Boolean getLatencyTolerant() {
        return this.latencyTolerant;
    }
    /**
     * An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
     * 
    */
    public String getLocationHint() {
        return this.locationHint;
    }
    /**
     * Specifies the number of hours after VM instance creation where the VM won't be scheduled for maintenance.
     * 
    */
    public Integer getMaintenanceFreezeDurationHours() {
        return this.maintenanceFreezeDurationHours;
    }
    /**
     * For more information about maintenance intervals, see Setting maintenance intervals.
     * 
    */
    public String getMaintenanceInterval() {
        return this.maintenanceInterval;
    }
    /**
     * Specifies the max run duration for the given instance. If specified, the instance termination action will be performed at the end of the run duration.
     * 
    */
    public DurationResponse getMaxRunDuration() {
        return this.maxRunDuration;
    }
    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
    */
    public Integer getMinNodeCpus() {
        return this.minNodeCpus;
    }
    /**
     * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
     * 
    */
    public List<SchedulingNodeAffinityResponse> getNodeAffinities() {
        return this.nodeAffinities;
    }
    /**
     * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM availability policies.
     * 
    */
    public String getOnHostMaintenance() {
        return this.onHostMaintenance;
    }
    /**
     * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
     * 
    */
    public Boolean getPreemptible() {
        return this.preemptible;
    }
    /**
     * Specifies the provisioning model of the instance.
     * 
    */
    public String getProvisioningModel() {
        return this.provisioningModel;
    }
    /**
     * Specifies the timestamp, when the instance will be terminated, in RFC3339 text format. If specified, the instance termination action will be performed at the termination time.
     * 
    */
    public String getTerminationTime() {
        return this.terminationTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean automaticRestart;
        private Integer availabilityDomain;
        private Integer currentCpus;
        private String currentMemoryMb;
        private Integer hostErrorTimeoutSeconds;
        private String instanceTerminationAction;
        private Boolean latencyTolerant;
        private String locationHint;
        private Integer maintenanceFreezeDurationHours;
        private String maintenanceInterval;
        private DurationResponse maxRunDuration;
        private Integer minNodeCpus;
        private List<SchedulingNodeAffinityResponse> nodeAffinities;
        private String onHostMaintenance;
        private Boolean preemptible;
        private String provisioningModel;
        private String terminationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.currentCpus = defaults.currentCpus;
    	      this.currentMemoryMb = defaults.currentMemoryMb;
    	      this.hostErrorTimeoutSeconds = defaults.hostErrorTimeoutSeconds;
    	      this.instanceTerminationAction = defaults.instanceTerminationAction;
    	      this.latencyTolerant = defaults.latencyTolerant;
    	      this.locationHint = defaults.locationHint;
    	      this.maintenanceFreezeDurationHours = defaults.maintenanceFreezeDurationHours;
    	      this.maintenanceInterval = defaults.maintenanceInterval;
    	      this.maxRunDuration = defaults.maxRunDuration;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
    	      this.terminationTime = defaults.terminationTime;
        }

        public Builder setAutomaticRestart(Boolean automaticRestart) {
            this.automaticRestart = Objects.requireNonNull(automaticRestart);
            return this;
        }

        public Builder setAvailabilityDomain(Integer availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }

        public Builder setCurrentCpus(Integer currentCpus) {
            this.currentCpus = Objects.requireNonNull(currentCpus);
            return this;
        }

        public Builder setCurrentMemoryMb(String currentMemoryMb) {
            this.currentMemoryMb = Objects.requireNonNull(currentMemoryMb);
            return this;
        }

        public Builder setHostErrorTimeoutSeconds(Integer hostErrorTimeoutSeconds) {
            this.hostErrorTimeoutSeconds = Objects.requireNonNull(hostErrorTimeoutSeconds);
            return this;
        }

        public Builder setInstanceTerminationAction(String instanceTerminationAction) {
            this.instanceTerminationAction = Objects.requireNonNull(instanceTerminationAction);
            return this;
        }

        public Builder setLatencyTolerant(Boolean latencyTolerant) {
            this.latencyTolerant = Objects.requireNonNull(latencyTolerant);
            return this;
        }

        public Builder setLocationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }

        public Builder setMaintenanceFreezeDurationHours(Integer maintenanceFreezeDurationHours) {
            this.maintenanceFreezeDurationHours = Objects.requireNonNull(maintenanceFreezeDurationHours);
            return this;
        }

        public Builder setMaintenanceInterval(String maintenanceInterval) {
            this.maintenanceInterval = Objects.requireNonNull(maintenanceInterval);
            return this;
        }

        public Builder setMaxRunDuration(DurationResponse maxRunDuration) {
            this.maxRunDuration = Objects.requireNonNull(maxRunDuration);
            return this;
        }

        public Builder setMinNodeCpus(Integer minNodeCpus) {
            this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
            return this;
        }

        public Builder setNodeAffinities(List<SchedulingNodeAffinityResponse> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }

        public Builder setOnHostMaintenance(String onHostMaintenance) {
            this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
            return this;
        }

        public Builder setPreemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }

        public Builder setProvisioningModel(String provisioningModel) {
            this.provisioningModel = Objects.requireNonNull(provisioningModel);
            return this;
        }

        public Builder setTerminationTime(String terminationTime) {
            this.terminationTime = Objects.requireNonNull(terminationTime);
            return this;
        }
        public SchedulingResponse build() {
            return new SchedulingResponse(automaticRestart, availabilityDomain, currentCpus, currentMemoryMb, hostErrorTimeoutSeconds, instanceTerminationAction, latencyTolerant, locationHint, maintenanceFreezeDurationHours, maintenanceInterval, maxRunDuration, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible, provisioningModel, terminationTime);
        }
    }
}