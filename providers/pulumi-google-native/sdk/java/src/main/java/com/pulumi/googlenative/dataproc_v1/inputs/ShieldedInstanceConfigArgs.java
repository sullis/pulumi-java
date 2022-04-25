// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Shielded Instance Config for clusters using Compute Engine Shielded VMs (https://cloud.google.com/security/shielded-cloud/shielded-vm).
 * 
 */
public final class ShieldedInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShieldedInstanceConfigArgs Empty = new ShieldedInstanceConfigArgs();

    /**
     * Optional. Defines whether instances have integrity monitoring enabled.
     * 
     */
    @Import(name="enableIntegrityMonitoring")
    private @Nullable Output<Boolean> enableIntegrityMonitoring;

    /**
     * @return Optional. Defines whether instances have integrity monitoring enabled.
     * 
     */
    public Optional<Output<Boolean>> enableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }

    /**
     * Optional. Defines whether instances have Secure Boot enabled.
     * 
     */
    @Import(name="enableSecureBoot")
    private @Nullable Output<Boolean> enableSecureBoot;

    /**
     * @return Optional. Defines whether instances have Secure Boot enabled.
     * 
     */
    public Optional<Output<Boolean>> enableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }

    /**
     * Optional. Defines whether instances have the vTPM enabled.
     * 
     */
    @Import(name="enableVtpm")
    private @Nullable Output<Boolean> enableVtpm;

    /**
     * @return Optional. Defines whether instances have the vTPM enabled.
     * 
     */
    public Optional<Output<Boolean>> enableVtpm() {
        return Optional.ofNullable(this.enableVtpm);
    }

    private ShieldedInstanceConfigArgs() {}

    private ShieldedInstanceConfigArgs(ShieldedInstanceConfigArgs $) {
        this.enableIntegrityMonitoring = $.enableIntegrityMonitoring;
        this.enableSecureBoot = $.enableSecureBoot;
        this.enableVtpm = $.enableVtpm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShieldedInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShieldedInstanceConfigArgs $;

        public Builder() {
            $ = new ShieldedInstanceConfigArgs();
        }

        public Builder(ShieldedInstanceConfigArgs defaults) {
            $ = new ShieldedInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableIntegrityMonitoring Optional. Defines whether instances have integrity monitoring enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableIntegrityMonitoring(@Nullable Output<Boolean> enableIntegrityMonitoring) {
            $.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        /**
         * @param enableIntegrityMonitoring Optional. Defines whether instances have integrity monitoring enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            return enableIntegrityMonitoring(Output.of(enableIntegrityMonitoring));
        }

        /**
         * @param enableSecureBoot Optional. Defines whether instances have Secure Boot enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableSecureBoot(@Nullable Output<Boolean> enableSecureBoot) {
            $.enableSecureBoot = enableSecureBoot;
            return this;
        }

        /**
         * @param enableSecureBoot Optional. Defines whether instances have Secure Boot enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            return enableSecureBoot(Output.of(enableSecureBoot));
        }

        /**
         * @param enableVtpm Optional. Defines whether instances have the vTPM enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableVtpm(@Nullable Output<Boolean> enableVtpm) {
            $.enableVtpm = enableVtpm;
            return this;
        }

        /**
         * @param enableVtpm Optional. Defines whether instances have the vTPM enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableVtpm(Boolean enableVtpm) {
            return enableVtpm(Output.of(enableVtpm));
        }

        public ShieldedInstanceConfigArgs build() {
            return $;
        }
    }

}
