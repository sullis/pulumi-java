// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNodeConfigWorkloadMetadataConfig {
    private final String mode;

    @OutputCustomType.Constructor({"mode"})
    private GetClusterNodeConfigWorkloadMetadataConfig(String mode) {
        this.mode = Objects.requireNonNull(mode);
    }

    public String getMode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigWorkloadMetadataConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodeConfigWorkloadMetadataConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public GetClusterNodeConfigWorkloadMetadataConfig build() {
            return new GetClusterNodeConfigWorkloadMetadataConfig(mode);
        }
    }
}