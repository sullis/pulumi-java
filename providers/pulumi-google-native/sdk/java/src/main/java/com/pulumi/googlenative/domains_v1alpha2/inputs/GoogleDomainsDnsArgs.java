// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.domains_v1alpha2.enums.GoogleDomainsDnsDsState;
import java.util.Objects;


/**
 * Configuration for using the free DNS zone provided by Google Domains as a `Registration`&#39;s `dns_provider`. You cannot configure the DNS zone itself using the API. To configure the DNS zone, go to [Google Domains](https://domains.google/).
 * 
 */
public final class GoogleDomainsDnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleDomainsDnsArgs Empty = new GoogleDomainsDnsArgs();

    /**
     * The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
     * 
     */
    @Import(name="dsState", required=true)
    private Output<GoogleDomainsDnsDsState> dsState;

    /**
     * @return The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
     * 
     */
    public Output<GoogleDomainsDnsDsState> dsState() {
        return this.dsState;
    }

    private GoogleDomainsDnsArgs() {}

    private GoogleDomainsDnsArgs(GoogleDomainsDnsArgs $) {
        this.dsState = $.dsState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleDomainsDnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDomainsDnsArgs $;

        public Builder() {
            $ = new GoogleDomainsDnsArgs();
        }

        public Builder(GoogleDomainsDnsArgs defaults) {
            $ = new GoogleDomainsDnsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dsState The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
         * 
         * @return builder
         * 
         */
        public Builder dsState(Output<GoogleDomainsDnsDsState> dsState) {
            $.dsState = dsState;
            return this;
        }

        /**
         * @param dsState The state of DS records for this domain. Used to enable or disable automatic DNSSEC.
         * 
         * @return builder
         * 
         */
        public Builder dsState(GoogleDomainsDnsDsState dsState) {
            return dsState(Output.of(dsState));
        }

        public GoogleDomainsDnsArgs build() {
            $.dsState = Objects.requireNonNull($.dsState, "expected parameter 'dsState' to be non-null");
            return $;
        }
    }

}
