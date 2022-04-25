// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1beta1.inputs.CaOptionsResponse;
import com.pulumi.googlenative.privateca_v1beta1.inputs.KeyUsageResponse;
import com.pulumi.googlenative.privateca_v1beta1.inputs.ObjectIdResponse;
import com.pulumi.googlenative.privateca_v1beta1.inputs.X509ExtensionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A ReusableConfigValues is used to describe certain fields of an X.509 certificate, such as the key usage fields, fields specific to CA certificates, certificate policy extensions and custom extensions.
 * 
 */
public final class ReusableConfigValuesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReusableConfigValuesResponse Empty = new ReusableConfigValuesResponse();

    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    @Import(name="additionalExtensions", required=true)
    private List<X509ExtensionResponse> additionalExtensions;

    /**
     * @return Optional. Describes custom X.509 extensions.
     * 
     */
    public List<X509ExtensionResponse> additionalExtensions() {
        return this.additionalExtensions;
    }

    /**
     * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    @Import(name="aiaOcspServers", required=true)
    private List<String> aiaOcspServers;

    /**
     * @return Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    public List<String> aiaOcspServers() {
        return this.aiaOcspServers;
    }

    /**
     * Optional. Describes options in this ReusableConfigValues that are relevant in a CA certificate.
     * 
     */
    @Import(name="caOptions", required=true)
    private CaOptionsResponse caOptions;

    /**
     * @return Optional. Describes options in this ReusableConfigValues that are relevant in a CA certificate.
     * 
     */
    public CaOptionsResponse caOptions() {
        return this.caOptions;
    }

    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    @Import(name="keyUsage", required=true)
    private KeyUsageResponse keyUsage;

    /**
     * @return Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    public KeyUsageResponse keyUsage() {
        return this.keyUsage;
    }

    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    @Import(name="policyIds", required=true)
    private List<ObjectIdResponse> policyIds;

    /**
     * @return Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    public List<ObjectIdResponse> policyIds() {
        return this.policyIds;
    }

    private ReusableConfigValuesResponse() {}

    private ReusableConfigValuesResponse(ReusableConfigValuesResponse $) {
        this.additionalExtensions = $.additionalExtensions;
        this.aiaOcspServers = $.aiaOcspServers;
        this.caOptions = $.caOptions;
        this.keyUsage = $.keyUsage;
        this.policyIds = $.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReusableConfigValuesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReusableConfigValuesResponse $;

        public Builder() {
            $ = new ReusableConfigValuesResponse();
        }

        public Builder(ReusableConfigValuesResponse defaults) {
            $ = new ReusableConfigValuesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalExtensions Optional. Describes custom X.509 extensions.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(List<X509ExtensionResponse> additionalExtensions) {
            $.additionalExtensions = additionalExtensions;
            return this;
        }

        /**
         * @param additionalExtensions Optional. Describes custom X.509 extensions.
         * 
         * @return builder
         * 
         */
        public Builder additionalExtensions(X509ExtensionResponse... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }

        /**
         * @param aiaOcspServers Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the &#34;Authority Information Access&#34; extension in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder aiaOcspServers(List<String> aiaOcspServers) {
            $.aiaOcspServers = aiaOcspServers;
            return this;
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
         * @param caOptions Optional. Describes options in this ReusableConfigValues that are relevant in a CA certificate.
         * 
         * @return builder
         * 
         */
        public Builder caOptions(CaOptionsResponse caOptions) {
            $.caOptions = caOptions;
            return this;
        }

        /**
         * @param keyUsage Optional. Indicates the intended use for keys that correspond to a certificate.
         * 
         * @return builder
         * 
         */
        public Builder keyUsage(KeyUsageResponse keyUsage) {
            $.keyUsage = keyUsage;
            return this;
        }

        /**
         * @param policyIds Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(List<ObjectIdResponse> policyIds) {
            $.policyIds = policyIds;
            return this;
        }

        /**
         * @param policyIds Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
         * 
         * @return builder
         * 
         */
        public Builder policyIds(ObjectIdResponse... policyIds) {
            return policyIds(List.of(policyIds));
        }

        public ReusableConfigValuesResponse build() {
            $.additionalExtensions = Objects.requireNonNull($.additionalExtensions, "expected parameter 'additionalExtensions' to be non-null");
            $.aiaOcspServers = Objects.requireNonNull($.aiaOcspServers, "expected parameter 'aiaOcspServers' to be non-null");
            $.caOptions = Objects.requireNonNull($.caOptions, "expected parameter 'caOptions' to be non-null");
            $.keyUsage = Objects.requireNonNull($.keyUsage, "expected parameter 'keyUsage' to be non-null");
            $.policyIds = Objects.requireNonNull($.policyIds, "expected parameter 'policyIds' to be non-null");
            return $;
        }
    }

}
