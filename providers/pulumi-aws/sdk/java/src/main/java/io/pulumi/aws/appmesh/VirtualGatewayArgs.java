// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewayArgs Empty = new VirtualGatewayArgs();

    /**
     * The name of the service mesh in which to create the virtual gateway. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="meshName", required=true)
      private final Output<String> meshName;

    public Output<String> meshName() {
        return this.meshName;
    }

    /**
     * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @Import(name="meshOwner")
      private final @Nullable Output<String> meshOwner;

    public Output<String> meshOwner() {
        return this.meshOwner == null ? Codegen.empty() : this.meshOwner;
    }

    /**
     * The name to use for the virtual gateway. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The virtual gateway specification to apply.
     * 
     */
    @Import(name="spec", required=true)
      private final Output<VirtualGatewaySpecArgs> spec;

    public Output<VirtualGatewaySpecArgs> spec() {
        return this.spec;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public VirtualGatewayArgs(
        Output<String> meshName,
        @Nullable Output<String> meshOwner,
        @Nullable Output<String> name,
        Output<VirtualGatewaySpecArgs> spec,
        @Nullable Output<Map<String,String>> tags) {
        this.meshName = Objects.requireNonNull(meshName, "expected parameter 'meshName' to be non-null");
        this.meshOwner = meshOwner;
        this.name = name;
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
        this.tags = tags;
    }

    private VirtualGatewayArgs() {
        this.meshName = Codegen.empty();
        this.meshOwner = Codegen.empty();
        this.name = Codegen.empty();
        this.spec = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> meshName;
        private @Nullable Output<String> meshOwner;
        private @Nullable Output<String> name;
        private Output<VirtualGatewaySpecArgs> spec;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.meshName = defaults.meshName;
    	      this.meshOwner = defaults.meshOwner;
    	      this.name = defaults.name;
    	      this.spec = defaults.spec;
    	      this.tags = defaults.tags;
        }

        public Builder meshName(Output<String> meshName) {
            this.meshName = Objects.requireNonNull(meshName);
            return this;
        }
        public Builder meshName(String meshName) {
            this.meshName = Output.of(Objects.requireNonNull(meshName));
            return this;
        }
        public Builder meshOwner(@Nullable Output<String> meshOwner) {
            this.meshOwner = meshOwner;
            return this;
        }
        public Builder meshOwner(@Nullable String meshOwner) {
            this.meshOwner = Codegen.ofNullable(meshOwner);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder spec(Output<VirtualGatewaySpecArgs> spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        public Builder spec(VirtualGatewaySpecArgs spec) {
            this.spec = Output.of(Objects.requireNonNull(spec));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public VirtualGatewayArgs build() {
            return new VirtualGatewayArgs(meshName, meshOwner, name, spec, tags);
        }
    }
}
