// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The protection policy of a virtual machine scale set VM.
 * 
 */
public final class VirtualMachineScaleSetVMProtectionPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetVMProtectionPolicyResponse Empty = new VirtualMachineScaleSetVMProtectionPolicyResponse();

    /**
     * Indicates that the virtual machine scale set VM shouldn't be considered for deletion during a scale-in operation.
     * 
     */
    @InputImport(name="protectFromScaleIn")
      private final @Nullable Boolean protectFromScaleIn;

    public Optional<Boolean> getProtectFromScaleIn() {
        return this.protectFromScaleIn == null ? Optional.empty() : Optional.ofNullable(this.protectFromScaleIn);
    }

    /**
     * Indicates that model updates or actions (including scale-in) initiated on the virtual machine scale set should not be applied to the virtual machine scale set VM.
     * 
     */
    @InputImport(name="protectFromScaleSetActions")
      private final @Nullable Boolean protectFromScaleSetActions;

    public Optional<Boolean> getProtectFromScaleSetActions() {
        return this.protectFromScaleSetActions == null ? Optional.empty() : Optional.ofNullable(this.protectFromScaleSetActions);
    }

    public VirtualMachineScaleSetVMProtectionPolicyResponse(
        @Nullable Boolean protectFromScaleIn,
        @Nullable Boolean protectFromScaleSetActions) {
        this.protectFromScaleIn = protectFromScaleIn;
        this.protectFromScaleSetActions = protectFromScaleSetActions;
    }

    private VirtualMachineScaleSetVMProtectionPolicyResponse() {
        this.protectFromScaleIn = null;
        this.protectFromScaleSetActions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetVMProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean protectFromScaleIn;
        private @Nullable Boolean protectFromScaleSetActions;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetVMProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protectFromScaleIn = defaults.protectFromScaleIn;
    	      this.protectFromScaleSetActions = defaults.protectFromScaleSetActions;
        }

        public Builder setProtectFromScaleIn(@Nullable Boolean protectFromScaleIn) {
            this.protectFromScaleIn = protectFromScaleIn;
            return this;
        }

        public Builder setProtectFromScaleSetActions(@Nullable Boolean protectFromScaleSetActions) {
            this.protectFromScaleSetActions = protectFromScaleSetActions;
            return this;
        }
        public VirtualMachineScaleSetVMProtectionPolicyResponse build() {
            return new VirtualMachineScaleSetVMProtectionPolicyResponse(protectFromScaleIn, protectFromScaleSetActions);
        }
    }
}