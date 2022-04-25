// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gkehub_v1.inputs.ResourceManifestResponse;
import com.pulumi.googlenative.gkehub_v1.inputs.ResourceOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * KubernetesResource contains the YAML manifests and configuration for Membership Kubernetes resources in the cluster. After CreateMembership or UpdateMembership, these resources should be re-applied in the cluster.
 * 
 */
public final class KubernetesResourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final KubernetesResourceResponse Empty = new KubernetesResourceResponse();

    /**
     * The Kubernetes resources for installing the GKE Connect agent This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
     * 
     */
    @Import(name="connectResources", required=true)
    private List<ResourceManifestResponse> connectResources;

    /**
     * @return The Kubernetes resources for installing the GKE Connect agent This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
     * 
     */
    public List<ResourceManifestResponse> connectResources() {
        return this.connectResources;
    }

    /**
     * Input only. The YAML representation of the Membership CR. This field is ignored for GKE clusters where Hub can read the CR directly. Callers should provide the CR that is currently present in the cluster during CreateMembership or UpdateMembership, or leave this field empty if none exists. The CR manifest is used to validate the cluster has not been registered with another Membership.
     * 
     */
    @Import(name="membershipCrManifest", required=true)
    private String membershipCrManifest;

    /**
     * @return Input only. The YAML representation of the Membership CR. This field is ignored for GKE clusters where Hub can read the CR directly. Callers should provide the CR that is currently present in the cluster during CreateMembership or UpdateMembership, or leave this field empty if none exists. The CR manifest is used to validate the cluster has not been registered with another Membership.
     * 
     */
    public String membershipCrManifest() {
        return this.membershipCrManifest;
    }

    /**
     * Additional Kubernetes resources that need to be applied to the cluster after Membership creation, and after every update. This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
     * 
     */
    @Import(name="membershipResources", required=true)
    private List<ResourceManifestResponse> membershipResources;

    /**
     * @return Additional Kubernetes resources that need to be applied to the cluster after Membership creation, and after every update. This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
     * 
     */
    public List<ResourceManifestResponse> membershipResources() {
        return this.membershipResources;
    }

    /**
     * Optional. Options for Kubernetes resource generation.
     * 
     */
    @Import(name="resourceOptions", required=true)
    private ResourceOptionsResponse resourceOptions;

    /**
     * @return Optional. Options for Kubernetes resource generation.
     * 
     */
    public ResourceOptionsResponse resourceOptions() {
        return this.resourceOptions;
    }

    private KubernetesResourceResponse() {}

    private KubernetesResourceResponse(KubernetesResourceResponse $) {
        this.connectResources = $.connectResources;
        this.membershipCrManifest = $.membershipCrManifest;
        this.membershipResources = $.membershipResources;
        this.resourceOptions = $.resourceOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesResourceResponse $;

        public Builder() {
            $ = new KubernetesResourceResponse();
        }

        public Builder(KubernetesResourceResponse defaults) {
            $ = new KubernetesResourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectResources The Kubernetes resources for installing the GKE Connect agent This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
         * 
         * @return builder
         * 
         */
        public Builder connectResources(List<ResourceManifestResponse> connectResources) {
            $.connectResources = connectResources;
            return this;
        }

        /**
         * @param connectResources The Kubernetes resources for installing the GKE Connect agent This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
         * 
         * @return builder
         * 
         */
        public Builder connectResources(ResourceManifestResponse... connectResources) {
            return connectResources(List.of(connectResources));
        }

        /**
         * @param membershipCrManifest Input only. The YAML representation of the Membership CR. This field is ignored for GKE clusters where Hub can read the CR directly. Callers should provide the CR that is currently present in the cluster during CreateMembership or UpdateMembership, or leave this field empty if none exists. The CR manifest is used to validate the cluster has not been registered with another Membership.
         * 
         * @return builder
         * 
         */
        public Builder membershipCrManifest(String membershipCrManifest) {
            $.membershipCrManifest = membershipCrManifest;
            return this;
        }

        /**
         * @param membershipResources Additional Kubernetes resources that need to be applied to the cluster after Membership creation, and after every update. This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
         * 
         * @return builder
         * 
         */
        public Builder membershipResources(List<ResourceManifestResponse> membershipResources) {
            $.membershipResources = membershipResources;
            return this;
        }

        /**
         * @param membershipResources Additional Kubernetes resources that need to be applied to the cluster after Membership creation, and after every update. This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
         * 
         * @return builder
         * 
         */
        public Builder membershipResources(ResourceManifestResponse... membershipResources) {
            return membershipResources(List.of(membershipResources));
        }

        /**
         * @param resourceOptions Optional. Options for Kubernetes resource generation.
         * 
         * @return builder
         * 
         */
        public Builder resourceOptions(ResourceOptionsResponse resourceOptions) {
            $.resourceOptions = resourceOptions;
            return this;
        }

        public KubernetesResourceResponse build() {
            $.connectResources = Objects.requireNonNull($.connectResources, "expected parameter 'connectResources' to be non-null");
            $.membershipCrManifest = Objects.requireNonNull($.membershipCrManifest, "expected parameter 'membershipCrManifest' to be non-null");
            $.membershipResources = Objects.requireNonNull($.membershipResources, "expected parameter 'membershipResources' to be non-null");
            $.resourceOptions = Objects.requireNonNull($.resourceOptions, "expected parameter 'resourceOptions' to be non-null");
            return $;
        }
    }

}
