// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the custom settings for the virtual machine.
 * 
 */
public final class CustomProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomProfileArgs Empty = new CustomProfileArgs();

    /**
     * Path for metadata configuration.
     * 
     */
    @InputImport(name="metadataConfigurationPath")
      private final @Nullable Input<String> metadataConfigurationPath;

    public Input<String> getMetadataConfigurationPath() {
        return this.metadataConfigurationPath == null ? Input.empty() : this.metadataConfigurationPath;
    }

    public CustomProfileArgs(@Nullable Input<String> metadataConfigurationPath) {
        this.metadataConfigurationPath = metadataConfigurationPath;
    }

    private CustomProfileArgs() {
        this.metadataConfigurationPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> metadataConfigurationPath;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataConfigurationPath = defaults.metadataConfigurationPath;
        }

        public Builder setMetadataConfigurationPath(@Nullable Input<String> metadataConfigurationPath) {
            this.metadataConfigurationPath = metadataConfigurationPath;
            return this;
        }

        public Builder setMetadataConfigurationPath(@Nullable String metadataConfigurationPath) {
            this.metadataConfigurationPath = Input.ofNullable(metadataConfigurationPath);
            return this;
        }
        public CustomProfileArgs build() {
            return new CustomProfileArgs(metadataConfigurationPath);
        }
    }
}