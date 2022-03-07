// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.enums.EnterpriseChannelState;
import io.pulumi.azurenative.botservice.inputs.EnterpriseChannelNodeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Enterprise Channel.
 * 
 */
public final class EnterpriseChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseChannelPropertiesArgs Empty = new EnterpriseChannelPropertiesArgs();

    /**
     * The nodes associated with the Enterprise Channel.
     * 
     */
    @InputImport(name="nodes", required=true)
      private final Input<List<EnterpriseChannelNodeArgs>> nodes;

    public Input<List<EnterpriseChannelNodeArgs>> getNodes() {
        return this.nodes;
    }

    /**
     * The current state of the Enterprise Channel.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<Either<String,EnterpriseChannelState>> state;

    public Input<Either<String,EnterpriseChannelState>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public EnterpriseChannelPropertiesArgs(
        Input<List<EnterpriseChannelNodeArgs>> nodes,
        @Nullable Input<Either<String,EnterpriseChannelState>> state) {
        this.nodes = Objects.requireNonNull(nodes, "expected parameter 'nodes' to be non-null");
        this.state = state;
    }

    private EnterpriseChannelPropertiesArgs() {
        this.nodes = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<EnterpriseChannelNodeArgs>> nodes;
        private @Nullable Input<Either<String,EnterpriseChannelState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodes = defaults.nodes;
    	      this.state = defaults.state;
        }

        public Builder setNodes(Input<List<EnterpriseChannelNodeArgs>> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }

        public Builder setNodes(List<EnterpriseChannelNodeArgs> nodes) {
            this.nodes = Input.of(Objects.requireNonNull(nodes));
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,EnterpriseChannelState>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,EnterpriseChannelState> state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public EnterpriseChannelPropertiesArgs build() {
            return new EnterpriseChannelPropertiesArgs(nodes, state);
        }
    }
}