// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * describe the properties of a security assessment object reference (by key)
 * 
 */
public final class AssignedComponentItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignedComponentItemArgs Empty = new AssignedComponentItemArgs();

    /**
     * unique key to a security assessment object
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    public AssignedComponentItemArgs(@Nullable Input<String> key) {
        this.key = key;
    }

    private AssignedComponentItemArgs() {
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignedComponentItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignedComponentItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public AssignedComponentItemArgs build() {
            return new AssignedComponentItemArgs(key);
        }
    }
}
