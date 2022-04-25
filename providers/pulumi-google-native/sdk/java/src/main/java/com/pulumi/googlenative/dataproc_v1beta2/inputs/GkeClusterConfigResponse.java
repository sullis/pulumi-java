// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.NamespacedGkeDeploymentTargetResponse;
import java.util.Objects;


/**
 * The GKE config for this cluster.
 * 
 */
public final class GkeClusterConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GkeClusterConfigResponse Empty = new GkeClusterConfigResponse();

    /**
     * Optional. A target for the deployment.
     * 
     */
    @Import(name="namespacedGkeDeploymentTarget", required=true)
    private NamespacedGkeDeploymentTargetResponse namespacedGkeDeploymentTarget;

    /**
     * @return Optional. A target for the deployment.
     * 
     */
    public NamespacedGkeDeploymentTargetResponse namespacedGkeDeploymentTarget() {
        return this.namespacedGkeDeploymentTarget;
    }

    private GkeClusterConfigResponse() {}

    private GkeClusterConfigResponse(GkeClusterConfigResponse $) {
        this.namespacedGkeDeploymentTarget = $.namespacedGkeDeploymentTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GkeClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GkeClusterConfigResponse $;

        public Builder() {
            $ = new GkeClusterConfigResponse();
        }

        public Builder(GkeClusterConfigResponse defaults) {
            $ = new GkeClusterConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespacedGkeDeploymentTarget Optional. A target for the deployment.
         * 
         * @return builder
         * 
         */
        public Builder namespacedGkeDeploymentTarget(NamespacedGkeDeploymentTargetResponse namespacedGkeDeploymentTarget) {
            $.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
            return this;
        }

        public GkeClusterConfigResponse build() {
            $.namespacedGkeDeploymentTarget = Objects.requireNonNull($.namespacedGkeDeploymentTarget, "expected parameter 'namespacedGkeDeploymentTarget' to be non-null");
            return $;
        }
    }

}
