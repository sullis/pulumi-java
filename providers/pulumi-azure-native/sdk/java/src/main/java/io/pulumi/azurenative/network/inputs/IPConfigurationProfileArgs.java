// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubnetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IP configuration profile child resource.
 * 
 */
public final class IPConfigurationProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPConfigurationProfileArgs Empty = new IPConfigurationProfileArgs();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name of the resource. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The reference to the subnet resource to create a container network interface ip configuration.
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable Input<SubnetArgs> subnet;

    public Input<SubnetArgs> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    public IPConfigurationProfileArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<SubnetArgs> subnet) {
        this.id = id;
        this.name = name;
        this.subnet = subnet;
    }

    private IPConfigurationProfileArgs() {
        this.id = Input.empty();
        this.name = Input.empty();
        this.subnet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPConfigurationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<SubnetArgs> subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(IPConfigurationProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.subnet = defaults.subnet;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSubnet(@Nullable Input<SubnetArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setSubnet(@Nullable SubnetArgs subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }
        public IPConfigurationProfileArgs build() {
            return new IPConfigurationProfileArgs(id, name, subnet);
        }
    }
}