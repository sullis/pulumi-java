// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A 2D coordinate in an image. The origin is the top-left.
 * 
 */
public final class VertexArgs extends com.pulumi.resources.ResourceArgs {

    public static final VertexArgs Empty = new VertexArgs();

    /**
     * X coordinate.
     * 
     */
    @Import(name="x")
    private @Nullable Output<Double> x;

    /**
     * @return X coordinate.
     * 
     */
    public Optional<Output<Double>> x() {
        return Optional.ofNullable(this.x);
    }

    /**
     * Y coordinate.
     * 
     */
    @Import(name="y")
    private @Nullable Output<Double> y;

    /**
     * @return Y coordinate.
     * 
     */
    public Optional<Output<Double>> y() {
        return Optional.ofNullable(this.y);
    }

    private VertexArgs() {}

    private VertexArgs(VertexArgs $) {
        this.x = $.x;
        this.y = $.y;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VertexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VertexArgs $;

        public Builder() {
            $ = new VertexArgs();
        }

        public Builder(VertexArgs defaults) {
            $ = new VertexArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param x X coordinate.
         * 
         * @return builder
         * 
         */
        public Builder x(@Nullable Output<Double> x) {
            $.x = x;
            return this;
        }

        /**
         * @param x X coordinate.
         * 
         * @return builder
         * 
         */
        public Builder x(Double x) {
            return x(Output.of(x));
        }

        /**
         * @param y Y coordinate.
         * 
         * @return builder
         * 
         */
        public Builder y(@Nullable Output<Double> y) {
            $.y = y;
            return this;
        }

        /**
         * @param y Y coordinate.
         * 
         * @return builder
         * 
         */
        public Builder y(Double y) {
            return y(Output.of(y));
        }

        public VertexArgs build() {
            return $;
        }
    }

}
