// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRouteCalculatorResult {
    private final @Nullable String arn;
    private final @Nullable String calculatorArn;
    private final @Nullable String createTime;
    private final @Nullable String updateTime;

    @OutputCustomType.Constructor({"arn","calculatorArn","createTime","updateTime"})
    private GetRouteCalculatorResult(
        @Nullable String arn,
        @Nullable String calculatorArn,
        @Nullable String createTime,
        @Nullable String updateTime) {
        this.arn = arn;
        this.calculatorArn = calculatorArn;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getCalculatorArn() {
        return Optional.ofNullable(this.calculatorArn);
    }
    public Optional<String> getCreateTime() {
        return Optional.ofNullable(this.createTime);
    }
    public Optional<String> getUpdateTime() {
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

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCalculatorArn(@Nullable String calculatorArn) {
            this.calculatorArn = calculatorArn;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetRouteCalculatorResult build() {
            return new GetRouteCalculatorResult(arn, calculatorArn, createTime, updateTime);
        }
    }
}
