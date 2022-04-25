// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.enums.BearerTokenSendingMethods;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API OAuth2 Authentication settings details.
 * 
 */
public final class OpenIdAuthenticationSettingsContractArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenIdAuthenticationSettingsContractArgs Empty = new OpenIdAuthenticationSettingsContractArgs();

    /**
     * How to send token to the server.
     * 
     */
    @Import(name="bearerTokenSendingMethods")
    private @Nullable Output<List<Either<String,BearerTokenSendingMethods>>> bearerTokenSendingMethods;

    /**
     * @return How to send token to the server.
     * 
     */
    public Optional<Output<List<Either<String,BearerTokenSendingMethods>>>> bearerTokenSendingMethods() {
        return Optional.ofNullable(this.bearerTokenSendingMethods);
    }

    /**
     * OAuth authorization server identifier.
     * 
     */
    @Import(name="openidProviderId")
    private @Nullable Output<String> openidProviderId;

    /**
     * @return OAuth authorization server identifier.
     * 
     */
    public Optional<Output<String>> openidProviderId() {
        return Optional.ofNullable(this.openidProviderId);
    }

    private OpenIdAuthenticationSettingsContractArgs() {}

    private OpenIdAuthenticationSettingsContractArgs(OpenIdAuthenticationSettingsContractArgs $) {
        this.bearerTokenSendingMethods = $.bearerTokenSendingMethods;
        this.openidProviderId = $.openidProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenIdAuthenticationSettingsContractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenIdAuthenticationSettingsContractArgs $;

        public Builder() {
            $ = new OpenIdAuthenticationSettingsContractArgs();
        }

        public Builder(OpenIdAuthenticationSettingsContractArgs defaults) {
            $ = new OpenIdAuthenticationSettingsContractArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bearerTokenSendingMethods How to send token to the server.
         * 
         * @return builder
         * 
         */
        public Builder bearerTokenSendingMethods(@Nullable Output<List<Either<String,BearerTokenSendingMethods>>> bearerTokenSendingMethods) {
            $.bearerTokenSendingMethods = bearerTokenSendingMethods;
            return this;
        }

        /**
         * @param bearerTokenSendingMethods How to send token to the server.
         * 
         * @return builder
         * 
         */
        public Builder bearerTokenSendingMethods(List<Either<String,BearerTokenSendingMethods>> bearerTokenSendingMethods) {
            return bearerTokenSendingMethods(Output.of(bearerTokenSendingMethods));
        }

        /**
         * @param bearerTokenSendingMethods How to send token to the server.
         * 
         * @return builder
         * 
         */
        public Builder bearerTokenSendingMethods(Either<String,BearerTokenSendingMethods>... bearerTokenSendingMethods) {
            return bearerTokenSendingMethods(List.of(bearerTokenSendingMethods));
        }

        /**
         * @param openidProviderId OAuth authorization server identifier.
         * 
         * @return builder
         * 
         */
        public Builder openidProviderId(@Nullable Output<String> openidProviderId) {
            $.openidProviderId = openidProviderId;
            return this;
        }

        /**
         * @param openidProviderId OAuth authorization server identifier.
         * 
         * @return builder
         * 
         */
        public Builder openidProviderId(String openidProviderId) {
            return openidProviderId(Output.of(openidProviderId));
        }

        public OpenIdAuthenticationSettingsContractArgs build() {
            return $;
        }
    }

}
