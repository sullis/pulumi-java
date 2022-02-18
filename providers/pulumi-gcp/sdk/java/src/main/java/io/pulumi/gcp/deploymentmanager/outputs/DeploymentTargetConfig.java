// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.deploymentmanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeploymentTargetConfig {
    /**
     * The full contents of the template that you want to import.
     * 
     */
    private final String content;

    @OutputCustomType.Constructor({"content"})
    private DeploymentTargetConfig(String content) {
        this.content = Objects.requireNonNull(content);
    }

    /**
     * The full contents of the template that you want to import.
     * 
     */
    public String getContent() {
        return this.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentTargetConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentTargetConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public DeploymentTargetConfig build() {
            return new DeploymentTargetConfig(content);
        }
    }
}
