// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.run_v1alpha1.outputs.JobSpecResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.JobStatusResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.ObjectMetaResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobResult {
    /**
     * Optional. APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources +optional
     * 
     */
    private final String apiVersion;
    /**
     * Optional. Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds +optional
     * 
     */
    private final String kind;
    /**
     * Optional. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata +optional
     * 
     */
    private final ObjectMetaResponse metadata;
    /**
     * Optional. Specification of the desired behavior of a job. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status +optional
     * 
     */
    private final JobSpecResponse spec;
    /**
     * Optional. Current status of a job. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status +optional
     * 
     */
    private final JobStatusResponse status;

    @CustomType.Constructor
    private GetJobResult(
        @CustomType.Parameter("apiVersion") String apiVersion,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("metadata") ObjectMetaResponse metadata,
        @CustomType.Parameter("spec") JobSpecResponse spec,
        @CustomType.Parameter("status") JobStatusResponse status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    /**
     * Optional. APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources +optional
     * 
    */
    public String getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Optional. Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds +optional
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Optional. Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata +optional
     * 
    */
    public ObjectMetaResponse getMetadata() {
        return this.metadata;
    }
    /**
     * Optional. Specification of the desired behavior of a job. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status +optional
     * 
    */
    public JobSpecResponse getSpec() {
        return this.spec;
    }
    /**
     * Optional. Current status of a job. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status +optional
     * 
    */
    public JobStatusResponse getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiVersion;
        private String kind;
        private ObjectMetaResponse metadata;
        private JobSpecResponse spec;
        private JobStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder metadata(ObjectMetaResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder spec(JobSpecResponse spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        public Builder status(JobStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetJobResult build() {
            return new GetJobResult(apiVersion, kind, metadata, spec, status);
        }
    }
}
