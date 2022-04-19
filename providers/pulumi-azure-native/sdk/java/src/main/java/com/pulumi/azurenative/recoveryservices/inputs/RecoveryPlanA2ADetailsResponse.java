// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Recovery plan A2A specific details.
 * 
 */
public final class RecoveryPlanA2ADetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final RecoveryPlanA2ADetailsResponse Empty = new RecoveryPlanA2ADetailsResponse();

    /**
     * Gets the Instance type.
     * Expected value is 'A2A'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    /**
     * The primary zone.
     * 
     */
    @Import(name="primaryZone")
      private final @Nullable String primaryZone;

    public Optional<String> primaryZone() {
        return this.primaryZone == null ? Optional.empty() : Optional.ofNullable(this.primaryZone);
    }

    /**
     * The recovery zone.
     * 
     */
    @Import(name="recoveryZone")
      private final @Nullable String recoveryZone;

    public Optional<String> recoveryZone() {
        return this.recoveryZone == null ? Optional.empty() : Optional.ofNullable(this.recoveryZone);
    }

    public RecoveryPlanA2ADetailsResponse(
        String instanceType,
        @Nullable String primaryZone,
        @Nullable String recoveryZone) {
        this.instanceType = Codegen.stringProp("instanceType").arg(instanceType).require();
        this.primaryZone = primaryZone;
        this.recoveryZone = recoveryZone;
    }

    private RecoveryPlanA2ADetailsResponse() {
        this.instanceType = null;
        this.primaryZone = null;
        this.recoveryZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanA2ADetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;
        private @Nullable String primaryZone;
        private @Nullable String recoveryZone;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanA2ADetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.primaryZone = defaults.primaryZone;
    	      this.recoveryZone = defaults.recoveryZone;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder primaryZone(@Nullable String primaryZone) {
            this.primaryZone = primaryZone;
            return this;
        }
        public Builder recoveryZone(@Nullable String recoveryZone) {
            this.recoveryZone = recoveryZone;
            return this;
        }        public RecoveryPlanA2ADetailsResponse build() {
            return new RecoveryPlanA2ADetailsResponse(instanceType, primaryZone, recoveryZone);
        }
    }
}
