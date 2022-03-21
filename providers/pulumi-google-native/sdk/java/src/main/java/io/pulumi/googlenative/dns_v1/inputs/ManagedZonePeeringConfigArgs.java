// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZonePeeringConfigTargetNetworkArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZonePeeringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZonePeeringConfigArgs Empty = new ManagedZonePeeringConfigArgs();

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * The network with which to peer.
     * 
     */
    @Import(name="targetNetwork")
      private final @Nullable Output<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork;

    public Output<ManagedZonePeeringConfigTargetNetworkArgs> getTargetNetwork() {
        return this.targetNetwork == null ? Output.empty() : this.targetNetwork;
    }

    public ManagedZonePeeringConfigArgs(
        @Nullable Output<String> kind,
        @Nullable Output<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork) {
        this.kind = kind;
        this.targetNetwork = targetNetwork;
    }

    private ManagedZonePeeringConfigArgs() {
        this.kind = Output.empty();
        this.targetNetwork = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private @Nullable Output<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.targetNetwork = defaults.targetNetwork;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder targetNetwork(@Nullable Output<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork) {
            this.targetNetwork = targetNetwork;
            return this;
        }
        public Builder targetNetwork(@Nullable ManagedZonePeeringConfigTargetNetworkArgs targetNetwork) {
            this.targetNetwork = Output.ofNullable(targetNetwork);
            return this;
        }        public ManagedZonePeeringConfigArgs build() {
            return new ManagedZonePeeringConfigArgs(kind, targetNetwork);
        }
    }
}
