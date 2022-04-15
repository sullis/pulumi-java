// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.AppImageConfigFileSystemConfig;
import io.pulumi.awsnative.sagemaker.outputs.AppImageConfigKernelSpec;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppImageConfigKernelGatewayImageConfig {
    /**
     * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * 
     */
    private final @Nullable AppImageConfigFileSystemConfig fileSystemConfig;
    /**
     * The specification of the Jupyter kernels in the image.
     * 
     */
    private final List<AppImageConfigKernelSpec> kernelSpecs;

    @CustomType.Constructor
    private AppImageConfigKernelGatewayImageConfig(
        @CustomType.Parameter("fileSystemConfig") @Nullable AppImageConfigFileSystemConfig fileSystemConfig,
        @CustomType.Parameter("kernelSpecs") List<AppImageConfigKernelSpec> kernelSpecs) {
        this.fileSystemConfig = fileSystemConfig;
        this.kernelSpecs = kernelSpecs;
    }

    /**
     * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * 
    */
    public Optional<AppImageConfigFileSystemConfig> fileSystemConfig() {
        return Optional.ofNullable(this.fileSystemConfig);
    }
    /**
     * The specification of the Jupyter kernels in the image.
     * 
    */
    public List<AppImageConfigKernelSpec> kernelSpecs() {
        return this.kernelSpecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AppImageConfigFileSystemConfig fileSystemConfig;
        private List<AppImageConfigKernelSpec> kernelSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemConfig = defaults.fileSystemConfig;
    	      this.kernelSpecs = defaults.kernelSpecs;
        }

        public Builder fileSystemConfig(@Nullable AppImageConfigFileSystemConfig fileSystemConfig) {
            this.fileSystemConfig = fileSystemConfig;
            return this;
        }
        public Builder kernelSpecs(List<AppImageConfigKernelSpec> kernelSpecs) {
            this.kernelSpecs = Objects.requireNonNull(kernelSpecs);
            return this;
        }
        public Builder kernelSpecs(AppImageConfigKernelSpec... kernelSpecs) {
            return kernelSpecs(List.of(kernelSpecs));
        }        public AppImageConfigKernelGatewayImageConfig build() {
            return new AppImageConfigKernelGatewayImageConfig(fileSystemConfig, kernelSpecs);
        }
    }
}
