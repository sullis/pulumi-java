// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisPortRange extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInsightsAnalysisPortRange Empty = new NetworkInsightsAnalysisPortRange();

    @Import(name="from")
      private final @Nullable Integer from;

    public Optional<Integer> from() {
        return this.from == null ? Optional.empty() : Optional.ofNullable(this.from);
    }

    @Import(name="to")
      private final @Nullable Integer to;

    public Optional<Integer> to() {
        return this.to == null ? Optional.empty() : Optional.ofNullable(this.to);
    }

    public NetworkInsightsAnalysisPortRange(
        @Nullable Integer from,
        @Nullable Integer to) {
        this.from = from;
        this.to = to;
    }

    private NetworkInsightsAnalysisPortRange() {
        this.from = null;
        this.to = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisPortRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer from;
        private @Nullable Integer to;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder from(@Nullable Integer from) {
            this.from = from;
            return this;
        }
        public Builder to(@Nullable Integer to) {
            this.to = to;
            return this;
        }        public NetworkInsightsAnalysisPortRange build() {
            return new NetworkInsightsAnalysisPortRange(from, to);
        }
    }
}
