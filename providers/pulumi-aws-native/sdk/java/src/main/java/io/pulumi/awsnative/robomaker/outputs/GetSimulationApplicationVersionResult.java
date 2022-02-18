// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSimulationApplicationVersionResult {
    private final @Nullable String applicationVersion;
    private final @Nullable String arn;

    @OutputCustomType.Constructor({"applicationVersion","arn"})
    private GetSimulationApplicationVersionResult(
        @Nullable String applicationVersion,
        @Nullable String arn) {
        this.applicationVersion = applicationVersion;
        this.arn = arn;
    }

    public Optional<String> getApplicationVersion() {
        return Optional.ofNullable(this.applicationVersion);
    }
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSimulationApplicationVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationVersion;
        private @Nullable String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSimulationApplicationVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationVersion = defaults.applicationVersion;
    	      this.arn = defaults.arn;
        }

        public Builder setApplicationVersion(@Nullable String applicationVersion) {
            this.applicationVersion = applicationVersion;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public GetSimulationApplicationVersionResult build() {
            return new GetSimulationApplicationVersionResult(applicationVersion, arn);
        }
    }
}
