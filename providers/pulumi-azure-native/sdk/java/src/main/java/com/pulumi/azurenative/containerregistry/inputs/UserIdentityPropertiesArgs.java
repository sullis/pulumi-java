// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserIdentityPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserIdentityPropertiesArgs Empty = new UserIdentityPropertiesArgs();

    /**
     * The client id of user assigned identity.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The client id of user assigned identity.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The principal id of user assigned identity.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The principal id of user assigned identity.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    private UserIdentityPropertiesArgs() {}

    private UserIdentityPropertiesArgs(UserIdentityPropertiesArgs $) {
        this.clientId = $.clientId;
        this.principalId = $.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserIdentityPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserIdentityPropertiesArgs $;

        public Builder() {
            $ = new UserIdentityPropertiesArgs();
        }

        public Builder(UserIdentityPropertiesArgs defaults) {
            $ = new UserIdentityPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The client id of user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client id of user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param principalId The principal id of user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The principal id of user assigned identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        public UserIdentityPropertiesArgs build() {
            return $;
        }
    }

}
