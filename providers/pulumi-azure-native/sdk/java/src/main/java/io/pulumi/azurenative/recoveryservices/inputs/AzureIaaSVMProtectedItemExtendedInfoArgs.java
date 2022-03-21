// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional information on Azure IaaS VM specific backup item.
 * 
 */
public final class AzureIaaSVMProtectedItemExtendedInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureIaaSVMProtectedItemExtendedInfoArgs Empty = new AzureIaaSVMProtectedItemExtendedInfoArgs();

    /**
     * The oldest backup copy available for this backup item.
     * 
     */
    @Import(name="oldestRecoveryPoint")
      private final @Nullable Output<String> oldestRecoveryPoint;

    public Output<String> getOldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Output.empty() : this.oldestRecoveryPoint;
    }

    /**
     * Specifies if backup policy associated with the backup item is inconsistent.
     * 
     */
    @Import(name="policyInconsistent")
      private final @Nullable Output<Boolean> policyInconsistent;

    public Output<Boolean> getPolicyInconsistent() {
        return this.policyInconsistent == null ? Output.empty() : this.policyInconsistent;
    }

    /**
     * Number of backup copies available for this backup item.
     * 
     */
    @Import(name="recoveryPointCount")
      private final @Nullable Output<Integer> recoveryPointCount;

    public Output<Integer> getRecoveryPointCount() {
        return this.recoveryPointCount == null ? Output.empty() : this.recoveryPointCount;
    }

    public AzureIaaSVMProtectedItemExtendedInfoArgs(
        @Nullable Output<String> oldestRecoveryPoint,
        @Nullable Output<Boolean> policyInconsistent,
        @Nullable Output<Integer> recoveryPointCount) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.policyInconsistent = policyInconsistent;
        this.recoveryPointCount = recoveryPointCount;
    }

    private AzureIaaSVMProtectedItemExtendedInfoArgs() {
        this.oldestRecoveryPoint = Output.empty();
        this.policyInconsistent = Output.empty();
        this.recoveryPointCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSVMProtectedItemExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> oldestRecoveryPoint;
        private @Nullable Output<Boolean> policyInconsistent;
        private @Nullable Output<Integer> recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSVMProtectedItemExtendedInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.policyInconsistent = defaults.policyInconsistent;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder oldestRecoveryPoint(@Nullable Output<String> oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }
        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = Output.ofNullable(oldestRecoveryPoint);
            return this;
        }
        public Builder policyInconsistent(@Nullable Output<Boolean> policyInconsistent) {
            this.policyInconsistent = policyInconsistent;
            return this;
        }
        public Builder policyInconsistent(@Nullable Boolean policyInconsistent) {
            this.policyInconsistent = Output.ofNullable(policyInconsistent);
            return this;
        }
        public Builder recoveryPointCount(@Nullable Output<Integer> recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }
        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = Output.ofNullable(recoveryPointCount);
            return this;
        }        public AzureIaaSVMProtectedItemExtendedInfoArgs build() {
            return new AzureIaaSVMProtectedItemExtendedInfoArgs(oldestRecoveryPoint, policyInconsistent, recoveryPointCount);
        }
    }
}
