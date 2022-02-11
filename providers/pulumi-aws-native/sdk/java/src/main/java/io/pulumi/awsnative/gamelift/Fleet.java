// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.gamelift.FleetArgs;
import io.pulumi.awsnative.gamelift.enums.FleetNewGameSessionProtectionPolicy;
import io.pulumi.awsnative.gamelift.enums.FleetType;
import io.pulumi.awsnative.gamelift.outputs.FleetCertificateConfiguration;
import io.pulumi.awsnative.gamelift.outputs.FleetIpPermission;
import io.pulumi.awsnative.gamelift.outputs.FleetLocationConfiguration;
import io.pulumi.awsnative.gamelift.outputs.FleetResourceCreationLimitPolicy;
import io.pulumi.awsnative.gamelift.outputs.FleetRuntimeConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:gamelift:Fleet")
public class Fleet extends io.pulumi.resources.CustomResource {
    @OutputExport(name="buildId", type=String.class, parameters={})
    private Output</* @Nullable */ String> buildId;

    public Output</* @Nullable */ String> getBuildId() {
        return this.buildId;
    }
    @OutputExport(name="certificateConfiguration", type=FleetCertificateConfiguration.class, parameters={})
    private Output</* @Nullable */ FleetCertificateConfiguration> certificateConfiguration;

    public Output</* @Nullable */ FleetCertificateConfiguration> getCertificateConfiguration() {
        return this.certificateConfiguration;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="desiredEC2Instances", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> desiredEC2Instances;

    public Output</* @Nullable */ Integer> getDesiredEC2Instances() {
        return this.desiredEC2Instances;
    }
    @OutputExport(name="eC2InboundPermissions", type=List.class, parameters={FleetIpPermission.class})
    private Output</* @Nullable */ List<FleetIpPermission>> eC2InboundPermissions;

    public Output</* @Nullable */ List<FleetIpPermission>> getEC2InboundPermissions() {
        return this.eC2InboundPermissions;
    }
    @OutputExport(name="eC2InstanceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> eC2InstanceType;

    public Output</* @Nullable */ String> getEC2InstanceType() {
        return this.eC2InstanceType;
    }
    @OutputExport(name="fleetId", type=String.class, parameters={})
    private Output<String> fleetId;

    public Output<String> getFleetId() {
        return this.fleetId;
    }
    @OutputExport(name="fleetType", type=FleetType.class, parameters={})
    private Output</* @Nullable */ FleetType> fleetType;

    public Output</* @Nullable */ FleetType> getFleetType() {
        return this.fleetType;
    }
    @OutputExport(name="instanceRoleARN", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceRoleARN;

    public Output</* @Nullable */ String> getInstanceRoleARN() {
        return this.instanceRoleARN;
    }
    @OutputExport(name="locations", type=List.class, parameters={FleetLocationConfiguration.class})
    private Output</* @Nullable */ List<FleetLocationConfiguration>> locations;

    public Output</* @Nullable */ List<FleetLocationConfiguration>> getLocations() {
        return this.locations;
    }
    @OutputExport(name="logPaths", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> logPaths;

    public Output</* @Nullable */ List<String>> getLogPaths() {
        return this.logPaths;
    }
    @OutputExport(name="maxSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxSize;

    public Output</* @Nullable */ Integer> getMaxSize() {
        return this.maxSize;
    }
    @OutputExport(name="metricGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> metricGroups;

    public Output</* @Nullable */ List<String>> getMetricGroups() {
        return this.metricGroups;
    }
    @OutputExport(name="minSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minSize;

    public Output</* @Nullable */ Integer> getMinSize() {
        return this.minSize;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="newGameSessionProtectionPolicy", type=FleetNewGameSessionProtectionPolicy.class, parameters={})
    private Output</* @Nullable */ FleetNewGameSessionProtectionPolicy> newGameSessionProtectionPolicy;

    public Output</* @Nullable */ FleetNewGameSessionProtectionPolicy> getNewGameSessionProtectionPolicy() {
        return this.newGameSessionProtectionPolicy;
    }
    @OutputExport(name="peerVpcAwsAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> peerVpcAwsAccountId;

    public Output</* @Nullable */ String> getPeerVpcAwsAccountId() {
        return this.peerVpcAwsAccountId;
    }
    @OutputExport(name="peerVpcId", type=String.class, parameters={})
    private Output</* @Nullable */ String> peerVpcId;

    public Output</* @Nullable */ String> getPeerVpcId() {
        return this.peerVpcId;
    }
    @OutputExport(name="resourceCreationLimitPolicy", type=FleetResourceCreationLimitPolicy.class, parameters={})
    private Output</* @Nullable */ FleetResourceCreationLimitPolicy> resourceCreationLimitPolicy;

    public Output</* @Nullable */ FleetResourceCreationLimitPolicy> getResourceCreationLimitPolicy() {
        return this.resourceCreationLimitPolicy;
    }
    @OutputExport(name="runtimeConfiguration", type=FleetRuntimeConfiguration.class, parameters={})
    private Output</* @Nullable */ FleetRuntimeConfiguration> runtimeConfiguration;

    public Output</* @Nullable */ FleetRuntimeConfiguration> getRuntimeConfiguration() {
        return this.runtimeConfiguration;
    }
    @OutputExport(name="scriptId", type=String.class, parameters={})
    private Output</* @Nullable */ String> scriptId;

    public Output</* @Nullable */ String> getScriptId() {
        return this.scriptId;
    }
    @OutputExport(name="serverLaunchParameters", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverLaunchParameters;

    public Output</* @Nullable */ String> getServerLaunchParameters() {
        return this.serverLaunchParameters;
    }
    @OutputExport(name="serverLaunchPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverLaunchPath;

    public Output</* @Nullable */ String> getServerLaunchPath() {
        return this.serverLaunchPath;
    }

    public Fleet(String name, @Nullable FleetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:gamelift:Fleet", name, args == null ? FleetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Fleet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:gamelift:Fleet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Fleet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Fleet(name, id, options);
    }
}
