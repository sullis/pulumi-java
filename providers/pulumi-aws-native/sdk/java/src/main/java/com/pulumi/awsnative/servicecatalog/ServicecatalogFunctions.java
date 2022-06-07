// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalog;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.servicecatalog.inputs.GetCloudFormationProvisionedProductArgs;
import com.pulumi.awsnative.servicecatalog.inputs.GetCloudFormationProvisionedProductPlainArgs;
import com.pulumi.awsnative.servicecatalog.inputs.GetServiceActionArgs;
import com.pulumi.awsnative.servicecatalog.inputs.GetServiceActionAssociationArgs;
import com.pulumi.awsnative.servicecatalog.inputs.GetServiceActionAssociationPlainArgs;
import com.pulumi.awsnative.servicecatalog.inputs.GetServiceActionPlainArgs;
import com.pulumi.awsnative.servicecatalog.outputs.GetCloudFormationProvisionedProductResult;
import com.pulumi.awsnative.servicecatalog.outputs.GetServiceActionAssociationResult;
import com.pulumi.awsnative.servicecatalog.outputs.GetServiceActionResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServicecatalogFunctions {
    /**
     * Resource Schema for AWS::ServiceCatalog::CloudFormationProvisionedProduct
     * 
     */
    public static Output<GetCloudFormationProvisionedProductResult> getCloudFormationProvisionedProduct(GetCloudFormationProvisionedProductArgs args) {
        return getCloudFormationProvisionedProduct(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::CloudFormationProvisionedProduct
     * 
     */
    public static CompletableFuture<GetCloudFormationProvisionedProductResult> getCloudFormationProvisionedProductPlain(GetCloudFormationProvisionedProductPlainArgs args) {
        return getCloudFormationProvisionedProductPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::CloudFormationProvisionedProduct
     * 
     */
    public static Output<GetCloudFormationProvisionedProductResult> getCloudFormationProvisionedProduct(GetCloudFormationProvisionedProductArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:servicecatalog:getCloudFormationProvisionedProduct", TypeShape.of(GetCloudFormationProvisionedProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::CloudFormationProvisionedProduct
     * 
     */
    public static CompletableFuture<GetCloudFormationProvisionedProductResult> getCloudFormationProvisionedProductPlain(GetCloudFormationProvisionedProductPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalog:getCloudFormationProvisionedProduct", TypeShape.of(GetCloudFormationProvisionedProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::ServiceAction
     * 
     */
    public static Output<GetServiceActionResult> getServiceAction(GetServiceActionArgs args) {
        return getServiceAction(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::ServiceAction
     * 
     */
    public static CompletableFuture<GetServiceActionResult> getServiceActionPlain(GetServiceActionPlainArgs args) {
        return getServiceActionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::ServiceAction
     * 
     */
    public static Output<GetServiceActionResult> getServiceAction(GetServiceActionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:servicecatalog:getServiceAction", TypeShape.of(GetServiceActionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::ServiceAction
     * 
     */
    public static CompletableFuture<GetServiceActionResult> getServiceActionPlain(GetServiceActionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalog:getServiceAction", TypeShape.of(GetServiceActionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::ServiceActionAssociation
     * 
     */
    public static Output<GetServiceActionAssociationResult> getServiceActionAssociation(GetServiceActionAssociationArgs args) {
        return getServiceActionAssociation(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::ServiceActionAssociation
     * 
     */
    public static CompletableFuture<GetServiceActionAssociationResult> getServiceActionAssociationPlain(GetServiceActionAssociationPlainArgs args) {
        return getServiceActionAssociationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::ServiceActionAssociation
     * 
     */
    public static Output<GetServiceActionAssociationResult> getServiceActionAssociation(GetServiceActionAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:servicecatalog:getServiceActionAssociation", TypeShape.of(GetServiceActionAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::ServiceActionAssociation
     * 
     */
    public static CompletableFuture<GetServiceActionAssociationResult> getServiceActionAssociationPlain(GetServiceActionAssociationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalog:getServiceActionAssociation", TypeShape.of(GetServiceActionAssociationResult.class), args, Utilities.withVersion(options));
    }
}
