// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAnalysisAnalysisComponent;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisAnalysisLoadBalancerTarget extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInsightsAnalysisAnalysisLoadBalancerTarget Empty = new NetworkInsightsAnalysisAnalysisLoadBalancerTarget();

    @Import(name="address")
      private final @Nullable String address;

    public Optional<String> address() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    @Import(name="availabilityZone")
      private final @Nullable String availabilityZone;

    public Optional<String> availabilityZone() {
        return this.availabilityZone == null ? Optional.empty() : Optional.ofNullable(this.availabilityZone);
    }

    @Import(name="instance")
      private final @Nullable NetworkInsightsAnalysisAnalysisComponent instance;

    public Optional<NetworkInsightsAnalysisAnalysisComponent> instance() {
        return this.instance == null ? Optional.empty() : Optional.ofNullable(this.instance);
    }

    @Import(name="port")
      private final @Nullable Integer port;

    public Optional<Integer> port() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    public NetworkInsightsAnalysisAnalysisLoadBalancerTarget(
        @Nullable String address,
        @Nullable String availabilityZone,
        @Nullable NetworkInsightsAnalysisAnalysisComponent instance,
        @Nullable Integer port) {
        this.address = address;
        this.availabilityZone = availabilityZone;
        this.instance = instance;
        this.port = port;
    }

    private NetworkInsightsAnalysisAnalysisLoadBalancerTarget() {
        this.address = null;
        this.availabilityZone = null;
        this.instance = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAnalysisLoadBalancerTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String availabilityZone;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent instance;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAnalysisLoadBalancerTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.instance = defaults.instance;
    	      this.port = defaults.port;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder instance(@Nullable NetworkInsightsAnalysisAnalysisComponent instance) {
            this.instance = instance;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }        public NetworkInsightsAnalysisAnalysisLoadBalancerTarget build() {
            return new NetworkInsightsAnalysisAnalysisLoadBalancerTarget(address, availabilityZone, instance, port);
        }
    }
}
