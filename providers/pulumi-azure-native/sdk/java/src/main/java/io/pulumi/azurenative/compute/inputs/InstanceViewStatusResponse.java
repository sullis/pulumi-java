// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Instance view status.
 * 
 */
public final class InstanceViewStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceViewStatusResponse Empty = new InstanceViewStatusResponse();

    /**
     * The status code.
     * 
     */
    @InputImport(name="code")
    private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * The short localizable label for the status.
     * 
     */
    @InputImport(name="displayStatus")
    private final @Nullable String displayStatus;

    public Optional<String> getDisplayStatus() {
        return this.displayStatus == null ? Optional.empty() : Optional.ofNullable(this.displayStatus);
    }

    /**
     * The level code.
     * 
     */
    @InputImport(name="level")
    private final @Nullable String level;

    public Optional<String> getLevel() {
        return this.level == null ? Optional.empty() : Optional.ofNullable(this.level);
    }

    /**
     * The detailed status message, including for alerts and error messages.
     * 
     */
    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * The time of the status.
     * 
     */
    @InputImport(name="time")
    private final @Nullable String time;

    public Optional<String> getTime() {
        return this.time == null ? Optional.empty() : Optional.ofNullable(this.time);
    }

    public InstanceViewStatusResponse(
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

    private InstanceViewStatusResponse() {
        this.code = null;
        this.displayStatus = null;
        this.level = null;
        this.message = null;
        this.time = null;
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
