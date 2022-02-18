// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
 * 
 */
public final class GlusterfsPersistentVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlusterfsPersistentVolumeSourceArgs Empty = new GlusterfsPersistentVolumeSourceArgs();

    /**
     * EndpointsName is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    @InputImport(name="endpoints", required=true)
    private final Input<String> endpoints;

    public Input<String> getEndpoints() {
        return this.endpoints;
    }

    /**
     * EndpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    @InputImport(name="endpointsNamespace")
    private final @Nullable Input<String> endpointsNamespace;

    public Input<String> getEndpointsNamespace() {
        return this.endpointsNamespace == null ? Input.empty() : this.endpointsNamespace;
    }

    /**
     * Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    @InputImport(name="path", required=true)
    private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    public GlusterfsPersistentVolumeSourceArgs(
        Input<String> endpoints,
        @Nullable Input<String> endpointsNamespace,
        Input<String> path,
        @Nullable Input<Boolean> readOnly) {
        this.endpoints = Objects.requireNonNull(endpoints, "expected parameter 'endpoints' to be non-null");
        this.endpointsNamespace = endpointsNamespace;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.readOnly = readOnly;
    }

    private GlusterfsPersistentVolumeSourceArgs() {
        this.endpoints = Input.empty();
        this.endpointsNamespace = Input.empty();
        this.path = Input.empty();
        this.readOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlusterfsPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endpoints;
        private @Nullable Input<String> endpointsNamespace;
        private Input<String> path;
        private @Nullable Input<Boolean> readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(GlusterfsPersistentVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.endpointsNamespace = defaults.endpointsNamespace;
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setEndpoints(Input<String> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }

        public Builder setEndpoints(String endpoints) {
            this.endpoints = Input.of(Objects.requireNonNull(endpoints));
            return this;
        }

        public Builder setEndpointsNamespace(@Nullable Input<String> endpointsNamespace) {
            this.endpointsNamespace = endpointsNamespace;
            return this;
        }

        public Builder setEndpointsNamespace(@Nullable String endpointsNamespace) {
            this.endpointsNamespace = Input.ofNullable(endpointsNamespace);
            return this;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public GlusterfsPersistentVolumeSourceArgs build() {
            return new GlusterfsPersistentVolumeSourceArgs(endpoints, endpointsNamespace, path, readOnly);
        }
    }
}
