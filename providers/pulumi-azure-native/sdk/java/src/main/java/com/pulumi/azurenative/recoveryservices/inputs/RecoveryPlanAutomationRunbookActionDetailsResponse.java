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
 * Recovery plan Automation runbook action details.
 * 
 */
public final class RecoveryPlanAutomationRunbookActionDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final RecoveryPlanAutomationRunbookActionDetailsResponse Empty = new RecoveryPlanAutomationRunbookActionDetailsResponse();

    /**
     * The fabric location.
     * 
     */
    @Import(name="fabricLocation", required=true)
      private final String fabricLocation;

    public String fabricLocation() {
        return this.fabricLocation;
    }

    /**
     * Gets the type of action details (see RecoveryPlanActionDetailsTypes enum for possible values).
     * Expected value is 'AutomationRunbookActionDetails'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    /**
     * The runbook ARM Id.
     * 
     */
    @Import(name="runbookId")
      private final @Nullable String runbookId;

    public Optional<String> runbookId() {
        return this.runbookId == null ? Optional.empty() : Optional.ofNullable(this.runbookId);
    }

    /**
     * The runbook timeout.
     * 
     */
    @Import(name="timeout")
      private final @Nullable String timeout;

    public Optional<String> timeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    public RecoveryPlanAutomationRunbookActionDetailsResponse(
        String fabricLocation,
        String instanceType,
        @Nullable String runbookId,
        @Nullable String timeout) {
        this.fabricLocation = Objects.requireNonNull(fabricLocation, "expected parameter 'fabricLocation' to be non-null");
        this.instanceType = Codegen.stringProp("instanceType").arg(instanceType).require();
        this.runbookId = runbookId;
        this.timeout = timeout;
    }

    private RecoveryPlanAutomationRunbookActionDetailsResponse() {
        this.fabricLocation = null;
        this.instanceType = null;
        this.runbookId = null;
        this.timeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanAutomationRunbookActionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fabricLocation;
        private String instanceType;
        private @Nullable String runbookId;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanAutomationRunbookActionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricLocation = defaults.fabricLocation;
    	      this.instanceType = defaults.instanceType;
    	      this.runbookId = defaults.runbookId;
    	      this.timeout = defaults.timeout;
        }

        public Builder fabricLocation(String fabricLocation) {
            this.fabricLocation = Objects.requireNonNull(fabricLocation);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder runbookId(@Nullable String runbookId) {
            this.runbookId = runbookId;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }        public RecoveryPlanAutomationRunbookActionDetailsResponse build() {
            return new RecoveryPlanAutomationRunbookActionDetailsResponse(fabricLocation, instanceType, runbookId, timeout);
        }
    }
}
