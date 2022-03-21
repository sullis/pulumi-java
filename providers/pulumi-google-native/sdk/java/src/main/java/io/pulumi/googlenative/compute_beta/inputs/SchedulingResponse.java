// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.inputs.SchedulingNodeAffinityResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Sets the scheduling options for an Instance. NextID: 21
 * 
 */
public final class SchedulingResponse extends io.pulumi.resources.InvokeArgs {

    public static final SchedulingResponse Empty = new SchedulingResponse();

    /**
     * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
     * 
     */
    @Import(name="automaticRestart", required=true)
      private final Boolean automaticRestart;

    public Boolean getAutomaticRestart() {
        return this.automaticRestart;
    }

    /**
     * Specify the time in seconds for host error detection, the value must be within the range of [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will be used.
     * 
     */
    @Import(name="hostErrorTimeoutSeconds", required=true)
      private final Integer hostErrorTimeoutSeconds;

    public Integer getHostErrorTimeoutSeconds() {
        return this.hostErrorTimeoutSeconds;
    }

    /**
     * Specifies the termination action for the instance.
     * 
     */
    @Import(name="instanceTerminationAction", required=true)
      private final String instanceTerminationAction;

    public String getInstanceTerminationAction() {
        return this.instanceTerminationAction;
    }

    /**
     * An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @Import(name="locationHint", required=true)
      private final String locationHint;

    public String getLocationHint() {
        return this.locationHint;
    }

    /**
     * Specifies the number of hours after VM instance creation where the VM won't be scheduled for maintenance.
     * 
     */
    @Import(name="maintenanceFreezeDurationHours", required=true)
      private final Integer maintenanceFreezeDurationHours;

    public Integer getMaintenanceFreezeDurationHours() {
        return this.maintenanceFreezeDurationHours;
    }

    /**
     * For more information about maintenance intervals, see Setting maintenance intervals.
     * 
     */
    @Import(name="maintenanceInterval", required=true)
      private final String maintenanceInterval;

    public String getMaintenanceInterval() {
        return this.maintenanceInterval;
    }

    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    @Import(name="minNodeCpus", required=true)
      private final Integer minNodeCpus;

    public Integer getMinNodeCpus() {
        return this.minNodeCpus;
    }

    /**
     * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
     * 
     */
    @Import(name="nodeAffinities", required=true)
      private final List<SchedulingNodeAffinityResponse> nodeAffinities;

    public List<SchedulingNodeAffinityResponse> getNodeAffinities() {
        return this.nodeAffinities;
    }

    /**
     * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM availability policies.
     * 
     */
    @Import(name="onHostMaintenance", required=true)
      private final String onHostMaintenance;

    public String getOnHostMaintenance() {
        return this.onHostMaintenance;
    }

    /**
     * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
     * 
     */
    @Import(name="preemptible", required=true)
      private final Boolean preemptible;

    public Boolean getPreemptible() {
        return this.preemptible;
    }

    /**
     * Specifies the provisioning model of the instance.
     * 
     */
    @Import(name="provisioningModel", required=true)
      private final String provisioningModel;

    public String getProvisioningModel() {
        return this.provisioningModel;
    }

    public SchedulingResponse(
        Boolean automaticRestart,
        Integer hostErrorTimeoutSeconds,
        String instanceTerminationAction,
        String locationHint,
        Integer maintenanceFreezeDurationHours,
        String maintenanceInterval,
        Integer minNodeCpus,
        List<SchedulingNodeAffinityResponse> nodeAffinities,
        String onHostMaintenance,
        Boolean preemptible,
        String provisioningModel) {
        this.automaticRestart = Objects.requireNonNull(automaticRestart, "expected parameter 'automaticRestart' to be non-null");
        this.hostErrorTimeoutSeconds = Objects.requireNonNull(hostErrorTimeoutSeconds, "expected parameter 'hostErrorTimeoutSeconds' to be non-null");
        this.instanceTerminationAction = Objects.requireNonNull(instanceTerminationAction, "expected parameter 'instanceTerminationAction' to be non-null");
        this.locationHint = Objects.requireNonNull(locationHint, "expected parameter 'locationHint' to be non-null");
        this.maintenanceFreezeDurationHours = Objects.requireNonNull(maintenanceFreezeDurationHours, "expected parameter 'maintenanceFreezeDurationHours' to be non-null");
        this.maintenanceInterval = Objects.requireNonNull(maintenanceInterval, "expected parameter 'maintenanceInterval' to be non-null");
        this.minNodeCpus = Objects.requireNonNull(minNodeCpus, "expected parameter 'minNodeCpus' to be non-null");
        this.nodeAffinities = Objects.requireNonNull(nodeAffinities, "expected parameter 'nodeAffinities' to be non-null");
        this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance, "expected parameter 'onHostMaintenance' to be non-null");
        this.preemptible = Objects.requireNonNull(preemptible, "expected parameter 'preemptible' to be non-null");
        this.provisioningModel = Objects.requireNonNull(provisioningModel, "expected parameter 'provisioningModel' to be non-null");
    }

    private SchedulingResponse() {
        this.automaticRestart = null;
        this.hostErrorTimeoutSeconds = null;
        this.instanceTerminationAction = null;
        this.locationHint = null;
        this.maintenanceFreezeDurationHours = null;
        this.maintenanceInterval = null;
        this.minNodeCpus = null;
        this.nodeAffinities = List.of();
        this.onHostMaintenance = null;
        this.preemptible = null;
        this.provisioningModel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean automaticRestart;
        private Integer hostErrorTimeoutSeconds;
        private String instanceTerminationAction;
        private String locationHint;
        private Integer maintenanceFreezeDurationHours;
        private String maintenanceInterval;
        private Integer minNodeCpus;
        private List<SchedulingNodeAffinityResponse> nodeAffinities;
        private String onHostMaintenance;
        private Boolean preemptible;
        private String provisioningModel;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.hostErrorTimeoutSeconds = defaults.hostErrorTimeoutSeconds;
    	      this.instanceTerminationAction = defaults.instanceTerminationAction;
    	      this.locationHint = defaults.locationHint;
    	      this.maintenanceFreezeDurationHours = defaults.maintenanceFreezeDurationHours;
    	      this.maintenanceInterval = defaults.maintenanceInterval;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
        }

        public Builder automaticRestart(Boolean automaticRestart) {
            this.automaticRestart = Objects.requireNonNull(automaticRestart);
            return this;
        }
        public Builder hostErrorTimeoutSeconds(Integer hostErrorTimeoutSeconds) {
            this.hostErrorTimeoutSeconds = Objects.requireNonNull(hostErrorTimeoutSeconds);
            return this;
        }
        public Builder instanceTerminationAction(String instanceTerminationAction) {
            this.instanceTerminationAction = Objects.requireNonNull(instanceTerminationAction);
            return this;
        }
        public Builder locationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }
        public Builder maintenanceFreezeDurationHours(Integer maintenanceFreezeDurationHours) {
            this.maintenanceFreezeDurationHours = Objects.requireNonNull(maintenanceFreezeDurationHours);
            return this;
        }
        public Builder maintenanceInterval(String maintenanceInterval) {
            this.maintenanceInterval = Objects.requireNonNull(maintenanceInterval);
            return this;
        }
        public Builder minNodeCpus(Integer minNodeCpus) {
            this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
            return this;
        }
        public Builder nodeAffinities(List<SchedulingNodeAffinityResponse> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(SchedulingNodeAffinityResponse... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public Builder onHostMaintenance(String onHostMaintenance) {
            this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
            return this;
        }
        public Builder preemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }
        public Builder provisioningModel(String provisioningModel) {
            this.provisioningModel = Objects.requireNonNull(provisioningModel);
            return this;
        }        public SchedulingResponse build() {
            return new SchedulingResponse(automaticRestart, hostErrorTimeoutSeconds, instanceTerminationAction, locationHint, maintenanceFreezeDurationHours, maintenanceInterval, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible, provisioningModel);
        }
    }
}
