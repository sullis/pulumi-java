// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ses;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ses.inputs.GetConfigurationSetArgs;
import com.pulumi.awsnative.ses.inputs.GetConfigurationSetEventDestinationArgs;
import com.pulumi.awsnative.ses.inputs.GetConfigurationSetEventDestinationPlainArgs;
import com.pulumi.awsnative.ses.inputs.GetConfigurationSetPlainArgs;
import com.pulumi.awsnative.ses.inputs.GetContactListArgs;
import com.pulumi.awsnative.ses.inputs.GetContactListPlainArgs;
import com.pulumi.awsnative.ses.inputs.GetTemplateArgs;
import com.pulumi.awsnative.ses.inputs.GetTemplatePlainArgs;
import com.pulumi.awsnative.ses.outputs.GetConfigurationSetEventDestinationResult;
import com.pulumi.awsnative.ses.outputs.GetConfigurationSetResult;
import com.pulumi.awsnative.ses.outputs.GetContactListResult;
import com.pulumi.awsnative.ses.outputs.GetTemplateResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SesFunctions {
    /**
     * Resource schema for AWS::SES::ConfigurationSet.
     * 
     */
    public static Output<GetConfigurationSetResult> getConfigurationSet(GetConfigurationSetArgs args) {
        return getConfigurationSet(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::SES::ConfigurationSet.
     * 
     */
    public static CompletableFuture<GetConfigurationSetResult> getConfigurationSetPlain(GetConfigurationSetPlainArgs args) {
        return getConfigurationSetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::SES::ConfigurationSet.
     * 
     */
    public static Output<GetConfigurationSetResult> getConfigurationSet(GetConfigurationSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:ses:getConfigurationSet", TypeShape.of(GetConfigurationSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::SES::ConfigurationSet.
     * 
     */
    public static CompletableFuture<GetConfigurationSetResult> getConfigurationSetPlain(GetConfigurationSetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ses:getConfigurationSet", TypeShape.of(GetConfigurationSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::SES::ConfigurationSetEventDestination
     * 
     */
    public static Output<GetConfigurationSetEventDestinationResult> getConfigurationSetEventDestination(GetConfigurationSetEventDestinationArgs args) {
        return getConfigurationSetEventDestination(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::SES::ConfigurationSetEventDestination
     * 
     */
    public static CompletableFuture<GetConfigurationSetEventDestinationResult> getConfigurationSetEventDestinationPlain(GetConfigurationSetEventDestinationPlainArgs args) {
        return getConfigurationSetEventDestinationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::SES::ConfigurationSetEventDestination
     * 
     */
    public static Output<GetConfigurationSetEventDestinationResult> getConfigurationSetEventDestination(GetConfigurationSetEventDestinationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:ses:getConfigurationSetEventDestination", TypeShape.of(GetConfigurationSetEventDestinationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::SES::ConfigurationSetEventDestination
     * 
     */
    public static CompletableFuture<GetConfigurationSetEventDestinationResult> getConfigurationSetEventDestinationPlain(GetConfigurationSetEventDestinationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ses:getConfigurationSetEventDestination", TypeShape.of(GetConfigurationSetEventDestinationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::SES::ContactList.
     * 
     */
    public static Output<GetContactListResult> getContactList(GetContactListArgs args) {
        return getContactList(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::SES::ContactList.
     * 
     */
    public static CompletableFuture<GetContactListResult> getContactListPlain(GetContactListPlainArgs args) {
        return getContactListPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::SES::ContactList.
     * 
     */
    public static Output<GetContactListResult> getContactList(GetContactListArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:ses:getContactList", TypeShape.of(GetContactListResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::SES::ContactList.
     * 
     */
    public static CompletableFuture<GetContactListResult> getContactListPlain(GetContactListPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ses:getContactList", TypeShape.of(GetContactListResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::SES::Template
     * 
     */
    public static Output<GetTemplateResult> getTemplate(GetTemplateArgs args) {
        return getTemplate(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::SES::Template
     * 
     */
    public static CompletableFuture<GetTemplateResult> getTemplatePlain(GetTemplatePlainArgs args) {
        return getTemplatePlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::SES::Template
     * 
     */
    public static Output<GetTemplateResult> getTemplate(GetTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:ses:getTemplate", TypeShape.of(GetTemplateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::SES::Template
     * 
     */
    public static CompletableFuture<GetTemplateResult> getTemplatePlain(GetTemplatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ses:getTemplate", TypeShape.of(GetTemplateResult.class), args, Utilities.withVersion(options));
    }
}
