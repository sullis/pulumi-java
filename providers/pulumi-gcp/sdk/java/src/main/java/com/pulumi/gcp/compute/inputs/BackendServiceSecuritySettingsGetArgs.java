// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BackendServiceSecuritySettingsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceSecuritySettingsGetArgs Empty = new BackendServiceSecuritySettingsGetArgs();

    /**
     * ClientTlsPolicy is a resource that specifies how a client should authenticate
     * connections to backends of a service. This resource itself does not affect
     * configuration unless it is attached to a backend service resource.
     * 
     */
    @Import(name="clientTlsPolicy", required=true)
    private Output<String> clientTlsPolicy;

    /**
     * @return ClientTlsPolicy is a resource that specifies how a client should authenticate
     * connections to backends of a service. This resource itself does not affect
     * configuration unless it is attached to a backend service resource.
     * 
     */
    public Output<String> clientTlsPolicy() {
        return this.clientTlsPolicy;
    }

    /**
     * A list of alternate names to verify the subject identity in the certificate.
     * If specified, the client will verify that the server certificate&#39;s subject
     * alt name matches one of the specified values.
     * 
     */
    @Import(name="subjectAltNames", required=true)
    private Output<List<String>> subjectAltNames;

    /**
     * @return A list of alternate names to verify the subject identity in the certificate.
     * If specified, the client will verify that the server certificate&#39;s subject
     * alt name matches one of the specified values.
     * 
     */
    public Output<List<String>> subjectAltNames() {
        return this.subjectAltNames;
    }

    private BackendServiceSecuritySettingsGetArgs() {}

    private BackendServiceSecuritySettingsGetArgs(BackendServiceSecuritySettingsGetArgs $) {
        this.clientTlsPolicy = $.clientTlsPolicy;
        this.subjectAltNames = $.subjectAltNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceSecuritySettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceSecuritySettingsGetArgs $;

        public Builder() {
            $ = new BackendServiceSecuritySettingsGetArgs();
        }

        public Builder(BackendServiceSecuritySettingsGetArgs defaults) {
            $ = new BackendServiceSecuritySettingsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientTlsPolicy ClientTlsPolicy is a resource that specifies how a client should authenticate
         * connections to backends of a service. This resource itself does not affect
         * configuration unless it is attached to a backend service resource.
         * 
         * @return builder
         * 
         */
        public Builder clientTlsPolicy(Output<String> clientTlsPolicy) {
            $.clientTlsPolicy = clientTlsPolicy;
            return this;
        }

        /**
         * @param clientTlsPolicy ClientTlsPolicy is a resource that specifies how a client should authenticate
         * connections to backends of a service. This resource itself does not affect
         * configuration unless it is attached to a backend service resource.
         * 
         * @return builder
         * 
         */
        public Builder clientTlsPolicy(String clientTlsPolicy) {
            return clientTlsPolicy(Output.of(clientTlsPolicy));
        }

        /**
         * @param subjectAltNames A list of alternate names to verify the subject identity in the certificate.
         * If specified, the client will verify that the server certificate&#39;s subject
         * alt name matches one of the specified values.
         * 
         * @return builder
         * 
         */
        public Builder subjectAltNames(Output<List<String>> subjectAltNames) {
            $.subjectAltNames = subjectAltNames;
            return this;
        }

        /**
         * @param subjectAltNames A list of alternate names to verify the subject identity in the certificate.
         * If specified, the client will verify that the server certificate&#39;s subject
         * alt name matches one of the specified values.
         * 
         * @return builder
         * 
         */
        public Builder subjectAltNames(List<String> subjectAltNames) {
            return subjectAltNames(Output.of(subjectAltNames));
        }

        /**
         * @param subjectAltNames A list of alternate names to verify the subject identity in the certificate.
         * If specified, the client will verify that the server certificate&#39;s subject
         * alt name matches one of the specified values.
         * 
         * @return builder
         * 
         */
        public Builder subjectAltNames(String... subjectAltNames) {
            return subjectAltNames(List.of(subjectAltNames));
        }

        public BackendServiceSecuritySettingsGetArgs build() {
            $.clientTlsPolicy = Objects.requireNonNull($.clientTlsPolicy, "expected parameter 'clientTlsPolicy' to be non-null");
            $.subjectAltNames = Objects.requireNonNull($.subjectAltNames, "expected parameter 'subjectAltNames' to be non-null");
            return $;
        }
    }

}
