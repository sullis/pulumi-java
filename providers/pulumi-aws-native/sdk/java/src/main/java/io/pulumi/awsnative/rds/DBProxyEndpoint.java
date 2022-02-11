// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.rds.DBProxyEndpointArgs;
import io.pulumi.awsnative.rds.enums.DBProxyEndpointTargetRole;
import io.pulumi.awsnative.rds.outputs.DBProxyEndpointTagFormat;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:rds:DBProxyEndpoint")
public class DBProxyEndpoint extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dBProxyEndpointArn", type=String.class, parameters={})
    private Output<String> dBProxyEndpointArn;

    public Output<String> getDBProxyEndpointArn() {
        return this.dBProxyEndpointArn;
    }
    @OutputExport(name="dBProxyEndpointName", type=String.class, parameters={})
    private Output<String> dBProxyEndpointName;

    public Output<String> getDBProxyEndpointName() {
        return this.dBProxyEndpointName;
    }
    @OutputExport(name="dBProxyName", type=String.class, parameters={})
    private Output<String> dBProxyName;

    public Output<String> getDBProxyName() {
        return this.dBProxyName;
    }
    @OutputExport(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    @OutputExport(name="isDefault", type=Boolean.class, parameters={})
    private Output<Boolean> isDefault;

    public Output<Boolean> getIsDefault() {
        return this.isDefault;
    }
    @OutputExport(name="tags", type=List.class, parameters={DBProxyEndpointTagFormat.class})
    private Output</* @Nullable */ List<DBProxyEndpointTagFormat>> tags;

    public Output</* @Nullable */ List<DBProxyEndpointTagFormat>> getTags() {
        return this.tags;
    }
    @OutputExport(name="targetRole", type=DBProxyEndpointTargetRole.class, parameters={})
    private Output</* @Nullable */ DBProxyEndpointTargetRole> targetRole;

    public Output</* @Nullable */ DBProxyEndpointTargetRole> getTargetRole() {
        return this.targetRole;
    }
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }
    @OutputExport(name="vpcSecurityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> vpcSecurityGroupIds;

    public Output</* @Nullable */ List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }
    @OutputExport(name="vpcSubnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> vpcSubnetIds;

    public Output<List<String>> getVpcSubnetIds() {
        return this.vpcSubnetIds;
    }

    public DBProxyEndpoint(String name, DBProxyEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:rds:DBProxyEndpoint", name, args == null ? DBProxyEndpointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DBProxyEndpoint(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:rds:DBProxyEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DBProxyEndpoint get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DBProxyEndpoint(name, id, options);
    }
}
