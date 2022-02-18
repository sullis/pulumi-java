// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.StatusLevelTypes;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Instance view status.
 * 
 */
public final class InstanceViewStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceViewStatusArgs Empty = new InstanceViewStatusArgs();

    /**
     * The status code.
     * 
     */
    @InputImport(name="code")
    private final @Nullable Input<String> code;

    public Input<String> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * The short localizable label for the status.
     * 
     */
    @InputImport(name="displayStatus")
    private final @Nullable Input<String> displayStatus;

    public Input<String> getDisplayStatus() {
        return this.displayStatus == null ? Input.empty() : this.displayStatus;
    }

    /**
     * The level code.
     * 
     */
    @InputImport(name="level")
    private final @Nullable Input<StatusLevelTypes> level;

    public Input<StatusLevelTypes> getLevel() {
        return this.level == null ? Input.empty() : this.level;
    }

    /**
     * The detailed status message, including for alerts and error messages.
     * 
     */
    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * The time of the status.
     * 
     */
    @InputImport(name="time")
    private final @Nullable Input<String> time;

    public Input<String> getTime() {
        return this.time == null ? Input.empty() : this.time;
    }

    public InstanceViewStatusArgs(
        @Nullable Input<String> code,
        @Nullable Input<String> displayStatus,
        @Nullable Input<StatusLevelTypes> level,
        @Nullable Input<String> message,
        @Nullable Input<String> time) {
        this.code = code;
        this.displayStatus = displayStatus;
        this.level = level;
        this.message = message;
        this.time = time;
    }

    private InstanceViewStatusArgs() {
        this.code = Input.empty();
        this.displayStatus = Input.empty();
        this.level = Input.empty();
        this.message = Input.empty();
        this.time = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceViewStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> code;
        private @Nullable Input<String> displayStatus;
        private @Nullable Input<StatusLevelTypes> level;
        private @Nullable Input<String> message;
        private @Nullable Input<String> time;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceViewStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayStatus = defaults.displayStatus;
    	      this.level = defaults.level;
    	      this.message = defaults.message;
    	      this.time = defaults.time;
        }

        public Builder setCode(@Nullable Input<String> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable String code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setDisplayStatus(@Nullable Input<String> displayStatus) {
            this.displayStatus = displayStatus;
            return this;
        }

        public Builder setDisplayStatus(@Nullable String displayStatus) {
            this.displayStatus = Input.ofNullable(displayStatus);
            return this;
        }

        public Builder setLevel(@Nullable Input<StatusLevelTypes> level) {
            this.level = level;
            return this;
        }

        public Builder setLevel(@Nullable StatusLevelTypes level) {
            this.level = Input.ofNullable(level);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setTime(@Nullable Input<String> time) {
            this.time = time;
            return this;
        }

        public Builder setTime(@Nullable String time) {
            this.time = Input.ofNullable(time);
            return this;
        }

        public InstanceViewStatusArgs build() {
            return new InstanceViewStatusArgs(code, displayStatus, level, message, time);
        }
    }
}
