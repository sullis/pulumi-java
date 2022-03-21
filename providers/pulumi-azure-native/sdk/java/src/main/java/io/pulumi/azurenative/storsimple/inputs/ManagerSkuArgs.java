// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.azurenative.storsimple.enums.ManagerSkuType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The Sku.
 * 
 */
public final class ManagerSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagerSkuArgs Empty = new ManagerSkuArgs();

    /**
     * Refers to the sku name which should be "Standard"
     * 
     */
    @Import(name="name", required=true)
      private final Output<ManagerSkuType> name;

    public Output<ManagerSkuType> getName() {
        return this.name;
    }

    public ManagerSkuArgs(Output<ManagerSkuType> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ManagerSkuArgs() {
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagerSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ManagerSkuType> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagerSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<ManagerSkuType> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(ManagerSkuType name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ManagerSkuArgs build() {
            return new ManagerSkuArgs(name);
        }
    }
}
