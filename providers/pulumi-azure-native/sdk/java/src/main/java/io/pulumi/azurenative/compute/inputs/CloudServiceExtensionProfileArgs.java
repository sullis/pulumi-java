// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ExtensionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a cloud service extension profile.
 * 
 */
public final class CloudServiceExtensionProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceExtensionProfileArgs Empty = new CloudServiceExtensionProfileArgs();

    /**
     * List of extensions for the cloud service.
     * 
     */
    @Import(name="extensions")
      private final @Nullable Output<List<ExtensionArgs>> extensions;

    public Output<List<ExtensionArgs>> getExtensions() {
        return this.extensions == null ? Output.empty() : this.extensions;
    }

    public CloudServiceExtensionProfileArgs(@Nullable Output<List<ExtensionArgs>> extensions) {
        this.extensions = extensions;
    }

    private CloudServiceExtensionProfileArgs() {
        this.extensions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceExtensionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ExtensionArgs>> extensions;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceExtensionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensions = defaults.extensions;
        }

        public Builder extensions(@Nullable Output<List<ExtensionArgs>> extensions) {
            this.extensions = extensions;
            return this;
        }
        public Builder extensions(@Nullable List<ExtensionArgs> extensions) {
            this.extensions = Output.ofNullable(extensions);
            return this;
        }
        public Builder extensions(ExtensionArgs... extensions) {
            return extensions(List.of(extensions));
        }        public CloudServiceExtensionProfileArgs build() {
            return new CloudServiceExtensionProfileArgs(extensions);
        }
    }
}
