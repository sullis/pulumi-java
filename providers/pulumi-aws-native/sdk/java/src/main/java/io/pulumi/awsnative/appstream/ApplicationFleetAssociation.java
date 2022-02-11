// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appstream.ApplicationFleetAssociationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:appstream:ApplicationFleetAssociation")
public class ApplicationFleetAssociation extends io.pulumi.resources.CustomResource {
    @OutputExport(name="applicationArn", type=String.class, parameters={})
    private Output<String> applicationArn;

    public Output<String> getApplicationArn() {
        return this.applicationArn;
    }
    @OutputExport(name="fleetName", type=String.class, parameters={})
    private Output<String> fleetName;

    public Output<String> getFleetName() {
        return this.fleetName;
    }

    public ApplicationFleetAssociation(String name, ApplicationFleetAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appstream:ApplicationFleetAssociation", name, args == null ? ApplicationFleetAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApplicationFleetAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appstream:ApplicationFleetAssociation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ApplicationFleetAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationFleetAssociation(name, id, options);
    }
}
