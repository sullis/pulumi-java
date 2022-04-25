// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.extensions_v1beta1.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.TypedLocalObjectReferenceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IngressBackend describes all endpoints for a given service and port.
 * 
 */
public final class IngressBackendArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressBackendArgs Empty = new IngressBackendArgs();

    /**
     * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<TypedLocalObjectReferenceArgs> resource;

    /**
     * @return Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
     * 
     */
    public Optional<Output<TypedLocalObjectReferenceArgs>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * Specifies the name of the referenced service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return Specifies the name of the referenced service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Specifies the port of the referenced service.
     * 
     */
    @Import(name="servicePort", required=true)
    private Output<Either<Integer,String>> servicePort;

    /**
     * @return Specifies the port of the referenced service.
     * 
     */
    public Output<Either<Integer,String>> servicePort() {
        return this.servicePort;
    }

    private IngressBackendArgs() {}

    private IngressBackendArgs(IngressBackendArgs $) {
        this.resource = $.resource;
        this.serviceName = $.serviceName;
        this.servicePort = $.servicePort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressBackendArgs $;

        public Builder() {
            $ = new IngressBackendArgs();
        }

        public Builder(IngressBackendArgs defaults) {
            $ = new IngressBackendArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resource Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<TypedLocalObjectReferenceArgs> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
         * 
         * @return builder
         * 
         */
        public Builder resource(TypedLocalObjectReferenceArgs resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param serviceName Specifies the name of the referenced service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Specifies the name of the referenced service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param servicePort Specifies the port of the referenced service.
         * 
         * @return builder
         * 
         */
        public Builder servicePort(Output<Either<Integer,String>> servicePort) {
            $.servicePort = servicePort;
            return this;
        }

        /**
         * @param servicePort Specifies the port of the referenced service.
         * 
         * @return builder
         * 
         */
        public Builder servicePort(Either<Integer,String> servicePort) {
            return servicePort(Output.of(servicePort));
        }

        /**
         * @param servicePort Specifies the port of the referenced service.
         * 
         * @return builder
         * 
         */
        public Builder servicePort(Integer servicePort) {
            return servicePort(Either.ofLeft(servicePort));
        }

        /**
         * @param servicePort Specifies the port of the referenced service.
         * 
         * @return builder
         * 
         */
        public Builder servicePort(String servicePort) {
            return servicePort(Either.ofRight(servicePort));
        }

        public IngressBackendArgs build() {
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.servicePort = Objects.requireNonNull($.servicePort, "expected parameter 'servicePort' to be non-null");
            return $;
        }
    }

}
