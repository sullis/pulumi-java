// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.azurenative.desktopvirtualization.enums.RegistrationTokenOperation;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a RegistrationInfo definition.
 * 
 */
public final class RegistrationInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistrationInfoArgs Empty = new RegistrationInfoArgs();

    /**
     * Expiration time of registration token.
     * 
     */
    @InputImport(name="expirationTime")
      private final @Nullable Input<String> expirationTime;

    public Input<String> getExpirationTime() {
        return this.expirationTime == null ? Input.empty() : this.expirationTime;
    }

    /**
     * The type of resetting the token.
     * 
     */
    @InputImport(name="registrationTokenOperation")
      private final @Nullable Input<Either<String,RegistrationTokenOperation>> registrationTokenOperation;

    public Input<Either<String,RegistrationTokenOperation>> getRegistrationTokenOperation() {
        return this.registrationTokenOperation == null ? Input.empty() : this.registrationTokenOperation;
    }

    /**
     * The registration token base64 encoded string.
     * 
     */
    @InputImport(name="token")
      private final @Nullable Input<String> token;

    public Input<String> getToken() {
        return this.token == null ? Input.empty() : this.token;
    }

    public RegistrationInfoArgs(
        @Nullable Input<String> expirationTime,
        @Nullable Input<Either<String,RegistrationTokenOperation>> registrationTokenOperation,
        @Nullable Input<String> token) {
        this.expirationTime = expirationTime;
        this.registrationTokenOperation = registrationTokenOperation;
        this.token = token;
    }

    private RegistrationInfoArgs() {
        this.expirationTime = Input.empty();
        this.registrationTokenOperation = Input.empty();
        this.token = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expirationTime;
        private @Nullable Input<Either<String,RegistrationTokenOperation>> registrationTokenOperation;
        private @Nullable Input<String> token;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.registrationTokenOperation = defaults.registrationTokenOperation;
    	      this.token = defaults.token;
        }

        public Builder setExpirationTime(@Nullable Input<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder setExpirationTime(@Nullable String expirationTime) {
            this.expirationTime = Input.ofNullable(expirationTime);
            return this;
        }

        public Builder setRegistrationTokenOperation(@Nullable Input<Either<String,RegistrationTokenOperation>> registrationTokenOperation) {
            this.registrationTokenOperation = registrationTokenOperation;
            return this;
        }

        public Builder setRegistrationTokenOperation(@Nullable Either<String,RegistrationTokenOperation> registrationTokenOperation) {
            this.registrationTokenOperation = Input.ofNullable(registrationTokenOperation);
            return this;
        }

        public Builder setToken(@Nullable Input<String> token) {
            this.token = token;
            return this;
        }

        public Builder setToken(@Nullable String token) {
            this.token = Input.ofNullable(token);
            return this;
        }
        public RegistrationInfoArgs build() {
            return new RegistrationInfoArgs(expirationTime, registrationTokenOperation, token);
        }
    }
}