// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connection State of the Private Endpoint Connection.
 * 
 */
public final class PrivateLinkServiceConnectionStatePropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStatePropertyArgs Empty = new PrivateLinkServiceConnectionStatePropertyArgs();

    /**
     * The private link service connection description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The private link service connection status.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public PrivateLinkServiceConnectionStatePropertyArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> status) {
        this.description = description;
        this.status = status;
    }

    private PrivateLinkServiceConnectionStatePropertyArgs() {
        this.description = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStatePropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStatePropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public PrivateLinkServiceConnectionStatePropertyArgs build() {
            return new PrivateLinkServiceConnectionStatePropertyArgs(description, status);
        }
    }
}