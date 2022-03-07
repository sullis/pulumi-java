// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.WorkspaceKeyDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details of the customer managed key associated with the workspace
 * 
 */
public final class CustomerManagedKeyDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerManagedKeyDetailsArgs Empty = new CustomerManagedKeyDetailsArgs();

    /**
     * The key object of the workspace
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<WorkspaceKeyDetailsArgs> key;

    public Input<WorkspaceKeyDetailsArgs> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    public CustomerManagedKeyDetailsArgs(@Nullable Input<WorkspaceKeyDetailsArgs> key) {
        this.key = key;
    }

    private CustomerManagedKeyDetailsArgs() {
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerManagedKeyDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkspaceKeyDetailsArgs> key;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerManagedKeyDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        public Builder setKey(@Nullable Input<WorkspaceKeyDetailsArgs> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable WorkspaceKeyDetailsArgs key) {
            this.key = Input.ofNullable(key);
            return this;
        }
        public CustomerManagedKeyDetailsArgs build() {
            return new CustomerManagedKeyDetailsArgs(key);
        }
    }
}