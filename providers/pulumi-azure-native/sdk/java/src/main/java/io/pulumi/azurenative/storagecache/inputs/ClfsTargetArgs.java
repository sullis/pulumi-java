// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties pertaining to the ClfsTarget
 * 
 */
public final class ClfsTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClfsTargetArgs Empty = new ClfsTargetArgs();

    /**
     * Resource ID of storage container.
     * 
     */
    @InputImport(name="target")
      private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    public ClfsTargetArgs(@Nullable Input<String> target) {
        this.target = target;
    }

    private ClfsTargetArgs() {
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClfsTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ClfsTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }
        public ClfsTargetArgs build() {
            return new ClfsTargetArgs(target);
        }
    }
}