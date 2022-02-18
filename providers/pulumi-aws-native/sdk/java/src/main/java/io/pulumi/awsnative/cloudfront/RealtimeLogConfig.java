// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudfront.RealtimeLogConfigArgs;
import io.pulumi.awsnative.cloudfront.outputs.RealtimeLogConfigEndPoint;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::CloudFront::RealtimeLogConfig
 * 
 */
@ResourceType(type="aws-native:cloudfront:RealtimeLogConfig")
public class RealtimeLogConfig extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="endPoints", type=List.class, parameters={RealtimeLogConfigEndPoint.class})
    private Output<List<RealtimeLogConfigEndPoint>> endPoints;

    public Output<List<RealtimeLogConfigEndPoint>> getEndPoints() {
        return this.endPoints;
    }
    @OutputExport(name="fields", type=List.class, parameters={String.class})
    private Output<List<String>> fields;

    public Output<List<String>> getFields() {
        return this.fields;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="samplingRate", type=Double.class, parameters={})
    private Output<Double> samplingRate;

    public Output<Double> getSamplingRate() {
        return this.samplingRate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RealtimeLogConfig(String name, RealtimeLogConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:RealtimeLogConfig", name, args == null ? RealtimeLogConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RealtimeLogConfig(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:RealtimeLogConfig", name, null, makeResourceOptions(options, id));
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
    public static RealtimeLogConfig get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RealtimeLogConfig(name, id, options);
    }
}
