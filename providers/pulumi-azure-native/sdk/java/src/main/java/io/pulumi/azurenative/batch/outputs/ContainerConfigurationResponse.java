// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.azurenative.batch.outputs.ContainerRegistryResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerConfigurationResponse {
    /**
     * This is the full image reference, as would be specified to "docker pull". An image will be sourced from the default Docker registry unless the image is fully qualified with an alternative registry.
     * 
     */
    private final @Nullable List<String> containerImageNames;
    /**
     * If any images must be downloaded from a private registry which requires credentials, then those credentials must be provided here.
     * 
     */
    private final @Nullable List<ContainerRegistryResponse> containerRegistries;
    private final String type;

    @OutputCustomType.Constructor({"containerImageNames","containerRegistries","type"})
    private ContainerConfigurationResponse(
        @Nullable List<String> containerImageNames,
        @Nullable List<ContainerRegistryResponse> containerRegistries,
        String type) {
        this.containerImageNames = containerImageNames;
        this.containerRegistries = containerRegistries;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * This is the full image reference, as would be specified to "docker pull". An image will be sourced from the default Docker registry unless the image is fully qualified with an alternative registry.
     * 
    */
    public List<String> getContainerImageNames() {
        return this.containerImageNames == null ? List.of() : this.containerImageNames;
    }
    /**
     * If any images must be downloaded from a private registry which requires credentials, then those credentials must be provided here.
     * 
    */
    public List<ContainerRegistryResponse> getContainerRegistries() {
        return this.containerRegistries == null ? List.of() : this.containerRegistries;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> containerImageNames;
        private @Nullable List<ContainerRegistryResponse> containerRegistries;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerImageNames = defaults.containerImageNames;
    	      this.containerRegistries = defaults.containerRegistries;
    	      this.type = defaults.type;
        }

        public Builder setContainerImageNames(@Nullable List<String> containerImageNames) {
            this.containerImageNames = containerImageNames;
            return this;
        }

        public Builder setContainerRegistries(@Nullable List<ContainerRegistryResponse> containerRegistries) {
            this.containerRegistries = containerRegistries;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ContainerConfigurationResponse build() {
            return new ContainerConfigurationResponse(containerImageNames, containerRegistries, type);
        }
    }
}