// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.SkuDefinition;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * Gets or set the SKU.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<SkuDefinition> name;

    public Input<SkuDefinition> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public SkuArgs(@Nullable Input<SkuDefinition> name) {
        this.name = name;
    }

    private SkuArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SkuDefinition> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<SkuDefinition> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable SkuDefinition name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public SkuArgs build() {
            return new SkuArgs(name);
        }
    }
}
