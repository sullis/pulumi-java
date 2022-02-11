// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkmanager.CustomerGatewayAssociationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:networkmanager:CustomerGatewayAssociation")
public class CustomerGatewayAssociation extends io.pulumi.resources.CustomResource {
    @OutputExport(name="customerGatewayArn", type=String.class, parameters={})
    private Output<String> customerGatewayArn;

    public Output<String> getCustomerGatewayArn() {
        return this.customerGatewayArn;
    }
    @OutputExport(name="deviceId", type=String.class, parameters={})
    private Output<String> deviceId;

    public Output<String> getDeviceId() {
        return this.deviceId;
    }
    @OutputExport(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    public Output<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }
    @OutputExport(name="linkId", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkId;

    public Output</* @Nullable */ String> getLinkId() {
        return this.linkId;
    }

    public CustomerGatewayAssociation(String name, CustomerGatewayAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:CustomerGatewayAssociation", name, args == null ? CustomerGatewayAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CustomerGatewayAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:CustomerGatewayAssociation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CustomerGatewayAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomerGatewayAssociation(name, id, options);
    }
}
