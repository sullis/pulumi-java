// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Instance view status.
 * 
 */
public final class MachineExtensionInstanceViewResponseStatus extends io.pulumi.resources.InvokeArgs {

    public static final MachineExtensionInstanceViewResponseStatus Empty = new MachineExtensionInstanceViewResponseStatus();

    /**
     * The status code.
     * 
     */
    @InputImport(name="code", required=true)
      private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * The short localizable label for the status.
     * 
     */
    @InputImport(name="displayStatus", required=true)
      private final String displayStatus;

    public String getDisplayStatus() {
        return this.displayStatus;
    }

    /**
     * The level code.
     * 
     */
    @InputImport(name="level", required=true)
      private final String level;

    public String getLevel() {
        return this.level;
    }

    /**
     * The detailed status message, including for alerts and error messages.
     * 
     */
    @InputImport(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * The time of the status.
     * 
     */
    @InputImport(name="time", required=true)
      private final String time;

    public String getTime() {
        return this.time;
    }

    public MachineExtensionInstanceViewResponseStatus(
        String code,
        String displayStatus,
        String level,
        String message,
        String time) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.displayStatus = Objects.requireNonNull(displayStatus, "expected parameter 'displayStatus' to be non-null");
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.time = Objects.requireNonNull(time, "expected parameter 'time' to be non-null");
    }

    private MachineExtensionInstanceViewResponseStatus() {
        this.code = null;
        this.displayStatus = null;
        this.level = null;
        this.message = null;
        this.time = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineExtensionInstanceViewResponseStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String displayStatus;
        private String level;
        private String message;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineExtensionInstanceViewResponseStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayStatus = defaults.displayStatus;
    	      this.level = defaults.level;
    	      this.message = defaults.message;
    	      this.time = defaults.time;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDisplayStatus(String displayStatus) {
            this.displayStatus = Objects.requireNonNull(displayStatus);
            return this;
        }

        public Builder setLevel(String level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setTime(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }
        public MachineExtensionInstanceViewResponseStatus build() {
            return new MachineExtensionInstanceViewResponseStatus(code, displayStatus, level, message, time);
        }
    }
}