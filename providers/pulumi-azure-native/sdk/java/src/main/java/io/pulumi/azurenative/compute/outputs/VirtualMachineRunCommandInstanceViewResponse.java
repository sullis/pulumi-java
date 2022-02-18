// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineRunCommandInstanceViewResponse {
    /**
     * Script end time.
     * 
     */
    private final @Nullable String endTime;
    /**
     * Script error stream.
     * 
     */
    private final @Nullable String error;
    /**
     * Communicate script configuration errors or execution messages.
     * 
     */
    private final @Nullable String executionMessage;
    /**
     * Script execution status.
     * 
     */
    private final @Nullable String executionState;
    /**
     * Exit code returned from script execution.
     * 
     */
    private final @Nullable Integer exitCode;
    /**
     * Script output stream.
     * 
     */
    private final @Nullable String output;
    /**
     * Script start time.
     * 
     */
    private final @Nullable String startTime;
    /**
     * The resource status information.
     * 
     */
    private final @Nullable List<InstanceViewStatusResponse> statuses;

    @OutputCustomType.Constructor({"endTime","error","executionMessage","executionState","exitCode","output","startTime","statuses"})
    private VirtualMachineRunCommandInstanceViewResponse(
        @Nullable String endTime,
        @Nullable String error,
        @Nullable String executionMessage,
        @Nullable String executionState,
        @Nullable Integer exitCode,
        @Nullable String output,
        @Nullable String startTime,
        @Nullable List<InstanceViewStatusResponse> statuses) {
        this.endTime = endTime;
        this.error = error;
        this.executionMessage = executionMessage;
        this.executionState = executionState;
        this.exitCode = exitCode;
        this.output = output;
        this.startTime = startTime;
        this.statuses = statuses;
    }

    /**
     * Script end time.
     * 
     */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * Script error stream.
     * 
     */
    public Optional<String> getError() {
        return Optional.ofNullable(this.error);
    }
    /**
     * Communicate script configuration errors or execution messages.
     * 
     */
    public Optional<String> getExecutionMessage() {
        return Optional.ofNullable(this.executionMessage);
    }
    /**
     * Script execution status.
     * 
     */
    public Optional<String> getExecutionState() {
        return Optional.ofNullable(this.executionState);
    }
    /**
     * Exit code returned from script execution.
     * 
     */
    public Optional<Integer> getExitCode() {
        return Optional.ofNullable(this.exitCode);
    }
    /**
     * Script output stream.
     * 
     */
    public Optional<String> getOutput() {
        return Optional.ofNullable(this.output);
    }
    /**
     * Script start time.
     * 
     */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * The resource status information.
     * 
     */
    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineRunCommandInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endTime;
        private @Nullable String error;
        private @Nullable String executionMessage;
        private @Nullable String executionState;
        private @Nullable Integer exitCode;
        private @Nullable String output;
        private @Nullable String startTime;
        private @Nullable List<InstanceViewStatusResponse> statuses;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineRunCommandInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.executionMessage = defaults.executionMessage;
    	      this.executionState = defaults.executionState;
    	      this.exitCode = defaults.exitCode;
    	      this.output = defaults.output;
    	      this.startTime = defaults.startTime;
    	      this.statuses = defaults.statuses;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setError(@Nullable String error) {
            this.error = error;
            return this;
        }

        public Builder setExecutionMessage(@Nullable String executionMessage) {
            this.executionMessage = executionMessage;
            return this;
        }

        public Builder setExecutionState(@Nullable String executionState) {
            this.executionState = executionState;
            return this;
        }

        public Builder setExitCode(@Nullable Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }

        public Builder setOutput(@Nullable String output) {
            this.output = output;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStatuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }

        public VirtualMachineRunCommandInstanceViewResponse build() {
            return new VirtualMachineRunCommandInstanceViewResponse(endTime, error, executionMessage, executionState, exitCode, output, startTime, statuses);
        }
    }
}
