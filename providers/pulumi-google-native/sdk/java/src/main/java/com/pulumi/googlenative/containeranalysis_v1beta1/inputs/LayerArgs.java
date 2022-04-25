// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.enums.LayerDirective;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Layer holds metadata specific to a layer of a Docker image.
 * 
 */
public final class LayerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LayerArgs Empty = new LayerArgs();

    /**
     * The recovered arguments to the Dockerfile directive.
     * 
     */
    @Import(name="arguments")
    private @Nullable Output<String> arguments;

    /**
     * @return The recovered arguments to the Dockerfile directive.
     * 
     */
    public Optional<Output<String>> arguments() {
        return Optional.ofNullable(this.arguments);
    }

    /**
     * The recovered Dockerfile directive used to construct this layer.
     * 
     */
    @Import(name="directive", required=true)
    private Output<LayerDirective> directive;

    /**
     * @return The recovered Dockerfile directive used to construct this layer.
     * 
     */
    public Output<LayerDirective> directive() {
        return this.directive;
    }

    private LayerArgs() {}

    private LayerArgs(LayerArgs $) {
        this.arguments = $.arguments;
        this.directive = $.directive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LayerArgs $;

        public Builder() {
            $ = new LayerArgs();
        }

        public Builder(LayerArgs defaults) {
            $ = new LayerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arguments The recovered arguments to the Dockerfile directive.
         * 
         * @return builder
         * 
         */
        public Builder arguments(@Nullable Output<String> arguments) {
            $.arguments = arguments;
            return this;
        }

        /**
         * @param arguments The recovered arguments to the Dockerfile directive.
         * 
         * @return builder
         * 
         */
        public Builder arguments(String arguments) {
            return arguments(Output.of(arguments));
        }

        /**
         * @param directive The recovered Dockerfile directive used to construct this layer.
         * 
         * @return builder
         * 
         */
        public Builder directive(Output<LayerDirective> directive) {
            $.directive = directive;
            return this;
        }

        /**
         * @param directive The recovered Dockerfile directive used to construct this layer.
         * 
         * @return builder
         * 
         */
        public Builder directive(LayerDirective directive) {
            return directive(Output.of(directive));
        }

        public LayerArgs build() {
            $.directive = Objects.requireNonNull($.directive, "expected parameter 'directive' to be non-null");
            return $;
        }
    }

}
