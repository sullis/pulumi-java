// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.OpenIdConnectClientCredentialArgs;
import com.pulumi.azurenative.web.inputs.OpenIdConnectConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the app registration for the custom Open ID Connect provider.
 * 
 */
public final class OpenIdConnectRegistrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenIdConnectRegistrationArgs Empty = new OpenIdConnectRegistrationArgs();

    /**
     * The authentication credentials of the custom Open ID Connect provider.
     * 
     */
    @Import(name="clientCredential")
    private @Nullable Output<OpenIdConnectClientCredentialArgs> clientCredential;

    /**
     * @return The authentication credentials of the custom Open ID Connect provider.
     * 
     */
    public Optional<Output<OpenIdConnectClientCredentialArgs>> clientCredential() {
        return Optional.ofNullable(this.clientCredential);
    }

    /**
     * The client id of the custom Open ID Connect provider.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The client id of the custom Open ID Connect provider.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The configuration settings of the endpoints used for the custom Open ID Connect provider.
     * 
     */
    @Import(name="openIdConnectConfiguration")
    private @Nullable Output<OpenIdConnectConfigArgs> openIdConnectConfiguration;

    /**
     * @return The configuration settings of the endpoints used for the custom Open ID Connect provider.
     * 
     */
    public Optional<Output<OpenIdConnectConfigArgs>> openIdConnectConfiguration() {
        return Optional.ofNullable(this.openIdConnectConfiguration);
    }

    private OpenIdConnectRegistrationArgs() {}

    private OpenIdConnectRegistrationArgs(OpenIdConnectRegistrationArgs $) {
        this.clientCredential = $.clientCredential;
        this.clientId = $.clientId;
        this.openIdConnectConfiguration = $.openIdConnectConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenIdConnectRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenIdConnectRegistrationArgs $;

        public Builder() {
            $ = new OpenIdConnectRegistrationArgs();
        }

        public Builder(OpenIdConnectRegistrationArgs defaults) {
            $ = new OpenIdConnectRegistrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientCredential The authentication credentials of the custom Open ID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder clientCredential(@Nullable Output<OpenIdConnectClientCredentialArgs> clientCredential) {
            $.clientCredential = clientCredential;
            return this;
        }

        /**
         * @param clientCredential The authentication credentials of the custom Open ID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder clientCredential(OpenIdConnectClientCredentialArgs clientCredential) {
            return clientCredential(Output.of(clientCredential));
        }

        /**
         * @param clientId The client id of the custom Open ID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The client id of the custom Open ID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param openIdConnectConfiguration The configuration settings of the endpoints used for the custom Open ID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder openIdConnectConfiguration(@Nullable Output<OpenIdConnectConfigArgs> openIdConnectConfiguration) {
            $.openIdConnectConfiguration = openIdConnectConfiguration;
            return this;
        }

        /**
         * @param openIdConnectConfiguration The configuration settings of the endpoints used for the custom Open ID Connect provider.
         * 
         * @return builder
         * 
         */
        public Builder openIdConnectConfiguration(OpenIdConnectConfigArgs openIdConnectConfiguration) {
            return openIdConnectConfiguration(Output.of(openIdConnectConfiguration));
        }

        public OpenIdConnectRegistrationArgs build() {
            return $;
        }
    }

}
