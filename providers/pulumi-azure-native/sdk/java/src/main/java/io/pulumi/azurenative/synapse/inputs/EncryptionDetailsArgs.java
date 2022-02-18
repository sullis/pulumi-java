// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.CustomerManagedKeyDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details of the encryption associated with the workspace
 * 
 */
public final class EncryptionDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionDetailsArgs Empty = new EncryptionDetailsArgs();

    /**
     * Customer Managed Key Details
     * 
     */
    @InputImport(name="cmk")
    private final @Nullable Input<CustomerManagedKeyDetailsArgs> cmk;

    public Input<CustomerManagedKeyDetailsArgs> getCmk() {
        return this.cmk == null ? Input.empty() : this.cmk;
    }

    public EncryptionDetailsArgs(@Nullable Input<CustomerManagedKeyDetailsArgs> cmk) {
        this.cmk = cmk;
    }

    private EncryptionDetailsArgs() {
        this.cmk = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CustomerManagedKeyDetailsArgs> cmk;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cmk = defaults.cmk;
        }

        public Builder setCmk(@Nullable Input<CustomerManagedKeyDetailsArgs> cmk) {
            this.cmk = cmk;
            return this;
        }

        public Builder setCmk(@Nullable CustomerManagedKeyDetailsArgs cmk) {
            this.cmk = Input.ofNullable(cmk);
            return this;
        }

        public EncryptionDetailsArgs build() {
            return new EncryptionDetailsArgs(cmk);
        }
    }
}
