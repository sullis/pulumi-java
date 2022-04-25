// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.KeyVaultCertificateSourceParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the certificate source parameters using user&#39;s keyvault certificate for enabling SSL.
 * 
 */
public final class UserManagedHttpsParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserManagedHttpsParametersResponse Empty = new UserManagedHttpsParametersResponse();

    /**
     * Defines the source of the SSL certificate.
     * Expected value is &#39;AzureKeyVault&#39;.
     * 
     */
    @Import(name="certificateSource", required=true)
    private String certificateSource;

    /**
     * @return Defines the source of the SSL certificate.
     * Expected value is &#39;AzureKeyVault&#39;.
     * 
     */
    public String certificateSource() {
        return this.certificateSource;
    }

    /**
     * Defines the certificate source parameters using user&#39;s keyvault certificate for enabling SSL.
     * 
     */
    @Import(name="certificateSourceParameters", required=true)
    private KeyVaultCertificateSourceParametersResponse certificateSourceParameters;

    /**
     * @return Defines the certificate source parameters using user&#39;s keyvault certificate for enabling SSL.
     * 
     */
    public KeyVaultCertificateSourceParametersResponse certificateSourceParameters() {
        return this.certificateSourceParameters;
    }

    /**
     * TLS protocol version that will be used for Https
     * 
     */
    @Import(name="minimumTlsVersion")
    private @Nullable String minimumTlsVersion;

    /**
     * @return TLS protocol version that will be used for Https
     * 
     */
    public Optional<String> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }

    /**
     * Defines the TLS extension protocol that is used for secure delivery.
     * 
     */
    @Import(name="protocolType", required=true)
    private String protocolType;

    /**
     * @return Defines the TLS extension protocol that is used for secure delivery.
     * 
     */
    public String protocolType() {
        return this.protocolType;
    }

    private UserManagedHttpsParametersResponse() {}

    private UserManagedHttpsParametersResponse(UserManagedHttpsParametersResponse $) {
        this.certificateSource = $.certificateSource;
        this.certificateSourceParameters = $.certificateSourceParameters;
        this.minimumTlsVersion = $.minimumTlsVersion;
        this.protocolType = $.protocolType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserManagedHttpsParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserManagedHttpsParametersResponse $;

        public Builder() {
            $ = new UserManagedHttpsParametersResponse();
        }

        public Builder(UserManagedHttpsParametersResponse defaults) {
            $ = new UserManagedHttpsParametersResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateSource Defines the source of the SSL certificate.
         * Expected value is &#39;AzureKeyVault&#39;.
         * 
         * @return builder
         * 
         */
        public Builder certificateSource(String certificateSource) {
            $.certificateSource = certificateSource;
            return this;
        }

        /**
         * @param certificateSourceParameters Defines the certificate source parameters using user&#39;s keyvault certificate for enabling SSL.
         * 
         * @return builder
         * 
         */
        public Builder certificateSourceParameters(KeyVaultCertificateSourceParametersResponse certificateSourceParameters) {
            $.certificateSourceParameters = certificateSourceParameters;
            return this;
        }

        /**
         * @param minimumTlsVersion TLS protocol version that will be used for Https
         * 
         * @return builder
         * 
         */
        public Builder minimumTlsVersion(@Nullable String minimumTlsVersion) {
            $.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        /**
         * @param protocolType Defines the TLS extension protocol that is used for secure delivery.
         * 
         * @return builder
         * 
         */
        public Builder protocolType(String protocolType) {
            $.protocolType = protocolType;
            return this;
        }

        public UserManagedHttpsParametersResponse build() {
            $.certificateSource = Codegen.stringProp("certificateSource").arg($.certificateSource).require();
            $.certificateSourceParameters = Objects.requireNonNull($.certificateSourceParameters, "expected parameter 'certificateSourceParameters' to be non-null");
            $.protocolType = Objects.requireNonNull($.protocolType, "expected parameter 'protocolType' to be non-null");
            return $;
        }
    }

}
