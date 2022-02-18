// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apprunner.ServiceArgs;
import io.pulumi.awsnative.apprunner.outputs.ServiceEncryptionConfiguration;
import io.pulumi.awsnative.apprunner.outputs.ServiceHealthCheckConfiguration;
import io.pulumi.awsnative.apprunner.outputs.ServiceInstanceConfiguration;
import io.pulumi.awsnative.apprunner.outputs.ServiceSourceConfiguration;
import io.pulumi.awsnative.apprunner.outputs.ServiceTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::AppRunner::Service resource specifies an AppRunner Service.
 * 
 */
@ResourceType(type="aws-native:apprunner:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * Autoscaling configuration ARN
     * 
     */
    @OutputExport(name="autoScalingConfigurationArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoScalingConfigurationArn;

    /**
     * @return Autoscaling configuration ARN
     * 
     */
    public Output</* @Nullable */ String> getAutoScalingConfigurationArn() {
        return this.autoScalingConfigurationArn;
    }
    @OutputExport(name="encryptionConfiguration", type=ServiceEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ ServiceEncryptionConfiguration> encryptionConfiguration;

    public Output</* @Nullable */ ServiceEncryptionConfiguration> getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }
    @OutputExport(name="healthCheckConfiguration", type=ServiceHealthCheckConfiguration.class, parameters={})
    private Output</* @Nullable */ ServiceHealthCheckConfiguration> healthCheckConfiguration;

    public Output</* @Nullable */ ServiceHealthCheckConfiguration> getHealthCheckConfiguration() {
        return this.healthCheckConfiguration;
    }
    @OutputExport(name="instanceConfiguration", type=ServiceInstanceConfiguration.class, parameters={})
    private Output</* @Nullable */ ServiceInstanceConfiguration> instanceConfiguration;

    public Output</* @Nullable */ ServiceInstanceConfiguration> getInstanceConfiguration() {
        return this.instanceConfiguration;
    }
    /**
     * The Amazon Resource Name (ARN) of the AppRunner Service.
     * 
     */
    @OutputExport(name="serviceArn", type=String.class, parameters={})
    private Output<String> serviceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the AppRunner Service.
     * 
     */
    public Output<String> getServiceArn() {
        return this.serviceArn;
    }
    /**
     * The AppRunner Service Id
     * 
     */
    @OutputExport(name="serviceId", type=String.class, parameters={})
    private Output<String> serviceId;

    /**
     * @return The AppRunner Service Id
     * 
     */
    public Output<String> getServiceId() {
        return this.serviceId;
    }
    /**
     * The AppRunner Service Name.
     * 
     */
    @OutputExport(name="serviceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceName;

    /**
     * @return The AppRunner Service Name.
     * 
     */
    public Output</* @Nullable */ String> getServiceName() {
        return this.serviceName;
    }
    /**
     * The Service Url of the AppRunner Service.
     * 
     */
    @OutputExport(name="serviceUrl", type=String.class, parameters={})
    private Output<String> serviceUrl;

    /**
     * @return The Service Url of the AppRunner Service.
     * 
     */
    public Output<String> getServiceUrl() {
        return this.serviceUrl;
    }
    @OutputExport(name="sourceConfiguration", type=ServiceSourceConfiguration.class, parameters={})
    private Output<ServiceSourceConfiguration> sourceConfiguration;

    public Output<ServiceSourceConfiguration> getSourceConfiguration() {
        return this.sourceConfiguration;
    }
    /**
     * AppRunner Service status.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return AppRunner Service status.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="tags", type=List.class, parameters={ServiceTag.class})
    private Output</* @Nullable */ List<ServiceTag>> tags;

    public Output</* @Nullable */ List<ServiceTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apprunner:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Service(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apprunner:Service", name, null, makeResourceOptions(options, id));
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
    public static Service get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}
