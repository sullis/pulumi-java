// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ManagedClusterPodIdentityExceptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedClusterPodIdentityExceptionResponse Empty = new ManagedClusterPodIdentityExceptionResponse();

    /**
     * Name of the pod identity exception.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Namespace of the pod identity exception.
     * 
     */
    @InputImport(name="namespace", required=true)
      private final String namespace;

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Pod labels to match.
     * 
     */
    @InputImport(name="podLabels", required=true)
      private final Map<String,String> podLabels;

    public Map<String,String> getPodLabels() {
        return this.podLabels;
    }

    public ManagedClusterPodIdentityExceptionResponse(
        String name,
        String namespace,
        Map<String,String> podLabels) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.podLabels = Objects.requireNonNull(podLabels, "expected parameter 'podLabels' to be non-null");
    }

    private ManagedClusterPodIdentityExceptionResponse() {
        this.name = null;
        this.namespace = null;
        this.podLabels = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterPodIdentityExceptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String namespace;
        private Map<String,String> podLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterPodIdentityExceptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.podLabels = defaults.podLabels;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setPodLabels(Map<String,String> podLabels) {
            this.podLabels = Objects.requireNonNull(podLabels);
            return this;
        }
        public ManagedClusterPodIdentityExceptionResponse build() {
            return new ManagedClusterPodIdentityExceptionResponse(name, namespace, podLabels);
        }
    }
}