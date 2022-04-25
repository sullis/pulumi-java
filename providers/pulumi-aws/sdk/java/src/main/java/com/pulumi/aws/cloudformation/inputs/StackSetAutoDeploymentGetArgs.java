// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StackSetAutoDeploymentGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final StackSetAutoDeploymentGetArgs Empty = new StackSetAutoDeploymentGetArgs();

    /**
     * Whether or not auto-deployment is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether or not auto-deployment is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Whether or not to retain stacks when the account is removed.
     * 
     */
    @Import(name="retainStacksOnAccountRemoval")
    private @Nullable Output<Boolean> retainStacksOnAccountRemoval;

    /**
     * @return Whether or not to retain stacks when the account is removed.
     * 
     */
    public Optional<Output<Boolean>> retainStacksOnAccountRemoval() {
        return Optional.ofNullable(this.retainStacksOnAccountRemoval);
    }

    private StackSetAutoDeploymentGetArgs() {}

    private StackSetAutoDeploymentGetArgs(StackSetAutoDeploymentGetArgs $) {
        this.enabled = $.enabled;
        this.retainStacksOnAccountRemoval = $.retainStacksOnAccountRemoval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackSetAutoDeploymentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackSetAutoDeploymentGetArgs $;

        public Builder() {
            $ = new StackSetAutoDeploymentGetArgs();
        }

        public Builder(StackSetAutoDeploymentGetArgs defaults) {
            $ = new StackSetAutoDeploymentGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether or not auto-deployment is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not auto-deployment is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param retainStacksOnAccountRemoval Whether or not to retain stacks when the account is removed.
         * 
         * @return builder
         * 
         */
        public Builder retainStacksOnAccountRemoval(@Nullable Output<Boolean> retainStacksOnAccountRemoval) {
            $.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }

        /**
         * @param retainStacksOnAccountRemoval Whether or not to retain stacks when the account is removed.
         * 
         * @return builder
         * 
         */
        public Builder retainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
            return retainStacksOnAccountRemoval(Output.of(retainStacksOnAccountRemoval));
        }

        public StackSetAutoDeploymentGetArgs build() {
            return $;
        }
    }

}
