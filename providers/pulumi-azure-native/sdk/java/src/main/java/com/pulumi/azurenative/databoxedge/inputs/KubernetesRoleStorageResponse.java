// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.azurenative.databoxedge.inputs.KubernetesRoleStorageClassInfoResponse;
import com.pulumi.azurenative.databoxedge.inputs.MountPointMapResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Kubernetes role storage resource
 * 
 */
public final class KubernetesRoleStorageResponse extends com.pulumi.resources.InvokeArgs {

    public static final KubernetesRoleStorageResponse Empty = new KubernetesRoleStorageResponse();

    /**
     * Mount points of shares in role(s).
     * 
     */
    @Import(name="endpoints")
    private @Nullable List<MountPointMapResponse> endpoints;

    /**
     * @return Mount points of shares in role(s).
     * 
     */
    public Optional<List<MountPointMapResponse>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * Kubernetes storage class info.
     * 
     */
    @Import(name="storageClasses", required=true)
    private List<KubernetesRoleStorageClassInfoResponse> storageClasses;

    /**
     * @return Kubernetes storage class info.
     * 
     */
    public List<KubernetesRoleStorageClassInfoResponse> storageClasses() {
        return this.storageClasses;
    }

    private KubernetesRoleStorageResponse() {}

    private KubernetesRoleStorageResponse(KubernetesRoleStorageResponse $) {
        this.endpoints = $.endpoints;
        this.storageClasses = $.storageClasses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesRoleStorageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesRoleStorageResponse $;

        public Builder() {
            $ = new KubernetesRoleStorageResponse();
        }

        public Builder(KubernetesRoleStorageResponse defaults) {
            $ = new KubernetesRoleStorageResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoints Mount points of shares in role(s).
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable List<MountPointMapResponse> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints Mount points of shares in role(s).
         * 
         * @return builder
         * 
         */
        public Builder endpoints(MountPointMapResponse... endpoints) {
            return endpoints(List.of(endpoints));
        }

        /**
         * @param storageClasses Kubernetes storage class info.
         * 
         * @return builder
         * 
         */
        public Builder storageClasses(List<KubernetesRoleStorageClassInfoResponse> storageClasses) {
            $.storageClasses = storageClasses;
            return this;
        }

        /**
         * @param storageClasses Kubernetes storage class info.
         * 
         * @return builder
         * 
         */
        public Builder storageClasses(KubernetesRoleStorageClassInfoResponse... storageClasses) {
            return storageClasses(List.of(storageClasses));
        }

        public KubernetesRoleStorageResponse build() {
            $.storageClasses = Objects.requireNonNull($.storageClasses, "expected parameter 'storageClasses' to be non-null");
            return $;
        }
    }

}
