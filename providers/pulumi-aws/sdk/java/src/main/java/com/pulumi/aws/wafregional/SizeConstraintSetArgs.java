// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SizeConstraintSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SizeConstraintSetArgs Empty = new SizeConstraintSetArgs();

    /**
     * The name or description of the Size Constraint Set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name or description of the Size Constraint Set.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    @Import(name="sizeConstraints")
    private @Nullable Output<List<SizeConstraintSetSizeConstraintArgs>> sizeConstraints;

    /**
     * @return Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    public Optional<Output<List<SizeConstraintSetSizeConstraintArgs>>> sizeConstraints() {
        return Optional.ofNullable(this.sizeConstraints);
    }

    private SizeConstraintSetArgs() {}

    private SizeConstraintSetArgs(SizeConstraintSetArgs $) {
        this.name = $.name;
        this.sizeConstraints = $.sizeConstraints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SizeConstraintSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SizeConstraintSetArgs $;

        public Builder() {
            $ = new SizeConstraintSetArgs();
        }

        public Builder(SizeConstraintSetArgs defaults) {
            $ = new SizeConstraintSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name or description of the Size Constraint Set.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name or description of the Size Constraint Set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sizeConstraints Specifies the parts of web requests that you want to inspect the size of.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraints(@Nullable Output<List<SizeConstraintSetSizeConstraintArgs>> sizeConstraints) {
            $.sizeConstraints = sizeConstraints;
            return this;
        }

        /**
         * @param sizeConstraints Specifies the parts of web requests that you want to inspect the size of.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraints(List<SizeConstraintSetSizeConstraintArgs> sizeConstraints) {
            return sizeConstraints(Output.of(sizeConstraints));
        }

        /**
         * @param sizeConstraints Specifies the parts of web requests that you want to inspect the size of.
         * 
         * @return builder
         * 
         */
        public Builder sizeConstraints(SizeConstraintSetSizeConstraintArgs... sizeConstraints) {
            return sizeConstraints(List.of(sizeConstraints));
        }

        public SizeConstraintSetArgs build() {
            return $;
        }
    }

}
