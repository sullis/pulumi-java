// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionLegacyCustomOriginArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionLegacyCustomOriginArgs Empty = new DistributionLegacyCustomOriginArgs();

    @Import(name="dNSName", required=true)
      private final Output<String> dNSName;

    public Output<String> dNSName() {
        return this.dNSName;
    }

    @Import(name="hTTPPort")
      private final @Nullable Output<Integer> hTTPPort;

    public Output<Integer> hTTPPort() {
        return this.hTTPPort == null ? Codegen.empty() : this.hTTPPort;
    }

    @Import(name="hTTPSPort")
      private final @Nullable Output<Integer> hTTPSPort;

    public Output<Integer> hTTPSPort() {
        return this.hTTPSPort == null ? Codegen.empty() : this.hTTPSPort;
    }

    @Import(name="originProtocolPolicy", required=true)
      private final Output<String> originProtocolPolicy;

    public Output<String> originProtocolPolicy() {
        return this.originProtocolPolicy;
    }

    @Import(name="originSSLProtocols", required=true)
      private final Output<List<String>> originSSLProtocols;

    public Output<List<String>> originSSLProtocols() {
        return this.originSSLProtocols;
    }

    public DistributionLegacyCustomOriginArgs(
        Output<String> dNSName,
        @Nullable Output<Integer> hTTPPort,
        @Nullable Output<Integer> hTTPSPort,
        Output<String> originProtocolPolicy,
        Output<List<String>> originSSLProtocols) {
        this.dNSName = Objects.requireNonNull(dNSName, "expected parameter 'dNSName' to be non-null");
        this.hTTPPort = hTTPPort;
        this.hTTPSPort = hTTPSPort;
        this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy, "expected parameter 'originProtocolPolicy' to be non-null");
        this.originSSLProtocols = Objects.requireNonNull(originSSLProtocols, "expected parameter 'originSSLProtocols' to be non-null");
    }

    private DistributionLegacyCustomOriginArgs() {
        this.dNSName = Codegen.empty();
        this.hTTPPort = Codegen.empty();
        this.hTTPSPort = Codegen.empty();
        this.originProtocolPolicy = Codegen.empty();
        this.originSSLProtocols = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionLegacyCustomOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dNSName;
        private @Nullable Output<Integer> hTTPPort;
        private @Nullable Output<Integer> hTTPSPort;
        private Output<String> originProtocolPolicy;
        private Output<List<String>> originSSLProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionLegacyCustomOriginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dNSName = defaults.dNSName;
    	      this.hTTPPort = defaults.hTTPPort;
    	      this.hTTPSPort = defaults.hTTPSPort;
    	      this.originProtocolPolicy = defaults.originProtocolPolicy;
    	      this.originSSLProtocols = defaults.originSSLProtocols;
        }

        public Builder dNSName(Output<String> dNSName) {
            this.dNSName = Objects.requireNonNull(dNSName);
            return this;
        }
        public Builder dNSName(String dNSName) {
            this.dNSName = Output.of(Objects.requireNonNull(dNSName));
            return this;
        }
        public Builder hTTPPort(@Nullable Output<Integer> hTTPPort) {
            this.hTTPPort = hTTPPort;
            return this;
        }
        public Builder hTTPPort(@Nullable Integer hTTPPort) {
            this.hTTPPort = Codegen.ofNullable(hTTPPort);
            return this;
        }
        public Builder hTTPSPort(@Nullable Output<Integer> hTTPSPort) {
            this.hTTPSPort = hTTPSPort;
            return this;
        }
        public Builder hTTPSPort(@Nullable Integer hTTPSPort) {
            this.hTTPSPort = Codegen.ofNullable(hTTPSPort);
            return this;
        }
        public Builder originProtocolPolicy(Output<String> originProtocolPolicy) {
            this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy);
            return this;
        }
        public Builder originProtocolPolicy(String originProtocolPolicy) {
            this.originProtocolPolicy = Output.of(Objects.requireNonNull(originProtocolPolicy));
            return this;
        }
        public Builder originSSLProtocols(Output<List<String>> originSSLProtocols) {
            this.originSSLProtocols = Objects.requireNonNull(originSSLProtocols);
            return this;
        }
        public Builder originSSLProtocols(List<String> originSSLProtocols) {
            this.originSSLProtocols = Output.of(Objects.requireNonNull(originSSLProtocols));
            return this;
        }
        public Builder originSSLProtocols(String... originSSLProtocols) {
            return originSSLProtocols(List.of(originSSLProtocols));
        }        public DistributionLegacyCustomOriginArgs build() {
            return new DistributionLegacyCustomOriginArgs(dNSName, hTTPPort, hTTPSPort, originProtocolPolicy, originSSLProtocols);
        }
    }
}
