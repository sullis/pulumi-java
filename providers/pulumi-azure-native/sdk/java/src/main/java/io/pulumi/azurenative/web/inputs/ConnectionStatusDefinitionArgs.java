// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ConnectionErrorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connection status
 * 
 */
public final class ConnectionStatusDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionStatusDefinitionArgs Empty = new ConnectionStatusDefinitionArgs();

    /**
     * Connection error
     * 
     */
    @InputImport(name="error")
    private final @Nullable Input<ConnectionErrorArgs> error;

    public Input<ConnectionErrorArgs> getError() {
        return this.error == null ? Input.empty() : this.error;
    }

    /**
     * The gateway status
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Target of the error
     * 
     */
    @InputImport(name="target")
    private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    public ConnectionStatusDefinitionArgs(
        @Nullable Input<ConnectionErrorArgs> error,
        @Nullable Input<String> status,
        @Nullable Input<String> target) {
        this.error = error;
        this.status = status;
        this.target = target;
    }

    private ConnectionStatusDefinitionArgs() {
        this.error = Input.empty();
        this.status = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionStatusDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConnectionErrorArgs> error;
        private @Nullable Input<String> status;
        private @Nullable Input<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionStatusDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.status = defaults.status;
    	      this.target = defaults.target;
        }

        public Builder setError(@Nullable Input<ConnectionErrorArgs> error) {
            this.error = error;
            return this;
        }

        public Builder setError(@Nullable ConnectionErrorArgs error) {
            this.error = Input.ofNullable(error);
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

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public ConnectionStatusDefinitionArgs build() {
            return new ConnectionStatusDefinitionArgs(error, status, target);
        }
    }
}
