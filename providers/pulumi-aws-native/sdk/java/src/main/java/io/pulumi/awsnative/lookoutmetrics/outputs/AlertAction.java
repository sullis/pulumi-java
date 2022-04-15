// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.awsnative.lookoutmetrics.outputs.AlertLambdaConfiguration;
import io.pulumi.awsnative.lookoutmetrics.outputs.AlertSNSConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertAction {
    private final @Nullable AlertLambdaConfiguration lambdaConfiguration;
    private final @Nullable AlertSNSConfiguration sNSConfiguration;

    @CustomType.Constructor
    private AlertAction(
        @CustomType.Parameter("lambdaConfiguration") @Nullable AlertLambdaConfiguration lambdaConfiguration,
        @CustomType.Parameter("sNSConfiguration") @Nullable AlertSNSConfiguration sNSConfiguration) {
        this.lambdaConfiguration = lambdaConfiguration;
        this.sNSConfiguration = sNSConfiguration;
    }

    public Optional<AlertLambdaConfiguration> lambdaConfiguration() {
        return Optional.ofNullable(this.lambdaConfiguration);
    }
    public Optional<AlertSNSConfiguration> sNSConfiguration() {
        return Optional.ofNullable(this.sNSConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AlertLambdaConfiguration lambdaConfiguration;
        private @Nullable AlertSNSConfiguration sNSConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaConfiguration = defaults.lambdaConfiguration;
    	      this.sNSConfiguration = defaults.sNSConfiguration;
        }

        public Builder lambdaConfiguration(@Nullable AlertLambdaConfiguration lambdaConfiguration) {
            this.lambdaConfiguration = lambdaConfiguration;
            return this;
        }
        public Builder sNSConfiguration(@Nullable AlertSNSConfiguration sNSConfiguration) {
            this.sNSConfiguration = sNSConfiguration;
            return this;
        }        public AlertAction build() {
            return new AlertAction(lambdaConfiguration, sNSConfiguration);
        }
    }
}
