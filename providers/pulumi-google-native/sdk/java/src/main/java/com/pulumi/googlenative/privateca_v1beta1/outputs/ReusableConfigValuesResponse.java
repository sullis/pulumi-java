// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.privateca_v1beta1.outputs.CaOptionsResponse;
import com.pulumi.googlenative.privateca_v1beta1.outputs.KeyUsageResponse;
import com.pulumi.googlenative.privateca_v1beta1.outputs.ObjectIdResponse;
import com.pulumi.googlenative.privateca_v1beta1.outputs.X509ExtensionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ReusableConfigValuesResponse {
    /**
     * @return Optional. Describes custom X.509 extensions.
     * 
     */
    private final List<X509ExtensionResponse> additionalExtensions;
    /**
     * @return Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    private final List<String> aiaOcspServers;
    /**
     * @return Optional. Describes options in this ReusableConfigValues that are relevant in a CA certificate.
     * 
     */
    private final CaOptionsResponse caOptions;
    /**
     * @return Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    private final KeyUsageResponse keyUsage;
    /**
     * @return Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    private final List<ObjectIdResponse> policyIds;

    @CustomType.Constructor
    private ReusableConfigValuesResponse(
        @CustomType.Parameter("additionalExtensions") List<X509ExtensionResponse> additionalExtensions,
        @CustomType.Parameter("aiaOcspServers") List<String> aiaOcspServers,
        @CustomType.Parameter("caOptions") CaOptionsResponse caOptions,
        @CustomType.Parameter("keyUsage") KeyUsageResponse keyUsage,
        @CustomType.Parameter("policyIds") List<ObjectIdResponse> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = keyUsage;
        this.policyIds = policyIds;
    }

    /**
     * @return Optional. Describes custom X.509 extensions.
     * 
     */
    public List<X509ExtensionResponse> additionalExtensions() {
        return this.additionalExtensions;
    }
    /**
     * @return Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    public List<String> aiaOcspServers() {
        return this.aiaOcspServers;
    }
    /**
     * @return Optional. Describes options in this ReusableConfigValues that are relevant in a CA certificate.
     * 
     */
    public CaOptionsResponse caOptions() {
        return this.caOptions;
    }
    /**
     * @return Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    public KeyUsageResponse keyUsage() {
        return this.keyUsage;
    }
    /**
     * @return Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    public List<ObjectIdResponse> policyIds() {
        return this.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReusableConfigValuesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<X509ExtensionResponse> additionalExtensions;
        private List<String> aiaOcspServers;
        private CaOptionsResponse caOptions;
        private KeyUsageResponse keyUsage;
        private List<ObjectIdResponse> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ReusableConfigValuesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder additionalExtensions(List<X509ExtensionResponse> additionalExtensions) {
            this.additionalExtensions = Objects.requireNonNull(additionalExtensions);
            return this;
        }
        public Builder additionalExtensions(X509ExtensionResponse... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }
        public Builder aiaOcspServers(List<String> aiaOcspServers) {
            this.aiaOcspServers = Objects.requireNonNull(aiaOcspServers);
            return this;
        }
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }
        public Builder caOptions(CaOptionsResponse caOptions) {
            this.caOptions = Objects.requireNonNull(caOptions);
            return this;
        }
        public Builder keyUsage(KeyUsageResponse keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }
        public Builder policyIds(List<ObjectIdResponse> policyIds) {
            this.policyIds = Objects.requireNonNull(policyIds);
            return this;
        }
        public Builder policyIds(ObjectIdResponse... policyIds) {
            return policyIds(List.of(policyIds));
        }        public ReusableConfigValuesResponse build() {
            return new ReusableConfigValuesResponse(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
