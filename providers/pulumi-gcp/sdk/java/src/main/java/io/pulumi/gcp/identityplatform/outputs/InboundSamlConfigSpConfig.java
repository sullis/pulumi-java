// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.identityplatform.outputs.InboundSamlConfigSpConfigSpCertificate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InboundSamlConfigSpConfig {
    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    private final @Nullable String callbackUri;
    /**
     * - 
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<InboundSamlConfigSpConfigSpCertificate> spCertificates;
    /**
     * Unique identifier for all SAML entities.
     * 
     */
    private final @Nullable String spEntityId;

    @OutputCustomType.Constructor({"callbackUri","spCertificates","spEntityId"})
    private InboundSamlConfigSpConfig(
        @Nullable String callbackUri,
        @Nullable List<InboundSamlConfigSpConfigSpCertificate> spCertificates,
        @Nullable String spEntityId) {
        this.callbackUri = callbackUri;
        this.spCertificates = spCertificates;
        this.spEntityId = spEntityId;
    }

    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    public Optional<String> getCallbackUri() {
        return Optional.ofNullable(this.callbackUri);
    }
    /**
     * - 
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    public List<InboundSamlConfigSpConfigSpCertificate> getSpCertificates() {
        return this.spCertificates == null ? List.of() : this.spCertificates;
    }
    /**
     * Unique identifier for all SAML entities.
     * 
     */
    public Optional<String> getSpEntityId() {
        return Optional.ofNullable(this.spEntityId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundSamlConfigSpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String callbackUri;
        private @Nullable List<InboundSamlConfigSpConfigSpCertificate> spCertificates;
        private @Nullable String spEntityId;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundSamlConfigSpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUri = defaults.callbackUri;
    	      this.spCertificates = defaults.spCertificates;
    	      this.spEntityId = defaults.spEntityId;
        }

        public Builder setCallbackUri(@Nullable String callbackUri) {
            this.callbackUri = callbackUri;
            return this;
        }

        public Builder setSpCertificates(@Nullable List<InboundSamlConfigSpConfigSpCertificate> spCertificates) {
            this.spCertificates = spCertificates;
            return this;
        }

        public Builder setSpEntityId(@Nullable String spEntityId) {
            this.spEntityId = spEntityId;
            return this;
        }

        public InboundSamlConfigSpConfig build() {
            return new InboundSamlConfigSpConfig(callbackUri, spCertificates, spEntityId);
        }
    }
}
