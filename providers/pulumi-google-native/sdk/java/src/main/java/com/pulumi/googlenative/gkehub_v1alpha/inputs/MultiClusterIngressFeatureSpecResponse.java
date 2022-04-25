// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * **Multi-cluster Ingress**: The configuration for the MultiClusterIngress feature.
 * 
 */
public final class MultiClusterIngressFeatureSpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final MultiClusterIngressFeatureSpecResponse Empty = new MultiClusterIngressFeatureSpecResponse();

    /**
     * Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
     * 
     */
    @Import(name="configMembership", required=true)
    private String configMembership;

    /**
     * @return Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
     * 
     */
    public String configMembership() {
        return this.configMembership;
    }

    private MultiClusterIngressFeatureSpecResponse() {}

    private MultiClusterIngressFeatureSpecResponse(MultiClusterIngressFeatureSpecResponse $) {
        this.configMembership = $.configMembership;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiClusterIngressFeatureSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiClusterIngressFeatureSpecResponse $;

        public Builder() {
            $ = new MultiClusterIngressFeatureSpecResponse();
        }

        public Builder(MultiClusterIngressFeatureSpecResponse defaults) {
            $ = new MultiClusterIngressFeatureSpecResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param configMembership Fully-qualified Membership name which hosts the MultiClusterIngress CRD. Example: `projects/foo-proj/locations/global/memberships/bar`
         * 
         * @return builder
         * 
         */
        public Builder configMembership(String configMembership) {
            $.configMembership = configMembership;
            return this;
        }

        public MultiClusterIngressFeatureSpecResponse build() {
            $.configMembership = Objects.requireNonNull($.configMembership, "expected parameter 'configMembership' to be non-null");
            return $;
        }
    }

}
