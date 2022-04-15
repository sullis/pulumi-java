// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.iotsitewise.inputs.GatewayCapabilitySummaryArgs;
import io.pulumi.awsnative.iotsitewise.inputs.GatewayPlatformArgs;
import io.pulumi.awsnative.iotsitewise.inputs.GatewayTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * A list of gateway capability summaries that each contain a namespace and status.
     * 
     */
    @Import(name="gatewayCapabilitySummaries")
      private final @Nullable Output<List<GatewayCapabilitySummaryArgs>> gatewayCapabilitySummaries;

    public Output<List<GatewayCapabilitySummaryArgs>> gatewayCapabilitySummaries() {
        return this.gatewayCapabilitySummaries == null ? Codegen.empty() : this.gatewayCapabilitySummaries;
    }

    /**
     * A unique, friendly name for the gateway.
     * 
     */
    @Import(name="gatewayName")
      private final @Nullable Output<String> gatewayName;

    public Output<String> gatewayName() {
        return this.gatewayName == null ? Codegen.empty() : this.gatewayName;
    }

    /**
     * The gateway's platform. You can only specify one platform in a gateway.
     * 
     */
    @Import(name="gatewayPlatform", required=true)
      private final Output<GatewayPlatformArgs> gatewayPlatform;

    public Output<GatewayPlatformArgs> gatewayPlatform() {
        return this.gatewayPlatform;
    }

    /**
     * A list of key-value pairs that contain metadata for the gateway.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<GatewayTagArgs>> tags;

    public Output<List<GatewayTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public GatewayArgs(
        @Nullable Output<List<GatewayCapabilitySummaryArgs>> gatewayCapabilitySummaries,
        @Nullable Output<String> gatewayName,
        Output<GatewayPlatformArgs> gatewayPlatform,
        @Nullable Output<List<GatewayTagArgs>> tags) {
        this.gatewayCapabilitySummaries = gatewayCapabilitySummaries;
        this.gatewayName = gatewayName;
        this.gatewayPlatform = Objects.requireNonNull(gatewayPlatform, "expected parameter 'gatewayPlatform' to be non-null");
        this.tags = tags;
    }

    private GatewayArgs() {
        this.gatewayCapabilitySummaries = Codegen.empty();
        this.gatewayName = Codegen.empty();
        this.gatewayPlatform = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GatewayCapabilitySummaryArgs>> gatewayCapabilitySummaries;
        private @Nullable Output<String> gatewayName;
        private Output<GatewayPlatformArgs> gatewayPlatform;
        private @Nullable Output<List<GatewayTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayCapabilitySummaries = defaults.gatewayCapabilitySummaries;
    	      this.gatewayName = defaults.gatewayName;
    	      this.gatewayPlatform = defaults.gatewayPlatform;
    	      this.tags = defaults.tags;
        }

        public Builder gatewayCapabilitySummaries(@Nullable Output<List<GatewayCapabilitySummaryArgs>> gatewayCapabilitySummaries) {
            this.gatewayCapabilitySummaries = gatewayCapabilitySummaries;
            return this;
        }
        public Builder gatewayCapabilitySummaries(@Nullable List<GatewayCapabilitySummaryArgs> gatewayCapabilitySummaries) {
            this.gatewayCapabilitySummaries = Codegen.ofNullable(gatewayCapabilitySummaries);
            return this;
        }
        public Builder gatewayCapabilitySummaries(GatewayCapabilitySummaryArgs... gatewayCapabilitySummaries) {
            return gatewayCapabilitySummaries(List.of(gatewayCapabilitySummaries));
        }
        public Builder gatewayName(@Nullable Output<String> gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public Builder gatewayName(@Nullable String gatewayName) {
            this.gatewayName = Codegen.ofNullable(gatewayName);
            return this;
        }
        public Builder gatewayPlatform(Output<GatewayPlatformArgs> gatewayPlatform) {
            this.gatewayPlatform = Objects.requireNonNull(gatewayPlatform);
            return this;
        }
        public Builder gatewayPlatform(GatewayPlatformArgs gatewayPlatform) {
            this.gatewayPlatform = Output.of(Objects.requireNonNull(gatewayPlatform));
            return this;
        }
        public Builder tags(@Nullable Output<List<GatewayTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<GatewayTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(GatewayTagArgs... tags) {
            return tags(List.of(tags));
        }        public GatewayArgs build() {
            return new GatewayArgs(gatewayCapabilitySummaries, gatewayName, gatewayPlatform, tags);
        }
    }
}
