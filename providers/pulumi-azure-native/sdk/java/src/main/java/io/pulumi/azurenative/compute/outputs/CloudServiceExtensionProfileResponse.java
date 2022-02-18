// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.ExtensionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudServiceExtensionProfileResponse {
    /**
     * List of extensions for the cloud service.
     * 
     */
    private final @Nullable List<ExtensionResponse> extensions;

    @OutputCustomType.Constructor({"extensions"})
    private CloudServiceExtensionProfileResponse(@Nullable List<ExtensionResponse> extensions) {
        this.extensions = extensions;
    }

    /**
     * List of extensions for the cloud service.
     * 
     */
    public List<ExtensionResponse> getExtensions() {
        return this.extensions == null ? List.of() : this.extensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceExtensionProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ExtensionResponse> extensions;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceExtensionProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensions = defaults.extensions;
        }

        public Builder setExtensions(@Nullable List<ExtensionResponse> extensions) {
            this.extensions = extensions;
            return this;
        }

        public CloudServiceExtensionProfileResponse build() {
            return new CloudServiceExtensionProfileResponse(extensions);
        }
    }
}
