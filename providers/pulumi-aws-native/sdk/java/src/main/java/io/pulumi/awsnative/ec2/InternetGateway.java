// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.InternetGatewayArgs;
import io.pulumi.awsnative.ec2.outputs.InternetGatewayTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:ec2:InternetGateway")
public class InternetGateway extends io.pulumi.resources.CustomResource {
    @OutputExport(name="internetGatewayId", type=String.class, parameters={})
    private Output<String> internetGatewayId;

    public Output<String> getInternetGatewayId() {
        return this.internetGatewayId;
    }
    @OutputExport(name="tags", type=List.class, parameters={InternetGatewayTag.class})
    private Output</* @Nullable */ List<InternetGatewayTag>> tags;

    public Output</* @Nullable */ List<InternetGatewayTag>> getTags() {
        return this.tags;
    }

    public InternetGateway(String name, @Nullable InternetGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:InternetGateway", name, args == null ? InternetGatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private InternetGateway(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:InternetGateway", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static InternetGateway get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InternetGateway(name, id, options);
    }
}
