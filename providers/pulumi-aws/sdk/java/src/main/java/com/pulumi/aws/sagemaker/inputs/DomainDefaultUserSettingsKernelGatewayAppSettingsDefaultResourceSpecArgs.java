// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs Empty = new DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs();

    /**
     * The instance type that the image version runs on.. For valid values see [Sagemaker Instance Types](https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html).
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The instance type that the image version runs on.. For valid values see [Sagemaker Instance Types](https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html).
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * 
     */
    @Import(name="lifecycleConfigArn")
    private @Nullable Output<String> lifecycleConfigArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * 
     */
    public Optional<Output<String>> lifecycleConfigArn() {
        return Optional.ofNullable(this.lifecycleConfigArn);
    }

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    @Import(name="sagemakerImageArn")
    private @Nullable Output<String> sagemakerImageArn;

    /**
     * @return The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    public Optional<Output<String>> sagemakerImageArn() {
        return Optional.ofNullable(this.sagemakerImageArn);
    }

    /**
     * The ARN of the image version created on the instance.
     * 
     */
    @Import(name="sagemakerImageVersionArn")
    private @Nullable Output<String> sagemakerImageVersionArn;

    /**
     * @return The ARN of the image version created on the instance.
     * 
     */
    public Optional<Output<String>> sagemakerImageVersionArn() {
        return Optional.ofNullable(this.sagemakerImageVersionArn);
    }

    private DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs() {}

    private DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs(DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs $) {
        this.instanceType = $.instanceType;
        this.lifecycleConfigArn = $.lifecycleConfigArn;
        this.sagemakerImageArn = $.sagemakerImageArn;
        this.sagemakerImageVersionArn = $.sagemakerImageVersionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs $;

        public Builder() {
            $ = new DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs();
        }

        public Builder(DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs defaults) {
            $ = new DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceType The instance type that the image version runs on.. For valid values see [Sagemaker Instance Types](https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html).
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The instance type that the image version runs on.. For valid values see [Sagemaker Instance Types](https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html).
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param lifecycleConfigArn The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleConfigArn(@Nullable Output<String> lifecycleConfigArn) {
            $.lifecycleConfigArn = lifecycleConfigArn;
            return this;
        }

        /**
         * @param lifecycleConfigArn The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleConfigArn(String lifecycleConfigArn) {
            return lifecycleConfigArn(Output.of(lifecycleConfigArn));
        }

        /**
         * @param sagemakerImageArn The ARN of the SageMaker image that the image version belongs to.
         * 
         * @return builder
         * 
         */
        public Builder sagemakerImageArn(@Nullable Output<String> sagemakerImageArn) {
            $.sagemakerImageArn = sagemakerImageArn;
            return this;
        }

        /**
         * @param sagemakerImageArn The ARN of the SageMaker image that the image version belongs to.
         * 
         * @return builder
         * 
         */
        public Builder sagemakerImageArn(String sagemakerImageArn) {
            return sagemakerImageArn(Output.of(sagemakerImageArn));
        }

        /**
         * @param sagemakerImageVersionArn The ARN of the image version created on the instance.
         * 
         * @return builder
         * 
         */
        public Builder sagemakerImageVersionArn(@Nullable Output<String> sagemakerImageVersionArn) {
            $.sagemakerImageVersionArn = sagemakerImageVersionArn;
            return this;
        }

        /**
         * @param sagemakerImageVersionArn The ARN of the image version created on the instance.
         * 
         * @return builder
         * 
         */
        public Builder sagemakerImageVersionArn(String sagemakerImageVersionArn) {
            return sagemakerImageVersionArn(Output.of(sagemakerImageVersionArn));
        }

        public DomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpecArgs build() {
            return $;
        }
    }

}
