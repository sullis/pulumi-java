// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.DeploymentResponse;
import java.util.Objects;


/**
 * Details of a deployment occurrence.
 * 
 */
public final class GrafeasV1beta1DeploymentDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GrafeasV1beta1DeploymentDetailsResponse Empty = new GrafeasV1beta1DeploymentDetailsResponse();

    /**
     * Deployment history for the resource.
     * 
     */
    @Import(name="deployment", required=true)
    private DeploymentResponse deployment;

    /**
     * @return Deployment history for the resource.
     * 
     */
    public DeploymentResponse deployment() {
        return this.deployment;
    }

    private GrafeasV1beta1DeploymentDetailsResponse() {}

    private GrafeasV1beta1DeploymentDetailsResponse(GrafeasV1beta1DeploymentDetailsResponse $) {
        this.deployment = $.deployment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrafeasV1beta1DeploymentDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrafeasV1beta1DeploymentDetailsResponse $;

        public Builder() {
            $ = new GrafeasV1beta1DeploymentDetailsResponse();
        }

        public Builder(GrafeasV1beta1DeploymentDetailsResponse defaults) {
            $ = new GrafeasV1beta1DeploymentDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param deployment Deployment history for the resource.
         * 
         * @return builder
         * 
         */
        public Builder deployment(DeploymentResponse deployment) {
            $.deployment = deployment;
            return this;
        }

        public GrafeasV1beta1DeploymentDetailsResponse build() {
            $.deployment = Objects.requireNonNull($.deployment, "expected parameter 'deployment' to be non-null");
            return $;
        }
    }

}
