// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wisdom;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.wisdom.inputs.GetAssistantArgs;
import com.pulumi.awsnative.wisdom.inputs.GetAssistantAssociationArgs;
import com.pulumi.awsnative.wisdom.inputs.GetAssistantAssociationPlainArgs;
import com.pulumi.awsnative.wisdom.inputs.GetAssistantPlainArgs;
import com.pulumi.awsnative.wisdom.inputs.GetKnowledgeBaseArgs;
import com.pulumi.awsnative.wisdom.inputs.GetKnowledgeBasePlainArgs;
import com.pulumi.awsnative.wisdom.outputs.GetAssistantAssociationResult;
import com.pulumi.awsnative.wisdom.outputs.GetAssistantResult;
import com.pulumi.awsnative.wisdom.outputs.GetKnowledgeBaseResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class WisdomFunctions {
    /**
     * Definition of AWS::Wisdom::Assistant Resource Type
     * 
     */
    public static Output<GetAssistantResult> getAssistant(GetAssistantArgs args) {
        return getAssistant(args, InvokeOptions.Empty);
    }
    /**
     * Definition of AWS::Wisdom::Assistant Resource Type
     * 
     */
    public static CompletableFuture<GetAssistantResult> getAssistantPlain(GetAssistantPlainArgs args) {
        return getAssistantPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of AWS::Wisdom::Assistant Resource Type
     * 
     */
    public static Output<GetAssistantResult> getAssistant(GetAssistantArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:wisdom:getAssistant", TypeShape.of(GetAssistantResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of AWS::Wisdom::Assistant Resource Type
     * 
     */
    public static CompletableFuture<GetAssistantResult> getAssistantPlain(GetAssistantPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wisdom:getAssistant", TypeShape.of(GetAssistantResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of AWS::Wisdom::AssistantAssociation Resource Type
     * 
     */
    public static Output<GetAssistantAssociationResult> getAssistantAssociation(GetAssistantAssociationArgs args) {
        return getAssistantAssociation(args, InvokeOptions.Empty);
    }
    /**
     * Definition of AWS::Wisdom::AssistantAssociation Resource Type
     * 
     */
    public static CompletableFuture<GetAssistantAssociationResult> getAssistantAssociationPlain(GetAssistantAssociationPlainArgs args) {
        return getAssistantAssociationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of AWS::Wisdom::AssistantAssociation Resource Type
     * 
     */
    public static Output<GetAssistantAssociationResult> getAssistantAssociation(GetAssistantAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:wisdom:getAssistantAssociation", TypeShape.of(GetAssistantAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of AWS::Wisdom::AssistantAssociation Resource Type
     * 
     */
    public static CompletableFuture<GetAssistantAssociationResult> getAssistantAssociationPlain(GetAssistantAssociationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wisdom:getAssistantAssociation", TypeShape.of(GetAssistantAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of AWS::Wisdom::KnowledgeBase Resource Type
     * 
     */
    public static Output<GetKnowledgeBaseResult> getKnowledgeBase(GetKnowledgeBaseArgs args) {
        return getKnowledgeBase(args, InvokeOptions.Empty);
    }
    /**
     * Definition of AWS::Wisdom::KnowledgeBase Resource Type
     * 
     */
    public static CompletableFuture<GetKnowledgeBaseResult> getKnowledgeBasePlain(GetKnowledgeBasePlainArgs args) {
        return getKnowledgeBasePlain(args, InvokeOptions.Empty);
    }
    /**
     * Definition of AWS::Wisdom::KnowledgeBase Resource Type
     * 
     */
    public static Output<GetKnowledgeBaseResult> getKnowledgeBase(GetKnowledgeBaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:wisdom:getKnowledgeBase", TypeShape.of(GetKnowledgeBaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Definition of AWS::Wisdom::KnowledgeBase Resource Type
     * 
     */
    public static CompletableFuture<GetKnowledgeBaseResult> getKnowledgeBasePlain(GetKnowledgeBasePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wisdom:getKnowledgeBase", TypeShape.of(GetKnowledgeBaseResult.class), args, Utilities.withVersion(options));
    }
}
