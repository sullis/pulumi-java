// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.enums.DistributionConfigurationTargetContainerRepositoryService;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The destination repository for the container image.
 * 
 */
public final class DistributionConfigurationTargetContainerRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationTargetContainerRepositoryArgs Empty = new DistributionConfigurationTargetContainerRepositoryArgs();

    /**
     * The repository name of target container repository.
     * 
     */
    @InputImport(name="repositoryName")
    private final @Nullable Input<String> repositoryName;

    public Input<String> getRepositoryName() {
        return this.repositoryName == null ? Input.empty() : this.repositoryName;
    }

    /**
     * The service of target container repository.
     * 
     */
    @InputImport(name="service")
    private final @Nullable Input<DistributionConfigurationTargetContainerRepositoryService> service;

    public Input<DistributionConfigurationTargetContainerRepositoryService> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public DistributionConfigurationTargetContainerRepositoryArgs(
        @Nullable Input<String> repositoryName,
        @Nullable Input<DistributionConfigurationTargetContainerRepositoryService> service) {
        this.repositoryName = repositoryName;
        this.service = service;
    }

    private DistributionConfigurationTargetContainerRepositoryArgs() {
        this.repositoryName = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationTargetContainerRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> repositoryName;
        private @Nullable Input<DistributionConfigurationTargetContainerRepositoryService> service;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationTargetContainerRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
    	      this.service = defaults.service;
        }

        public Builder setRepositoryName(@Nullable Input<String> repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder setRepositoryName(@Nullable String repositoryName) {
            this.repositoryName = Input.ofNullable(repositoryName);
            return this;
        }

        public Builder setService(@Nullable Input<DistributionConfigurationTargetContainerRepositoryService> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable DistributionConfigurationTargetContainerRepositoryService service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public DistributionConfigurationTargetContainerRepositoryArgs build() {
            return new DistributionConfigurationTargetContainerRepositoryArgs(repositoryName, service);
        }
    }
}
