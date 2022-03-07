// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MissionProfileDataflowEdge {
    private final @Nullable String destination;
    private final @Nullable String source;

    @OutputCustomType.Constructor({"destination","source"})
    private MissionProfileDataflowEdge(
        @Nullable String destination,
        @Nullable String source) {
        this.destination = destination;
        this.source = source;
    }

    public Optional<String> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
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