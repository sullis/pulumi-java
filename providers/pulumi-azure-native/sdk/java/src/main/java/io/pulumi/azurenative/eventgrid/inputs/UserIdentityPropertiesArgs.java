// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The information about the user identity.
 * 
 */
public final class UserIdentityPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserIdentityPropertiesArgs Empty = new UserIdentityPropertiesArgs();

    /**
     * The client id of user assigned identity.
     * 
     */
    @InputImport(name="clientId")
    private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * The principal id of user assigned identity.
     * 
     */
    @InputImport(name="principalId")
    private final @Nullable Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId == null ? Input.empty() : this.principalId;
    }

    public UserIdentityPropertiesArgs(
        @Nullable Input<String> clientId,
        @Nullable Input<String> principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    private UserIdentityPropertiesArgs() {
        this.clientId = Input.empty();
        this.principalId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setPrincipalId(@Nullable Input<String> principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = Input.ofNullable(principalId);
            return this;
        }

        public UserIdentityPropertiesArgs build() {
            return new UserIdentityPropertiesArgs(clientId, principalId);
        }
    }
}
