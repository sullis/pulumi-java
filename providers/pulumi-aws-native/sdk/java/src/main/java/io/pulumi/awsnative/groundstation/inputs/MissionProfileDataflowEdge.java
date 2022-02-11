// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MissionProfileDataflowEdge extends io.pulumi.resources.InvokeArgs {

    public static final MissionProfileDataflowEdge Empty = new MissionProfileDataflowEdge();

    @InputImport(name="destination")
    private final @Nullable String destination;

    public Optional<String> getDestination() {
        return this.destination == null ? Optional.empty() : Optional.ofNullable(this.destination);
    }

    @InputImport(name="source")
    private final @Nullable String source;

    public Optional<String> getSource() {
        return this.source == null ? Optional.empty() : Optional.ofNullable(this.source);
    }

    public MissionProfileDataflowEdge(
        @Nullable String destination,
        @Nullable String source) {
        this.destination = destination;
        this.source = source;
    }

    private MissionProfileDataflowEdge() {
        this.destination = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MissionProfileDataflowEdge defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destination;
        private @Nullable String source;

        public Builder() {
    	      // Empty
        }

        public Builder(MissionProfileDataflowEdge defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.source = defaults.source;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        public MissionProfileDataflowEdge build() {
            return new MissionProfileDataflowEdge(destination, source);
        }
    }
}
