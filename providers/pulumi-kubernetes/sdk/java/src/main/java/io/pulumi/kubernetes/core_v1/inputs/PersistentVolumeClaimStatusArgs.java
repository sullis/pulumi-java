// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.PersistentVolumeClaimConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
 * 
 */
public final class PersistentVolumeClaimStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeClaimStatusArgs Empty = new PersistentVolumeClaimStatusArgs();

    /**
     * AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     * 
     */
    @InputImport(name="accessModes")
      private final @Nullable Input<List<String>> accessModes;

    public Input<List<String>> getAccessModes() {
        return this.accessModes == null ? Input.empty() : this.accessModes;
    }

    /**
     * The storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
     * 
     */
    @InputImport(name="allocatedResources")
      private final @Nullable Input<Map<String,String>> allocatedResources;

    public Input<Map<String,String>> getAllocatedResources() {
        return this.allocatedResources == null ? Input.empty() : this.allocatedResources;
    }

    /**
     * Represents the actual resources of the underlying volume.
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Input<Map<String,String>> capacity;

    public Input<Map<String,String>> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
     * 
     */
    @InputImport(name="conditions")
      private final @Nullable Input<List<PersistentVolumeClaimConditionArgs>> conditions;

    public Input<List<PersistentVolumeClaimConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * Phase represents the current phase of PersistentVolumeClaim.
     * 
     * Possible enum values:
     *  - `"Bound"` used for PersistentVolumeClaims that are bound
     *  - `"Lost"` used for PersistentVolumeClaims that lost their underlying PersistentVolume. The claim was bound to a PersistentVolume and this volume does not exist any longer and all data on it was lost.
     *  - `"Pending"` used for PersistentVolumeClaims that are not yet bound
     * 
     */
    @InputImport(name="phase")
      private final @Nullable Input<String> phase;

    public Input<String> getPhase() {
        return this.phase == null ? Input.empty() : this.phase;
    }

    /**
     * ResizeStatus stores status of resize operation. ResizeStatus is not set by default but when expansion is complete resizeStatus is set to empty string by resize controller or kubelet. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
     * 
     */
    @InputImport(name="resizeStatus")
      private final @Nullable Input<String> resizeStatus;

    public Input<String> getResizeStatus() {
        return this.resizeStatus == null ? Input.empty() : this.resizeStatus;
    }

    public PersistentVolumeClaimStatusArgs(
        @Nullable Input<List<String>> accessModes,
        @Nullable Input<Map<String,String>> allocatedResources,
        @Nullable Input<Map<String,String>> capacity,
        @Nullable Input<List<PersistentVolumeClaimConditionArgs>> conditions,
        @Nullable Input<String> phase,
        @Nullable Input<String> resizeStatus) {
        this.accessModes = accessModes;
        this.allocatedResources = allocatedResources;
        this.capacity = capacity;
        this.conditions = conditions;
        this.phase = phase;
        this.resizeStatus = resizeStatus;
    }

    private PersistentVolumeClaimStatusArgs() {
        this.accessModes = Input.empty();
        this.allocatedResources = Input.empty();
        this.capacity = Input.empty();
        this.conditions = Input.empty();
        this.phase = Input.empty();
        this.resizeStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeClaimStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> accessModes;
        private @Nullable Input<Map<String,String>> allocatedResources;
        private @Nullable Input<Map<String,String>> capacity;
        private @Nullable Input<List<PersistentVolumeClaimConditionArgs>> conditions;
        private @Nullable Input<String> phase;
        private @Nullable Input<String> resizeStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistentVolumeClaimStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessModes = defaults.accessModes;
    	      this.allocatedResources = defaults.allocatedResources;
    	      this.capacity = defaults.capacity;
    	      this.conditions = defaults.conditions;
    	      this.phase = defaults.phase;
    	      this.resizeStatus = defaults.resizeStatus;
        }

        public Builder setAccessModes(@Nullable Input<List<String>> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        public Builder setAccessModes(@Nullable List<String> accessModes) {
            this.accessModes = Input.ofNullable(accessModes);
            return this;
        }

        public Builder setAllocatedResources(@Nullable Input<Map<String,String>> allocatedResources) {
            this.allocatedResources = allocatedResources;
            return this;
        }

        public Builder setAllocatedResources(@Nullable Map<String,String> allocatedResources) {
            this.allocatedResources = Input.ofNullable(allocatedResources);
            return this;
        }

        public Builder setCapacity(@Nullable Input<Map<String,String>> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setCapacity(@Nullable Map<String,String> capacity) {
            this.capacity = Input.ofNullable(capacity);
            return this;
        }

        public Builder setConditions(@Nullable Input<List<PersistentVolumeClaimConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<PersistentVolumeClaimConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setPhase(@Nullable Input<String> phase) {
            this.phase = phase;
            return this;
        }

        public Builder setPhase(@Nullable String phase) {
            this.phase = Input.ofNullable(phase);
            return this;
        }

        public Builder setResizeStatus(@Nullable Input<String> resizeStatus) {
            this.resizeStatus = resizeStatus;
            return this;
        }

        public Builder setResizeStatus(@Nullable String resizeStatus) {
            this.resizeStatus = Input.ofNullable(resizeStatus);
            return this;
        }
        public PersistentVolumeClaimStatusArgs build() {
            return new PersistentVolumeClaimStatusArgs(accessModes, allocatedResources, capacity, conditions, phase, resizeStatus);
        }
    }
}