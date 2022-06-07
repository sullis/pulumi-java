// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.wafv2.inputs.GetIPSetArgs;
import com.pulumi.awsnative.wafv2.inputs.GetIPSetPlainArgs;
import com.pulumi.awsnative.wafv2.inputs.GetLoggingConfigurationArgs;
import com.pulumi.awsnative.wafv2.inputs.GetLoggingConfigurationPlainArgs;
import com.pulumi.awsnative.wafv2.inputs.GetRegexPatternSetArgs;
import com.pulumi.awsnative.wafv2.inputs.GetRegexPatternSetPlainArgs;
import com.pulumi.awsnative.wafv2.inputs.GetRuleGroupArgs;
import com.pulumi.awsnative.wafv2.inputs.GetRuleGroupPlainArgs;
import com.pulumi.awsnative.wafv2.inputs.GetWebACLArgs;
import com.pulumi.awsnative.wafv2.inputs.GetWebACLAssociationArgs;
import com.pulumi.awsnative.wafv2.inputs.GetWebACLAssociationPlainArgs;
import com.pulumi.awsnative.wafv2.inputs.GetWebACLPlainArgs;
import com.pulumi.awsnative.wafv2.outputs.GetIPSetResult;
import com.pulumi.awsnative.wafv2.outputs.GetLoggingConfigurationResult;
import com.pulumi.awsnative.wafv2.outputs.GetRegexPatternSetResult;
import com.pulumi.awsnative.wafv2.outputs.GetRuleGroupResult;
import com.pulumi.awsnative.wafv2.outputs.GetWebACLAssociationResult;
import com.pulumi.awsnative.wafv2.outputs.GetWebACLResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class Wafv2Functions {
    /**
     * Contains a list of IP addresses. This can be either IPV4 or IPV6. The list will be mutually
     * 
     */
    public static Output<GetIPSetResult> getIPSet(GetIPSetArgs args) {
        return getIPSet(args, InvokeOptions.Empty);
    }
    /**
     * Contains a list of IP addresses. This can be either IPV4 or IPV6. The list will be mutually
     * 
     */
    public static CompletableFuture<GetIPSetResult> getIPSetPlain(GetIPSetPlainArgs args) {
        return getIPSetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Contains a list of IP addresses. This can be either IPV4 or IPV6. The list will be mutually
     * 
     */
    public static Output<GetIPSetResult> getIPSet(GetIPSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:wafv2:getIPSet", TypeShape.of(GetIPSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Contains a list of IP addresses. This can be either IPV4 or IPV6. The list will be mutually
     * 
     */
    public static CompletableFuture<GetIPSetResult> getIPSetPlain(GetIPSetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wafv2:getIPSet", TypeShape.of(GetIPSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A WAFv2 Logging Configuration Resource Provider
     * 
     */
    public static Output<GetLoggingConfigurationResult> getLoggingConfiguration(GetLoggingConfigurationArgs args) {
        return getLoggingConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * A WAFv2 Logging Configuration Resource Provider
     * 
     */
    public static CompletableFuture<GetLoggingConfigurationResult> getLoggingConfigurationPlain(GetLoggingConfigurationPlainArgs args) {
        return getLoggingConfigurationPlain(args, InvokeOptions.Empty);
    }
    /**
     * A WAFv2 Logging Configuration Resource Provider
     * 
     */
    public static Output<GetLoggingConfigurationResult> getLoggingConfiguration(GetLoggingConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:wafv2:getLoggingConfiguration", TypeShape.of(GetLoggingConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A WAFv2 Logging Configuration Resource Provider
     * 
     */
    public static CompletableFuture<GetLoggingConfigurationResult> getLoggingConfigurationPlain(GetLoggingConfigurationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wafv2:getLoggingConfiguration", TypeShape.of(GetLoggingConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Contains a list of Regular expressions based on the provided inputs. RegexPatternSet can be used with other WAF entities with RegexPatternSetReferenceStatement to perform other actions .
     * 
     */
    public static Output<GetRegexPatternSetResult> getRegexPatternSet(GetRegexPatternSetArgs args) {
        return getRegexPatternSet(args, InvokeOptions.Empty);
    }
    /**
     * Contains a list of Regular expressions based on the provided inputs. RegexPatternSet can be used with other WAF entities with RegexPatternSetReferenceStatement to perform other actions .
     * 
     */
    public static CompletableFuture<GetRegexPatternSetResult> getRegexPatternSetPlain(GetRegexPatternSetPlainArgs args) {
        return getRegexPatternSetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Contains a list of Regular expressions based on the provided inputs. RegexPatternSet can be used with other WAF entities with RegexPatternSetReferenceStatement to perform other actions .
     * 
     */
    public static Output<GetRegexPatternSetResult> getRegexPatternSet(GetRegexPatternSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:wafv2:getRegexPatternSet", TypeShape.of(GetRegexPatternSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Contains a list of Regular expressions based on the provided inputs. RegexPatternSet can be used with other WAF entities with RegexPatternSetReferenceStatement to perform other actions .
     * 
     */
    public static CompletableFuture<GetRegexPatternSetResult> getRegexPatternSetPlain(GetRegexPatternSetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wafv2:getRegexPatternSet", TypeShape.of(GetRegexPatternSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Contains the Rules that identify the requests that you want to allow, block, or count. In a RuleGroup, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a RuleGroup, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the RuleGroup with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a RuleGroup, a request needs to match only one of the specifications to be allowed, blocked, or counted.
     * 
     */
    public static Output<GetRuleGroupResult> getRuleGroup(GetRuleGroupArgs args) {
        return getRuleGroup(args, InvokeOptions.Empty);
    }
    /**
     * Contains the Rules that identify the requests that you want to allow, block, or count. In a RuleGroup, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a RuleGroup, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the RuleGroup with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a RuleGroup, a request needs to match only one of the specifications to be allowed, blocked, or counted.
     * 
     */
    public static CompletableFuture<GetRuleGroupResult> getRuleGroupPlain(GetRuleGroupPlainArgs args) {
        return getRuleGroupPlain(args, InvokeOptions.Empty);
    }
    /**
     * Contains the Rules that identify the requests that you want to allow, block, or count. In a RuleGroup, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a RuleGroup, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the RuleGroup with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a RuleGroup, a request needs to match only one of the specifications to be allowed, blocked, or counted.
     * 
     */
    public static Output<GetRuleGroupResult> getRuleGroup(GetRuleGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:wafv2:getRuleGroup", TypeShape.of(GetRuleGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Contains the Rules that identify the requests that you want to allow, block, or count. In a RuleGroup, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a RuleGroup, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the RuleGroup with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a RuleGroup, a request needs to match only one of the specifications to be allowed, blocked, or counted.
     * 
     */
    public static CompletableFuture<GetRuleGroupResult> getRuleGroupPlain(GetRuleGroupPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wafv2:getRuleGroup", TypeShape.of(GetRuleGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Contains the Rules that identify the requests that you want to allow, block, or count. In a WebACL, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a WebACL, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the WebACL with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a WebACL, a request needs to match only one of the specifications to be allowed, blocked, or counted.
     * 
     */
    public static Output<GetWebACLResult> getWebACL(GetWebACLArgs args) {
        return getWebACL(args, InvokeOptions.Empty);
    }
    /**
     * Contains the Rules that identify the requests that you want to allow, block, or count. In a WebACL, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a WebACL, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the WebACL with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a WebACL, a request needs to match only one of the specifications to be allowed, blocked, or counted.
     * 
     */
    public static CompletableFuture<GetWebACLResult> getWebACLPlain(GetWebACLPlainArgs args) {
        return getWebACLPlain(args, InvokeOptions.Empty);
    }
    /**
     * Contains the Rules that identify the requests that you want to allow, block, or count. In a WebACL, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a WebACL, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the WebACL with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a WebACL, a request needs to match only one of the specifications to be allowed, blocked, or counted.
     * 
     */
    public static Output<GetWebACLResult> getWebACL(GetWebACLArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:wafv2:getWebACL", TypeShape.of(GetWebACLResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Contains the Rules that identify the requests that you want to allow, block, or count. In a WebACL, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a WebACL, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the WebACL with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a WebACL, a request needs to match only one of the specifications to be allowed, blocked, or counted.
     * 
     */
    public static CompletableFuture<GetWebACLResult> getWebACLPlain(GetWebACLPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wafv2:getWebACL", TypeShape.of(GetWebACLResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Associates WebACL to Application Load Balancer, CloudFront or API Gateway.
     * 
     */
    public static Output<GetWebACLAssociationResult> getWebACLAssociation(GetWebACLAssociationArgs args) {
        return getWebACLAssociation(args, InvokeOptions.Empty);
    }
    /**
     * Associates WebACL to Application Load Balancer, CloudFront or API Gateway.
     * 
     */
    public static CompletableFuture<GetWebACLAssociationResult> getWebACLAssociationPlain(GetWebACLAssociationPlainArgs args) {
        return getWebACLAssociationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Associates WebACL to Application Load Balancer, CloudFront or API Gateway.
     * 
     */
    public static Output<GetWebACLAssociationResult> getWebACLAssociation(GetWebACLAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:wafv2:getWebACLAssociation", TypeShape.of(GetWebACLAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Associates WebACL to Application Load Balancer, CloudFront or API Gateway.
     * 
     */
    public static CompletableFuture<GetWebACLAssociationResult> getWebACLAssociationPlain(GetWebACLAssociationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wafv2:getWebACLAssociation", TypeShape.of(GetWebACLAssociationResult.class), args, Utilities.withVersion(options));
    }
}
