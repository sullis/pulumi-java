// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetEndpointPolicyArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetEndpointPolicyIamPolicyArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetEndpointPolicyIamPolicyPlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetEndpointPolicyPlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetGatewayArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetGatewayIamPolicyArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetGatewayIamPolicyPlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetGatewayPlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetGrpcRouteArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetGrpcRoutePlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetHttpRouteArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetHttpRoutePlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetMeshArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetMeshIamPolicyArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetMeshIamPolicyPlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetMeshPlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetServiceBindingArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetServiceBindingIamPolicyArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetServiceBindingIamPolicyPlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetServiceBindingPlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetTcpRouteArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetTcpRoutePlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetTlsRouteArgs;
import com.pulumi.googlenative.networkservices_v1beta1.inputs.GetTlsRoutePlainArgs;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetEndpointPolicyIamPolicyResult;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetEndpointPolicyResult;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetGatewayIamPolicyResult;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetGatewayResult;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetGrpcRouteResult;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetHttpRouteResult;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetMeshIamPolicyResult;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetMeshResult;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetServiceBindingIamPolicyResult;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetServiceBindingResult;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetTcpRouteResult;
import com.pulumi.googlenative.networkservices_v1beta1.outputs.GetTlsRouteResult;
import java.util.concurrent.CompletableFuture;

public final class Networkservices_v1beta1Functions {
    /**
     * Gets details of a single EndpointPolicy.
     * 
     */
    public static Output<GetEndpointPolicyResult> getEndpointPolicy(GetEndpointPolicyArgs args) {
        return getEndpointPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single EndpointPolicy.
     * 
     */
    public static CompletableFuture<GetEndpointPolicyResult> getEndpointPolicyPlain(GetEndpointPolicyPlainArgs args) {
        return getEndpointPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single EndpointPolicy.
     * 
     */
    public static Output<GetEndpointPolicyResult> getEndpointPolicy(GetEndpointPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getEndpointPolicy", TypeShape.of(GetEndpointPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single EndpointPolicy.
     * 
     */
    public static CompletableFuture<GetEndpointPolicyResult> getEndpointPolicyPlain(GetEndpointPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getEndpointPolicy", TypeShape.of(GetEndpointPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetEndpointPolicyIamPolicyResult> getEndpointPolicyIamPolicy(GetEndpointPolicyIamPolicyArgs args) {
        return getEndpointPolicyIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetEndpointPolicyIamPolicyResult> getEndpointPolicyIamPolicyPlain(GetEndpointPolicyIamPolicyPlainArgs args) {
        return getEndpointPolicyIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetEndpointPolicyIamPolicyResult> getEndpointPolicyIamPolicy(GetEndpointPolicyIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getEndpointPolicyIamPolicy", TypeShape.of(GetEndpointPolicyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetEndpointPolicyIamPolicyResult> getEndpointPolicyIamPolicyPlain(GetEndpointPolicyIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getEndpointPolicyIamPolicy", TypeShape.of(GetEndpointPolicyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Gateway.
     * 
     */
    public static Output<GetGatewayResult> getGateway(GetGatewayArgs args) {
        return getGateway(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Gateway.
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGatewayPlain(GetGatewayPlainArgs args) {
        return getGatewayPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Gateway.
     * 
     */
    public static Output<GetGatewayResult> getGateway(GetGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getGateway", TypeShape.of(GetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Gateway.
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGatewayPlain(GetGatewayPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getGateway", TypeShape.of(GetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetGatewayIamPolicyResult> getGatewayIamPolicy(GetGatewayIamPolicyArgs args) {
        return getGatewayIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetGatewayIamPolicyResult> getGatewayIamPolicyPlain(GetGatewayIamPolicyPlainArgs args) {
        return getGatewayIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetGatewayIamPolicyResult> getGatewayIamPolicy(GetGatewayIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getGatewayIamPolicy", TypeShape.of(GetGatewayIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetGatewayIamPolicyResult> getGatewayIamPolicyPlain(GetGatewayIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getGatewayIamPolicy", TypeShape.of(GetGatewayIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single GrpcRoute.
     * 
     */
    public static Output<GetGrpcRouteResult> getGrpcRoute(GetGrpcRouteArgs args) {
        return getGrpcRoute(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single GrpcRoute.
     * 
     */
    public static CompletableFuture<GetGrpcRouteResult> getGrpcRoutePlain(GetGrpcRoutePlainArgs args) {
        return getGrpcRoutePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single GrpcRoute.
     * 
     */
    public static Output<GetGrpcRouteResult> getGrpcRoute(GetGrpcRouteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getGrpcRoute", TypeShape.of(GetGrpcRouteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single GrpcRoute.
     * 
     */
    public static CompletableFuture<GetGrpcRouteResult> getGrpcRoutePlain(GetGrpcRoutePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getGrpcRoute", TypeShape.of(GetGrpcRouteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single HttpRoute.
     * 
     */
    public static Output<GetHttpRouteResult> getHttpRoute(GetHttpRouteArgs args) {
        return getHttpRoute(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single HttpRoute.
     * 
     */
    public static CompletableFuture<GetHttpRouteResult> getHttpRoutePlain(GetHttpRoutePlainArgs args) {
        return getHttpRoutePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single HttpRoute.
     * 
     */
    public static Output<GetHttpRouteResult> getHttpRoute(GetHttpRouteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getHttpRoute", TypeShape.of(GetHttpRouteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single HttpRoute.
     * 
     */
    public static CompletableFuture<GetHttpRouteResult> getHttpRoutePlain(GetHttpRoutePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getHttpRoute", TypeShape.of(GetHttpRouteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Mesh.
     * 
     */
    public static Output<GetMeshResult> getMesh(GetMeshArgs args) {
        return getMesh(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Mesh.
     * 
     */
    public static CompletableFuture<GetMeshResult> getMeshPlain(GetMeshPlainArgs args) {
        return getMeshPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Mesh.
     * 
     */
    public static Output<GetMeshResult> getMesh(GetMeshArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getMesh", TypeShape.of(GetMeshResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Mesh.
     * 
     */
    public static CompletableFuture<GetMeshResult> getMeshPlain(GetMeshPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getMesh", TypeShape.of(GetMeshResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetMeshIamPolicyResult> getMeshIamPolicy(GetMeshIamPolicyArgs args) {
        return getMeshIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetMeshIamPolicyResult> getMeshIamPolicyPlain(GetMeshIamPolicyPlainArgs args) {
        return getMeshIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetMeshIamPolicyResult> getMeshIamPolicy(GetMeshIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getMeshIamPolicy", TypeShape.of(GetMeshIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetMeshIamPolicyResult> getMeshIamPolicyPlain(GetMeshIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getMeshIamPolicy", TypeShape.of(GetMeshIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single ServiceBinding.
     * 
     */
    public static Output<GetServiceBindingResult> getServiceBinding(GetServiceBindingArgs args) {
        return getServiceBinding(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single ServiceBinding.
     * 
     */
    public static CompletableFuture<GetServiceBindingResult> getServiceBindingPlain(GetServiceBindingPlainArgs args) {
        return getServiceBindingPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single ServiceBinding.
     * 
     */
    public static Output<GetServiceBindingResult> getServiceBinding(GetServiceBindingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getServiceBinding", TypeShape.of(GetServiceBindingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single ServiceBinding.
     * 
     */
    public static CompletableFuture<GetServiceBindingResult> getServiceBindingPlain(GetServiceBindingPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getServiceBinding", TypeShape.of(GetServiceBindingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceBindingIamPolicyResult> getServiceBindingIamPolicy(GetServiceBindingIamPolicyArgs args) {
        return getServiceBindingIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceBindingIamPolicyResult> getServiceBindingIamPolicyPlain(GetServiceBindingIamPolicyPlainArgs args) {
        return getServiceBindingIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceBindingIamPolicyResult> getServiceBindingIamPolicy(GetServiceBindingIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getServiceBindingIamPolicy", TypeShape.of(GetServiceBindingIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceBindingIamPolicyResult> getServiceBindingIamPolicyPlain(GetServiceBindingIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getServiceBindingIamPolicy", TypeShape.of(GetServiceBindingIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single TcpRoute.
     * 
     */
    public static Output<GetTcpRouteResult> getTcpRoute(GetTcpRouteArgs args) {
        return getTcpRoute(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single TcpRoute.
     * 
     */
    public static CompletableFuture<GetTcpRouteResult> getTcpRoutePlain(GetTcpRoutePlainArgs args) {
        return getTcpRoutePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single TcpRoute.
     * 
     */
    public static Output<GetTcpRouteResult> getTcpRoute(GetTcpRouteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getTcpRoute", TypeShape.of(GetTcpRouteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single TcpRoute.
     * 
     */
    public static CompletableFuture<GetTcpRouteResult> getTcpRoutePlain(GetTcpRoutePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getTcpRoute", TypeShape.of(GetTcpRouteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single TlsRoute.
     * 
     */
    public static Output<GetTlsRouteResult> getTlsRoute(GetTlsRouteArgs args) {
        return getTlsRoute(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single TlsRoute.
     * 
     */
    public static CompletableFuture<GetTlsRouteResult> getTlsRoutePlain(GetTlsRoutePlainArgs args) {
        return getTlsRoutePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single TlsRoute.
     * 
     */
    public static Output<GetTlsRouteResult> getTlsRoute(GetTlsRouteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkservices/v1beta1:getTlsRoute", TypeShape.of(GetTlsRouteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single TlsRoute.
     * 
     */
    public static CompletableFuture<GetTlsRouteResult> getTlsRoutePlain(GetTlsRoutePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkservices/v1beta1:getTlsRoute", TypeShape.of(GetTlsRouteResult.class), args, Utilities.withVersion(options));
    }
}
