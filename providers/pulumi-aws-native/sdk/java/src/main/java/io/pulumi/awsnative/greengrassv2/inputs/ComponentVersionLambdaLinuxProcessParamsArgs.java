// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.inputs;

import io.pulumi.awsnative.greengrassv2.enums.ComponentVersionLambdaLinuxProcessParamsIsolationMode;
import io.pulumi.awsnative.greengrassv2.inputs.ComponentVersionLambdaContainerParamsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentVersionLambdaLinuxProcessParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentVersionLambdaLinuxProcessParamsArgs Empty = new ComponentVersionLambdaLinuxProcessParamsArgs();

    @InputImport(name="containerParams")
    private final @Nullable Input<ComponentVersionLambdaContainerParamsArgs> containerParams;

    public Input<ComponentVersionLambdaContainerParamsArgs> getContainerParams() {
        return this.containerParams == null ? Input.empty() : this.containerParams;
    }

    @InputImport(name="isolationMode")
    private final @Nullable Input<ComponentVersionLambdaLinuxProcessParamsIsolationMode> isolationMode;

    public Input<ComponentVersionLambdaLinuxProcessParamsIsolationMode> getIsolationMode() {
        return this.isolationMode == null ? Input.empty() : this.isolationMode;
    }

    public ComponentVersionLambdaLinuxProcessParamsArgs(
        @Nullable Input<ComponentVersionLambdaContainerParamsArgs> containerParams,
        @Nullable Input<ComponentVersionLambdaLinuxProcessParamsIsolationMode> isolationMode) {
        this.containerParams = containerParams;
        this.isolationMode = isolationMode;
    }

    private ComponentVersionLambdaLinuxProcessParamsArgs() {
        this.containerParams = Input.empty();
        this.isolationMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionLambdaLinuxProcessParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ComponentVersionLambdaContainerParamsArgs> containerParams;
        private @Nullable Input<ComponentVersionLambdaLinuxProcessParamsIsolationMode> isolationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionLambdaLinuxProcessParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerParams = defaults.containerParams;
    	      this.isolationMode = defaults.isolationMode;
        }

        public Builder setContainerParams(@Nullable Input<ComponentVersionLambdaContainerParamsArgs> containerParams) {
            this.containerParams = containerParams;
            return this;
        }

        public Builder setContainerParams(@Nullable ComponentVersionLambdaContainerParamsArgs containerParams) {
            this.containerParams = Input.ofNullable(containerParams);
            return this;
        }

        public Builder setIsolationMode(@Nullable Input<ComponentVersionLambdaLinuxProcessParamsIsolationMode> isolationMode) {
            this.isolationMode = isolationMode;
            return this;
        }

        public Builder setIsolationMode(@Nullable ComponentVersionLambdaLinuxProcessParamsIsolationMode isolationMode) {
            this.isolationMode = Input.ofNullable(isolationMode);
            return this;
        }

        public ComponentVersionLambdaLinuxProcessParamsArgs build() {
            return new ComponentVersionLambdaLinuxProcessParamsArgs(containerParams, isolationMode);
        }
    }
}
