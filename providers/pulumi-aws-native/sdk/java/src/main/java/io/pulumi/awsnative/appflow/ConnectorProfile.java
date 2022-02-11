// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.appflow.ConnectorProfileArgs;
import io.pulumi.awsnative.appflow.enums.ConnectorProfileConnectionMode;
import io.pulumi.awsnative.appflow.enums.ConnectorProfileConnectorType;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:appflow:ConnectorProfile")
public class ConnectorProfile extends io.pulumi.resources.CustomResource {
    @OutputExport(name="connectionMode", type=ConnectorProfileConnectionMode.class, parameters={})
    private Output<ConnectorProfileConnectionMode> connectionMode;

    public Output<ConnectorProfileConnectionMode> getConnectionMode() {
        return this.connectionMode;
    }
    @OutputExport(name="connectorProfileArn", type=String.class, parameters={})
    private Output<String> connectorProfileArn;

    public Output<String> getConnectorProfileArn() {
        return this.connectorProfileArn;
    }
    @OutputExport(name="connectorProfileConfig", type=ConnectorProfileConfig.class, parameters={})
    private Output</* @Nullable */ ConnectorProfileConfig> connectorProfileConfig;

    public Output</* @Nullable */ ConnectorProfileConfig> getConnectorProfileConfig() {
        return this.connectorProfileConfig;
    }
    @OutputExport(name="connectorProfileName", type=String.class, parameters={})
    private Output<String> connectorProfileName;

    public Output<String> getConnectorProfileName() {
        return this.connectorProfileName;
    }
    @OutputExport(name="connectorType", type=ConnectorProfileConnectorType.class, parameters={})
    private Output<ConnectorProfileConnectorType> connectorType;

    public Output<ConnectorProfileConnectorType> getConnectorType() {
        return this.connectorType;
    }
    @OutputExport(name="credentialsArn", type=String.class, parameters={})
    private Output<String> credentialsArn;

    public Output<String> getCredentialsArn() {
        return this.credentialsArn;
    }
    @OutputExport(name="kMSArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> kMSArn;

    public Output</* @Nullable */ String> getKMSArn() {
        return this.kMSArn;
    }

    public ConnectorProfile(String name, ConnectorProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appflow:ConnectorProfile", name, args == null ? ConnectorProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConnectorProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:appflow:ConnectorProfile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ConnectorProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConnectorProfile(name, id, options);
    }
}
