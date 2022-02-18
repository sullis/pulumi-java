// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.TypedLocalObjectReferenceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IngressBackend describes all endpoints for a given service and port.
 * 
 */
public final class IngressBackendArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressBackendArgs Empty = new IngressBackendArgs();

    /**
     * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
     * 
     */
    @InputImport(name="resource")
    private final @Nullable Input<TypedLocalObjectReferenceArgs> resource;

    public Input<TypedLocalObjectReferenceArgs> getResource() {
        return this.resource == null ? Input.empty() : this.resource;
    }

    /**
     * Specifies the name of the referenced service.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Specifies the port of the referenced service.
     * 
     */
    @InputImport(name="servicePort", required=true)
    private final Input<Either<Integer,String>> servicePort;

    public Input<Either<Integer,String>> getServicePort() {
        return this.servicePort;
    }

    public IngressBackendArgs(
        @Nullable Input<TypedLocalObjectReferenceArgs> resource,
        Input<String> serviceName,
        Input<Either<Integer,String>> servicePort) {
        this.resource = resource;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.servicePort = Objects.requireNonNull(servicePort, "expected parameter 'servicePort' to be non-null");
    }

    private IngressBackendArgs() {
        this.resource = Input.empty();
        this.serviceName = Input.empty();
        this.servicePort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TypedLocalObjectReferenceArgs> resource;
        private Input<String> serviceName;
        private Input<Either<Integer,String>> servicePort;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressBackendArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
    	      this.serviceName = defaults.serviceName;
    	      this.servicePort = defaults.servicePort;
        }

        public Builder setResource(@Nullable Input<TypedLocalObjectReferenceArgs> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResource(@Nullable TypedLocalObjectReferenceArgs resource) {
            this.resource = Input.ofNullable(resource);
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setServicePort(Input<Either<Integer,String>> servicePort) {
            this.servicePort = Objects.requireNonNull(servicePort);
            return this;
        }

        public Builder setServicePort(Either<Integer,String> servicePort) {
            this.servicePort = Input.of(Objects.requireNonNull(servicePort));
            return this;
        }

        public IngressBackendArgs build() {
            return new IngressBackendArgs(resource, serviceName, servicePort);
        }
    }
}
