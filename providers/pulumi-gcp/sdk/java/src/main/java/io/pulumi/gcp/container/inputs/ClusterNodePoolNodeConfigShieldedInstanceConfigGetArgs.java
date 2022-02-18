// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs Empty = new ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs();

    /**
     * Defines if the instance has integrity monitoring enabled.
     * 
     */
    @InputImport(name="enableIntegrityMonitoring")
    private final @Nullable Input<Boolean> enableIntegrityMonitoring;

    public Input<Boolean> getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring == null ? Input.empty() : this.enableIntegrityMonitoring;
    }

    /**
     * Defines if the instance has Secure Boot enabled.
     * 
     */
    @InputImport(name="enableSecureBoot")
    private final @Nullable Input<Boolean> enableSecureBoot;

    public Input<Boolean> getEnableSecureBoot() {
        return this.enableSecureBoot == null ? Input.empty() : this.enableSecureBoot;
    }

    public ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs(
        @Nullable Input<Boolean> enableIntegrityMonitoring,
        @Nullable Input<Boolean> enableSecureBoot) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
    }

    private ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs() {
        this.enableIntegrityMonitoring = Input.empty();
        this.enableSecureBoot = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableIntegrityMonitoring;
        private @Nullable Input<Boolean> enableSecureBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
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

        public ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs build() {
            return new ClusterNodePoolNodeConfigShieldedInstanceConfigGetArgs(enableIntegrityMonitoring, enableSecureBoot);
        }
    }
}
