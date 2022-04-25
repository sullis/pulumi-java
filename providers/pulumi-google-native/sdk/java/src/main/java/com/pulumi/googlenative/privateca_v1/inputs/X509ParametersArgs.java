// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1.inputs.CaOptionsArgs;
import com.pulumi.googlenative.privateca_v1.inputs.KeyUsageArgs;
import com.pulumi.googlenative.privateca_v1.inputs.ObjectIdArgs;
import com.pulumi.googlenative.privateca_v1.inputs.X509ExtensionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An X509Parameters is used to describe certain fields of an X.509 certificate, such as the key usage fields, fields specific to CA certificates, certificate policy extensions and custom extensions.
 * 
 */
public final class X509ParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final X509ParametersArgs Empty = new X509ParametersArgs();

    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    @Import(name="additionalExtensions")
    private @Nullable Output<List<X509ExtensionArgs>> additionalExtensions;

    /**
     * @return Optional. Describes custom X.509 extensions.
     * 
     */
    public Optional<Output<List<X509ExtensionArgs>>> additionalExtensions() {
        return Optional.ofNullable(this.additionalExtensions);
    }

    /**
     * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    @Import(name="aiaOcspServers")
    private @Nullable Output<List<String>> aiaOcspServers;

    /**
     * @return Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    public Optional<Output<List<String>>> aiaOcspServers() {
        return Optional.ofNullable(this.aiaOcspServers);
    }

    /**
     * Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
     * 
     */
    @Import(name="caOptions")
    private @Nullable Output<CaOptionsArgs> caOptions;

    /**
     * @return Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
     * 
     */
    public Optional<Output<CaOptionsArgs>> caOptions() {
        return Optional.ofNullable(this.caOptions);
    }

    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    @Import(name="keyUsage")
    private @Nullable Output<KeyUsageArgs> keyUsage;

    /**
     * @return Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    public Optional<Output<KeyUsageArgs>> keyUsage() {
        return Optional.ofNullable(this.keyUsage);
    }

    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    @Import(name="policyIds")
    private @Nullable Output<List<ObjectIdArgs>> policyIds;

    /**
     * @return Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    public Optional<Output<List<ObjectIdArgs>>> policyIds() {
        return Optional.ofNullable(this.policyIds);
    }

    private X509ParametersArgs() {}

    private X509ParametersArgs(X509ParametersArgs $) {
        this.additionalExtensions = $.additionalExtensions;
        this.aiaOcspServers = $.aiaOcspServers;
        this.caOptions = $.caOptions;
        this.keyUsage = $.keyUsage;
        this.policyIds = $.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X509ParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X509ParametersArgs $;

        public Builder() {
            $ = new X509ParametersArgs();
        }

        public Builder(X509ParametersArgs defaults) {
            $ = new X509ParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalExtensions Optional. Describes custom X.509 extensions.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(@Nullable Output<List<X509ExtensionArgs>> additionalExtensions) {
            $.additionalExtensions = additionalExtensions;
            return this;
        }

        /**
         * @param additionalExtensions Optional. Describes custom X.509 extensions.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(List<X509ExtensionArgs> additionalExtensions) {
            return additionalExtensions(Output.of(additionalExtensions));
        }

        /**
         * @param additionalExtensions Optional. Describes custom X.509 extensions.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(X509ExtensionArgs... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }

        /**
         * @param aiaOcspServers Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(@Nullable Output<List<String>> aiaOcspServers) {
            $.aiaOcspServers = aiaOcspServers;
            return this;
        }

        /**
         * @param aiaOcspServers Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(List<String> aiaOcspServers) {
            return aiaOcspServers(Output.of(aiaOcspServers));
        }

        /**
         * @param aiaOcspServers Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }

        /**
         * @param caOptions Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder caOptions(@Nullable Output<CaOptionsArgs> caOptions) {
            $.caOptions = caOptions;
            return this;
        }

        /**
         * @param caOptions Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder caOptions(CaOptionsArgs caOptions) {
            return caOptions(Output.of(caOptions));
        }

        /**
         * @param keyUsage Optional. Indicates the intended use for keys that correspond to a certificate.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(@Nullable Output<KeyUsageArgs> keyUsage) {
            $.keyUsage = keyUsage;
            return this;
        }

        /**
         * @param keyUsage Optional. Indicates the intended use for keys that correspond to a certificate.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(KeyUsageArgs keyUsage) {
            return keyUsage(Output.of(keyUsage));
        }

        /**
         * @param policyIds Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(@Nullable Output<List<ObjectIdArgs>> policyIds) {
            $.policyIds = policyIds;
            return this;
        }

        /**
         * @param policyIds Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(List<ObjectIdArgs> policyIds) {
            return policyIds(Output.of(policyIds));
        }

        /**
         * @param policyIds Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(ObjectIdArgs... policyIds) {
            return policyIds(List.of(policyIds));
        }

        public X509ParametersArgs build() {
            return $;
        }
    }

}
