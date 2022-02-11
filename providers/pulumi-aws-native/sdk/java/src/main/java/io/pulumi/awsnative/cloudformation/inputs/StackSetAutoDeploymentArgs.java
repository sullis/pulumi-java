// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackSetAutoDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackSetAutoDeploymentArgs Empty = new StackSetAutoDeploymentArgs();

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="retainStacksOnAccountRemoval")
    private final @Nullable Input<Boolean> retainStacksOnAccountRemoval;

    public Input<Boolean> getRetainStacksOnAccountRemoval() {
        return this.retainStacksOnAccountRemoval == null ? Input.empty() : this.retainStacksOnAccountRemoval;
    }

    public StackSetAutoDeploymentArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Boolean> retainStacksOnAccountRemoval) {
        this.enabled = enabled;
        this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
    }

    private StackSetAutoDeploymentArgs() {
        this.enabled = Input.empty();
        this.retainStacksOnAccountRemoval = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetAutoDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Boolean> retainStacksOnAccountRemoval;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetAutoDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retainStacksOnAccountRemoval = defaults.retainStacksOnAccountRemoval;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setRetainStacksOnAccountRemoval(@Nullable Input<Boolean> retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }

        public Builder setRetainStacksOnAccountRemoval(@Nullable Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = Input.ofNullable(retainStacksOnAccountRemoval);
            return this;
        }

        public StackSetAutoDeploymentArgs build() {
            return new StackSetAutoDeploymentArgs(enabled, retainStacksOnAccountRemoval);
        }
    }
}
