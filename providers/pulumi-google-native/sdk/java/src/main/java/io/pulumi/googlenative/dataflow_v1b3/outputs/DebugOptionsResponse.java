// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class DebugOptionsResponse {
    /**
     * When true, enables the logging of the literal hot key to the user's Cloud Logging.
     * 
     */
    private final Boolean enableHotKeyLogging;

    @OutputCustomType.Constructor({"enableHotKeyLogging"})
    private DebugOptionsResponse(Boolean enableHotKeyLogging) {
        this.enableHotKeyLogging = Objects.requireNonNull(enableHotKeyLogging);
    }

    /**
     * When true, enables the logging of the literal hot key to the user's Cloud Logging.
     * 
    */
    public Boolean getEnableHotKeyLogging() {
        return this.enableHotKeyLogging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DebugOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableHotKeyLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(DebugOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHotKeyLogging = defaults.enableHotKeyLogging;
        }

        public Builder setEnableHotKeyLogging(Boolean enableHotKeyLogging) {
            this.enableHotKeyLogging = Objects.requireNonNull(enableHotKeyLogging);
            return this;
        }
        public DebugOptionsResponse build() {
            return new DebugOptionsResponse(enableHotKeyLogging);
        }
    }
}