// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterVerticalPodAutoscalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterVerticalPodAutoscalingArgs Empty = new ClusterVerticalPodAutoscalingArgs();

    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    public ClusterVerticalPodAutoscalingArgs(Input<Boolean> enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private ClusterVerticalPodAutoscalingArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterVerticalPodAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterVerticalPodAutoscalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public ClusterVerticalPodAutoscalingArgs build() {
            return new ClusterVerticalPodAutoscalingArgs(enabled);
        }
    }
}
