// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataflowEndpointGroupSocketAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataflowEndpointGroupSocketAddressArgs Empty = new DataflowEndpointGroupSocketAddressArgs();

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    public DataflowEndpointGroupSocketAddressArgs(
        @Nullable Output<String> name,
        @Nullable Output<Integer> port) {
        this.name = name;
        this.port = port;
    }

    private DataflowEndpointGroupSocketAddressArgs() {
        this.name = Codegen.empty();
        this.port = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataflowEndpointGroupSocketAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataflowEndpointGroupSocketAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }        public DataflowEndpointGroupSocketAddressArgs build() {
            return new DataflowEndpointGroupSocketAddressArgs(name, port);
        }
    }
}
