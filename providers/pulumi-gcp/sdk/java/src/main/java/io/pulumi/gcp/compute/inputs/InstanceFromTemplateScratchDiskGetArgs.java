// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InstanceFromTemplateScratchDiskGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateScratchDiskGetArgs Empty = new InstanceFromTemplateScratchDiskGetArgs();

    @InputImport(name="interface", required=true)
      private final Input<String> $interface;

    public Input<String> get$interface() {
        return this.$interface;
    }

    public InstanceFromTemplateScratchDiskGetArgs(Input<String> $interface) {
        this.$interface = Objects.requireNonNull($interface, "expected parameter '$interface' to be non-null");
    }

    private InstanceFromTemplateScratchDiskGetArgs() {
        this.$interface = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateScratchDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> $interface;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateScratchDiskGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$interface = defaults.$interface;
        }

        public Builder set$interface(Input<String> $interface) {
            this.$interface = Objects.requireNonNull($interface);
            return this;
        }

        public Builder set$interface(String $interface) {
            this.$interface = Input.of(Objects.requireNonNull($interface));
            return this;
        }
        public InstanceFromTemplateScratchDiskGetArgs build() {
            return new InstanceFromTemplateScratchDiskGetArgs($interface);
        }
    }
}