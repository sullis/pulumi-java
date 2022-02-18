// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.ContainerRegistryResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerConfigurationResponse Empty = new ContainerConfigurationResponse();

    /**
     * This is the full image reference, as would be specified to "docker pull". An image will be sourced from the default Docker registry unless the image is fully qualified with an alternative registry.
     * 
     */
    @InputImport(name="containerImageNames")
    private final @Nullable List<String> containerImageNames;

    public List<String> getContainerImageNames() {
        return this.containerImageNames == null ? List.of() : this.containerImageNames;
    }

    /**
     * If any images must be downloaded from a private registry which requires credentials, then those credentials must be provided here.
     * 
     */
    @InputImport(name="containerRegistries")
    private final @Nullable List<ContainerRegistryResponse> containerRegistries;

    public List<ContainerRegistryResponse> getContainerRegistries() {
        return this.containerRegistries == null ? List.of() : this.containerRegistries;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ContainerConfigurationResponse(
        @Nullable List<String> containerImageNames,
        @Nullable List<ContainerRegistryResponse> containerRegistries,
        String type) {
        this.containerImageNames = containerImageNames;
        this.containerRegistries = containerRegistries;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ContainerConfigurationResponse() {
        this.containerImageNames = List.of();
        this.containerRegistries = List.of();
        this.type = null;
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
