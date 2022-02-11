// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigArgs;
import io.pulumi.awsnative.sagemaker.inputs.AppImageConfigTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppImageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigArgs Empty = new AppImageConfigArgs();

    @InputImport(name="appImageConfigName")
    private final @Nullable Input<String> appImageConfigName;

    public Input<String> getAppImageConfigName() {
        return this.appImageConfigName == null ? Input.empty() : this.appImageConfigName;
    }

    @InputImport(name="kernelGatewayImageConfig")
    private final @Nullable Input<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig;

    public Input<AppImageConfigKernelGatewayImageConfigArgs> getKernelGatewayImageConfig() {
        return this.kernelGatewayImageConfig == null ? Input.empty() : this.kernelGatewayImageConfig;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<AppImageConfigTagArgs>> tags;

    public Input<List<AppImageConfigTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AppImageConfigArgs(
        @Nullable Input<String> appImageConfigName,
        @Nullable Input<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig,
        @Nullable Input<List<AppImageConfigTagArgs>> tags) {
        this.appImageConfigName = appImageConfigName;
        this.kernelGatewayImageConfig = kernelGatewayImageConfig;
        this.tags = tags;
    }

    private AppImageConfigArgs() {
        this.appImageConfigName = Input.empty();
        this.kernelGatewayImageConfig = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appImageConfigName;
        private @Nullable Input<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig;
        private @Nullable Input<List<AppImageConfigTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appImageConfigName = defaults.appImageConfigName;
    	      this.kernelGatewayImageConfig = defaults.kernelGatewayImageConfig;
    	      this.tags = defaults.tags;
        }

        public Builder setAppImageConfigName(@Nullable Input<String> appImageConfigName) {
            this.appImageConfigName = appImageConfigName;
            return this;
        }

        public Builder setAppImageConfigName(@Nullable String appImageConfigName) {
            this.appImageConfigName = Input.ofNullable(appImageConfigName);
            return this;
        }

        public Builder setKernelGatewayImageConfig(@Nullable Input<AppImageConfigKernelGatewayImageConfigArgs> kernelGatewayImageConfig) {
            this.kernelGatewayImageConfig = kernelGatewayImageConfig;
            return this;
        }

        public Builder setKernelGatewayImageConfig(@Nullable AppImageConfigKernelGatewayImageConfigArgs kernelGatewayImageConfig) {
            this.kernelGatewayImageConfig = Input.ofNullable(kernelGatewayImageConfig);
            return this;
        }

        public Builder setTags(@Nullable Input<List<AppImageConfigTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<AppImageConfigTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public AppImageConfigArgs build() {
            return new AppImageConfigArgs(appImageConfigName, kernelGatewayImageConfig, tags);
        }
    }
}
