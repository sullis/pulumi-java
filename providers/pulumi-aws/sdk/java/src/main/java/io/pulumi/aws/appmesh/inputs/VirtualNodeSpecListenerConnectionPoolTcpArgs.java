// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;


public final class VirtualNodeSpecListenerConnectionPoolTcpArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerConnectionPoolTcpArgs Empty = new VirtualNodeSpecListenerConnectionPoolTcpArgs();

    /**
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    @Import(name="maxConnections", required=true)
      private final Output<Integer> maxConnections;

    public Output<Integer> maxConnections() {
        return this.maxConnections;
    }

    public VirtualNodeSpecListenerConnectionPoolTcpArgs(Output<Integer> maxConnections) {
        this.maxConnections = Objects.requireNonNull(maxConnections, "expected parameter 'maxConnections' to be non-null");
    }

    private VirtualNodeSpecListenerConnectionPoolTcpArgs() {
        this.maxConnections = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerConnectionPoolTcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolTcpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConnections = defaults.maxConnections;
        }

        public Builder maxConnections(Output<Integer> maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Output.of(Objects.requireNonNull(maxConnections));
            return this;
        }        public VirtualNodeSpecListenerConnectionPoolTcpArgs build() {
            return new VirtualNodeSpecListenerConnectionPoolTcpArgs(maxConnections);
        }
    }
}
