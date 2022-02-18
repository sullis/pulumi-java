// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an OpenShift router
 * 
 */
public final class OpenShiftRouterProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenShiftRouterProfileArgs Empty = new OpenShiftRouterProfileArgs();

    /**
     * Name of the router profile.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public OpenShiftRouterProfileArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private OpenShiftRouterProfileArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftRouterProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftRouterProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public OpenShiftRouterProfileArgs build() {
            return new OpenShiftRouterProfileArgs(name);
        }
    }
}
