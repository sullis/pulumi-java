// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssm;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ssm.inputs.GetAssociationArgs;
import com.pulumi.awsnative.ssm.inputs.GetAssociationPlainArgs;
import com.pulumi.awsnative.ssm.inputs.GetDocumentArgs;
import com.pulumi.awsnative.ssm.inputs.GetDocumentPlainArgs;
import com.pulumi.awsnative.ssm.inputs.GetResourceDataSyncArgs;
import com.pulumi.awsnative.ssm.inputs.GetResourceDataSyncPlainArgs;
import com.pulumi.awsnative.ssm.outputs.GetAssociationResult;
import com.pulumi.awsnative.ssm.outputs.GetDocumentResult;
import com.pulumi.awsnative.ssm.outputs.GetResourceDataSyncResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SsmFunctions {
    /**
     * The AWS::SSM::Association resource associates an SSM document in AWS Systems Manager with EC2 instances that contain a configuration agent to process the document.
     * 
     */
    public static Output<GetAssociationResult> getAssociation(GetAssociationArgs args) {
        return getAssociation(args, InvokeOptions.Empty);
    }
    /**
     * The AWS::SSM::Association resource associates an SSM document in AWS Systems Manager with EC2 instances that contain a configuration agent to process the document.
     * 
     */
    public static CompletableFuture<GetAssociationResult> getAssociationPlain(GetAssociationPlainArgs args) {
        return getAssociationPlain(args, InvokeOptions.Empty);
    }
    /**
     * The AWS::SSM::Association resource associates an SSM document in AWS Systems Manager with EC2 instances that contain a configuration agent to process the document.
     * 
     */
    public static Output<GetAssociationResult> getAssociation(GetAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:ssm:getAssociation", TypeShape.of(GetAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::SSM::Association resource associates an SSM document in AWS Systems Manager with EC2 instances that contain a configuration agent to process the document.
     * 
     */
    public static CompletableFuture<GetAssociationResult> getAssociationPlain(GetAssociationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ssm:getAssociation", TypeShape.of(GetAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::SSM::Document resource is an SSM document in AWS Systems Manager that defines the actions that Systems Manager performs, which can be used to set up and run commands on your instances.
     * 
     */
    public static Output<GetDocumentResult> getDocument(GetDocumentArgs args) {
        return getDocument(args, InvokeOptions.Empty);
    }
    /**
     * The AWS::SSM::Document resource is an SSM document in AWS Systems Manager that defines the actions that Systems Manager performs, which can be used to set up and run commands on your instances.
     * 
     */
    public static CompletableFuture<GetDocumentResult> getDocumentPlain(GetDocumentPlainArgs args) {
        return getDocumentPlain(args, InvokeOptions.Empty);
    }
    /**
     * The AWS::SSM::Document resource is an SSM document in AWS Systems Manager that defines the actions that Systems Manager performs, which can be used to set up and run commands on your instances.
     * 
     */
    public static Output<GetDocumentResult> getDocument(GetDocumentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:ssm:getDocument", TypeShape.of(GetDocumentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::SSM::Document resource is an SSM document in AWS Systems Manager that defines the actions that Systems Manager performs, which can be used to set up and run commands on your instances.
     * 
     */
    public static CompletableFuture<GetDocumentResult> getDocumentPlain(GetDocumentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ssm:getDocument", TypeShape.of(GetDocumentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::SSM::ResourceDataSync
     * 
     */
    public static Output<GetResourceDataSyncResult> getResourceDataSync(GetResourceDataSyncArgs args) {
        return getResourceDataSync(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::SSM::ResourceDataSync
     * 
     */
    public static CompletableFuture<GetResourceDataSyncResult> getResourceDataSyncPlain(GetResourceDataSyncPlainArgs args) {
        return getResourceDataSyncPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::SSM::ResourceDataSync
     * 
     */
    public static Output<GetResourceDataSyncResult> getResourceDataSync(GetResourceDataSyncArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:ssm:getResourceDataSync", TypeShape.of(GetResourceDataSyncResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::SSM::ResourceDataSync
     * 
     */
    public static CompletableFuture<GetResourceDataSyncResult> getResourceDataSyncPlain(GetResourceDataSyncPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ssm:getResourceDataSync", TypeShape.of(GetResourceDataSyncResult.class), args, Utilities.withVersion(options));
    }
}
