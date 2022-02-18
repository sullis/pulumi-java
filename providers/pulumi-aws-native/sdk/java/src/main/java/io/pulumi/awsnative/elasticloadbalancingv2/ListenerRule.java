// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.elasticloadbalancingv2.ListenerRuleArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRuleAction;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRuleRuleCondition;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ElasticLoadBalancingV2::ListenerRule
 * 
 */
@ResourceType(type="aws-native:elasticloadbalancingv2:ListenerRule")
public class ListenerRule extends io.pulumi.resources.CustomResource {
    @OutputExport(name="actions", type=List.class, parameters={ListenerRuleAction.class})
    private Output<List<ListenerRuleAction>> actions;

    public Output<List<ListenerRuleAction>> getActions() {
        return this.actions;
    }
    @OutputExport(name="conditions", type=List.class, parameters={ListenerRuleRuleCondition.class})
    private Output<List<ListenerRuleRuleCondition>> conditions;

    public Output<List<ListenerRuleRuleCondition>> getConditions() {
        return this.conditions;
    }
    @OutputExport(name="isDefault", type=Boolean.class, parameters={})
    private Output<Boolean> isDefault;

    public Output<Boolean> getIsDefault() {
        return this.isDefault;
    }
    @OutputExport(name="listenerArn", type=String.class, parameters={})
    private Output<String> listenerArn;

    public Output<String> getListenerArn() {
        return this.listenerArn;
    }
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }
    @OutputExport(name="ruleArn", type=String.class, parameters={})
    private Output<String> ruleArn;

    public Output<String> getRuleArn() {
        return this.ruleArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ListenerRule(String name, ListenerRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:elasticloadbalancingv2:ListenerRule", name, args == null ? ListenerRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ListenerRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:elasticloadbalancingv2:ListenerRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ListenerRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ListenerRule(name, id, options);
    }
}
