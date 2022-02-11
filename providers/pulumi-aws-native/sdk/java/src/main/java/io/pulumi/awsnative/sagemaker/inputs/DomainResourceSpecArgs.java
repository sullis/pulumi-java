// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.DomainResourceSpecInstanceType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainResourceSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainResourceSpecArgs Empty = new DomainResourceSpecArgs();

    @InputImport(name="instanceType")
    private final @Nullable Input<DomainResourceSpecInstanceType> instanceType;

    public Input<DomainResourceSpecInstanceType> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    @InputImport(name="sageMakerImageArn")
    private final @Nullable Input<String> sageMakerImageArn;

    public Input<String> getSageMakerImageArn() {
        return this.sageMakerImageArn == null ? Input.empty() : this.sageMakerImageArn;
    }

    @InputImport(name="sageMakerImageVersionArn")
    private final @Nullable Input<String> sageMakerImageVersionArn;

    public Input<String> getSageMakerImageVersionArn() {
        return this.sageMakerImageVersionArn == null ? Input.empty() : this.sageMakerImageVersionArn;
    }

    public DomainResourceSpecArgs(
        @Nullable Input<DomainResourceSpecInstanceType> instanceType,
        @Nullable Input<String> sageMakerImageArn,
        @Nullable Input<String> sageMakerImageVersionArn) {
        this.instanceType = instanceType;
        this.sageMakerImageArn = sageMakerImageArn;
        this.sageMakerImageVersionArn = sageMakerImageVersionArn;
    }

    private DomainResourceSpecArgs() {
        this.instanceType = Input.empty();
        this.sageMakerImageArn = Input.empty();
        this.sageMakerImageVersionArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainResourceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DomainResourceSpecInstanceType> instanceType;
        private @Nullable Input<String> sageMakerImageArn;
        private @Nullable Input<String> sageMakerImageVersionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainResourceSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.sageMakerImageArn = defaults.sageMakerImageArn;
    	      this.sageMakerImageVersionArn = defaults.sageMakerImageVersionArn;
        }

        public Builder setInstanceType(@Nullable Input<DomainResourceSpecInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable DomainResourceSpecInstanceType instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setSageMakerImageArn(@Nullable Input<String> sageMakerImageArn) {
            this.sageMakerImageArn = sageMakerImageArn;
            return this;
        }

        public Builder setSageMakerImageArn(@Nullable String sageMakerImageArn) {
            this.sageMakerImageArn = Input.ofNullable(sageMakerImageArn);
            return this;
        }

        public Builder setSageMakerImageVersionArn(@Nullable Input<String> sageMakerImageVersionArn) {
            this.sageMakerImageVersionArn = sageMakerImageVersionArn;
            return this;
        }

        public Builder setSageMakerImageVersionArn(@Nullable String sageMakerImageVersionArn) {
            this.sageMakerImageVersionArn = Input.ofNullable(sageMakerImageVersionArn);
            return this;
        }

        public DomainResourceSpecArgs build() {
            return new DomainResourceSpecArgs(instanceType, sageMakerImageArn, sageMakerImageVersionArn);
        }
    }
}
