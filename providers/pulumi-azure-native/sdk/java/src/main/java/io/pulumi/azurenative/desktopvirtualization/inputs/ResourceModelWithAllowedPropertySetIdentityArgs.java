// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.azurenative.desktopvirtualization.enums.ResourceIdentityType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceModelWithAllowedPropertySetIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceModelWithAllowedPropertySetIdentityArgs Empty = new ResourceModelWithAllowedPropertySetIdentityArgs();

    /**
     * The identity type.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<ResourceIdentityType> type;

    public Input<ResourceIdentityType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ResourceModelWithAllowedPropertySetIdentityArgs(@Nullable Input<ResourceIdentityType> type) {
        this.type = type;
    }

    private ResourceModelWithAllowedPropertySetIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceModelWithAllowedPropertySetIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceModelWithAllowedPropertySetIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<ResourceIdentityType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ResourceIdentityType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public ResourceModelWithAllowedPropertySetIdentityArgs build() {
            return new ResourceModelWithAllowedPropertySetIdentityArgs(type);
        }
    }
}
