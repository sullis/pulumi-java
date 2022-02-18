// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceViewStatusResponse {
    /**
     * The status code.
     * 
     */
    private final @Nullable String code;
    /**
     * The short localizable label for the status.
     * 
     */
    private final @Nullable String displayStatus;
    /**
     * The level code.
     * 
     */
    private final @Nullable String level;
    /**
     * The detailed status message, including for alerts and error messages.
     * 
     */
    private final @Nullable String message;
    /**
     * The time of the status.
     * 
     */
    private final @Nullable String time;

    @OutputCustomType.Constructor({"code","displayStatus","level","message","time"})
    private InstanceViewStatusResponse(
        @Nullable String code,
        @Nullable String displayStatus,
        @Nullable String level,
        @Nullable String message,
        @Nullable String time) {
        this.code = code;
        this.displayStatus = displayStatus;
        this.level = level;
        this.message = message;
        this.time = time;
    }

    /**
     * The status code.
     * 
     */
    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    /**
     * The short localizable label for the status.
     * 
     */
    public Optional<String> getDisplayStatus() {
        return Optional.ofNullable(this.displayStatus);
    }
    /**
     * The level code.
     * 
     */
    public Optional<String> getLevel() {
        return Optional.ofNullable(this.level);
    }
    /**
     * The detailed status message, including for alerts and error messages.
     * 
     */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * The time of the status.
     * 
     */
    public Optional<String> getTime() {
        return Optional.ofNullable(this.time);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceViewStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String displayStatus;
        private @Nullable String level;
        private @Nullable String message;
        private @Nullable String time;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceViewStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayStatus = defaults.displayStatus;
    	      this.level = defaults.level;
    	      this.message = defaults.message;
    	      this.time = defaults.time;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setDisplayStatus(@Nullable String displayStatus) {
            this.displayStatus = displayStatus;
            return this;
        }

        public Builder setLevel(@Nullable String level) {
            this.level = level;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setTime(@Nullable String time) {
            this.time = time;
            return this;
        }

        public InstanceViewStatusResponse build() {
            return new InstanceViewStatusResponse(code, displayStatus, level, message, time);
        }
    }
}
