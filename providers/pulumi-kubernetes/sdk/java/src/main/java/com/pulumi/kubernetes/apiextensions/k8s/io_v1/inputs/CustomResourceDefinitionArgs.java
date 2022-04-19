// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceDefinitionSpecArgs;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceDefinitionStatusArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its name MUST be in the format <.spec.name>.<.spec.group>.
 * 
 */
public final class CustomResourceDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionArgs Empty = new CustomResourceDefinitionArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> apiVersion() {
        return this.apiVersion == null ? Codegen.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Standard object's metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * spec describes how the user wants the resources to appear
     * 
     */
    @Import(name="spec", required=true)
      private final Output<CustomResourceDefinitionSpecArgs> spec;

    public Output<CustomResourceDefinitionSpecArgs> spec() {
        return this.spec;
    }

    /**
     * status indicates the actual state of the CustomResourceDefinition
     * 
     */
    @Import(name="status")
      private final @Nullable Output<CustomResourceDefinitionStatusArgs> status;

    public Output<CustomResourceDefinitionStatusArgs> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public CustomResourceDefinitionArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        Output<CustomResourceDefinitionSpecArgs> spec,
        @Nullable Output<CustomResourceDefinitionStatusArgs> status) {
        this.apiVersion = Codegen.stringProp("apiVersion").output().arg(apiVersion).getNullable();
        this.kind = Codegen.stringProp("kind").output().arg(kind).getNullable();
        this.metadata = metadata;
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
        this.status = status;
    }

    private CustomResourceDefinitionArgs() {
        this.apiVersion = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.spec = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private Output<CustomResourceDefinitionSpecArgs> spec;
        private @Nullable Output<CustomResourceDefinitionStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder spec(Output<CustomResourceDefinitionSpecArgs> spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        public Builder spec(CustomResourceDefinitionSpecArgs spec) {
            this.spec = Output.of(Objects.requireNonNull(spec));
            return this;
        }
        public Builder status(@Nullable Output<CustomResourceDefinitionStatusArgs> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable CustomResourceDefinitionStatusArgs status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public CustomResourceDefinitionArgs build() {
            return new CustomResourceDefinitionArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
