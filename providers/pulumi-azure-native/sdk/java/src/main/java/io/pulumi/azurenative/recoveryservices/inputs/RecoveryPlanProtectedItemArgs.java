// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Recovery plan protected item.
 * 
 */
public final class RecoveryPlanProtectedItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecoveryPlanProtectedItemArgs Empty = new RecoveryPlanProtectedItemArgs();

    /**
     * The ARM Id of the recovery plan protected item.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The virtual machine Id.
     * 
     */
    @InputImport(name="virtualMachineId")
    private final @Nullable Input<String> virtualMachineId;

    public Input<String> getVirtualMachineId() {
        return this.virtualMachineId == null ? Input.empty() : this.virtualMachineId;
    }

    public RecoveryPlanProtectedItemArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> virtualMachineId) {
        this.id = id;
        this.virtualMachineId = virtualMachineId;
    }

    private RecoveryPlanProtectedItemArgs() {
        this.id = Input.empty();
        this.virtualMachineId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> virtualMachineId;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.virtualMachineId = defaults.virtualMachineId;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setVirtualMachineId(@Nullable Input<String> virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }

        public Builder setVirtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = Input.ofNullable(virtualMachineId);
            return this;
        }

        public RecoveryPlanProtectedItemArgs build() {
            return new RecoveryPlanProtectedItemArgs(id, virtualMachineId);
        }
    }
}
