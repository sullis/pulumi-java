// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.UsagePlanArgs;
import io.pulumi.awsnative.apigateway.outputs.UsagePlanApiStage;
import io.pulumi.awsnative.apigateway.outputs.UsagePlanQuotaSettings;
import io.pulumi.awsnative.apigateway.outputs.UsagePlanTag;
import io.pulumi.awsnative.apigateway.outputs.UsagePlanThrottleSettings;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ApiGateway::UsagePlan
 * 
 */
@ResourceType(type="aws-native:apigateway:UsagePlan")
public class UsagePlan extends io.pulumi.resources.CustomResource {
    /**
     * The API stages to associate with this usage plan.
     * 
     */
    @OutputExport(name="apiStages", type=List.class, parameters={UsagePlanApiStage.class})
    private Output</* @Nullable */ List<UsagePlanApiStage>> apiStages;

    /**
     * @return The API stages to associate with this usage plan.
     * 
     */
    public Output</* @Nullable */ List<UsagePlanApiStage>> getApiStages() {
        return this.apiStages;
    }
    /**
     * A description of the usage plan.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the usage plan.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Configures the number of requests that users can make within a given interval.
     * 
     */
    @OutputExport(name="quota", type=UsagePlanQuotaSettings.class, parameters={})
    private Output</* @Nullable */ UsagePlanQuotaSettings> quota;

    /**
     * @return Configures the number of requests that users can make within a given interval.
     * 
     */
    public Output</* @Nullable */ UsagePlanQuotaSettings> getQuota() {
        return this.quota;
    }
    /**
     * An array of arbitrary tags (key-value pairs) to associate with the usage plan.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={UsagePlanTag.class})
    private Output</* @Nullable */ List<UsagePlanTag>> tags;

    /**
     * @return An array of arbitrary tags (key-value pairs) to associate with the usage plan.
     * 
     */
    public Output</* @Nullable */ List<UsagePlanTag>> getTags() {
        return this.tags;
    }
    /**
     * Configures the overall request rate (average requests per second) and burst capacity.
     * 
     */
    @OutputExport(name="throttle", type=UsagePlanThrottleSettings.class, parameters={})
    private Output</* @Nullable */ UsagePlanThrottleSettings> throttle;

    /**
     * @return Configures the overall request rate (average requests per second) and burst capacity.
     * 
     */
    public Output</* @Nullable */ UsagePlanThrottleSettings> getThrottle() {
        return this.throttle;
    }
    /**
     * A name for the usage plan.
     * 
     */
    @OutputExport(name="usagePlanName", type=String.class, parameters={})
    private Output</* @Nullable */ String> usagePlanName;

    /**
     * @return A name for the usage plan.
     * 
     */
    public Output</* @Nullable */ String> getUsagePlanName() {
        return this.usagePlanName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UsagePlan(String name, @Nullable UsagePlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:UsagePlan", name, args == null ? UsagePlanArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private UsagePlan(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:UsagePlan", name, null, makeResourceOptions(options, id));
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
    public static UsagePlan get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UsagePlan(name, id, options);
    }
}
