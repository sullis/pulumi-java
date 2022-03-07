// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Autopilot is the configuration for Autopilot settings on the cluster.
 * 
 */
public final class AutopilotResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutopilotResponse Empty = new AutopilotResponse();

    /**
     * Enable Autopilot
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public AutopilotResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private AutopilotResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutopilotResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(AutopilotResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public AutopilotResponse build() {
            return new AutopilotResponse(enabled);
        }
    }
}