// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceShieldedInstanceConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceShieldedInstanceConfigGetArgs Empty = new InstanceShieldedInstanceConfigGetArgs();

    /**
     * -- Compare the most recent boot measurements to the integrity policy baseline and return a pair of pass/fail results depending on whether they match or not. Defaults to true.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    @InputImport(name="enableIntegrityMonitoring")
    private final @Nullable Input<Boolean> enableIntegrityMonitoring;

    public Input<Boolean> getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring == null ? Input.empty() : this.enableIntegrityMonitoring;
    }

    /**
     * -- Verify the digital signature of all boot components, and halt the boot process if signature verification fails. Defaults to false.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    @InputImport(name="enableSecureBoot")
    private final @Nullable Input<Boolean> enableSecureBoot;

    public Input<Boolean> getEnableSecureBoot() {
        return this.enableSecureBoot == null ? Input.empty() : this.enableSecureBoot;
    }

    /**
     * -- Use a virtualized trusted platform module, which is a specialized computer chip you can use to encrypt objects like keys and certificates. Defaults to true.
     * **Note**: `allow_stopping_for_update` must be set to true or your instance must have a `desired_status` of `TERMINATED` in order to update this field.
     * 
     */
    @InputImport(name="enableVtpm")
    private final @Nullable Input<Boolean> enableVtpm;

    public Input<Boolean> getEnableVtpm() {
        return this.enableVtpm == null ? Input.empty() : this.enableVtpm;
    }

    public InstanceShieldedInstanceConfigGetArgs(
        @Nullable Input<Boolean> enableIntegrityMonitoring,
        @Nullable Input<Boolean> enableSecureBoot,
        @Nullable Input<Boolean> enableVtpm) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
        this.enableVtpm = enableVtpm;
    }

    private InstanceShieldedInstanceConfigGetArgs() {
        this.enableIntegrityMonitoring = Input.empty();
        this.enableSecureBoot = Input.empty();
        this.enableVtpm = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceShieldedInstanceConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableIntegrityMonitoring;
        private @Nullable Input<Boolean> enableSecureBoot;
        private @Nullable Input<Boolean> enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceShieldedInstanceConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder setEnableIntegrityMonitoring(@Nullable Input<Boolean> enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        public Builder setEnableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Input.ofNullable(enableIntegrityMonitoring);
            return this;
        }

        public Builder setEnableSecureBoot(@Nullable Input<Boolean> enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }

        public Builder setEnableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = Input.ofNullable(enableSecureBoot);
            return this;
        }

        public Builder setEnableVtpm(@Nullable Input<Boolean> enableVtpm) {
            this.enableVtpm = enableVtpm;
            return this;
        }

        public Builder setEnableVtpm(@Nullable Boolean enableVtpm) {
            this.enableVtpm = Input.ofNullable(enableVtpm);
            return this;
        }

        public InstanceShieldedInstanceConfigGetArgs build() {
            return new InstanceShieldedInstanceConfigGetArgs(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
