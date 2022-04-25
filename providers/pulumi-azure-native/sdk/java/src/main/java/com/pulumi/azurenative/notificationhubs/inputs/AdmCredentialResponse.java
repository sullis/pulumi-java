// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub AdmCredential.
 * 
 */
public final class AdmCredentialResponse extends com.pulumi.resources.InvokeArgs {

    public static final AdmCredentialResponse Empty = new AdmCredentialResponse();

    /**
     * The URL of the authorization token.
     * 
     */
    @Import(name="authTokenUrl")
    private @Nullable String authTokenUrl;

    /**
     * @return The URL of the authorization token.
     * 
     */
    public Optional<String> authTokenUrl() {
        return Optional.ofNullable(this.authTokenUrl);
    }

    /**
     * The client identifier.
     * 
     */
    @Import(name="clientId")
    private @Nullable String clientId;

    /**
     * @return The client identifier.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The credential secret access key.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable String clientSecret;

    /**
     * @return The credential secret access key.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    private AdmCredentialResponse() {}

    private AdmCredentialResponse(AdmCredentialResponse $) {
        this.authTokenUrl = $.authTokenUrl;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdmCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdmCredentialResponse $;

        public Builder() {
            $ = new AdmCredentialResponse();
        }

        public Builder(AdmCredentialResponse defaults) {
            $ = new AdmCredentialResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param authTokenUrl The URL of the authorization token.
         * 
         * @return builder
         * 
         */
        public Builder authTokenUrl(@Nullable String authTokenUrl) {
            $.authTokenUrl = authTokenUrl;
            return this;
        }

        /**
         * @param clientId The client identifier.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable String clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientSecret The credential secret access key.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable String clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public AdmCredentialResponse build() {
            return $;
        }
    }

}
