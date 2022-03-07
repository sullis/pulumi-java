// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PersistentVolumeStatus is the current status of a persistent volume.
 * 
 */
public final class PersistentVolumeStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeStatusArgs Empty = new PersistentVolumeStatusArgs();

    /**
     * A human-readable message indicating details about why the volume is in this state.
     * 
     */
    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
     * 
     * Possible enum values:
     *  - `"Available"` used for PersistentVolumes that are not yet bound Available volumes are held by the binder and matched to PersistentVolumeClaims
     *  - `"Bound"` used for PersistentVolumes that are bound
     *  - `"Failed"` used for PersistentVolumes that failed to be correctly recycled or deleted after being released from a claim
     *  - `"Pending"` used for PersistentVolumes that are not available
     *  - `"Released"` used for PersistentVolumes where the bound PersistentVolumeClaim was deleted released volumes must be recycled before becoming available again this phase is used by the persistent volume claim binder to signal to another process to reclaim the resource
     * 
     */
    @InputImport(name="phase")
      private final @Nullable Input<String> phase;

    public Input<String> getPhase() {
        return this.phase == null ? Input.empty() : this.phase;
    }

    /**
     * Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
     * 
     */
    @InputImport(name="reason")
      private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    public PersistentVolumeStatusArgs(
        @Nullable Input<String> message,
        @Nullable Input<String> phase,
        @Nullable Input<String> reason) {
        this.message = message;
        this.phase = phase;
        this.reason = reason;
    }

    private PersistentVolumeStatusArgs() {
        this.message = Input.empty();
        this.phase = Input.empty();
        this.reason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> message;
        private @Nullable Input<String> phase;
        private @Nullable Input<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistentVolumeStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.phase = defaults.phase;
    	      this.reason = defaults.reason;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
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

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }
        public PersistentVolumeStatusArgs build() {
            return new PersistentVolumeStatusArgs(message, phase, reason);
        }
    }
}