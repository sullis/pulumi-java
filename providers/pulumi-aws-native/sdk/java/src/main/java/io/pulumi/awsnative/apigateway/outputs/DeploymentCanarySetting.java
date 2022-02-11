// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentCanarySetting {
    private final @Nullable Double percentTraffic;
    private final @Nullable Object stageVariableOverrides;
    private final @Nullable Boolean useStageCache;

    @OutputCustomType.Constructor({"percentTraffic","stageVariableOverrides","useStageCache"})
    private DeploymentCanarySetting(
        @Nullable Double percentTraffic,
        @Nullable Object stageVariableOverrides,
        @Nullable Boolean useStageCache) {
        this.percentTraffic = percentTraffic;
        this.stageVariableOverrides = stageVariableOverrides;
        this.useStageCache = useStageCache;
    }

    public Optional<Double> getPercentTraffic() {
        return Optional.ofNullable(this.percentTraffic);
    }
    public Optional<Object> getStageVariableOverrides() {
        return Optional.ofNullable(this.stageVariableOverrides);
    }
    public Optional<Boolean> getUseStageCache() {
        return Optional.ofNullable(this.useStageCache);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentCanarySetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double percentTraffic;
        private @Nullable Object stageVariableOverrides;
        private @Nullable Boolean useStageCache;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentCanarySetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentTraffic = defaults.percentTraffic;
    	      this.stageVariableOverrides = defaults.stageVariableOverrides;
    	      this.useStageCache = defaults.useStageCache;
        }

        public Builder setPercentTraffic(@Nullable Double percentTraffic) {
            this.percentTraffic = percentTraffic;
            return this;
        }

        public Builder setStageVariableOverrides(@Nullable Object stageVariableOverrides) {
            this.stageVariableOverrides = stageVariableOverrides;
            return this;
        }

        public Builder setUseStageCache(@Nullable Boolean useStageCache) {
            this.useStageCache = useStageCache;
            return this;
        }

        public DeploymentCanarySetting build() {
            return new DeploymentCanarySetting(percentTraffic, stageVariableOverrides, useStageCache);
        }
    }
}
