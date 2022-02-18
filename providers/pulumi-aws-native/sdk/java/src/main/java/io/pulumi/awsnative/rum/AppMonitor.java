// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rum;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.rum.AppMonitorArgs;
import io.pulumi.awsnative.rum.outputs.AppMonitorConfiguration;
import io.pulumi.awsnative.rum.outputs.AppMonitorTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::RUM::AppMonitor
 * 
 */
@ResourceType(type="aws-native:rum:AppMonitor")
public class AppMonitor extends io.pulumi.resources.CustomResource {
    @OutputExport(name="appMonitorConfiguration", type=AppMonitorConfiguration.class, parameters={})
    private Output</* @Nullable */ AppMonitorConfiguration> appMonitorConfiguration;

    public Output</* @Nullable */ AppMonitorConfiguration> getAppMonitorConfiguration() {
        return this.appMonitorConfiguration;
    }
    /**
     * Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to CWLlong in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur CWLlong charges. If you omit this parameter, the default is false
     * 
     */
    @OutputExport(name="cwLogEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> cwLogEnabled;

    /**
     * @return Data collected by RUM is kept by RUM for 30 days and then deleted. This parameter specifies whether RUM sends a copy of this telemetry data to CWLlong in your account. This enables you to keep the telemetry data for more than 30 days, but it does incur CWLlong charges. If you omit this parameter, the default is false
     * 
     */
    public Output</* @Nullable */ Boolean> getCwLogEnabled() {
        return this.cwLogEnabled;
    }
    /**
     * The top-level internet domain name for which your application has administrative authority.
     * 
     */
    @OutputExport(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The top-level internet domain name for which your application has administrative authority.
     * 
     */
    public Output<String> getDomain() {
        return this.domain;
    }
    /**
     * A name for the app monitor
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for the app monitor
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=List.class, parameters={AppMonitorTag.class})
    private Output</* @Nullable */ List<AppMonitorTag>> tags;

    public Output</* @Nullable */ List<AppMonitorTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppMonitor(String name, AppMonitorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:rum:AppMonitor", name, args == null ? AppMonitorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AppMonitor(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:rum:AppMonitor", name, null, makeResourceOptions(options, id));
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
    public static AppMonitor get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AppMonitor(name, id, options);
    }
}
