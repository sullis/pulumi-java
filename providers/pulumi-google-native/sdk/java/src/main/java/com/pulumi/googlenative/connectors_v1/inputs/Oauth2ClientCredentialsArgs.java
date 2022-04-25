// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.connectors_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.connectors_v1.inputs.SecretArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters to support Oauth 2.0 Client Credentials Grant Authentication. See https://tools.ietf.org/html/rfc6749#section-1.3.4 for more details.
 * 
 */
public final class Oauth2ClientCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final Oauth2ClientCredentialsArgs Empty = new Oauth2ClientCredentialsArgs();

    /**
     * The client identifier.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The client identifier.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * Secret version reference containing the client secret.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<SecretArgs> clientSecret;

    /**
     * @return Secret version reference containing the client secret.
     * 
     */
    public Optional<Output<SecretArgs>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    private Oauth2ClientCredentialsArgs() {}

    private Oauth2ClientCredentialsArgs(Oauth2ClientCredentialsArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Oauth2ClientCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Oauth2ClientCredentialsArgs $;

        public Builder() {
            $ = new Oauth2ClientCredentialsArgs();
        }

        public Builder(Oauth2ClientCredentialsArgs defaults) {
            $ = new Oauth2ClientCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The client identifier.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client identifier.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret Secret version reference containing the client secret.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<SecretArgs> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret Secret version reference containing the client secret.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(SecretArgs clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Oauth2ClientCredentialsArgs build() {
            return $;
        }
    }

}
