// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRouteCalculatorResult {
    private final @Nullable String arn;
    private final @Nullable String calculatorArn;
    private final @Nullable String createTime;
    private final @Nullable String updateTime;

    @CustomType.Constructor
    private GetRouteCalculatorResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("calculatorArn") @Nullable String calculatorArn,
        @CustomType.Parameter("createTime") @Nullable String createTime,
        @CustomType.Parameter("updateTime") @Nullable String updateTime) {
        this.arn = arn;
        this.calculatorArn = calculatorArn;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> calculatorArn() {
        return Optional.ofNullable(this.calculatorArn);
    }
    public Optional<String> createTime() {
        return Optional.ofNullable(this.createTime);
    }
    public Optional<String> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteCalculatorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String calculatorArn;
        private @Nullable String createTime;
        private @Nullable String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteCalculatorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.calculatorArn = defaults.calculatorArn;
    	      this.createTime = defaults.createTime;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder calculatorArn(@Nullable String calculatorArn) {
            this.calculatorArn = calculatorArn;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }        public GetRouteCalculatorResult build() {
            return new GetRouteCalculatorResult(arn, calculatorArn, createTime, updateTime);
        }
    }
}
