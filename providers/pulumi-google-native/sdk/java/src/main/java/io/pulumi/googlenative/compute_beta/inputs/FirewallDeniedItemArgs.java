// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallDeniedItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallDeniedItemArgs Empty = new FirewallDeniedItemArgs();

    /**
     * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings (tcp, udp, icmp, esp, ah, ipip, sctp) or the IP protocol number.
     * 
     */
    @InputImport(name="ipProtocol")
      private final @Nullable Input<String> ipProtocol;

    public Input<String> getIpProtocol() {
        return this.ipProtocol == null ? Input.empty() : this.ipProtocol;
    }

    /**
     * An optional list of ports to which this rule applies. This field is only applicable for the UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
     * 
     */
    @InputImport(name="ports")
      private final @Nullable Input<List<String>> ports;

    public Input<List<String>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    public FirewallDeniedItemArgs(
        @Nullable Input<String> ipProtocol,
        @Nullable Input<List<String>> ports) {
        this.ipProtocol = ipProtocol;
        this.ports = ports;
    }

    private FirewallDeniedItemArgs() {
        this.ipProtocol = Input.empty();
        this.ports = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallDeniedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipProtocol;
        private @Nullable Input<List<String>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallDeniedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ports = defaults.ports;
        }

        public Builder setIpProtocol(@Nullable Input<String> ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }

        public Builder setIpProtocol(@Nullable String ipProtocol) {
            this.ipProtocol = Input.ofNullable(ipProtocol);
            return this;
        }

        public Builder setPorts(@Nullable Input<List<String>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<String> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }
        public FirewallDeniedItemArgs build() {
            return new FirewallDeniedItemArgs(ipProtocol, ports);
        }
    }
}