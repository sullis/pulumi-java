// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.ContentKeyPolicyRestrictionTokenType;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyRsaTokenKeyArgs;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicySymmetricTokenKeyArgs;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyTokenClaimArgs;
import com.pulumi.azurenative.media.inputs.ContentKeyPolicyX509CertificateTokenKeyArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a token restriction. Provided token must match these requirements for successful license or key delivery.
 * 
 */
public final class ContentKeyPolicyTokenRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyTokenRestrictionArgs Empty = new ContentKeyPolicyTokenRestrictionArgs();

    /**
     * A list of alternative verification keys.
     * 
     */
    @Import(name="alternateVerificationKeys")
    private @Nullable Output<List<Object>> alternateVerificationKeys;

    /**
     * @return A list of alternative verification keys.
     * 
     */
    public Optional<Output<List<Object>>> alternateVerificationKeys() {
        return Optional.ofNullable(this.alternateVerificationKeys);
    }

    /**
     * The audience for the token.
     * 
     */
    @Import(name="audience", required=true)
    private Output<String> audience;

    /**
     * @return The audience for the token.
     * 
     */
    public Output<String> audience() {
        return this.audience;
    }

    /**
     * The token issuer.
     * 
     */
    @Import(name="issuer", required=true)
    private Output<String> issuer;

    /**
     * @return The token issuer.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyTokenRestriction&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyTokenRestriction&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The OpenID connect discovery document.
     * 
     */
    @Import(name="openIdConnectDiscoveryDocument")
    private @Nullable Output<String> openIdConnectDiscoveryDocument;

    /**
     * @return The OpenID connect discovery document.
     * 
     */
    public Optional<Output<String>> openIdConnectDiscoveryDocument() {
        return Optional.ofNullable(this.openIdConnectDiscoveryDocument);
    }

    /**
     * The primary verification key.
     * 
     */
    @Import(name="primaryVerificationKey", required=true)
    private Output<Object> primaryVerificationKey;

    /**
     * @return The primary verification key.
     * 
     */
    public Output<Object> primaryVerificationKey() {
        return this.primaryVerificationKey;
    }

    /**
     * A list of required token claims.
     * 
     */
    @Import(name="requiredClaims")
    private @Nullable Output<List<ContentKeyPolicyTokenClaimArgs>> requiredClaims;

    /**
     * @return A list of required token claims.
     * 
     */
    public Optional<Output<List<ContentKeyPolicyTokenClaimArgs>>> requiredClaims() {
        return Optional.ofNullable(this.requiredClaims);
    }

    /**
     * The type of token.
     * 
     */
    @Import(name="restrictionTokenType", required=true)
    private Output<Either<String,ContentKeyPolicyRestrictionTokenType>> restrictionTokenType;

    /**
     * @return The type of token.
     * 
     */
    public Output<Either<String,ContentKeyPolicyRestrictionTokenType>> restrictionTokenType() {
        return this.restrictionTokenType;
    }

    private ContentKeyPolicyTokenRestrictionArgs() {}

    private ContentKeyPolicyTokenRestrictionArgs(ContentKeyPolicyTokenRestrictionArgs $) {
        this.alternateVerificationKeys = $.alternateVerificationKeys;
        this.audience = $.audience;
        this.issuer = $.issuer;
        this.odataType = $.odataType;
        this.openIdConnectDiscoveryDocument = $.openIdConnectDiscoveryDocument;
        this.primaryVerificationKey = $.primaryVerificationKey;
        this.requiredClaims = $.requiredClaims;
        this.restrictionTokenType = $.restrictionTokenType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentKeyPolicyTokenRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentKeyPolicyTokenRestrictionArgs $;

        public Builder() {
            $ = new ContentKeyPolicyTokenRestrictionArgs();
        }

        public Builder(ContentKeyPolicyTokenRestrictionArgs defaults) {
            $ = new ContentKeyPolicyTokenRestrictionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alternateVerificationKeys A list of alternative verification keys.
         * 
         * @return builder
         * 
         */
        public Builder alternateVerificationKeys(@Nullable Output<List<Object>> alternateVerificationKeys) {
            $.alternateVerificationKeys = alternateVerificationKeys;
            return this;
        }

        /**
         * @param alternateVerificationKeys A list of alternative verification keys.
         * 
         * @return builder
         * 
         */
        public Builder alternateVerificationKeys(List<Object> alternateVerificationKeys) {
            return alternateVerificationKeys(Output.of(alternateVerificationKeys));
        }

        /**
         * @param alternateVerificationKeys A list of alternative verification keys.
         * 
         * @return builder
         * 
         */
        public Builder alternateVerificationKeys(Object... alternateVerificationKeys) {
            return alternateVerificationKeys(List.of(alternateVerificationKeys));
        }

        /**
         * @param audience The audience for the token.
         * 
         * @return builder
         * 
         */
        public Builder audience(Output<String> audience) {
            $.audience = audience;
            return this;
        }

        /**
         * @param audience The audience for the token.
         * 
         * @return builder
         * 
         */
        public Builder audience(String audience) {
            return audience(Output.of(audience));
        }

        /**
         * @param issuer The token issuer.
         * 
         * @return builder
         * 
         */
        public Builder issuer(Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer The token issuer.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyTokenRestriction&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyTokenRestriction&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param openIdConnectDiscoveryDocument The OpenID connect discovery document.
         * 
         * @return builder
         * 
         */
        public Builder openIdConnectDiscoveryDocument(@Nullable Output<String> openIdConnectDiscoveryDocument) {
            $.openIdConnectDiscoveryDocument = openIdConnectDiscoveryDocument;
            return this;
        }

        /**
         * @param openIdConnectDiscoveryDocument The OpenID connect discovery document.
         * 
         * @return builder
         * 
         */
        public Builder openIdConnectDiscoveryDocument(String openIdConnectDiscoveryDocument) {
            return openIdConnectDiscoveryDocument(Output.of(openIdConnectDiscoveryDocument));
        }

        /**
         * @param primaryVerificationKey The primary verification key.
         * 
         * @return builder
         * 
         */
        public Builder primaryVerificationKey(Output<Object> primaryVerificationKey) {
            $.primaryVerificationKey = primaryVerificationKey;
            return this;
        }

        /**
         * @param primaryVerificationKey The primary verification key.
         * 
         * @return builder
         * 
         */
        public Builder primaryVerificationKey(Object primaryVerificationKey) {
            return primaryVerificationKey(Output.of(primaryVerificationKey));
        }

        /**
         * @param requiredClaims A list of required token claims.
         * 
         * @return builder
         * 
         */
        public Builder requiredClaims(@Nullable Output<List<ContentKeyPolicyTokenClaimArgs>> requiredClaims) {
            $.requiredClaims = requiredClaims;
            return this;
        }

        /**
         * @param requiredClaims A list of required token claims.
         * 
         * @return builder
         * 
         */
        public Builder requiredClaims(List<ContentKeyPolicyTokenClaimArgs> requiredClaims) {
            return requiredClaims(Output.of(requiredClaims));
        }

        /**
         * @param requiredClaims A list of required token claims.
         * 
         * @return builder
         * 
         */
        public Builder requiredClaims(ContentKeyPolicyTokenClaimArgs... requiredClaims) {
            return requiredClaims(List.of(requiredClaims));
        }

        /**
         * @param restrictionTokenType The type of token.
         * 
         * @return builder
         * 
         */
        public Builder restrictionTokenType(Output<Either<String,ContentKeyPolicyRestrictionTokenType>> restrictionTokenType) {
            $.restrictionTokenType = restrictionTokenType;
            return this;
        }

        /**
         * @param restrictionTokenType The type of token.
         * 
         * @return builder
         * 
         */
        public Builder restrictionTokenType(Either<String,ContentKeyPolicyRestrictionTokenType> restrictionTokenType) {
            return restrictionTokenType(Output.of(restrictionTokenType));
        }

        /**
         * @param restrictionTokenType The type of token.
         * 
         * @return builder
         * 
         */
        public Builder restrictionTokenType(String restrictionTokenType) {
            return restrictionTokenType(Either.ofLeft(restrictionTokenType));
        }

        /**
         * @param restrictionTokenType The type of token.
         * 
         * @return builder
         * 
         */
        public Builder restrictionTokenType(ContentKeyPolicyRestrictionTokenType restrictionTokenType) {
            return restrictionTokenType(Either.ofRight(restrictionTokenType));
        }

        public ContentKeyPolicyTokenRestrictionArgs build() {
            $.audience = Objects.requireNonNull($.audience, "expected parameter 'audience' to be non-null");
            $.issuer = Objects.requireNonNull($.issuer, "expected parameter 'issuer' to be non-null");
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            $.primaryVerificationKey = Objects.requireNonNull($.primaryVerificationKey, "expected parameter 'primaryVerificationKey' to be non-null");
            $.restrictionTokenType = Objects.requireNonNull($.restrictionTokenType, "expected parameter 'restrictionTokenType' to be non-null");
            return $;
        }
    }

}
