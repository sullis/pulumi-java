// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datafusion_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datafusion_v1beta1.enums.AcceleratorAcceleratorType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identifies Data Fusion accelerators for an instance.
 * 
 */
public final class AcceleratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final AcceleratorArgs Empty = new AcceleratorArgs();

    /**
     * The type of an accelator for a CDF instance.
     * 
     */
    @Import(name="acceleratorType")
    private @Nullable Output<AcceleratorAcceleratorType> acceleratorType;

    /**
     * @return The type of an accelator for a CDF instance.
     * 
     */
    public Optional<Output<AcceleratorAcceleratorType>> acceleratorType() {
        return Optional.ofNullable(this.acceleratorType);
    }

    private AcceleratorArgs() {}

    private AcceleratorArgs(AcceleratorArgs $) {
        this.acceleratorType = $.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AcceleratorArgs $;

        public Builder() {
            $ = new AcceleratorArgs();
        }

        public Builder(AcceleratorArgs defaults) {
            $ = new AcceleratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorType The type of an accelator for a CDF instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(@Nullable Output<AcceleratorAcceleratorType> acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * @param acceleratorType The type of an accelator for a CDF instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(AcceleratorAcceleratorType acceleratorType) {
            return acceleratorType(Output.of(acceleratorType));
        }

        public AcceleratorArgs build() {
            return $;
        }
    }

}
