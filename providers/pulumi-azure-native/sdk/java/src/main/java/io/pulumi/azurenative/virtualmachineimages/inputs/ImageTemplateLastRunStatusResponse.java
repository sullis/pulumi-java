// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the latest status of running an image template
 * 
 */
public final class ImageTemplateLastRunStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageTemplateLastRunStatusResponse Empty = new ImageTemplateLastRunStatusResponse();

    /**
     * End time of the last run (UTC)
     * 
     */
    @InputImport(name="endTime")
    private final @Nullable String endTime;

    public Optional<String> getEndTime() {
        return this.endTime == null ? Optional.empty() : Optional.ofNullable(this.endTime);
    }

    /**
     * Verbose information about the last run state
     * 
     */
    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * State of the last run
     * 
     */
    @InputImport(name="runState")
    private final @Nullable String runState;

    public Optional<String> getRunState() {
        return this.runState == null ? Optional.empty() : Optional.ofNullable(this.runState);
    }

    /**
     * Sub-state of the last run
     * 
     */
    @InputImport(name="runSubState")
    private final @Nullable String runSubState;

    public Optional<String> getRunSubState() {
        return this.runSubState == null ? Optional.empty() : Optional.ofNullable(this.runSubState);
    }

    /**
     * Start time of the last run (UTC)
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    public ImageTemplateLastRunStatusResponse(
        @Nullable String endTime,
        @Nullable String message,
        @Nullable String runState,
        @Nullable String runSubState,
        @Nullable String startTime) {
        this.endTime = endTime;
        this.message = message;
        this.runState = runState;
        this.runSubState = runSubState;
        this.startTime = startTime;
    }

    private ImageTemplateLastRunStatusResponse() {
        this.endTime = null;
        this.message = null;
        this.runState = null;
        this.runSubState = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateLastRunStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endTime;
        private @Nullable String message;
        private @Nullable String runState;
        private @Nullable String runSubState;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateLastRunStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.message = defaults.message;
    	      this.runState = defaults.runState;
    	      this.runSubState = defaults.runSubState;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setRunState(@Nullable String runState) {
            this.runState = runState;
            return this;
        }

        public Builder setRunSubState(@Nullable String runSubState) {
            this.runSubState = runSubState;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public ImageTemplateLastRunStatusResponse build() {
            return new ImageTemplateLastRunStatusResponse(endTime, message, runState, runSubState, startTime);
        }
    }
}
