// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpnTunnelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVpnTunnelArgs Empty = new GetVpnTunnelArgs();

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    @InputImport(name="vpnTunnel", required=true)
      private final String vpnTunnel;

    public String getVpnTunnel() {
        return this.vpnTunnel;
    }

    public GetVpnTunnelArgs(
        @Nullable String project,
        String region,
        String vpnTunnel) {
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.vpnTunnel = Objects.requireNonNull(vpnTunnel, "expected parameter 'vpnTunnel' to be non-null");
    }

    private GetVpnTunnelArgs() {
        this.project = null;
        this.region = null;
        this.vpnTunnel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnTunnelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String region;
        private String vpnTunnel;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnTunnelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.vpnTunnel = defaults.vpnTunnel;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setVpnTunnel(String vpnTunnel) {
            this.vpnTunnel = Objects.requireNonNull(vpnTunnel);
            return this;
        }
        public GetVpnTunnelArgs build() {
            return new GetVpnTunnelArgs(project, region, vpnTunnel);
        }
    }
}